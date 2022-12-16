/*
 * This file is part of the Krypton API, licensed under the MIT license.
 *
 * Copyright (C) 2021-2022 KryptonMC and the contributors to the Krypton project.
 *
 * This project is licensed under the terms of the MIT license.
 * For more details, please reference the LICENSE file in the api top-level directory.
 */
package org.kryptonmc.api.effect.particle.builder

import org.jetbrains.annotations.Contract
import org.kryptonmc.api.item.ItemStack
import org.kryptonmc.internal.annotations.dsl.ParticleDsl

/**
 * A builder for building item particle effects.
 */
@ParticleDsl
public interface ItemParticleEffectBuilder : BaseParticleEffectBuilder<ItemParticleEffectBuilder> {

    /**
     * Sets the item data of the texture to be used.
     *
     * @param item the item type to use
     */
    @ParticleDsl
    @Contract("_ -> this", mutates = "this")
    public fun item(item: ItemStack): ItemParticleEffectBuilder
}
