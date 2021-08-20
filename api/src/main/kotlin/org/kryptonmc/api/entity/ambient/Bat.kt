/*
 * This file is part of the Krypton API, licensed under the MIT license.
 *
 * Copyright (C) 2021 KryptonMC and the contributors to the Krypton project.
 *
 * This project is licensed under the terms of the MIT license.
 * For more details, please reference the LICENSE file in the api top-level directory.
 */
package org.kryptonmc.api.entity.ambient

/**
 * A bat.
 */
interface Bat : AmbientCreature {

    /**
     * If this bat is currently resting (hanging from the ceiling).
     */
    val isResting: Boolean
}