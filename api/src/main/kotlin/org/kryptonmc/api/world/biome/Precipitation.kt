/*
 * This file is part of the Krypton API, licensed under the MIT license.
 *
 * Copyright (C) 2021-2022 KryptonMC and the contributors to the Krypton project.
 *
 * This project is licensed under the terms of the MIT license.
 * For more details, please reference the LICENSE file in the api top-level directory.
 */
package org.kryptonmc.api.world.biome

import org.kryptonmc.api.util.StringSerializable

/**
 * A form of precipitation that applies in a climate.
 */
public enum class Precipitation(@get:JvmName("serialized") override val serialized: String) : StringSerializable {

    NONE("none"),
    RAIN("rain"),
    SNOW("snow")
}
