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
package org.kryptonmc.krypton.commands.krypton

import com.mojang.brigadier.builder.LiteralArgumentBuilder
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.event.ClickEvent
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import org.kryptonmc.api.command.literalCommand
import org.kryptonmc.krypton.KryptonPlatform
import org.kryptonmc.krypton.command.CommandSourceStack
import org.kryptonmc.krypton.commands.runs
import java.util.stream.Stream

object InfoCommand : KryptonSubCommand {

    private val MESSAGE = Component.text()
        .append(Component.text("This server is running ", KryptonColors.LIGHTER_PURPLE))
        .append(Component.text()
            .content("Krypton ")
            .color(KryptonColors.STANDARD_PURPLE)
            .decorate(TextDecoration.BOLD)
            .clickEvent(ClickEvent.openUrl("https://kryptonmc.org")))
        .append(Component.text(KryptonPlatform.version, NamedTextColor.GREEN))
        .append(Component.text(" for Minecraft ", KryptonColors.LIGHTER_PURPLE))
        .append(Component.text(KryptonPlatform.minecraftVersion, NamedTextColor.GREEN))
        .build()

    override fun aliases(): Stream<String> = Stream.of("about", "version")

    override fun register(): LiteralArgumentBuilder<CommandSourceStack> = literalCommand("info") {
        runs { it.source.sendSystemMessage(MESSAGE) }
    }
}
