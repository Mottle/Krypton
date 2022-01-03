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
package org.kryptonmc.krypton.packet.out.play

import io.netty.buffer.ByteBuf
import org.kryptonmc.api.effect.particle.ParticleEffect
import org.kryptonmc.krypton.effect.particle.write
import org.kryptonmc.krypton.packet.Packet
import org.spongepowered.math.vector.Vector3d

/**
 * Tells the client to spawn some particles around it
 */
@JvmRecord
data class PacketOutParticle(
    val effect: ParticleEffect,
    val x: Double,
    val y: Double,
    val z: Double
) : Packet {

    constructor(effect: ParticleEffect, location: Vector3d) : this(effect, location.x(), location.y(), location.z())

    override fun write(buf: ByteBuf) {
        effect.write(buf, x, y, z)
    }
}
