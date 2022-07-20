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
package org.kryptonmc.krypton.util

import com.google.common.base.Predicates
import com.google.common.collect.Iterators
import kotlin.math.max

/**
 * An IntBiMap implementation that uses identity equality to store values.
 *
 * This should be replaced, as it is a copy and translation of vanilla's
 * `CrudeIncrementalIntIdentityHashBiMap`. It is also not entirely clear why it
 * is necessary.
 */
@Suppress("UNCHECKED_CAST") // Our casts are fine and should always succeed
class IntIdentityHashBiMap<K> : IntBiMap<K> {

    private var keys: Array<K?>
    private var values: IntArray
    private var byId: Array<K?>

    private var nextId = 0
    override var size: Int = 0
        private set

    private constructor(initialCapacity: Int) {
        keys = newArray(initialCapacity)
        values = IntArray(initialCapacity)
        byId = newArray(initialCapacity)
    }

    private constructor(keys: Array<K?>, values: IntArray, byId: Array<K?>, nextId: Int, size: Int) {
        this.keys = keys
        this.values = values
        this.byId = byId
        this.nextId = nextId
        this.size = size
    }

    fun add(key: K): Int = nextId().apply { set(key, this) }

    fun set(key: K, value: Int) {
        val max = max(value, size + 1)
        if (max >= keys.size * LOAD_FACTOR) {
            var newSize = keys.size shl 1
            while (newSize < value) newSize = newSize shl 1
            grow(newSize)
        }
        val firstEmpty = findEmpty(hash(key))
        keys[firstEmpty] = key
        values[firstEmpty] = value
        byId[value] = key
        size++
        if (value == nextId) nextId++
    }

    fun clear() {
        keys.fill(null)
        byId.fill(null)
        nextId = 0
        size = 0
    }

    override fun idOf(value: K): Int = getValue(indexOf(value, hash(value)))

    override fun get(id: Int): K? = byId.getOrNull(id)

    override fun iterator(): Iterator<K> = Iterators.filter(Iterators.forArray(byId), Predicates.notNull()) as Iterator<K>

    private fun getValue(id: Int): Int = if (id == -1) -1 else values[id]

    private fun nextId(): Int {
        while (nextId < byId.size && byId[nextId] != null) nextId++
        return nextId
    }

    private fun grow(newSize: Int) {
        val oldKeys = keys
        val oldValues = values
        val map = IntIdentityHashBiMap<K>(newSize)
        for (i in oldKeys.indices) {
            if (oldKeys[i] != null) map.set(oldKeys[i]!!, oldValues[i])
        }
        keys = map.keys
        values = map.values
        byId = map.byId
        nextId = map.nextId
        size = map.size
    }

    private fun hash(key: K): Int = (murmurHash3Mixer(System.identityHashCode(key)) and Int.MAX_VALUE) % keys.size

    private fun indexOf(key: K, value: Int): Int {
        for (i in value until keys.size) {
            if (keys[i] == key) return i
            if (keys[i] == EMPTY_SLOT) return NOT_FOUND
        }
        for (i in 0 until value) {
            if (keys[i] == key) return i
            if (keys[i] == EMPTY_SLOT) return NOT_FOUND
        }
        return NOT_FOUND
    }

    private fun findEmpty(value: Int): Int {
        for (i in value until keys.size) {
            if (keys[i] == EMPTY_SLOT) return i
        }
        for (i in 0 until value) {
            if (keys[i] == EMPTY_SLOT) return i
        }
        throw RuntimeException("Overflowed :(")
    }

    companion object {

        const val NOT_FOUND: Int = -1
        private val EMPTY_SLOT = null
        private const val LOAD_FACTOR = 0.8F

        @JvmStatic
        fun <T> create(initialCapacity: Int): IntIdentityHashBiMap<T> = IntIdentityHashBiMap((initialCapacity.toFloat() / LOAD_FACTOR).toInt())

        // The magic values in here are from the mixer parts of MurmurHash3
        @JvmStatic
        private fun murmurHash3Mixer(value: Int): Int {
            var temp = value xor value ushr 16
            temp *= -2048144789
            temp = temp xor temp ushr 13
            temp *= -1028477387
            return temp xor temp ushr 16
        }

        @JvmStatic
        private fun <T> newArray(size: Int): Array<T?> = arrayOfNulls<Any>(size) as Array<T?>
    }
}
