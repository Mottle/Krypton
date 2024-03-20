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
package org.kryptonmc.krypton.network.chat

import org.kryptonmc.krypton.util.crypto.SignatureValidator

fun interface SignedMessageValidator {

    fun updateAndValidate(message: PlayerChatMessage): Boolean

    class KeyBased(private val validator: SignatureValidator) : SignedMessageValidator {

        private var lastMessage: PlayerChatMessage? = null
        private var isChainValid = true

        private fun validateChain(message: PlayerChatMessage): Boolean =
            message == lastMessage || lastMessage == null || message.link.isDescendantOf(lastMessage!!.link)

        override fun updateAndValidate(message: PlayerChatMessage): Boolean {
            isChainValid = isChainValid && message.verify(validator) && validateChain(message)
            if (!isChainValid) return false
            lastMessage = message
            return true
        }
    }
}
