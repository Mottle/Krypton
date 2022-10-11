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
package org.kryptonmc.krypton.entity.hanging

import org.kryptonmc.api.entity.hanging.Picture
import org.kryptonmc.api.entity.hanging.Painting
import org.kryptonmc.krypton.entity.KryptonEntityType
import org.kryptonmc.krypton.entity.KryptonEntityTypes
import org.kryptonmc.krypton.entity.serializer.EntitySerializer
import org.kryptonmc.krypton.entity.serializer.hanging.PaintingSerializer
import org.kryptonmc.krypton.world.KryptonWorld

class KryptonPainting(world: KryptonWorld) : KryptonHangingEntity(world), Painting {

    override val type: KryptonEntityType<Painting>
        get() = KryptonEntityTypes.PAINTING
    override val serializer: EntitySerializer<KryptonPainting>
        get() = PaintingSerializer

    override var picture: Picture? = null
    override val width: Int
        get() = picture?.width ?: 1
    override val height: Int
        get() = picture?.height ?: 1
}
