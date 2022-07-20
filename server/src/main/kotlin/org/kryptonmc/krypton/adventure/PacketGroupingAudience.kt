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
package org.kryptonmc.krypton.adventure

import net.kyori.adventure.audience.Audience
import net.kyori.adventure.audience.ForwardingAudience
import net.kyori.adventure.audience.MessageType
import net.kyori.adventure.bossbar.BossBar
import net.kyori.adventure.identity.Identified
import net.kyori.adventure.identity.Identity
import net.kyori.adventure.inventory.Book
import net.kyori.adventure.sound.Sound
import net.kyori.adventure.sound.SoundStop
import net.kyori.adventure.text.Component
import net.kyori.adventure.title.Title
import net.kyori.adventure.title.TitlePart
import org.kryptonmc.api.registry.Registries
import org.kryptonmc.krypton.KryptonServer
import org.kryptonmc.krypton.entity.KryptonEntity
import org.kryptonmc.krypton.entity.player.KryptonPlayer
import org.kryptonmc.krypton.network.SessionManager
import org.kryptonmc.krypton.network.chat.ChatSender
import org.kryptonmc.krypton.network.chat.ChatTypes
import org.kryptonmc.krypton.network.chat.MessageSignature
import org.kryptonmc.krypton.packet.Packet
import org.kryptonmc.krypton.packet.out.play.PacketOutSetActionBarText
import org.kryptonmc.krypton.packet.out.play.PacketOutClearTitles
import org.kryptonmc.krypton.packet.out.play.PacketOutEntitySoundEffect
import org.kryptonmc.krypton.packet.out.play.PacketOutCustomSoundEffect
import org.kryptonmc.krypton.packet.out.play.PacketOutPlayerChatMessage
import org.kryptonmc.krypton.packet.out.play.PacketOutSetTabListHeaderAndFooter
import org.kryptonmc.krypton.packet.out.play.PacketOutSoundEffect
import org.kryptonmc.krypton.packet.out.play.PacketOutStopSound
import org.kryptonmc.krypton.packet.out.play.PacketOutSetSubtitleText
import org.kryptonmc.krypton.packet.out.play.PacketOutSetTitleText
import org.kryptonmc.krypton.packet.out.play.PacketOutSetTitleAnimationTimes
import org.kryptonmc.krypton.packet.out.play.PacketOutSystemChatMessage
import org.kryptonmc.krypton.registry.InternalRegistries

interface PacketGroupingAudience : ForwardingAudience {

    val sessionManager: SessionManager
    val players: Collection<KryptonPlayer>

    fun sendGroupedPacket(packet: Packet) {
        sessionManager.sendGrouped(players, packet)
    }

    override fun sendMessage(source: Identified, message: Component, type: MessageType) {
        sendMessage(source.identity(), message, type)
    }

    override fun sendMessage(source: Identity, message: Component, type: MessageType) {
        val chatType = when (type) {
            MessageType.CHAT -> ChatTypes.CHAT
            MessageType.SYSTEM -> ChatTypes.SYSTEM
        }
        val typeId = InternalRegistries.CHAT_TYPE.idOf(chatType)
        val packet = when (chatType) {
            ChatTypes.SYSTEM -> PacketOutSystemChatMessage(message, typeId)
            ChatTypes.CHAT -> PacketOutPlayerChatMessage(message, null, typeId, ChatSender.fromIdentity(source), MessageSignature.unsigned())
            else -> throw IllegalArgumentException("Somehow chat type is not supported, this should be impossible! Type was $chatType.")
        }
        sessionManager.sendGrouped(players, packet) { it.acceptsChatType(chatType) }
    }

    override fun sendActionBar(message: Component) {
        sendGroupedPacket(PacketOutSetActionBarText(message))
    }

    override fun sendPlayerListHeader(header: Component) {
        sendPlayerListHeaderAndFooter(header, Component.empty())
    }

    override fun sendPlayerListFooter(footer: Component) {
        sendPlayerListHeaderAndFooter(Component.empty(), footer)
    }

    override fun sendPlayerListHeaderAndFooter(header: Component, footer: Component) {
        sendGroupedPacket(PacketOutSetTabListHeaderAndFooter(header, footer))
    }

    override fun <T : Any> sendTitlePart(part: TitlePart<T>, value: T) {
        if (part === TitlePart.TITLE) sendGroupedPacket(PacketOutSetTitleText(value as Component))
        if (part === TitlePart.SUBTITLE) sendGroupedPacket(PacketOutSetSubtitleText(value as Component))
        if (part === TitlePart.TIMES) sendGroupedPacket(PacketOutSetTitleAnimationTimes(value as Title.Times))
        throw IllegalArgumentException("Unknown TitlePart")
    }

    override fun clearTitle() {
        sendGroupedPacket(PacketOutClearTitles(false))
    }

    override fun resetTitle() {
        sendGroupedPacket(PacketOutClearTitles(true))
    }

    override fun showBossBar(bar: BossBar) {
        BossBarManager.addBar(bar, this)
    }

    override fun hideBossBar(bar: BossBar) {
        BossBarManager.removeBar(bar, this)
    }

    override fun playSound(sound: Sound, x: Double, y: Double, z: Double) {
        val type = Registries.SOUND_EVENT[sound.name()]
        if (type != null) {
            sendGroupedPacket(PacketOutSoundEffect(sound, type, x, y, z))
            return
        }
        sendGroupedPacket(PacketOutCustomSoundEffect(sound, x, y, z))
    }

    override fun playSound(sound: Sound, emitter: Sound.Emitter) {
        if (emitter !== Sound.Emitter.self()) {
            val entity = if (emitter is KryptonEntity) emitter else error("Sound emitter must be an entity or self(), was $emitter!")
            val event = Registries.SOUND_EVENT[sound.name()]
            if (event != null) {
                sendGroupedPacket(PacketOutEntitySoundEffect(event, sound.source(), entity.id, sound.volume(), sound.pitch()))
                return
            }
            sendGroupedPacket(PacketOutCustomSoundEffect(sound, entity.location.x(), entity.location.y(), entity.location.z()))
            return
        }
        // If we're playing on self, we need to delegate to each audience member
        super.playSound(sound, emitter)
    }

    override fun stopSound(stop: SoundStop) {
        sendGroupedPacket(PacketOutStopSound(stop))
    }

    override fun openBook(book: Book) {
        val item = book.toItemStack()
        players.forEach { it.openBook(item) }
    }

    override fun audiences(): Iterable<Audience> = players

    companion object {

        @JvmStatic
        fun of(players: Collection<KryptonPlayer>): PacketGroupingAudience = object : PacketGroupingAudience {

            override val sessionManager: SessionManager
                get() = KryptonServer.get().sessionManager
            override val players: Collection<KryptonPlayer>
                get() = players
        }
    }
}
