/*
 * This file is part of the Krypton API, licensed under the MIT license.
 *
 * Copyright (C) 2021 KryptonMC and the contributors to the Krypton project.
 *
 * This project is licensed under the terms of the MIT license.
 * For more details, please reference the LICENSE file in the api top-level directory.
 */
package org.kryptonmc.api.entity.player

import net.kyori.adventure.key.Key
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.event.HoverEvent
import net.kyori.adventure.text.event.HoverEventSource
import org.kryptonmc.api.auth.GameProfile
import org.kryptonmc.api.block.Block
import org.kryptonmc.api.command.Sender
import org.kryptonmc.api.effect.particle.ParticleEffect
import org.kryptonmc.api.entity.LivingEntity
import org.kryptonmc.api.entity.MainHand
import org.kryptonmc.api.inventory.InventoryHolder
import org.kryptonmc.api.inventory.PlayerInventory
import org.kryptonmc.api.plugin.PluginMessageRecipient
import org.kryptonmc.api.resource.ResourceKey
import org.kryptonmc.api.space.Direction
import org.kryptonmc.api.space.Position
import org.kryptonmc.api.statistic.Statistic
import org.kryptonmc.api.statistic.StatisticsTracker
import org.kryptonmc.api.world.Gamemode
import org.kryptonmc.api.space.Location
import org.kryptonmc.api.world.World
import org.kryptonmc.api.world.dimension.DimensionType
import org.kryptonmc.api.world.scoreboard.Scoreboard
import java.net.InetSocketAddress
import java.util.Locale

/**
 * Represents a player.
 */
@Suppress("INAPPLICABLE_JVM_NAME")
public interface Player : LivingEntity,
    Sender,
    InventoryHolder,
    PluginMessageRecipient,
    HoverEventSource<HoverEvent.ShowEntity> {

    /**
     * The address that the player is currently connected from.
     */
    public val address: InetSocketAddress

    /**
     * The game profile for this player.
     *
     * Will contain offline mode details for offline mode players.
     */
    public val profile: GameProfile

    /**
     * If this player can fly.
     */
    @get:JvmName("canFly")
    public var canFly: Boolean

    /**
     * If this player can build (place/break blocks).
     */
    @get:JvmName("canBuild")
    public var canBuild: Boolean

    /**
     * If this player can place and break blocks with no delay.
     */
    @get:JvmName("canInstantlyBuild")
    public var canInstantlyBuild: Boolean

    /**
     * The current speed at which this player can walk at.
     */
    public var walkingSpeed: Float

    /**
     * The current speed at which this player can fly at.
     */
    public var flyingSpeed: Float

    /**
     * The dimension resource key for the world the player is currently in.
     */
    public val dimension: ResourceKey<World>

    /**
     * The dimension the player is currently in.
     */
    public val dimensionType: DimensionType

    /**
     * The view distance of this player.
     */
    public val viewDistance: Int

    /**
     * The current time of this player.
     *
     * Will always be the time of the server.
     */
    public val time: Long

    /**
     * This player's current game mode.
     */
    public val gamemode: Gamemode

    /**
     * The direction this player is currently facing.
     */
    public val direction: Direction

    /**
     * The scoreboard currently being shown to this player.
     */
    public var scoreboard: Scoreboard?

    /**
     * This player's main hand.
     */
    public val mainHand: MainHand

    /**
     * The player's inventory.
     *
     * This can and should never be changed.
     */
    override val inventory: PlayerInventory

    /**
     * This player's locale.
     */
    public val locale: Locale?

    /**
     * The statistics tracker for this player.
     */
    public val statistics: StatisticsTracker

    /**
     * Increments the given [statistic] by 1.
     *
     * Note: This will increase the current value by 1, it will not set it.
     * To set statistics, use [StatisticsTracker.set]
     *
     * @param statistic the statistic
     */
    public fun incrementStatistic(statistic: Statistic<*>): Unit = incrementStatistic(statistic, 1)

    /**
     * Increments the given [statistic] by the given [amount].
     *
     * Note: This will increase the current value by the amount, it will not
     * set it. To set statistics, use [StatisticsTracker.set]
     *
     * @param statistic the statistic
     * @param amount the amount
     */
    public fun incrementStatistic(statistic: Statistic<*>, amount: Int)

    /**
     * Increments the given custom statistic [key] by 1.
     *
     * @param key the custom statistic key
     */
    public fun incrementStatistic(key: Key): Unit = incrementStatistic(key, 1)

    /**
     * Increments the given custom statistic [key] by the given [amount].
     *
     * @param key the custom statistic key
     */
    public fun incrementStatistic(key: Key, amount: Int)

    /**
     * Decrements the given [statistic] by 1.
     *
     * Note: This will decrease the current value by 1, it will not set it.
     * To set statistics, use [StatisticsTracker.set]
     *
     * @param statistic the statistic
     */
    public fun decrementStatistic(statistic: Statistic<*>): Unit = decrementStatistic(statistic, 1)

    /**
     * Decrements the given [statistic] by the given [amount].
     *
     * Note: This will decrease the current value by the amount, it will not
     * set it. To set statistics, use [StatisticsTracker.set]
     *
     * @param statistic the statistic
     * @param amount the amount
     */
    public fun decrementStatistic(statistic: Statistic<*>, amount: Int)

    /**
     * Resets the given statistic back to a value of 0.
     *
     * @param statistic the statistic
     */
    public fun resetStatistic(statistic: Statistic<*>)

    /**
     * Spawns particles for this player relative to a location.
     *
     * @param particleEffect the [ParticleEffect] used to describe the
     * particles' appearance
     * @param location the central location to spawn the particles at
     */
    public fun spawnParticles(particleEffect: ParticleEffect, location: Location)

    /**
     * Teleport this player to the specified position.
     */
    public fun teleport(position: Position)

    /**
     * Teleport this player to the specified other [player].
     */
    public fun teleport(player: Player)

    /**
     * Returns true if this player has the correct tool to be able to break
     * the given [block].
     *
     * @param block the block to check
     * @return true if the player can break it, false otherwise
     */
    public fun hasCorrectTool(block: Block): Boolean

    /**
     * Gets the speed at which this player can destroy the given
     * [block].
     *
     * @param block the block the player is destroying
     * @return the destroy speed
     */
    public fun getDestroySpeed(block: Block): Float

    /**
     * Kicks the player with the given text shown
     */
    public fun disconnect(text: Component)
}
