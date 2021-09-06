/*
 * This file is part of the Krypton project, licensed under the GNU General Public License v3.0
 *
 * Copyright (C) 2021 KryptonMC and the contributors of the Krypton project
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
package org.kryptonmc.krypton.util.converter.versions

import org.kryptonmc.krypton.util.converter.MCVersions
import org.kryptonmc.krypton.util.converter.types.MCTypeRegistry

object V107 {

    private const val VERSION = MCVersions.V15W32C + 3
    private val MINECART_IDS = arrayOf(
        "MinecartRideable",
        "MinecartChest",
        "MinecartFurnace",
        "MinecartTNT",
        "MinecartSpawner",
        "MinecartHopper",
        "MinecartCommandBlock"
    )

    fun register() = MCTypeRegistry.ENTITY.addConverterForId("Minecart", VERSION) { data, _, _ ->
        var newId = "MinecartRideable"
        val type = data.getInt("Type")
        data.remove("Type")

        if (type in MINECART_IDS.indices) newId = MINECART_IDS[type]
        data.setString("id", newId)
        null
    }
}
