/*
 * This file is part of the Krypton API, licensed under the MIT license.
 *
 * Copyright (C) 2021-2022 KryptonMC and the contributors to the Krypton project.
 *
 * This project is licensed under the terms of the MIT license.
 * For more details, please reference the LICENSE file in the api top-level directory.
 */
package org.kryptonmc.api.block.entity

import org.kryptonmc.api.entity.Entity

/**
 * A block entity that stores entities within it.
 */
public interface EntityStorageBlockEntity<T : Entity> : BlockEntity {

    /**
     * The amount of entities contained within this block entity.
     */
    public val entityCount: Int

    /**
     * The maximum amount of entities that can be stored within this block
     * entity.
     */
    public var maximumEntities: Int

    /**
     * Gets whether this block entity is full of entities.
     *
     * @return whether this block entity is full
     */
    public fun isFull(): Boolean = entityCount >= maximumEntities

    /**
     * Releases all the entities contained within this block entity.
     *
     * @return the released entities
     */
    public fun releaseEntities(): List<T>

    /**
     * Adds the given [entity] to the entities contained within this block
     * entity.
     *
     * @param entity the entity
     */
    public fun addEntity(entity: T)

    /**
     * Clears all of the entities out of this block entity.
     */
    public fun clearEntities()
}