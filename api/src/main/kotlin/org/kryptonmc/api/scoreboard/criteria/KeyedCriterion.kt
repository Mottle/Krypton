/*
 * This file is part of the Krypton API, licensed under the MIT license.
 *
 * Copyright (C) 2021-2022 KryptonMC and the contributors to the Krypton project.
 *
 * This project is licensed under the terms of the MIT license.
 * For more details, please reference the LICENSE file in the api top-level directory.
 */
package org.kryptonmc.api.scoreboard.criteria

import net.kyori.adventure.key.Keyed
import org.kryptonmc.api.util.CataloguedBy
import javax.annotation.concurrent.Immutable

/**
 * A criterion for a scoreboard objective to be displayed.
 */
@CataloguedBy(Criteria::class)
@Immutable
public interface KeyedCriterion : Criterion, Keyed