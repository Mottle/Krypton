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
package org.kryptonmc.krypton.world.data

import org.kryptonmc.krypton.KryptonPlatform
import org.kryptonmc.krypton.util.logger
import org.kryptonmc.nbt.CompoundTag
import org.kryptonmc.nbt.compound
import org.kryptonmc.nbt.io.TagCompression
import org.kryptonmc.nbt.io.TagIO
import java.io.IOException
import java.nio.file.Path

abstract class PersistentData {

    var isDirty: Boolean = false

    abstract fun save(): CompoundTag

    fun markDirty() {
        isDirty = true
    }

    fun save(path: Path) {
        if (!isDirty) return
        val tag = compound {
            put("data", save())
            int("DataVersion", KryptonPlatform.worldVersion)
        }
        try {
            TagIO.write(path, tag, TagCompression.GZIP)
        } catch (exception: IOException) {
            LOGGER.error("Could not save data $this!", exception)
        }
        isDirty = false
    }

    companion object {

        private val LOGGER = logger<PersistentData>()
    }
}