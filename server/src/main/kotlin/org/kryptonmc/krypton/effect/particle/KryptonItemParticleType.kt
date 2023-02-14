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
package org.kryptonmc.krypton.effect.particle

import io.netty.buffer.ByteBuf
import net.kyori.adventure.key.Key
import org.kryptonmc.api.effect.particle.ItemParticleType
import org.kryptonmc.api.effect.particle.builder.ItemParticleEffectBuilder
import org.kryptonmc.api.effect.particle.data.ParticleData
import org.kryptonmc.krypton.effect.particle.builder.KryptonItemParticleEffectBuilder
import org.kryptonmc.krypton.effect.particle.data.KryptonItemParticleData
import org.kryptonmc.krypton.util.readItem

@JvmRecord
data class KryptonItemParticleType(private val key: Key) : KryptonParticleType, ItemParticleType {

    override fun key(): Key = key

    override fun builder(): ItemParticleEffectBuilder = KryptonItemParticleEffectBuilder(this)

    override fun createData(buf: ByteBuf): ParticleData = KryptonItemParticleData(buf.readItem())
}