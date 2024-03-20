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
package org.kryptonmc.krypton.util.provider

import net.kyori.adventure.key.Key
import org.kryptonmc.krypton.registry.KryptonRegistries
import org.kryptonmc.serialization.Codec
import org.kryptonmc.serialization.DataResult
import org.kryptonmc.util.Either
import java.util.function.Function

object IntProviderTypes {

    // We put the XMAPs here because otherwise we get a compilation error. See https://youtrack.jetbrains.com/issue/KT-53478
    @JvmField
    val CONSTANT: IntProviderType<ConstantInt> = register("constant", ConstantInt.CODEC
        .xmap({ either -> either.map({ ConstantInt.of(it) }, Function.identity()) }, { Either.left(it.value) }))
    @JvmField
    val UNIFORM: IntProviderType<UniformInt> = register("uniform", UniformInt.CODEC.comapFlatMap({
        if (it.maximumValue >= it.minimumValue) return@comapFlatMap DataResult.success(it)
        DataResult.error("Maximum must be >= minimum! Maximum: ${it.maximumValue}, minimum: ${it.minimumValue}")
    }, Function.identity()))

    @JvmStatic
    private fun <P : IntProvider> register(name: String, codec: Codec<P>): IntProviderType<P> =
        KryptonRegistries.register(KryptonRegistries.INT_PROVIDER_TYPE, Key.key(name), IntProviderType { codec })
}
