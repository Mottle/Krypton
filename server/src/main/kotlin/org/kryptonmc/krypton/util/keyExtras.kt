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
package org.kryptonmc.krypton.util

import com.mojang.brigadier.StringReader
import net.kyori.adventure.key.InvalidKeyException
import net.kyori.adventure.key.Key
import net.kyori.adventure.text.Component
import org.kryptonmc.krypton.command.toExceptionType

private val ERROR_INVALID = Component.translatable("argument.id.invalid").toExceptionType()

fun StringReader.nextKey(): Key {
    val cursor = cursor
    while (canRead() && peek().isAllowedInKey()) {
        skip()
    }
    try {
        return Key.key(string.substring(cursor, this.cursor))
    } catch (exception: InvalidKeyException) {
        setCursor(cursor)
        throw ERROR_INVALID.createWithContext(this)
    }
}

fun Key.normalizePath(): String = asString().replace(':', '.')

private val ZERO_TO_NINE_RANGE = '0'..'9'
private val A_TO_Z_RANGE = 'a'..'z'

private fun Char.isAllowedInKey() = this in ZERO_TO_NINE_RANGE ||
        this in A_TO_Z_RANGE ||
        this == '_' ||
        this == ':' ||
        this == '/' ||
        this == '.' ||
        this == '-'