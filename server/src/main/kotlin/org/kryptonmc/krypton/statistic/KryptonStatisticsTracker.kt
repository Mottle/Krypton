/*
 * This file is part of the Krypton project, licensed under the GNU General Public License v3.0
 *
 * Copyright (C) 2021-2022 KryptonMC and the contributors of the Krypton project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.kryptonmc.krypton.statistic

import ca.spottedleaf.dataconverter.minecraft.datatypes.MCTypeRegistry
import com.google.gson.JsonObject
import com.google.gson.JsonParseException
import com.google.gson.internal.Streams
import com.google.gson.stream.JsonReader
import it.unimi.dsi.fastutil.objects.Object2IntMap
import it.unimi.dsi.fastutil.objects.Object2IntMaps
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
import me.bardy.gsonkt.keys
import net.kyori.adventure.key.InvalidKeyException
import net.kyori.adventure.key.Key
import org.kryptonmc.api.registry.Registries
import org.kryptonmc.api.registry.Registry
import org.kryptonmc.api.statistic.Statistic
import org.kryptonmc.api.statistic.StatisticType
import org.kryptonmc.api.statistic.StatisticTypes
import org.kryptonmc.api.statistic.StatisticsTracker
import org.kryptonmc.krypton.KryptonPlatform
import org.kryptonmc.krypton.entity.player.KryptonPlayer
import org.kryptonmc.krypton.packet.out.play.PacketOutStatistics
import org.kryptonmc.krypton.util.logger
import org.kryptonmc.krypton.util.sendDataConversionWarning
import org.kryptonmc.krypton.util.upgradeData
import java.io.IOException
import java.io.Reader
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import kotlin.math.max
import kotlin.math.min

@Suppress("INAPPLICABLE_JVM_NAME")
class KryptonStatisticsTracker(
    private val player: KryptonPlayer,
    private val file: Path
) : StatisticsTracker {

    override val statistics: Object2IntMap<Statistic<*>> = Object2IntMaps.synchronize(Object2IntOpenHashMap())
    private val pendingUpdate = mutableSetOf<Statistic<*>>()
    private val pendingUpdating: Set<Statistic<*>>
        get() {
            val copy = LinkedHashSet(pendingUpdate)
            pendingUpdate.clear()
            return copy
        }

    init {
        statistics.defaultReturnValue(0)
        if (Files.isRegularFile(file)) load(Files.newInputStream(file, StandardOpenOption.READ).reader())
        if (!Files.exists(file)) {
            try {
                Files.createFile(file)
            } catch (exception: Exception) {
                LOGGER.error("Failed to create statistics file ${file.toAbsolutePath()}!", exception)
                throw exception
            }
        }
    }

    @Suppress("UNCHECKED_CAST")
    fun save() {
        try {
            val map = mutableMapOf<StatisticType<*>, JsonObject>()
            statistics.object2IntEntrySet().forEach {
                val registry = it.key.type.registry as Registry<Any>
                map.getOrPut(it.key.type) { JsonObject() }.addProperty(registry[it.key.value]!!.toString(), it.intValue)
            }

            val statsJson = JsonObject()
            map.forEach { statsJson.add(it.key.key().asString(), it.value) }

            val json = JsonObject().apply {
                add("stats", statsJson)
                addProperty("DataVersion", KryptonPlatform.worldVersion)
            }.toString()
            Files.newOutputStream(file).writer().use { it.write(json) }
        } catch (exception: IOException) {
            LOGGER.error("Failed to save statistics file $file!", exception)
        }
    }

    fun send() {
        val map = Object2IntOpenHashMap<Statistic<*>>()
        pendingUpdating.forEach { map[it] = get(it) }
        player.session.send(PacketOutStatistics(map))
    }

    override fun invalidate() {
        pendingUpdate.addAll(statistics.keys)
    }

    override fun get(statistic: Statistic<*>): Int = statistics.getInt(statistic)

    override fun get(statistic: Key): Int = statistics.getInt(StatisticTypes.CUSTOM[statistic])

    override fun set(statistic: Statistic<*>, value: Int) {
        statistics[statistic] = value
        pendingUpdate.add(statistic)
    }

    override fun increment(statistic: Statistic<*>, amount: Int) {
        set(statistic, min(get(statistic).toLong() + amount.toLong(), Int.MAX_VALUE.toLong()).toInt())
        player.scoreboard.forEachObjective(statistic, player.teamRepresentation) { it.add(amount) }
    }

    override fun decrement(statistic: Statistic<*>, amount: Int) {
        set(statistic, max(get(statistic).toLong() - amount.toLong(), Int.MIN_VALUE.toLong()).toInt())
        player.scoreboard.forEachObjective(statistic, player.teamRepresentation) { it.subtract(amount) }
    }

    private fun load(reader: Reader) {
        try {
            val json = JsonReader(reader).apply { isLenient = false }.use { Streams.parse(it) }
            if (json.isJsonNull) {
                LOGGER.error("Unable to parse statistics data from $file to JSON!")
                return
            }

            json as JsonObject
            if (!json.has("DataVersion") || !json["DataVersion"].isJsonPrimitive) {
                json.addProperty("DataVersion", OLD_VERSION)
            }
            val version = json["DataVersion"].asInt
            // We won't upgrade data if use of the data converter is disabled.
            if (version < KryptonPlatform.worldVersion && !player.server.useDataConverter) {
                LOGGER.sendDataConversionWarning("statistics data for player with UUID ${player.uuid}")
                error("Tried to load old statistics from version $version when data conversion is disabled!")
            }

            // Don't use data converter if the version isn't older than our version.
            val data = json.upgradeData(MCTypeRegistry.STATS, json["DataVersion"].asInt)
            if (data["stats"].asJsonObject.size() == 0) return

            val stats = data["stats"]?.asJsonObject ?: JsonObject()
            stats.keys.forEach { key ->
                if (!stats[key].isJsonObject) return@forEach
                val type = Registries.STATISTIC_TYPE[Key.key(key)]
                if (type == null) {
                    LOGGER.warn("Invalid statistic type found in $file! Could not recognise $key!")
                    return@forEach
                }
                val values = stats[key].asJsonObject
                values.keys.forEach { valueKey ->
                    if (values[valueKey].isJsonPrimitive) {
                        val statistic = statistic(type, valueKey)
                        if (statistic != null) {
                            statistics[statistic] = values[valueKey].asInt
                        } else {
                            LOGGER.warn("Invalid statistic found in $file! Could not recognise key $valueKey!")
                        }
                    } else {
                        LOGGER.warn("Invalid statistic found in $file! Could not recognise value ${values[valueKey]} for key $valueKey")
                    }
                }
            }
        } catch (exception: IOException) {
            LOGGER.error("Failed to load statistics data from $file!", exception)
        } catch (exception: JsonParseException) {
            LOGGER.error("Failed to parse statistics data from $file to JSON!", exception)
        }
    }

    private fun <T : Any> statistic(type: StatisticType<T>, name: String): Statistic<T>? {
        val key = try {
            Key.key(name)
        } catch (exception: InvalidKeyException) {
            return null
        }
        return type.registry[key]?.let { type[it] }
    }

    companion object {

        private val LOGGER = logger<KryptonStatisticsTracker>()
        private const val OLD_VERSION = 1343
    }
}
