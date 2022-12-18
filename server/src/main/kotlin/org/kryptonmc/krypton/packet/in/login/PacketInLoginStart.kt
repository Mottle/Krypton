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
package org.kryptonmc.krypton.packet.`in`.login

import io.netty.buffer.ByteBuf
import org.kryptonmc.krypton.entity.player.PlayerPublicKey
import org.kryptonmc.krypton.network.handlers.LoginHandler
import org.kryptonmc.krypton.packet.InboundPacket
import org.kryptonmc.krypton.util.readString
import org.kryptonmc.krypton.util.writeNullable
import org.kryptonmc.krypton.util.writeString

@JvmRecord
data class PacketInLoginStart(val name: String, val publicKey: PlayerPublicKey.Data?) : InboundPacket<LoginHandler> {

    constructor(buf: ByteBuf) : this(buf.readString(16), if (buf.readBoolean()) PlayerPublicKey.Data(buf) else null)

    override fun write(buf: ByteBuf) {
        buf.writeString(name, 16)
        buf.writeNullable(publicKey) { _, key -> key.write(buf) }
    }

    override fun handle(handler: LoginHandler) {
        handler.handleLoginStart(this)
    }
}
