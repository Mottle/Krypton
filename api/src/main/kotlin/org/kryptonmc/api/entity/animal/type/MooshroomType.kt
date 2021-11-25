/*
 * This file is part of the Krypton API, licensed under the MIT license.
 *
 * Copyright (C) 2021 KryptonMC and the contributors to the Krypton project.
 *
 * This project is licensed under the terms of the MIT license.
 * For more details, please reference the LICENSE file in the api top-level directory.
 */
package org.kryptonmc.api.entity.animal.type

import net.kyori.adventure.key.Key
import net.kyori.adventure.key.Keyed
import org.jetbrains.annotations.ApiStatus
import org.jetbrains.annotations.Contract
import org.kryptonmc.api.Krypton
import org.kryptonmc.api.util.CataloguedBy
import org.kryptonmc.api.util.provide

/**
 * A type of mooshroom.
 */
@CataloguedBy(MooshroomTypes::class)
public interface MooshroomType : Keyed {

    @ApiStatus.Internal
    public interface Factory {

        public fun of(key: Key): MooshroomType
    }

    public companion object {

        private val FACTORY = Krypton.factoryProvider.provide<Factory>()

        /**
         * Creates a new mooshroom type with the given [key].
         *
         * @param key the key
         * @return a new mooshroom type
         */
        @JvmStatic
        @Contract("_ -> new", pure = true)
        public fun of(key: Key): MooshroomType = FACTORY.of(key)
    }
}