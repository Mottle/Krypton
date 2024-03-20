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
package org.kryptonmc.krypton.entity.monster

import org.kryptonmc.api.entity.monster.Blaze
import org.kryptonmc.krypton.entity.KryptonEntityType
import org.kryptonmc.krypton.entity.KryptonEntityTypes
import org.kryptonmc.krypton.entity.attribute.AttributeSupplier
import org.kryptonmc.krypton.entity.attribute.KryptonAttributeTypes
import org.kryptonmc.krypton.entity.metadata.MetadataKeys
import org.kryptonmc.krypton.world.KryptonWorld

class KryptonBlaze(world: KryptonWorld) : KryptonMonster(world), Blaze {

    override val type: KryptonEntityType<KryptonBlaze>
        get() = KryptonEntityTypes.BLAZE

    override var isOnFire: Boolean
        get() = data.getFlag(MetadataKeys.Blaze.FLAGS, 0)
        set(value) = data.setFlag(MetadataKeys.Blaze.FLAGS, 0, value)

    override fun defineData() {
        super.defineData()
        data.define(MetadataKeys.Blaze.FLAGS, 0)
    }

    companion object {

        @JvmStatic
        fun attributes(): AttributeSupplier.Builder = KryptonMonster.attributes()
            .add(KryptonAttributeTypes.ATTACK_DAMAGE, 6.0)
            .add(KryptonAttributeTypes.MOVEMENT_SPEED, 0.23F.toDouble())
            .add(KryptonAttributeTypes.FOLLOW_RANGE, 48.0)
    }
}
