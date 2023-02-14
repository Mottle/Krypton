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
package org.kryptonmc.krypton.pack

import net.kyori.adventure.key.Key
import org.kryptonmc.krypton.pack.metadata.MetadataSectionSerializer
import java.io.InputStream
import java.util.function.BiConsumer
import java.util.function.Supplier

interface PackResources : AutoCloseable {

    fun packId(): String

    fun namespaces(packType: PackType): Set<String>

    fun isBuiltin(): Boolean = false

    fun getRootResource(vararg path: String): Supplier<InputStream>?

    fun getResource(packType: PackType, location: Key): Supplier<InputStream>?

    fun listResources(packType: PackType, namespace: String, path: String, output: ResourceOutput)

    fun <T> getMetadataSection(serializer: MetadataSectionSerializer<T>): T?

    fun interface ResourceOutput : BiConsumer<Key, Supplier<InputStream>>

    companion object {

        const val METADATA_EXTENSION: String = ".mcmeta"
        const val PACK_META: String = "pack$METADATA_EXTENSION"
    }
}