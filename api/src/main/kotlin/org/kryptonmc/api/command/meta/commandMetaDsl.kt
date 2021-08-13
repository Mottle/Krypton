/*
 * This file is part of the Krypton API, licensed under the MIT license.
 *
 * Copyright (C) 2021 KryptonMC and the contributors to the Krypton project.
 *
 * This project is licensed under the terms of the MIT license.
 * For more details, please reference the LICENSE file in the api top-level directory.
 */
package org.kryptonmc.api.command.meta

@DslMarker
private annotation class CommandMetaDsl

/**
 * Constructs new [CommandMeta] with the given [name] and [builder].
 *
 * @param name the name
 * @param builder the builder
 * @return new command metadata
 */
@CommandMetaDsl
@JvmSynthetic
inline fun commandMeta(name: String, builder: CommandMeta.Builder.() -> Unit) = CommandMeta.builder(name).apply(builder).build()

/**
 * Constructs new [SimpleCommandMeta] with the given [name] and [builder] function.
 *
 * @param name the name
 * @param builder the builder function to apply
 * @return new simple command metadata
 */
@CommandMetaDsl
@JvmSynthetic
inline fun simpleCommandMeta(name: String, builder: SimpleCommandMeta.Builder.() -> Unit) = SimpleCommandMeta.builder(name).apply(builder).build()
