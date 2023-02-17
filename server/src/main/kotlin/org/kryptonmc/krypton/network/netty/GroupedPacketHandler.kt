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
package org.kryptonmc.krypton.network.netty

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandler
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder
import org.kryptonmc.krypton.packet.FramedPacket

@ChannelHandler.Sharable
object GroupedPacketHandler : MessageToByteEncoder<FramedPacket>() {

    const val NETTY_NAME = "grouped_packet_handler"

    override fun encode(ctx: ChannelHandlerContext?, msg: FramedPacket?, out: ByteBuf?) {
        // we just want to skip the pipeline and write the message directly
    }

    override fun allocateBuffer(ctx: ChannelHandlerContext?, msg: FramedPacket, preferDirect: Boolean): ByteBuf = msg.body.retainedSlice()
}