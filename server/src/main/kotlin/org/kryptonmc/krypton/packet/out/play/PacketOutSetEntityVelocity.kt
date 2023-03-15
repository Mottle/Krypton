/*
 * This file is part of the Krypton project, licensed under the Apache License v2.0
 *
 * Copyright (C) 2021-2023 KryptonMC and the contributors of the Krypton project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kryptonmc.krypton.packet.out.play

import org.kryptonmc.krypton.entity.KryptonEntity
import org.kryptonmc.krypton.packet.EntityPacket
import org.kryptonmc.krypton.coordinate.Positioning
import org.kryptonmc.krypton.network.buffer.BinaryReader
import org.kryptonmc.krypton.network.buffer.BinaryWriter

@JvmRecord
data class PacketOutSetEntityVelocity(override val entityId: Int, val x: Short, val y: Short, val z: Short) : EntityPacket {

    constructor(reader: BinaryReader) : this(reader.readVarInt(), reader.readShort(), reader.readShort(), reader.readShort())

    override fun write(writer: BinaryWriter) {
        writer.writeVarInt(entityId)
        writer.writeShort(x)
        writer.writeShort(y)
        writer.writeShort(z)
    }

    companion object {

        @JvmStatic
        fun fromEntity(entity: KryptonEntity): PacketOutSetEntityVelocity {
            return PacketOutSetEntityVelocity(entity.id, encode(entity.velocity.x), encode(entity.velocity.y), encode(entity.velocity.z))
        }

        @JvmStatic
        private fun encode(value: Double): Short = Positioning.encodeVelocity(value)
    }
}
