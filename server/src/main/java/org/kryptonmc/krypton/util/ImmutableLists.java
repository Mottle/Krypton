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
package org.kryptonmc.krypton.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Collection;
import java.util.List;

public final class ImmutableLists {

    public static <E> @NotNull @Unmodifiable List<E> copyOf(Collection<E> collection) {
        return List.copyOf(collection);
    }

    public static <E> @NotNull @Unmodifiable List<E> of() {
        return List.of();
    }

    public static <E> @NotNull @Unmodifiable List<E> ofArray(E[] elements) {
        return List.of(elements);
    }

    private ImmutableLists() {
        throw new AssertionError("This class cannot be instantiated!");
    }
}
