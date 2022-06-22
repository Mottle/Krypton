/*
 * This file is part of the Krypton API, licensed under the MIT license.
 *
 * Copyright (C) 2021-2022 KryptonMC and the contributors to the Krypton project.
 *
 * This project is licensed under the terms of the MIT license.
 * For more details, please reference the LICENSE file in the api top-level directory.
 */
package org.kryptonmc.api.item

import net.kyori.adventure.key.Key
import org.kryptonmc.api.registry.Registries
import org.kryptonmc.api.util.Catalogue

/**
 * This file is auto-generated. Do not edit this manually!
 */
@Catalogue(ItemType::class)
public object ItemTypes {

    // @formatter:off
    @JvmField
    public val AIR: ItemType = get("air")
    @JvmField
    public val STONE: ItemType = get("stone")
    @JvmField
    public val GRANITE: ItemType = get("granite")
    @JvmField
    public val POLISHED_GRANITE: ItemType = get("polished_granite")
    @JvmField
    public val DIORITE: ItemType = get("diorite")
    @JvmField
    public val POLISHED_DIORITE: ItemType = get("polished_diorite")
    @JvmField
    public val ANDESITE: ItemType = get("andesite")
    @JvmField
    public val POLISHED_ANDESITE: ItemType = get("polished_andesite")
    @JvmField
    public val DEEPSLATE: ItemType = get("deepslate")
    @JvmField
    public val COBBLED_DEEPSLATE: ItemType = get("cobbled_deepslate")
    @JvmField
    public val POLISHED_DEEPSLATE: ItemType = get("polished_deepslate")
    @JvmField
    public val CALCITE: ItemType = get("calcite")
    @JvmField
    public val TUFF: ItemType = get("tuff")
    @JvmField
    public val DRIPSTONE_BLOCK: ItemType = get("dripstone_block")
    @JvmField
    public val GRASS_BLOCK: ItemType = get("grass_block")
    @JvmField
    public val DIRT: ItemType = get("dirt")
    @JvmField
    public val COARSE_DIRT: ItemType = get("coarse_dirt")
    @JvmField
    public val PODZOL: ItemType = get("podzol")
    @JvmField
    public val ROOTED_DIRT: ItemType = get("rooted_dirt")
    @JvmField
    public val CRIMSON_NYLIUM: ItemType = get("crimson_nylium")
    @JvmField
    public val WARPED_NYLIUM: ItemType = get("warped_nylium")
    @JvmField
    public val COBBLESTONE: ItemType = get("cobblestone")
    @JvmField
    public val OAK_PLANKS: ItemType = get("oak_planks")
    @JvmField
    public val SPRUCE_PLANKS: ItemType = get("spruce_planks")
    @JvmField
    public val BIRCH_PLANKS: ItemType = get("birch_planks")
    @JvmField
    public val JUNGLE_PLANKS: ItemType = get("jungle_planks")
    @JvmField
    public val ACACIA_PLANKS: ItemType = get("acacia_planks")
    @JvmField
    public val DARK_OAK_PLANKS: ItemType = get("dark_oak_planks")
    @JvmField
    public val CRIMSON_PLANKS: ItemType = get("crimson_planks")
    @JvmField
    public val WARPED_PLANKS: ItemType = get("warped_planks")
    @JvmField
    public val OAK_SAPLING: ItemType = get("oak_sapling")
    @JvmField
    public val SPRUCE_SAPLING: ItemType = get("spruce_sapling")
    @JvmField
    public val BIRCH_SAPLING: ItemType = get("birch_sapling")
    @JvmField
    public val JUNGLE_SAPLING: ItemType = get("jungle_sapling")
    @JvmField
    public val ACACIA_SAPLING: ItemType = get("acacia_sapling")
    @JvmField
    public val DARK_OAK_SAPLING: ItemType = get("dark_oak_sapling")
    @JvmField
    public val BEDROCK: ItemType = get("bedrock")
    @JvmField
    public val SAND: ItemType = get("sand")
    @JvmField
    public val RED_SAND: ItemType = get("red_sand")
    @JvmField
    public val GRAVEL: ItemType = get("gravel")
    @JvmField
    public val COAL_ORE: ItemType = get("coal_ore")
    @JvmField
    public val DEEPSLATE_COAL_ORE: ItemType = get("deepslate_coal_ore")
    @JvmField
    public val IRON_ORE: ItemType = get("iron_ore")
    @JvmField
    public val DEEPSLATE_IRON_ORE: ItemType = get("deepslate_iron_ore")
    @JvmField
    public val COPPER_ORE: ItemType = get("copper_ore")
    @JvmField
    public val DEEPSLATE_COPPER_ORE: ItemType = get("deepslate_copper_ore")
    @JvmField
    public val GOLD_ORE: ItemType = get("gold_ore")
    @JvmField
    public val DEEPSLATE_GOLD_ORE: ItemType = get("deepslate_gold_ore")
    @JvmField
    public val REDSTONE_ORE: ItemType = get("redstone_ore")
    @JvmField
    public val DEEPSLATE_REDSTONE_ORE: ItemType = get("deepslate_redstone_ore")
    @JvmField
    public val EMERALD_ORE: ItemType = get("emerald_ore")
    @JvmField
    public val DEEPSLATE_EMERALD_ORE: ItemType = get("deepslate_emerald_ore")
    @JvmField
    public val LAPIS_ORE: ItemType = get("lapis_ore")
    @JvmField
    public val DEEPSLATE_LAPIS_ORE: ItemType = get("deepslate_lapis_ore")
    @JvmField
    public val DIAMOND_ORE: ItemType = get("diamond_ore")
    @JvmField
    public val DEEPSLATE_DIAMOND_ORE: ItemType = get("deepslate_diamond_ore")
    @JvmField
    public val NETHER_GOLD_ORE: ItemType = get("nether_gold_ore")
    @JvmField
    public val NETHER_QUARTZ_ORE: ItemType = get("nether_quartz_ore")
    @JvmField
    public val ANCIENT_DEBRIS: ItemType = get("ancient_debris")
    @JvmField
    public val COAL_BLOCK: ItemType = get("coal_block")
    @JvmField
    public val RAW_IRON_BLOCK: ItemType = get("raw_iron_block")
    @JvmField
    public val RAW_COPPER_BLOCK: ItemType = get("raw_copper_block")
    @JvmField
    public val RAW_GOLD_BLOCK: ItemType = get("raw_gold_block")
    @JvmField
    public val AMETHYST_BLOCK: ItemType = get("amethyst_block")
    @JvmField
    public val BUDDING_AMETHYST: ItemType = get("budding_amethyst")
    @JvmField
    public val IRON_BLOCK: ItemType = get("iron_block")
    @JvmField
    public val COPPER_BLOCK: ItemType = get("copper_block")
    @JvmField
    public val GOLD_BLOCK: ItemType = get("gold_block")
    @JvmField
    public val DIAMOND_BLOCK: ItemType = get("diamond_block")
    @JvmField
    public val NETHERITE_BLOCK: ItemType = get("netherite_block")
    @JvmField
    public val EXPOSED_COPPER: ItemType = get("exposed_copper")
    @JvmField
    public val WEATHERED_COPPER: ItemType = get("weathered_copper")
    @JvmField
    public val OXIDIZED_COPPER: ItemType = get("oxidized_copper")
    @JvmField
    public val CUT_COPPER: ItemType = get("cut_copper")
    @JvmField
    public val EXPOSED_CUT_COPPER: ItemType = get("exposed_cut_copper")
    @JvmField
    public val WEATHERED_CUT_COPPER: ItemType = get("weathered_cut_copper")
    @JvmField
    public val OXIDIZED_CUT_COPPER: ItemType = get("oxidized_cut_copper")
    @JvmField
    public val CUT_COPPER_STAIRS: ItemType = get("cut_copper_stairs")
    @JvmField
    public val EXPOSED_CUT_COPPER_STAIRS: ItemType = get("exposed_cut_copper_stairs")
    @JvmField
    public val WEATHERED_CUT_COPPER_STAIRS: ItemType = get("weathered_cut_copper_stairs")
    @JvmField
    public val OXIDIZED_CUT_COPPER_STAIRS: ItemType = get("oxidized_cut_copper_stairs")
    @JvmField
    public val CUT_COPPER_SLAB: ItemType = get("cut_copper_slab")
    @JvmField
    public val EXPOSED_CUT_COPPER_SLAB: ItemType = get("exposed_cut_copper_slab")
    @JvmField
    public val WEATHERED_CUT_COPPER_SLAB: ItemType = get("weathered_cut_copper_slab")
    @JvmField
    public val OXIDIZED_CUT_COPPER_SLAB: ItemType = get("oxidized_cut_copper_slab")
    @JvmField
    public val WAXED_COPPER_BLOCK: ItemType = get("waxed_copper_block")
    @JvmField
    public val WAXED_EXPOSED_COPPER: ItemType = get("waxed_exposed_copper")
    @JvmField
    public val WAXED_WEATHERED_COPPER: ItemType = get("waxed_weathered_copper")
    @JvmField
    public val WAXED_OXIDIZED_COPPER: ItemType = get("waxed_oxidized_copper")
    @JvmField
    public val WAXED_CUT_COPPER: ItemType = get("waxed_cut_copper")
    @JvmField
    public val WAXED_EXPOSED_CUT_COPPER: ItemType = get("waxed_exposed_cut_copper")
    @JvmField
    public val WAXED_WEATHERED_CUT_COPPER: ItemType = get("waxed_weathered_cut_copper")
    @JvmField
    public val WAXED_OXIDIZED_CUT_COPPER: ItemType = get("waxed_oxidized_cut_copper")
    @JvmField
    public val WAXED_CUT_COPPER_STAIRS: ItemType = get("waxed_cut_copper_stairs")
    @JvmField
    public val WAXED_EXPOSED_CUT_COPPER_STAIRS: ItemType = get("waxed_exposed_cut_copper_stairs")
    @JvmField
    public val WAXED_WEATHERED_CUT_COPPER_STAIRS: ItemType = get("waxed_weathered_cut_copper_stairs")
    @JvmField
    public val WAXED_OXIDIZED_CUT_COPPER_STAIRS: ItemType = get("waxed_oxidized_cut_copper_stairs")
    @JvmField
    public val WAXED_CUT_COPPER_SLAB: ItemType = get("waxed_cut_copper_slab")
    @JvmField
    public val WAXED_EXPOSED_CUT_COPPER_SLAB: ItemType = get("waxed_exposed_cut_copper_slab")
    @JvmField
    public val WAXED_WEATHERED_CUT_COPPER_SLAB: ItemType = get("waxed_weathered_cut_copper_slab")
    @JvmField
    public val WAXED_OXIDIZED_CUT_COPPER_SLAB: ItemType = get("waxed_oxidized_cut_copper_slab")
    @JvmField
    public val OAK_LOG: ItemType = get("oak_log")
    @JvmField
    public val SPRUCE_LOG: ItemType = get("spruce_log")
    @JvmField
    public val BIRCH_LOG: ItemType = get("birch_log")
    @JvmField
    public val JUNGLE_LOG: ItemType = get("jungle_log")
    @JvmField
    public val ACACIA_LOG: ItemType = get("acacia_log")
    @JvmField
    public val DARK_OAK_LOG: ItemType = get("dark_oak_log")
    @JvmField
    public val CRIMSON_STEM: ItemType = get("crimson_stem")
    @JvmField
    public val WARPED_STEM: ItemType = get("warped_stem")
    @JvmField
    public val STRIPPED_OAK_LOG: ItemType = get("stripped_oak_log")
    @JvmField
    public val STRIPPED_SPRUCE_LOG: ItemType = get("stripped_spruce_log")
    @JvmField
    public val STRIPPED_BIRCH_LOG: ItemType = get("stripped_birch_log")
    @JvmField
    public val STRIPPED_JUNGLE_LOG: ItemType = get("stripped_jungle_log")
    @JvmField
    public val STRIPPED_ACACIA_LOG: ItemType = get("stripped_acacia_log")
    @JvmField
    public val STRIPPED_DARK_OAK_LOG: ItemType = get("stripped_dark_oak_log")
    @JvmField
    public val STRIPPED_CRIMSON_STEM: ItemType = get("stripped_crimson_stem")
    @JvmField
    public val STRIPPED_WARPED_STEM: ItemType = get("stripped_warped_stem")
    @JvmField
    public val STRIPPED_OAK_WOOD: ItemType = get("stripped_oak_wood")
    @JvmField
    public val STRIPPED_SPRUCE_WOOD: ItemType = get("stripped_spruce_wood")
    @JvmField
    public val STRIPPED_BIRCH_WOOD: ItemType = get("stripped_birch_wood")
    @JvmField
    public val STRIPPED_JUNGLE_WOOD: ItemType = get("stripped_jungle_wood")
    @JvmField
    public val STRIPPED_ACACIA_WOOD: ItemType = get("stripped_acacia_wood")
    @JvmField
    public val STRIPPED_DARK_OAK_WOOD: ItemType = get("stripped_dark_oak_wood")
    @JvmField
    public val STRIPPED_CRIMSON_HYPHAE: ItemType = get("stripped_crimson_hyphae")
    @JvmField
    public val STRIPPED_WARPED_HYPHAE: ItemType = get("stripped_warped_hyphae")
    @JvmField
    public val OAK_WOOD: ItemType = get("oak_wood")
    @JvmField
    public val SPRUCE_WOOD: ItemType = get("spruce_wood")
    @JvmField
    public val BIRCH_WOOD: ItemType = get("birch_wood")
    @JvmField
    public val JUNGLE_WOOD: ItemType = get("jungle_wood")
    @JvmField
    public val ACACIA_WOOD: ItemType = get("acacia_wood")
    @JvmField
    public val DARK_OAK_WOOD: ItemType = get("dark_oak_wood")
    @JvmField
    public val CRIMSON_HYPHAE: ItemType = get("crimson_hyphae")
    @JvmField
    public val WARPED_HYPHAE: ItemType = get("warped_hyphae")
    @JvmField
    public val OAK_LEAVES: ItemType = get("oak_leaves")
    @JvmField
    public val SPRUCE_LEAVES: ItemType = get("spruce_leaves")
    @JvmField
    public val BIRCH_LEAVES: ItemType = get("birch_leaves")
    @JvmField
    public val JUNGLE_LEAVES: ItemType = get("jungle_leaves")
    @JvmField
    public val ACACIA_LEAVES: ItemType = get("acacia_leaves")
    @JvmField
    public val DARK_OAK_LEAVES: ItemType = get("dark_oak_leaves")
    @JvmField
    public val AZALEA_LEAVES: ItemType = get("azalea_leaves")
    @JvmField
    public val FLOWERING_AZALEA_LEAVES: ItemType = get("flowering_azalea_leaves")
    @JvmField
    public val SPONGE: ItemType = get("sponge")
    @JvmField
    public val WET_SPONGE: ItemType = get("wet_sponge")
    @JvmField
    public val GLASS: ItemType = get("glass")
    @JvmField
    public val TINTED_GLASS: ItemType = get("tinted_glass")
    @JvmField
    public val LAPIS_BLOCK: ItemType = get("lapis_block")
    @JvmField
    public val SANDSTONE: ItemType = get("sandstone")
    @JvmField
    public val CHISELED_SANDSTONE: ItemType = get("chiseled_sandstone")
    @JvmField
    public val CUT_SANDSTONE: ItemType = get("cut_sandstone")
    @JvmField
    public val COBWEB: ItemType = get("cobweb")
    @JvmField
    public val GRASS: ItemType = get("grass")
    @JvmField
    public val FERN: ItemType = get("fern")
    @JvmField
    public val AZALEA: ItemType = get("azalea")
    @JvmField
    public val FLOWERING_AZALEA: ItemType = get("flowering_azalea")
    @JvmField
    public val DEAD_BUSH: ItemType = get("dead_bush")
    @JvmField
    public val SEAGRASS: ItemType = get("seagrass")
    @JvmField
    public val SEA_PICKLE: ItemType = get("sea_pickle")
    @JvmField
    public val WHITE_WOOL: ItemType = get("white_wool")
    @JvmField
    public val ORANGE_WOOL: ItemType = get("orange_wool")
    @JvmField
    public val MAGENTA_WOOL: ItemType = get("magenta_wool")
    @JvmField
    public val LIGHT_BLUE_WOOL: ItemType = get("light_blue_wool")
    @JvmField
    public val YELLOW_WOOL: ItemType = get("yellow_wool")
    @JvmField
    public val LIME_WOOL: ItemType = get("lime_wool")
    @JvmField
    public val PINK_WOOL: ItemType = get("pink_wool")
    @JvmField
    public val GRAY_WOOL: ItemType = get("gray_wool")
    @JvmField
    public val LIGHT_GRAY_WOOL: ItemType = get("light_gray_wool")
    @JvmField
    public val CYAN_WOOL: ItemType = get("cyan_wool")
    @JvmField
    public val PURPLE_WOOL: ItemType = get("purple_wool")
    @JvmField
    public val BLUE_WOOL: ItemType = get("blue_wool")
    @JvmField
    public val BROWN_WOOL: ItemType = get("brown_wool")
    @JvmField
    public val GREEN_WOOL: ItemType = get("green_wool")
    @JvmField
    public val RED_WOOL: ItemType = get("red_wool")
    @JvmField
    public val BLACK_WOOL: ItemType = get("black_wool")
    @JvmField
    public val DANDELION: ItemType = get("dandelion")
    @JvmField
    public val POPPY: ItemType = get("poppy")
    @JvmField
    public val BLUE_ORCHID: ItemType = get("blue_orchid")
    @JvmField
    public val ALLIUM: ItemType = get("allium")
    @JvmField
    public val AZURE_BLUET: ItemType = get("azure_bluet")
    @JvmField
    public val RED_TULIP: ItemType = get("red_tulip")
    @JvmField
    public val ORANGE_TULIP: ItemType = get("orange_tulip")
    @JvmField
    public val WHITE_TULIP: ItemType = get("white_tulip")
    @JvmField
    public val PINK_TULIP: ItemType = get("pink_tulip")
    @JvmField
    public val OXEYE_DAISY: ItemType = get("oxeye_daisy")
    @JvmField
    public val CORNFLOWER: ItemType = get("cornflower")
    @JvmField
    public val LILY_OF_THE_VALLEY: ItemType = get("lily_of_the_valley")
    @JvmField
    public val WITHER_ROSE: ItemType = get("wither_rose")
    @JvmField
    public val SPORE_BLOSSOM: ItemType = get("spore_blossom")
    @JvmField
    public val BROWN_MUSHROOM: ItemType = get("brown_mushroom")
    @JvmField
    public val RED_MUSHROOM: ItemType = get("red_mushroom")
    @JvmField
    public val CRIMSON_FUNGUS: ItemType = get("crimson_fungus")
    @JvmField
    public val WARPED_FUNGUS: ItemType = get("warped_fungus")
    @JvmField
    public val CRIMSON_ROOTS: ItemType = get("crimson_roots")
    @JvmField
    public val WARPED_ROOTS: ItemType = get("warped_roots")
    @JvmField
    public val NETHER_SPROUTS: ItemType = get("nether_sprouts")
    @JvmField
    public val WEEPING_VINES: ItemType = get("weeping_vines")
    @JvmField
    public val TWISTING_VINES: ItemType = get("twisting_vines")
    @JvmField
    public val SUGAR_CANE: ItemType = get("sugar_cane")
    @JvmField
    public val KELP: ItemType = get("kelp")
    @JvmField
    public val MOSS_CARPET: ItemType = get("moss_carpet")
    @JvmField
    public val MOSS_BLOCK: ItemType = get("moss_block")
    @JvmField
    public val HANGING_ROOTS: ItemType = get("hanging_roots")
    @JvmField
    public val BIG_DRIPLEAF: ItemType = get("big_dripleaf")
    @JvmField
    public val SMALL_DRIPLEAF: ItemType = get("small_dripleaf")
    @JvmField
    public val BAMBOO: ItemType = get("bamboo")
    @JvmField
    public val OAK_SLAB: ItemType = get("oak_slab")
    @JvmField
    public val SPRUCE_SLAB: ItemType = get("spruce_slab")
    @JvmField
    public val BIRCH_SLAB: ItemType = get("birch_slab")
    @JvmField
    public val JUNGLE_SLAB: ItemType = get("jungle_slab")
    @JvmField
    public val ACACIA_SLAB: ItemType = get("acacia_slab")
    @JvmField
    public val DARK_OAK_SLAB: ItemType = get("dark_oak_slab")
    @JvmField
    public val CRIMSON_SLAB: ItemType = get("crimson_slab")
    @JvmField
    public val WARPED_SLAB: ItemType = get("warped_slab")
    @JvmField
    public val STONE_SLAB: ItemType = get("stone_slab")
    @JvmField
    public val SMOOTH_STONE_SLAB: ItemType = get("smooth_stone_slab")
    @JvmField
    public val SANDSTONE_SLAB: ItemType = get("sandstone_slab")
    @JvmField
    public val CUT_STANDSTONE_SLAB: ItemType = get("cut_sandstone_slab")
    @JvmField
    public val PETRIFIED_OAK_SLAB: ItemType = get("petrified_oak_slab")
    @JvmField
    public val COBBLESTONE_SLAB: ItemType = get("cobblestone_slab")
    @JvmField
    public val BRICK_SLAB: ItemType = get("brick_slab")
    @JvmField
    public val STONE_BRICK_SLAB: ItemType = get("stone_brick_slab")
    @JvmField
    public val NETHER_BRICK_SLAB: ItemType = get("nether_brick_slab")
    @JvmField
    public val QUARTZ_SLAB: ItemType = get("quartz_slab")
    @JvmField
    public val RED_SANDSTONE_SLAB: ItemType = get("red_sandstone_slab")
    @JvmField
    public val CUT_RED_SANDSTONE_SLAB: ItemType = get("cut_red_sandstone_slab")
    @JvmField
    public val PURPUR_SLAB: ItemType = get("purpur_slab")
    @JvmField
    public val PRISMARINE_SLAB: ItemType = get("prismarine_slab")
    @JvmField
    public val PRISMARINE_BRICK_SLAB: ItemType = get("prismarine_brick_slab")
    @JvmField
    public val DARK_PRISMARINE_SLAB: ItemType = get("dark_prismarine_slab")
    @JvmField
    public val SMOOTH_QUARTZ: ItemType = get("smooth_quartz")
    @JvmField
    public val SMOOTH_RED_SANDSTONE: ItemType = get("smooth_red_sandstone")
    @JvmField
    public val SMOOTH_SANDSTONE: ItemType = get("smooth_sandstone")
    @JvmField
    public val SMOOTH_STONE: ItemType = get("smooth_stone")
    @JvmField
    public val BRICKS: ItemType = get("bricks")
    @JvmField
    public val BOOKSHELF: ItemType = get("bookshelf")
    @JvmField
    public val MOSSY_COBBLESTONE: ItemType = get("mossy_cobblestone")
    @JvmField
    public val OBSIDIAN: ItemType = get("obsidian")
    @JvmField
    public val TORCH: ItemType = get("torch")
    @JvmField
    public val END_ROD: ItemType = get("end_rod")
    @JvmField
    public val CHORUS_PLANT: ItemType = get("chorus_plant")
    @JvmField
    public val CHORUS_FLOWER: ItemType = get("chorus_flower")
    @JvmField
    public val PURPUR_BLOCK: ItemType = get("purpur_block")
    @JvmField
    public val PURPUR_PILLAR: ItemType = get("purpur_pillar")
    @JvmField
    public val PURPUR_STAIRS: ItemType = get("purpur_stairs")
    @JvmField
    public val SPAWNER: ItemType = get("spawner")
    @JvmField
    public val OAK_STAIRS: ItemType = get("oak_stairs")
    @JvmField
    public val CHEST: ItemType = get("chest")
    @JvmField
    public val CRAFTING_TABLE: ItemType = get("crafting_table")
    @JvmField
    public val FARMLAND: ItemType = get("farmland")
    @JvmField
    public val FURNACE: ItemType = get("furnace")
    @JvmField
    public val LADDER: ItemType = get("ladder")
    @JvmField
    public val COBBLESTONE_STAIRS: ItemType = get("cobblestone_stairs")
    @JvmField
    public val SNOW: ItemType = get("snow")
    @JvmField
    public val ICE: ItemType = get("ice")
    @JvmField
    public val SNOW_BLOCK: ItemType = get("snow_block")
    @JvmField
    public val CACTUS: ItemType = get("cactus")
    @JvmField
    public val CLAY: ItemType = get("clay")
    @JvmField
    public val JUKEBOX: ItemType = get("jukebox")
    @JvmField
    public val OAK_FENCE: ItemType = get("oak_fence")
    @JvmField
    public val SPRUCE_FENCE: ItemType = get("spruce_fence")
    @JvmField
    public val BIRCH_FENCE: ItemType = get("birch_fence")
    @JvmField
    public val JUNGLE_FENCE: ItemType = get("jungle_fence")
    @JvmField
    public val ACACIA_FENCE: ItemType = get("acacia_fence")
    @JvmField
    public val DARK_OAK_FENCE: ItemType = get("dark_oak_fence")
    @JvmField
    public val CRIMSON_FENCE: ItemType = get("crimson_fence")
    @JvmField
    public val WARPED_FENCE: ItemType = get("warped_fence")
    @JvmField
    public val PUMPKIN: ItemType = get("pumpkin")
    @JvmField
    public val CARVED_PUMPKIN: ItemType = get("carved_pumpkin")
    @JvmField
    public val JACK_O_LANTERN: ItemType = get("jack_o_lantern")
    @JvmField
    public val NETHERRACK: ItemType = get("netherrack")
    @JvmField
    public val SOUL_SAND: ItemType = get("soul_sand")
    @JvmField
    public val SOUL_SOIL: ItemType = get("soul_soil")
    @JvmField
    public val BASALT: ItemType = get("basalt")
    @JvmField
    public val POLISHED_BASALT: ItemType = get("polished_basalt")
    @JvmField
    public val SMOOTH_BASALT: ItemType = get("smooth_basalt")
    @JvmField
    public val SOUL_TORCH: ItemType = get("soul_torch")
    @JvmField
    public val GLOWSTONE: ItemType = get("glowstone")
    @JvmField
    public val INFESTED_STONE: ItemType = get("infested_stone")
    @JvmField
    public val INFESTED_COBBLESTONE: ItemType = get("infested_cobblestone")
    @JvmField
    public val INFESTED_STONE_BRICKS: ItemType = get("infested_stone_bricks")
    @JvmField
    public val INFESTED_MOSSY_STONE_BRICKS: ItemType = get("infested_mossy_stone_bricks")
    @JvmField
    public val INFESTED_CRACKED_STONE_BRICKS: ItemType = get("infested_cracked_stone_bricks")
    @JvmField
    public val INFESTED_CHISELED_STONE_BRICKS: ItemType = get("infested_chiseled_stone_bricks")
    @JvmField
    public val INFESTED_DEEPSLATE: ItemType = get("infested_deepslate")
    @JvmField
    public val STONE_BRICKS: ItemType = get("stone_bricks")
    @JvmField
    public val MOSSY_STONE_BRICKS: ItemType = get("mossy_stone_bricks")
    @JvmField
    public val CRACKED_STONE_BRICKS: ItemType = get("cracked_stone_bricks")
    @JvmField
    public val CHISELED_STONE_BRICKS: ItemType = get("chiseled_stone_bricks")
    @JvmField
    public val DEEPSLATE_BRICKS: ItemType = get("deepslate_bricks")
    @JvmField
    public val CRACKED_DEEPSLATE_BRICKS: ItemType = get("cracked_deepslate_bricks")
    @JvmField
    public val DEEPSLATE_TILES: ItemType = get("deepslate_tiles")
    @JvmField
    public val CRACKED_DEEPSLATE_TILES: ItemType = get("cracked_deepslate_tiles")
    @JvmField
    public val CHISELED_DEEPSLATE: ItemType = get("chiseled_deepslate")
    @JvmField
    public val BROWN_MUSHROOM_BLOCK: ItemType = get("brown_mushroom_block")
    @JvmField
    public val RED_MUSHROOM_BLOCK: ItemType = get("red_mushroom_block")
    @JvmField
    public val MUSHROOM_STEM: ItemType = get("mushroom_stem")
    @JvmField
    public val IRON_BARS: ItemType = get("iron_bars")
    @JvmField
    public val CHAIN: ItemType = get("chain")
    @JvmField
    public val GLASS_PANE: ItemType = get("glass_pane")
    @JvmField
    public val MELON: ItemType = get("melon")
    @JvmField
    public val VINE: ItemType = get("vine")
    @JvmField
    public val GLOW_LICHEN: ItemType = get("glow_lichen")
    @JvmField
    public val BRICK_STAIRS: ItemType = get("brick_stairs")
    @JvmField
    public val STONE_BRICK_STAIRS: ItemType = get("stone_brick_stairs")
    @JvmField
    public val MYCELIUM: ItemType = get("mycelium")
    @JvmField
    public val LILY_PAD: ItemType = get("lily_pad")
    @JvmField
    public val NETHER_BRICKS: ItemType = get("nether_bricks")
    @JvmField
    public val CRACKED_NETHER_BRICKS: ItemType = get("cracked_nether_bricks")
    @JvmField
    public val CHISELED_NETHER_BRICKS: ItemType = get("chiseled_nether_bricks")
    @JvmField
    public val NETHER_BRICK_FENCE: ItemType = get("nether_brick_fence")
    @JvmField
    public val NETHER_BRICK_STAIRS: ItemType = get("nether_brick_stairs")
    @JvmField
    public val ENCHANTING_TABLE: ItemType = get("enchanting_table")
    @JvmField
    public val END_PORTAL_FRAME: ItemType = get("end_portal_frame")
    @JvmField
    public val END_STONE: ItemType = get("end_stone")
    @JvmField
    public val END_STONE_BRICKS: ItemType = get("end_stone_bricks")
    @JvmField
    public val DRAGON_EGG: ItemType = get("dragon_egg")
    @JvmField
    public val SANDSTONE_STAIRS: ItemType = get("sandstone_stairs")
    @JvmField
    public val ENDER_CHEST: ItemType = get("ender_chest")
    @JvmField
    public val EMERALD_BLOCK: ItemType = get("emerald_block")
    @JvmField
    public val SPRUCE_STAIRS: ItemType = get("spruce_stairs")
    @JvmField
    public val BIRCH_STAIRS: ItemType = get("birch_stairs")
    @JvmField
    public val JUNGLE_STAIRS: ItemType = get("jungle_stairs")
    @JvmField
    public val CRIMSON_STAIRS: ItemType = get("crimson_stairs")
    @JvmField
    public val WARPED_STAIRS: ItemType = get("warped_stairs")
    @JvmField
    public val COMMAND_BLOCK: ItemType = get("command_block")
    @JvmField
    public val BEACON: ItemType = get("beacon")
    @JvmField
    public val COBBLESTONE_WALL: ItemType = get("cobblestone_wall")
    @JvmField
    public val MOSSY_COBBLESTONE_WALL: ItemType = get("mossy_cobblestone_wall")
    @JvmField
    public val BRICK_WALL: ItemType = get("brick_wall")
    @JvmField
    public val PRISMARINE_WALL: ItemType = get("prismarine_wall")
    @JvmField
    public val RED_SANDSTONE_WALL: ItemType = get("red_sandstone_wall")
    @JvmField
    public val MOSSY_STONE_BRICK_WALL: ItemType = get("mossy_stone_brick_wall")
    @JvmField
    public val GRANITE_WALL: ItemType = get("granite_wall")
    @JvmField
    public val STONE_BRICK_WALL: ItemType = get("stone_brick_wall")
    @JvmField
    public val NETHER_BRICK_WALL: ItemType = get("nether_brick_wall")
    @JvmField
    public val ANDESITE_WALL: ItemType = get("andesite_wall")
    @JvmField
    public val RED_NETHER_BRICK_WALL: ItemType = get("red_nether_brick_wall")
    @JvmField
    public val SANDSTONE_WALL: ItemType = get("sandstone_wall")
    @JvmField
    public val END_STONE_BRICK_WALL: ItemType = get("end_stone_brick_wall")
    @JvmField
    public val DIORITE_WALL: ItemType = get("diorite_wall")
    @JvmField
    public val BLACKSTONE_WALL: ItemType = get("blackstone_wall")
    @JvmField
    public val POLISHED_BLACKSTONE_WALL: ItemType = get("polished_blackstone_wall")
    @JvmField
    public val POLISHED_BLACKSTONE_BRICK_WALL: ItemType = get("polished_blackstone_brick_wall")
    @JvmField
    public val COBBLED_DEEPSLATE_WALL: ItemType = get("cobbled_deepslate_wall")
    @JvmField
    public val POLISHED_DEEPSLATE_WALL: ItemType = get("polished_deepslate_wall")
    @JvmField
    public val DEEPSLATE_BRICK_WALL: ItemType = get("deepslate_brick_wall")
    @JvmField
    public val DEEPSLATE_TILE_WALL: ItemType = get("deepslate_tile_wall")
    @JvmField
    public val ANVIL: ItemType = get("anvil")
    @JvmField
    public val CHIPPED_ANVIL: ItemType = get("chipped_anvil")
    @JvmField
    public val DAMAGED_ANVIL: ItemType = get("damaged_anvil")
    @JvmField
    public val CHISELED_QUARTZ_BLOCK: ItemType = get("chiseled_quartz_block")
    @JvmField
    public val QUARTZ_BLOCK: ItemType = get("quartz_block")
    @JvmField
    public val QUARTZ_BRICKS: ItemType = get("quartz_bricks")
    @JvmField
    public val QUARTZ_PILLAR: ItemType = get("quartz_pillar")
    @JvmField
    public val QUARTZ_STAIRS: ItemType = get("quartz_stairs")
    @JvmField
    public val WHITE_TERRACOTTA: ItemType = get("white_terracotta")
    @JvmField
    public val ORANGE_TERRACOTTA: ItemType = get("orange_terracotta")
    @JvmField
    public val MAGENTA_TERRACOTTA: ItemType = get("magenta_terracotta")
    @JvmField
    public val LIGHT_BLUE_TERRACOTTA: ItemType = get("light_blue_terracotta")
    @JvmField
    public val YELLOW_TERRACOTTA: ItemType = get("yellow_terracotta")
    @JvmField
    public val LIME_TERRACOTTA: ItemType = get("lime_terracotta")
    @JvmField
    public val PINK_TERRACOTTA: ItemType = get("pink_terracotta")
    @JvmField
    public val GRAY_TERRACOTTA: ItemType = get("gray_terracotta")
    @JvmField
    public val LIGHT_GRAY_TERRACOTTA: ItemType = get("light_gray_terracotta")
    @JvmField
    public val CYAN_TERRACOTTA: ItemType = get("cyan_terracotta")
    @JvmField
    public val PURPLE_TERRACOTTA: ItemType = get("purple_terracotta")
    @JvmField
    public val BLUE_TERRACOTTA: ItemType = get("blue_terracotta")
    @JvmField
    public val BROWN_TERRACOTTA: ItemType = get("brown_terracotta")
    @JvmField
    public val GREEN_TERRACOTTA: ItemType = get("green_terracotta")
    @JvmField
    public val RED_TERRACOTTA: ItemType = get("red_terracotta")
    @JvmField
    public val BLACK_TERRACOTTA: ItemType = get("black_terracotta")
    @JvmField
    public val BARRIER: ItemType = get("barrier")
    @JvmField
    public val LIGHT: ItemType = get("light")
    @JvmField
    public val HAY_BLOCK: ItemType = get("hay_block")
    @JvmField
    public val WHITE_CARPET: ItemType = get("white_carpet")
    @JvmField
    public val ORANGE_CARPET: ItemType = get("orange_carpet")
    @JvmField
    public val MAGENTA_CARPET: ItemType = get("magenta_carpet")
    @JvmField
    public val LIGHT_BLUE_CARPET: ItemType = get("light_blue_carpet")
    @JvmField
    public val YELLOW_CARPET: ItemType = get("yellow_carpet")
    @JvmField
    public val LIME_CARPET: ItemType = get("lime_carpet")
    @JvmField
    public val PINK_CARPET: ItemType = get("pink_carpet")
    @JvmField
    public val GRAY_CARPET: ItemType = get("gray_carpet")
    @JvmField
    public val LIGHT_GRAY_CARPET: ItemType = get("light_gray_carpet")
    @JvmField
    public val CYAN_CARPET: ItemType = get("cyan_carpet")
    @JvmField
    public val PURPLE_CARPET: ItemType = get("purple_carpet")
    @JvmField
    public val BLUE_CARPET: ItemType = get("blue_carpet")
    @JvmField
    public val BROWN_CARPET: ItemType = get("brown_carpet")
    @JvmField
    public val GREEN_CARPET: ItemType = get("green_carpet")
    @JvmField
    public val RED_CARPET: ItemType = get("red_carpet")
    @JvmField
    public val BLACK_CARPET: ItemType = get("black_carpet")
    @JvmField
    public val TERRACOTTA: ItemType = get("terracotta")
    @JvmField
    public val PACKED_ICE: ItemType = get("packed_ice")
    @JvmField
    public val ACACIA_STAIRS: ItemType = get("acacia_stairs")
    @JvmField
    public val DARK_OAK_STAIRS: ItemType = get("dark_oak_stairs")
    @JvmField
    public val DIRT_PATH: ItemType = get("dirt_path")
    @JvmField
    public val SUNFLOWER: ItemType = get("sunflower")
    @JvmField
    public val LILAC: ItemType = get("lilac")
    @JvmField
    public val ROSE_BUSH: ItemType = get("rose_bush")
    @JvmField
    public val PEONY: ItemType = get("peony")
    @JvmField
    public val TALL_GRASS: ItemType = get("tall_grass")
    @JvmField
    public val LARGE_FERN: ItemType = get("large_fern")
    @JvmField
    public val WHITE_STAINED_GLASS: ItemType = get("white_stained_glass")
    @JvmField
    public val ORANGE_STAINED_GLASS: ItemType = get("orange_stained_glass")
    @JvmField
    public val MAGENTA_STAINED_GLASS: ItemType = get("magenta_stained_glass")
    @JvmField
    public val LIGHT_BLUE_STAINED_GLASS: ItemType = get("light_blue_stained_glass")
    @JvmField
    public val YELLOW_STAINED_GLASS: ItemType = get("yellow_stained_glass")
    @JvmField
    public val LIME_STAINED_GLASS: ItemType = get("lime_stained_glass")
    @JvmField
    public val PINK_STAINED_GLASS: ItemType = get("pink_stained_glass")
    @JvmField
    public val GRAY_STAINED_GLASS: ItemType = get("gray_stained_glass")
    @JvmField
    public val LIGHT_GRAY_STAINED_GLASS: ItemType = get("light_gray_stained_glass")
    @JvmField
    public val CYAN_STAINED_GLASS: ItemType = get("cyan_stained_glass")
    @JvmField
    public val PURPLE_STAINED_GLASS: ItemType = get("purple_stained_glass")
    @JvmField
    public val BLUE_STAINED_GLASS: ItemType = get("blue_stained_glass")
    @JvmField
    public val BROWN_STAINED_GLASS: ItemType = get("brown_stained_glass")
    @JvmField
    public val GREEN_STAINED_GLASS: ItemType = get("green_stained_glass")
    @JvmField
    public val RED_STAINED_GLASS: ItemType = get("red_stained_glass")
    @JvmField
    public val BLACK_STAINED_GLASS: ItemType = get("black_stained_glass")
    @JvmField
    public val WHITE_STAINED_GLASS_PANE: ItemType = get("white_stained_glass_pane")
    @JvmField
    public val ORANGE_STAINED_GLASS_PANE: ItemType = get("orange_stained_glass_pane")
    @JvmField
    public val MAGENTA_STAINED_GLASS_PANE: ItemType = get("magenta_stained_glass_pane")
    @JvmField
    public val LIGHT_BLUE_STAINED_GLASS_PANE: ItemType = get("light_blue_stained_glass_pane")
    @JvmField
    public val YELLOW_STAINED_GLASS_PANE: ItemType = get("yellow_stained_glass_pane")
    @JvmField
    public val LIME_STAINED_GLASS_PANE: ItemType = get("lime_stained_glass_pane")
    @JvmField
    public val PINK_STAINED_GLASS_PANE: ItemType = get("pink_stained_glass_pane")
    @JvmField
    public val GRAY_STAINED_GLASS_PANE: ItemType = get("gray_stained_glass_pane")
    @JvmField
    public val LIGHT_GRAY_STAINED_GLASS_PANE: ItemType = get("light_gray_stained_glass_pane")
    @JvmField
    public val CYAN_STAINED_GLASS_PANE: ItemType = get("cyan_stained_glass_pane")
    @JvmField
    public val PURPLE_STAINED_GLASS_PANE: ItemType = get("purple_stained_glass_pane")
    @JvmField
    public val BLUE_STAINED_GLASS_PANE: ItemType = get("blue_stained_glass_pane")
    @JvmField
    public val BROWN_STAINED_GLASS_PANE: ItemType = get("brown_stained_glass_pane")
    @JvmField
    public val GREEN_STAINED_GLASS_PANE: ItemType = get("green_stained_glass_pane")
    @JvmField
    public val RED_STAINED_GLASS_PANE: ItemType = get("red_stained_glass_pane")
    @JvmField
    public val BLACK_STAINED_GLASS_PANE: ItemType = get("black_stained_glass_pane")
    @JvmField
    public val PRISMARINE: ItemType = get("prismarine")
    @JvmField
    public val PRISMARINE_BRICKS: ItemType = get("prismarine_bricks")
    @JvmField
    public val DARK_PRISMARINE: ItemType = get("dark_prismarine")
    @JvmField
    public val PRISMARINE_STAIRS: ItemType = get("prismarine_stairs")
    @JvmField
    public val PRISMARINE_BRICK_STAIRS: ItemType = get("prismarine_brick_stairs")
    @JvmField
    public val DARK_PRISMARINE_STAIRS: ItemType = get("dark_prismarine_stairs")
    @JvmField
    public val SEA_LANTERN: ItemType = get("sea_lantern")
    @JvmField
    public val RED_SANDSTONE: ItemType = get("red_sandstone")
    @JvmField
    public val CHISELED_RED_SANDSTONE: ItemType = get("chiseled_red_sandstone")
    @JvmField
    public val CUT_RED_SANDSTONE: ItemType = get("cut_red_sandstone")
    @JvmField
    public val RED_SANDSTONE_STAIRS: ItemType = get("red_sandstone_stairs")
    @JvmField
    public val REPEATING_COMMAND_BLOCK: ItemType = get("repeating_command_block")
    @JvmField
    public val CHAIN_COMMAND_BLOCK: ItemType = get("chain_command_block")
    @JvmField
    public val MAGMA_BLOCK: ItemType = get("magma_block")
    @JvmField
    public val NETHER_WART_BLOCK: ItemType = get("nether_wart_block")
    @JvmField
    public val WARPED_WART_BLOCK: ItemType = get("warped_wart_block")
    @JvmField
    public val RED_NETHER_BRICKS: ItemType = get("red_nether_bricks")
    @JvmField
    public val BONE_BLOCK: ItemType = get("bone_block")
    @JvmField
    public val STRUCTURE_VOID: ItemType = get("structure_void")
    @JvmField
    public val SHULKER_BOX: ItemType = get("shulker_box")
    @JvmField
    public val WHITE_SHULKER_BOX: ItemType = get("white_shulker_box")
    @JvmField
    public val ORANGE_SHULKER_BOX: ItemType = get("orange_shulker_box")
    @JvmField
    public val MAGENTA_SHULKER_BOX: ItemType = get("magenta_shulker_box")
    @JvmField
    public val LIGHT_BLUE_SHULKER_BOX: ItemType = get("light_blue_shulker_box")
    @JvmField
    public val YELLOW_SHULKER_BOX: ItemType = get("yellow_shulker_box")
    @JvmField
    public val LIME_SHULKER_BOX: ItemType = get("lime_shulker_box")
    @JvmField
    public val PINK_SHULKER_BOX: ItemType = get("pink_shulker_box")
    @JvmField
    public val GRAY_SHULKER_BOX: ItemType = get("gray_shulker_box")
    @JvmField
    public val LIGHT_GRAY_SHULKER_BOX: ItemType = get("light_gray_shulker_box")
    @JvmField
    public val CYAN_SHULKER_BOX: ItemType = get("cyan_shulker_box")
    @JvmField
    public val PURPLE_SHULKER_BOX: ItemType = get("purple_shulker_box")
    @JvmField
    public val BLUE_SHULKER_BOX: ItemType = get("blue_shulker_box")
    @JvmField
    public val BROWN_SHULKER_BOX: ItemType = get("brown_shulker_box")
    @JvmField
    public val GREEN_SHULKER_BOX: ItemType = get("green_shulker_box")
    @JvmField
    public val RED_SHULKER_BOX: ItemType = get("red_shulker_box")
    @JvmField
    public val BLACK_SHULKER_BOX: ItemType = get("black_shulker_box")
    @JvmField
    public val WHITE_GLAZED_TERRACOTTA: ItemType = get("white_glazed_terracotta")
    @JvmField
    public val ORANGE_GLAZED_TERRACOTTA: ItemType = get("orange_glazed_terracotta")
    @JvmField
    public val MAGENTA_GLAZED_TERRACOTTA: ItemType = get("magenta_glazed_terracotta")
    @JvmField
    public val LIGHT_BLUE_GLAZED_TERRACOTTA: ItemType = get("light_blue_glazed_terracotta")
    @JvmField
    public val YELLOW_GLAZED_TERRACOTTA: ItemType = get("yellow_glazed_terracotta")
    @JvmField
    public val LIME_GLAZED_TERRACOTTA: ItemType = get("lime_glazed_terracotta")
    @JvmField
    public val PINK_GLAZED_TERRACOTTA: ItemType = get("pink_glazed_terracotta")
    @JvmField
    public val GRAY_GLAZED_TERRACOTTA: ItemType = get("gray_glazed_terracotta")
    @JvmField
    public val LIGHT_GRAY_GLAZED_TERRACOTTA: ItemType = get("light_gray_glazed_terracotta")
    @JvmField
    public val CYAN_GLAZED_TERRACOTTA: ItemType = get("cyan_glazed_terracotta")
    @JvmField
    public val PURPLE_GLAZED_TERRACOTTA: ItemType = get("purple_glazed_terracotta")
    @JvmField
    public val BLUE_GLAZED_TERRACOTTA: ItemType = get("blue_glazed_terracotta")
    @JvmField
    public val BROWN_GLAZED_TERRACOTTA: ItemType = get("brown_glazed_terracotta")
    @JvmField
    public val GREEN_GLAZED_TERRACOTTA: ItemType = get("green_glazed_terracotta")
    @JvmField
    public val RED_GLAZED_TERRACOTTA: ItemType = get("red_glazed_terracotta")
    @JvmField
    public val BLACK_GLAZED_TERRACOTTA: ItemType = get("black_glazed_terracotta")
    @JvmField
    public val WHITE_CONCRETE: ItemType = get("white_concrete")
    @JvmField
    public val ORANGE_CONCRETE: ItemType = get("orange_concrete")
    @JvmField
    public val MAGENTA_CONCRETE: ItemType = get("magenta_concrete")
    @JvmField
    public val LIGHT_BLUE_CONCRETE: ItemType = get("light_blue_concrete")
    @JvmField
    public val YELLOW_CONCRETE: ItemType = get("yellow_concrete")
    @JvmField
    public val LIME_CONCRETE: ItemType = get("lime_concrete")
    @JvmField
    public val PINK_CONCRETE: ItemType = get("pink_concrete")
    @JvmField
    public val GRAY_CONCRETE: ItemType = get("gray_concrete")
    @JvmField
    public val LIGHT_GRAY_CONCRETE: ItemType = get("light_gray_concrete")
    @JvmField
    public val CYAN_CONCRETE: ItemType = get("cyan_concrete")
    @JvmField
    public val PURPLE_CONCRETE: ItemType = get("purple_concrete")
    @JvmField
    public val BLUE_CONCRETE: ItemType = get("blue_concrete")
    @JvmField
    public val BROWN_CONCRETE: ItemType = get("brown_concrete")
    @JvmField
    public val GREEN_CONCRETE: ItemType = get("green_concrete")
    @JvmField
    public val RED_CONCRETE: ItemType = get("red_concrete")
    @JvmField
    public val BLACK_CONCRETE: ItemType = get("black_concrete")
    @JvmField
    public val WHITE_CONCRETE_POWDER: ItemType = get("white_concrete_powder")
    @JvmField
    public val ORANGE_CONCRETE_POWDER: ItemType = get("orange_concrete_powder")
    @JvmField
    public val MAGENTA_CONCRETE_POWDER: ItemType = get("magenta_concrete_powder")
    @JvmField
    public val LIGHT_BLUE_CONCRETE_POWDER: ItemType = get("light_blue_concrete_powder")
    @JvmField
    public val YELLOW_CONCRETE_POWDER: ItemType = get("yellow_concrete_powder")
    @JvmField
    public val LIME_CONCRETE_POWDER: ItemType = get("lime_concrete_powder")
    @JvmField
    public val PINK_CONCRETE_POWDER: ItemType = get("pink_concrete_powder")
    @JvmField
    public val GRAY_CONCRETE_POWDER: ItemType = get("gray_concrete_powder")
    @JvmField
    public val LIGHT_GRAY_CONCRETE_POWDER: ItemType = get("light_gray_concrete_powder")
    @JvmField
    public val CYAN_CONCRETE_POWDER: ItemType = get("cyan_concrete_powder")
    @JvmField
    public val PURPLE_CONCRETE_POWDER: ItemType = get("purple_concrete_powder")
    @JvmField
    public val BLUE_CONCRETE_POWDER: ItemType = get("blue_concrete_powder")
    @JvmField
    public val BROWN_CONCRETE_POWDER: ItemType = get("brown_concrete_powder")
    @JvmField
    public val GREEN_CONCRETE_POWDER: ItemType = get("green_concrete_powder")
    @JvmField
    public val RED_CONCRETE_POWDER: ItemType = get("red_concrete_powder")
    @JvmField
    public val BLACK_CONCRETE_POWDER: ItemType = get("black_concrete_powder")
    @JvmField
    public val TURTLE_EGG: ItemType = get("turtle_egg")
    @JvmField
    public val DEAD_TUBE_CORAL_BLOCK: ItemType = get("dead_tube_coral_block")
    @JvmField
    public val DEAD_BRAIN_CORAL_BLOCK: ItemType = get("dead_brain_coral_block")
    @JvmField
    public val DEAD_BUBBLE_CORAL_BLOCK: ItemType = get("dead_bubble_coral_block")
    @JvmField
    public val DEAD_FIRE_CORAL_BLOCK: ItemType = get("dead_fire_coral_block")
    @JvmField
    public val DEAD_HORN_CORAL_BLOCK: ItemType = get("dead_horn_coral_block")
    @JvmField
    public val TUBE_CORAL_BLOCK: ItemType = get("tube_coral_block")
    @JvmField
    public val BRAIN_CORAL_BLOCK: ItemType = get("brain_coral_block")
    @JvmField
    public val BUBBLE_CORAL_BLOCK: ItemType = get("bubble_coral_block")
    @JvmField
    public val FIRE_CORAL_BLOCK: ItemType = get("fire_coral_block")
    @JvmField
    public val HORN_CORAL_BLOCK: ItemType = get("horn_coral_block")
    @JvmField
    public val TUBE_CORAL: ItemType = get("tube_coral")
    @JvmField
    public val BRAIN_CORAL: ItemType = get("brain_coral")
    @JvmField
    public val BUBBLE_CORAL: ItemType = get("bubble_coral")
    @JvmField
    public val FIRE_CORAL: ItemType = get("fire_coral")
    @JvmField
    public val HORN_CORAL: ItemType = get("horn_coral")
    @JvmField
    public val DEAD_BRAIN_CORAL: ItemType = get("dead_brain_coral")
    @JvmField
    public val DEAD_BUBBLE_CORAL: ItemType = get("dead_bubble_coral")
    @JvmField
    public val DEAD_FIRE_CORAL: ItemType = get("dead_fire_coral")
    @JvmField
    public val DEAD_HORN_CORAL: ItemType = get("dead_horn_coral")
    @JvmField
    public val DEAD_TUBE_CORAL: ItemType = get("dead_tube_coral")
    @JvmField
    public val TUBE_CORAL_FAN: ItemType = get("tube_coral_fan")
    @JvmField
    public val BRAIN_CORAL_FAN: ItemType = get("brain_coral_fan")
    @JvmField
    public val BUBBLE_CORAL_FAN: ItemType = get("bubble_coral_fan")
    @JvmField
    public val FIRE_CORAL_FAN: ItemType = get("fire_coral_fan")
    @JvmField
    public val HORN_CORAL_FAN: ItemType = get("horn_coral_fan")
    @JvmField
    public val DEAD_TUBE_CORAL_FAN: ItemType = get("dead_tube_coral_fan")
    @JvmField
    public val DEAD_BRAIN_CORAL_FAN: ItemType = get("dead_brain_coral_fan")
    @JvmField
    public val DEAD_BUBBLE_CORAL_FAN: ItemType = get("dead_bubble_coral_fan")
    @JvmField
    public val DEAD_FIRE_CORAL_FAN: ItemType = get("dead_fire_coral_fan")
    @JvmField
    public val DEAD_HORN_CORAL_FAN: ItemType = get("dead_horn_coral_fan")
    @JvmField
    public val BLUE_ICE: ItemType = get("blue_ice")
    @JvmField
    public val CONDUIT: ItemType = get("conduit")
    @JvmField
    public val POLISHED_GRANITE_STAIRS: ItemType = get("polished_granite_stairs")
    @JvmField
    public val SMOOTH_RED_SANDSTONE_STAIRS: ItemType = get("smooth_red_sandstone_stairs")
    @JvmField
    public val MOSSY_STONE_BRICK_STAIRS: ItemType = get("mossy_stone_brick_stairs")
    @JvmField
    public val POLISHED_DIORITE_STAIRS: ItemType = get("polished_diorite_stairs")
    @JvmField
    public val MOSSY_COBBLESTONE_STAIRS: ItemType = get("mossy_cobblestone_stairs")
    @JvmField
    public val END_STONE_BRICK_STAIRS: ItemType = get("end_stone_brick_stairs")
    @JvmField
    public val STONE_STAIRS: ItemType = get("stone_stairs")
    @JvmField
    public val SMOOTH_SANDSTONE_STAIRS: ItemType = get("smooth_sandstone_stairs")
    @JvmField
    public val SMOOTH_QUARTZ_STAIRS: ItemType = get("smooth_quartz_stairs")
    @JvmField
    public val GRANITE_STAIRS: ItemType = get("granite_stairs")
    @JvmField
    public val ANDESITE_STAIRS: ItemType = get("andesite_stairs")
    @JvmField
    public val RED_NETHER_BRICK_STAIRS: ItemType = get("red_nether_brick_stairs")
    @JvmField
    public val POLISHED_ANDESITE_STAIRS: ItemType = get("polished_andesite_stairs")
    @JvmField
    public val DIORITE_STAIRS: ItemType = get("diorite_stairs")
    @JvmField
    public val COBBLED_DEEPSLATE_STAIRS: ItemType = get("cobbled_deepslate_stairs")
    @JvmField
    public val POLISHED_DEEPSLATE_STAIRS: ItemType = get("polished_deepslate_stairs")
    @JvmField
    public val DEEPSLATE_BRICK_STAIRS: ItemType = get("deepslate_brick_stairs")
    @JvmField
    public val DEEPSLATE_TILE_STAIRS: ItemType = get("deepslate_tile_stairs")
    @JvmField
    public val POLISHED_GRANITE_SLAB: ItemType = get("polished_granite_slab")
    @JvmField
    public val SMOOTH_RED_SANDSTONE_SLAB: ItemType = get("smooth_red_sandstone_slab")
    @JvmField
    public val MOSSY_STONE_BRICK_SLAB: ItemType = get("mossy_stone_brick_slab")
    @JvmField
    public val POLISHED_DIORITE_SLAB: ItemType = get("polished_diorite_slab")
    @JvmField
    public val MOSSY_COBBLESTONE_SLAB: ItemType = get("mossy_cobblestone_slab")
    @JvmField
    public val END_STONE_BRICK_SLAB: ItemType = get("end_stone_brick_slab")
    @JvmField
    public val SMOOTH_SANDSTONE_SLAB: ItemType = get("smooth_sandstone_slab")
    @JvmField
    public val SMOOTH_QUARTZ_SLAB: ItemType = get("smooth_quartz_slab")
    @JvmField
    public val GRANITE_SLAB: ItemType = get("granite_slab")
    @JvmField
    public val ANDESITE_SLAB: ItemType = get("andesite_slab")
    @JvmField
    public val RED_NETHER_BRICK_SLAB: ItemType = get("red_nether_brick_slab")
    @JvmField
    public val POLISHED_ANDESITE_SLAB: ItemType = get("polished_andesite_slab")
    @JvmField
    public val DIORITE_SLAB: ItemType = get("diorite_slab")
    @JvmField
    public val COBBLED_DEEPSLATE_SLAB: ItemType = get("cobbled_deepslate_slab")
    @JvmField
    public val POLISHED_DEEPSLATE_SLAB: ItemType = get("polished_deepslate_slab")
    @JvmField
    public val DEEPSLATE_BRICK_SLAB: ItemType = get("deepslate_brick_slab")
    @JvmField
    public val DEEPSLATE_TILE_SLAB: ItemType = get("deepslate_tile_slab")
    @JvmField
    public val SCAFFOLDING: ItemType = get("scaffolding")
    @JvmField
    public val REDSTONE: ItemType = get("redstone")
    @JvmField
    public val REDSTONE_TORCH: ItemType = get("redstone_torch")
    @JvmField
    public val REDSTONE_BLOCK: ItemType = get("redstone_block")
    @JvmField
    public val REPEATER: ItemType = get("repeater")
    @JvmField
    public val COMPARATOR: ItemType = get("comparator")
    @JvmField
    public val PISTON: ItemType = get("piston")
    @JvmField
    public val STICKY_PISTON: ItemType = get("sticky_piston")
    @JvmField
    public val SLIME_BLOCK: ItemType = get("slime_block")
    @JvmField
    public val HONEY_BLOCK: ItemType = get("honey_block")
    @JvmField
    public val OBSERVER: ItemType = get("observer")
    @JvmField
    public val HOPPER: ItemType = get("hopper")
    @JvmField
    public val DISPENSER: ItemType = get("dispenser")
    @JvmField
    public val DROPPER: ItemType = get("dropper")
    @JvmField
    public val LECTERN: ItemType = get("lectern")
    @JvmField
    public val TARGET: ItemType = get("target")
    @JvmField
    public val LEVER: ItemType = get("lever")
    @JvmField
    public val LIGHTNING_ROD: ItemType = get("lightning_rod")
    @JvmField
    public val DAYLIGHT_DETECTOR: ItemType = get("daylight_detector")
    @JvmField
    public val SCULK_SENSOR: ItemType = get("sculk_sensor")
    @JvmField
    public val TRIPWIRE_HOOK: ItemType = get("tripwire_hook")
    @JvmField
    public val TRAPPED_CHEST: ItemType = get("trapped_chest")
    @JvmField
    public val TNT: ItemType = get("tnt")
    @JvmField
    public val REDSTONE_LAMP: ItemType = get("redstone_lamp")
    @JvmField
    public val NOTE_BLOCK: ItemType = get("note_block")
    @JvmField
    public val STONE_BUTTON: ItemType = get("stone_button")
    @JvmField
    public val POLISHED_BLACKSTONE_BUTTON: ItemType = get("polished_blackstone_button")
    @JvmField
    public val OAK_BUTTON: ItemType = get("oak_button")
    @JvmField
    public val SPRUCE_BUTTON: ItemType = get("spruce_button")
    @JvmField
    public val BIRCH_BUTTON: ItemType = get("birch_button")
    @JvmField
    public val JUNGLE_BUTTON: ItemType = get("jungle_button")
    @JvmField
    public val ACACIA_BUTTON: ItemType = get("acacia_button")
    @JvmField
    public val DARK_OAK_BUTTON: ItemType = get("dark_oak_button")
    @JvmField
    public val CRIMSON_BUTTON: ItemType = get("crimson_button")
    @JvmField
    public val WARPED_BUTTON: ItemType = get("warped_button")
    @JvmField
    public val STONE_PRESSURE_PLATE: ItemType = get("stone_pressure_plate")
    @JvmField
    public val POLISHED_BLACKSTONE_PRESSURE_PLATE: ItemType = get("polished_blackstone_pressure_plate")
    @JvmField
    public val LIGHT_WEIGHTED_PRESSURE_PLATE: ItemType = get("light_weighted_pressure_plate")
    @JvmField
    public val HEAVY_WEIGHTED_PRESSURE_PLATE: ItemType = get("heavy_weighted_pressure_plate")
    @JvmField
    public val OAK_PRESSURE_PLATE: ItemType = get("oak_pressure_plate")
    @JvmField
    public val SPRUCE_PRESSURE_PLATE: ItemType = get("spruce_pressure_plate")
    @JvmField
    public val BIRCH_PRESSURE_PLATE: ItemType = get("birch_pressure_plate")
    @JvmField
    public val JUNGLE_PRESSURE_PLATE: ItemType = get("jungle_pressure_plate")
    @JvmField
    public val ACACIA_PRESSURE_PLATE: ItemType = get("acacia_pressure_plate")
    @JvmField
    public val DARK_OAK_PRESSURE_PLATE: ItemType = get("dark_oak_pressure_plate")
    @JvmField
    public val CRIMSON_PRESSURE_PLATE: ItemType = get("crimson_pressure_plate")
    @JvmField
    public val WARPED_PRESSURE_PLATE: ItemType = get("warped_pressure_plate")
    @JvmField
    public val IRON_DOOR: ItemType = get("iron_door")
    @JvmField
    public val OAK_DOOR: ItemType = get("oak_door")
    @JvmField
    public val SPRUCE_DOOR: ItemType = get("spruce_door")
    @JvmField
    public val BIRCH_DOOR: ItemType = get("birch_door")
    @JvmField
    public val JUNGLE_DOOR: ItemType = get("jungle_door")
    @JvmField
    public val ACACIA_DOOR: ItemType = get("acacia_door")
    @JvmField
    public val DARK_OAK_DOOR: ItemType = get("dark_oak_door")
    @JvmField
    public val CRIMSON_DOOR: ItemType = get("crimson_door")
    @JvmField
    public val WARPED_DOOR: ItemType = get("warped_door")
    @JvmField
    public val IRON_TRAPDOOR: ItemType = get("iron_trapdoor")
    @JvmField
    public val OAK_TRAPDOOR: ItemType = get("oak_trapdoor")
    @JvmField
    public val SPRUCE_TRAPDOOR: ItemType = get("spruce_trapdoor")
    @JvmField
    public val BIRCH_TRAPDOOR: ItemType = get("birch_trapdoor")
    @JvmField
    public val JUNGLE_TRAPDOOR: ItemType = get("jungle_trapdoor")
    @JvmField
    public val ACACIA_TRAPDOOR: ItemType = get("acacia_trapdoor")
    @JvmField
    public val DARK_OAK_TRAPDOOR: ItemType = get("dark_oak_trapdoor")
    @JvmField
    public val CRIMSON_TRAPDOOR: ItemType = get("crimson_trapdoor")
    @JvmField
    public val WARPED_TRAPDOOR: ItemType = get("warped_trapdoor")
    @JvmField
    public val OAK_FENCE_GATE: ItemType = get("oak_fence_gate")
    @JvmField
    public val SPRUCE_FENCE_GATE: ItemType = get("spruce_fence_gate")
    @JvmField
    public val BIRCH_FENCE_GATE: ItemType = get("birch_fence_gate")
    @JvmField
    public val JUNGLE_FENCE_GATE: ItemType = get("jungle_fence_gate")
    @JvmField
    public val ACACIA_FENCE_GATE: ItemType = get("acacia_fence_gate")
    @JvmField
    public val DARK_OAK_FENCE_GATE: ItemType = get("dark_oak_fence_gate")
    @JvmField
    public val CRIMSON_FENCE_GATE: ItemType = get("crimson_fence_gate")
    @JvmField
    public val WARPED_FENCE_GATE: ItemType = get("warped_fence_gate")
    @JvmField
    public val POWERED_RAIL: ItemType = get("powered_rail")
    @JvmField
    public val DETECTOR_RAIL: ItemType = get("detector_rail")
    @JvmField
    public val RAIL: ItemType = get("rail")
    @JvmField
    public val ACTIVATOR_RAIL: ItemType = get("activator_rail")
    @JvmField
    public val SADDLE: ItemType = get("saddle")
    @JvmField
    public val MINECART: ItemType = get("minecart")
    @JvmField
    public val CHEST_MINECART: ItemType = get("chest_minecart")
    @JvmField
    public val FURNACE_MINECART: ItemType = get("furnace_minecart")
    @JvmField
    public val TNT_MINECART: ItemType = get("tnt_minecart")
    @JvmField
    public val HOPPER_MINECART: ItemType = get("hopper_minecart")
    @JvmField
    public val CARROT_ON_A_STICK: ItemType = get("carrot_on_a_stick")
    @JvmField
    public val WARPED_FUNGUS_ON_A_STICK: ItemType = get("warped_fungus_on_a_stick")
    @JvmField
    public val ELYTRA: ItemType = get("elytra")
    @JvmField
    public val OAK_BOAT: ItemType = get("oak_boat")
    @JvmField
    public val SPRUCE_BOAT: ItemType = get("spruce_boat")
    @JvmField
    public val BIRCH_BOAT: ItemType = get("birch_boat")
    @JvmField
    public val JUNGLE_BOAT: ItemType = get("jungle_boat")
    @JvmField
    public val ACACIA_BOAT: ItemType = get("acacia_boat")
    @JvmField
    public val DARK_OAK_BOAT: ItemType = get("dark_oak_boat")
    @JvmField
    public val STRUCTURE_BLOCK: ItemType = get("structure_block")
    @JvmField
    public val JIGSAW: ItemType = get("jigsaw")
    @JvmField
    public val TURTLE_HELMET: ItemType = get("turtle_helmet")
    @JvmField
    public val SCUTE: ItemType = get("scute")
    @JvmField
    public val FLINT_AND_STEEL: ItemType = get("flint_and_steel")
    @JvmField
    public val APPLE: ItemType = get("apple")
    @JvmField
    public val BOW: ItemType = get("bow")
    @JvmField
    public val ARROW: ItemType = get("arrow")
    @JvmField
    public val COAL: ItemType = get("coal")
    @JvmField
    public val CHARCOAL: ItemType = get("charcoal")
    @JvmField
    public val DIAMOND: ItemType = get("diamond")
    @JvmField
    public val EMERALD: ItemType = get("emerald")
    @JvmField
    public val LAPIS_LAZULI: ItemType = get("lapis_lazuli")
    @JvmField
    public val QUARTZ: ItemType = get("quartz")
    @JvmField
    public val AMETHYST_SHARD: ItemType = get("amethyst_shard")
    @JvmField
    public val RAW_IRON: ItemType = get("raw_iron")
    @JvmField
    public val IRON_INGOT: ItemType = get("iron_ingot")
    @JvmField
    public val RAW_COPPER: ItemType = get("raw_copper")
    @JvmField
    public val COPPER_INGOT: ItemType = get("copper_ingot")
    @JvmField
    public val RAW_GOLD: ItemType = get("raw_gold")
    @JvmField
    public val GOLD_INGOT: ItemType = get("gold_ingot")
    @JvmField
    public val NETHERITE_INGOT: ItemType = get("netherite_ingot")
    @JvmField
    public val NETHERITE_SCRAP: ItemType = get("netherite_scrap")
    @JvmField
    public val WOODEN_SWORD: ItemType = get("wooden_sword")
    @JvmField
    public val WOODEN_SHOVEL: ItemType = get("wooden_shovel")
    @JvmField
    public val WOODEN_PICKAXE: ItemType = get("wooden_pickaxe")
    @JvmField
    public val WOODEN_AXE: ItemType = get("wooden_axe")
    @JvmField
    public val WOODEN_HOE: ItemType = get("wooden_hoe")
    @JvmField
    public val STONE_SWORD: ItemType = get("stone_sword")
    @JvmField
    public val STONE_SHOVEL: ItemType = get("stone_shovel")
    @JvmField
    public val STONE_PICKAXE: ItemType = get("stone_pickaxe")
    @JvmField
    public val STONE_AXE: ItemType = get("stone_axe")
    @JvmField
    public val STONE_HOE: ItemType = get("stone_hoe")
    @JvmField
    public val GOLDEN_SWORD: ItemType = get("golden_sword")
    @JvmField
    public val GOLDEN_SHOVEL: ItemType = get("golden_shovel")
    @JvmField
    public val GOLDEN_PICKAXE: ItemType = get("golden_pickaxe")
    @JvmField
    public val GOLDEN_AXE: ItemType = get("golden_axe")
    @JvmField
    public val GOLDEN_HOE: ItemType = get("golden_hoe")
    @JvmField
    public val IRON_SWORD: ItemType = get("iron_sword")
    @JvmField
    public val IRON_SHOVEL: ItemType = get("iron_shovel")
    @JvmField
    public val IRON_PICKAXE: ItemType = get("iron_pickaxe")
    @JvmField
    public val IRON_AXE: ItemType = get("iron_axe")
    @JvmField
    public val IRON_HOE: ItemType = get("iron_hoe")
    @JvmField
    public val DIAMOND_SWORD: ItemType = get("diamond_sword")
    @JvmField
    public val DIAMOND_SHOVEL: ItemType = get("diamond_shovel")
    @JvmField
    public val DIAMOND_PICKAXE: ItemType = get("diamond_pickaxe")
    @JvmField
    public val DIAMOND_AXE: ItemType = get("diamond_axe")
    @JvmField
    public val DIAMOND_HOE: ItemType = get("diamond_hoe")
    @JvmField
    public val NETHERITE_SWORD: ItemType = get("netherite_sword")
    @JvmField
    public val NETHERITE_SHOVEL: ItemType = get("netherite_shovel")
    @JvmField
    public val NETHERITE_PICKAXE: ItemType = get("netherite_pickaxe")
    @JvmField
    public val NETHERITE_AXE: ItemType = get("netherite_axe")
    @JvmField
    public val NETHERITE_HOE: ItemType = get("netherite_hoe")
    @JvmField
    public val STICK: ItemType = get("stick")
    @JvmField
    public val BOWL: ItemType = get("bowl")
    @JvmField
    public val MUSHROOM_STEW: ItemType = get("mushroom_stew")
    @JvmField
    public val STRING: ItemType = get("string")
    @JvmField
    public val FEATHER: ItemType = get("feather")
    @JvmField
    public val GUNPOWDER: ItemType = get("gunpowder")
    @JvmField
    public val WHEAT_SEEDS: ItemType = get("wheat_seeds")
    @JvmField
    public val WHEAT: ItemType = get("wheat")
    @JvmField
    public val BREAD: ItemType = get("bread")
    @JvmField
    public val LEATHER_HELMET: ItemType = get("leather_helmet")
    @JvmField
    public val LEATHER_CHESTPLATE: ItemType = get("leather_chestplate")
    @JvmField
    public val LEATHER_LEGGINGS: ItemType = get("leather_leggings")
    @JvmField
    public val LEATHER_BOOTS: ItemType = get("leather_boots")
    @JvmField
    public val CHAINMAIL_HELMET: ItemType = get("chainmail_helmet")
    @JvmField
    public val CHAINMAIL_CHESTPLATE: ItemType = get("chainmail_chestplate")
    @JvmField
    public val CHAINMAIL_LEGGINGS: ItemType = get("chainmail_leggings")
    @JvmField
    public val CHAINMAIL_BOOTS: ItemType = get("chainmail_boots")
    @JvmField
    public val IRON_HELMET: ItemType = get("iron_helmet")
    @JvmField
    public val IRON_CHESTPLATE: ItemType = get("iron_chestplate")
    @JvmField
    public val IRON_LEGGINGS: ItemType = get("iron_leggings")
    @JvmField
    public val IRON_BOOTS: ItemType = get("iron_boots")
    @JvmField
    public val DIAMOND_HELMET: ItemType = get("diamond_helmet")
    @JvmField
    public val DIAMOND_CHESTPLATE: ItemType = get("diamond_chestplate")
    @JvmField
    public val DIAMOND_LEGGINGS: ItemType = get("diamond_leggings")
    @JvmField
    public val DIAMOND_BOOTS: ItemType = get("diamond_boots")
    @JvmField
    public val GOLDEN_HELMET: ItemType = get("golden_helmet")
    @JvmField
    public val GOLDEN_CHESTPLATE: ItemType = get("golden_chestplate")
    @JvmField
    public val GOLDEN_LEGGINGS: ItemType = get("golden_leggings")
    @JvmField
    public val GOLDEN_BOOTS: ItemType = get("golden_boots")
    @JvmField
    public val NETHERITE_HELMET: ItemType = get("netherite_helmet")
    @JvmField
    public val NETHERITE_CHESTPLATE: ItemType = get("netherite_chestplate")
    @JvmField
    public val NETHERITE_LEGGINGS: ItemType = get("netherite_leggings")
    @JvmField
    public val NETHERITE_BOOTS: ItemType = get("netherite_boots")
    @JvmField
    public val FLINT: ItemType = get("flint")
    @JvmField
    public val PORKCHOP: ItemType = get("porkchop")
    @JvmField
    public val COOKED_PORKCHOP: ItemType = get("cooked_porkchop")
    @JvmField
    public val PAINTING: ItemType = get("painting")
    @JvmField
    public val GOLDEN_APPLE: ItemType = get("golden_apple")
    @JvmField
    public val ENCHANTED_GOLDEN_APPLE: ItemType = get("enchanted_golden_apple")
    @JvmField
    public val OAK_SIGN: ItemType = get("oak_sign")
    @JvmField
    public val SPRUCE_SIGN: ItemType = get("spruce_sign")
    @JvmField
    public val BIRCH_SIGN: ItemType = get("birch_sign")
    @JvmField
    public val JUNGLE_SIGN: ItemType = get("jungle_sign")
    @JvmField
    public val ACACIA_SIGN: ItemType = get("acacia_sign")
    @JvmField
    public val DARK_OAK_SIGN: ItemType = get("dark_oak_sign")
    @JvmField
    public val CRIMSON_SIGN: ItemType = get("crimson_sign")
    @JvmField
    public val WARPED_SIGN: ItemType = get("warped_sign")
    @JvmField
    public val BUCKET: ItemType = get("bucket")
    @JvmField
    public val WATER_BUCKET: ItemType = get("water_bucket")
    @JvmField
    public val LAVA_BUCKET: ItemType = get("lava_bucket")
    @JvmField
    public val POWDER_SNOW_BUCKET: ItemType = get("powder_snow_bucket")
    @JvmField
    public val SNOWBALL: ItemType = get("snowball")
    @JvmField
    public val LEATHER: ItemType = get("leather")
    @JvmField
    public val MILK_BUCKET: ItemType = get("milk_bucket")
    @JvmField
    public val PUFFERFISH_BUCKET: ItemType = get("pufferfish_bucket")
    @JvmField
    public val SALMON_BUCKET: ItemType = get("salmon_bucket")
    @JvmField
    public val COD_BUCKET: ItemType = get("cod_bucket")
    @JvmField
    public val TROPICAL_FISH_BUCKET: ItemType = get("tropical_fish_bucket")
    @JvmField
    public val AXOLOTL_BUCKET: ItemType = get("axolotl_bucket")
    @JvmField
    public val BRICK: ItemType = get("brick")
    @JvmField
    public val CLAY_BALL: ItemType = get("clay_ball")
    @JvmField
    public val DRIED_KELP_BLOCK: ItemType = get("dried_kelp_block")
    @JvmField
    public val PAPER: ItemType = get("paper")
    @JvmField
    public val BOOK: ItemType = get("book")
    @JvmField
    public val SLIME_BALL: ItemType = get("slime_ball")
    @JvmField
    public val EGG: ItemType = get("egg")
    @JvmField
    public val COMPASS: ItemType = get("compass")
    @JvmField
    public val BUNDLE: ItemType = get("bundle")
    @JvmField
    public val FISHING_ROD: ItemType = get("fishing_rod")
    @JvmField
    public val CLOCK: ItemType = get("clock")
    @JvmField
    public val SPYGLASS: ItemType = get("spyglass")
    @JvmField
    public val GLOWSTONE_DUST: ItemType = get("glowstone_dust")
    @JvmField
    public val COD: ItemType = get("cod")
    @JvmField
    public val SALMON: ItemType = get("salmon")
    @JvmField
    public val TROPICAL_FISH: ItemType = get("tropical_fish")
    @JvmField
    public val PUFFERFISH: ItemType = get("pufferfish")
    @JvmField
    public val COOKED_COD: ItemType = get("cooked_cod")
    @JvmField
    public val COOKED_SALMON: ItemType = get("cooked_salmon")
    @JvmField
    public val INK_SAC: ItemType = get("ink_sac")
    @JvmField
    public val GLOW_INK_SAC: ItemType = get("glow_ink_sac")
    @JvmField
    public val COCOA_BEANS: ItemType = get("cocoa_beans")
    @JvmField
    public val WHITE_DYE: ItemType = get("white_dye")
    @JvmField
    public val ORANGE_DYE: ItemType = get("orange_dye")
    @JvmField
    public val MAGENTA_DYE: ItemType = get("magenta_dye")
    @JvmField
    public val LIGHT_BLUE_DYE: ItemType = get("light_blue_dye")
    @JvmField
    public val YELLOW_DYE: ItemType = get("yellow_dye")
    @JvmField
    public val LIME_DYE: ItemType = get("lime_dye")
    @JvmField
    public val PINK_DYE: ItemType = get("pink_dye")
    @JvmField
    public val GRAY_DYE: ItemType = get("gray_dye")
    @JvmField
    public val LIGHT_GRAY_DYE: ItemType = get("light_gray_dye")
    @JvmField
    public val CYAN_DYE: ItemType = get("cyan_dye")
    @JvmField
    public val PURPLE_DYE: ItemType = get("purple_dye")
    @JvmField
    public val BLUE_DYE: ItemType = get("blue_dye")
    @JvmField
    public val BROWN_DYE: ItemType = get("brown_dye")
    @JvmField
    public val GREEN_DYE: ItemType = get("green_dye")
    @JvmField
    public val RED_DYE: ItemType = get("red_dye")
    @JvmField
    public val BLACK_DYE: ItemType = get("black_dye")
    @JvmField
    public val BONE_MEAL: ItemType = get("bone_meal")
    @JvmField
    public val BONE: ItemType = get("bone")
    @JvmField
    public val SUGAR: ItemType = get("sugar")
    @JvmField
    public val CAKE: ItemType = get("cake")
    @JvmField
    public val WHITE_BED: ItemType = get("white_bed")
    @JvmField
    public val ORANGE_BED: ItemType = get("orange_bed")
    @JvmField
    public val MAGENTA_BED: ItemType = get("magenta_bed")
    @JvmField
    public val LIGHT_BLUE_BED: ItemType = get("light_blue_bed")
    @JvmField
    public val YELLOW_BED: ItemType = get("yellow_bed")
    @JvmField
    public val LIME_BED: ItemType = get("lime_bed")
    @JvmField
    public val PINK_BED: ItemType = get("pink_bed")
    @JvmField
    public val GRAY_BED: ItemType = get("gray_bed")
    @JvmField
    public val LIGHT_GRAY_BED: ItemType = get("light_gray_bed")
    @JvmField
    public val CYAN_BED: ItemType = get("cyan_bed")
    @JvmField
    public val PURPLE_BED: ItemType = get("purple_bed")
    @JvmField
    public val BLUE_BED: ItemType = get("blue_bed")
    @JvmField
    public val BROWN_BED: ItemType = get("brown_bed")
    @JvmField
    public val GREEN_BED: ItemType = get("green_bed")
    @JvmField
    public val RED_BED: ItemType = get("red_bed")
    @JvmField
    public val BLACK_BED: ItemType = get("black_bed")
    @JvmField
    public val COOKIE: ItemType = get("cookie")
    @JvmField
    public val FILLED_MAP: ItemType = get("filled_map")
    @JvmField
    public val SHEARS: ItemType = get("shears")
    @JvmField
    public val MELON_SLICE: ItemType = get("melon_slice")
    @JvmField
    public val DRIED_KELP: ItemType = get("dried_kelp")
    @JvmField
    public val PUMPKIN_SEEDS: ItemType = get("pumpkin_seeds")
    @JvmField
    public val MELON_SEEDS: ItemType = get("melon_seeds")
    @JvmField
    public val BEEF: ItemType = get("beef")
    @JvmField
    public val COOKED_BEEF: ItemType = get("cooked_beef")
    @JvmField
    public val CHICKEN: ItemType = get("chicken")
    @JvmField
    public val COOKED_CHICKEN: ItemType = get("cooked_chicken")
    @JvmField
    public val ROTTEN_FLESH: ItemType = get("rotten_flesh")
    @JvmField
    public val ENDER_PEARL: ItemType = get("ender_pearl")
    @JvmField
    public val BLAZE_ROD: ItemType = get("blaze_rod")
    @JvmField
    public val GHAST_TEAR: ItemType = get("ghast_tear")
    @JvmField
    public val GOLD_NUGGET: ItemType = get("gold_nugget")
    @JvmField
    public val NETHER_WART: ItemType = get("nether_wart")
    @JvmField
    public val POTION: ItemType = get("potion")
    @JvmField
    public val GLASS_BOTTLE: ItemType = get("glass_bottle")
    @JvmField
    public val SPIDER_EYE: ItemType = get("spider_eye")
    @JvmField
    public val FERMENTED_SPIDER_EYE: ItemType = get("fermented_spider_eye")
    @JvmField
    public val BLAZE_POWDER: ItemType = get("blaze_powder")
    @JvmField
    public val MAGMA_CREAM: ItemType = get("magma_cream")
    @JvmField
    public val BREWING_STAND: ItemType = get("brewing_stand")
    @JvmField
    public val CAULDRON: ItemType = get("cauldron")
    @JvmField
    public val ENDER_EYE: ItemType = get("ender_eye")
    @JvmField
    public val GLISTERING_MELON_SLICE: ItemType = get("glistering_melon_slice")
    @JvmField
    public val AXOLOTL_SPAWN_EGG: ItemType = get("axolotl_spawn_egg")
    @JvmField
    public val BAT_SPAWN_EGG: ItemType = get("bat_spawn_egg")
    @JvmField
    public val BEE_SPAWN_EGG: ItemType = get("bee_spawn_egg")
    @JvmField
    public val BLAZE_SPAWN_EGG: ItemType = get("blaze_spawn_egg")
    @JvmField
    public val CAT_SPAWN_EGG: ItemType = get("cat_spawn_egg")
    @JvmField
    public val CAVE_SPIDER_SPAWN_EGG: ItemType = get("cave_spider_spawn_egg")
    @JvmField
    public val CHICKEN_SPAWN_EGG: ItemType = get("chicken_spawn_egg")
    @JvmField
    public val COD_SPAWN_EGG: ItemType = get("cod_spawn_egg")
    @JvmField
    public val COW_SPAWN_EGG: ItemType = get("cow_spawn_egg")
    @JvmField
    public val CREEPER_SPAWN_EGG: ItemType = get("creeper_spawn_egg")
    @JvmField
    public val DOLPHIN_SPAWN_EGG: ItemType = get("dolphin_spawn_egg")
    @JvmField
    public val DONKEY_SPAWN_EGG: ItemType = get("donkey_spawn_egg")
    @JvmField
    public val DROWNED_SPAWN_EGG: ItemType = get("drowned_spawn_egg")
    @JvmField
    public val ELDER_GUARDIAN_SPAWN_EGG: ItemType = get("elder_guardian_spawn_egg")
    @JvmField
    public val ENDERMAN_SPAWN_EGG: ItemType = get("enderman_spawn_egg")
    @JvmField
    public val ENDERMITE_SPAWN_EGG: ItemType = get("endermite_spawn_egg")
    @JvmField
    public val EVOKER_SPAWN_EGG: ItemType = get("evoker_spawn_egg")
    @JvmField
    public val FOX_SPAWN_EGG: ItemType = get("fox_spawn_egg")
    @JvmField
    public val GHAST_SPAWN_EGG: ItemType = get("ghast_spawn_egg")
    @JvmField
    public val GLOW_SQUID_SPAWN_EGG: ItemType = get("glow_squid_spawn_egg")
    @JvmField
    public val GOAT_SPAWN_EGG: ItemType = get("goat_spawn_egg")
    @JvmField
    public val GUARDIAN_SPAWN_EGG: ItemType = get("guardian_spawn_egg")
    @JvmField
    public val HOGLIN_SPAWN_EGG: ItemType = get("hoglin_spawn_egg")
    @JvmField
    public val HORSE_SPAWN_EGG: ItemType = get("horse_spawn_egg")
    @JvmField
    public val HUSK_SPAWN_EGG: ItemType = get("husk_spawn_egg")
    @JvmField
    public val LLAMA_SPAWN_EGG: ItemType = get("llama_spawn_egg")
    @JvmField
    public val MAGMA_CUBE_SPAWN_EGG: ItemType = get("magma_cube_spawn_egg")
    @JvmField
    public val MOOSHROOM_SPAWN_EGG: ItemType = get("mooshroom_spawn_egg")
    @JvmField
    public val MULE_SPAWN_EGG: ItemType = get("mule_spawn_egg")
    @JvmField
    public val OCELOT_SPAWN_EGG: ItemType = get("ocelot_spawn_egg")
    @JvmField
    public val PANDA_SPAWN_EGG: ItemType = get("panda_spawn_egg")
    @JvmField
    public val PARROT_SPAWN_EGG: ItemType = get("parrot_spawn_egg")
    @JvmField
    public val PHANTOM_SPAWN_EGG: ItemType = get("phantom_spawn_egg")
    @JvmField
    public val PIG_SPAWN_EGG: ItemType = get("pig_spawn_egg")
    @JvmField
    public val PIGLIN_SPAWN_EGG: ItemType = get("piglin_spawn_egg")
    @JvmField
    public val PIGLIN_BRUTE_SPAWN_EGG: ItemType = get("piglin_brute_spawn_egg")
    @JvmField
    public val PILLAGER_SPAWN_EGG: ItemType = get("pillager_spawn_egg")
    @JvmField
    public val POLAR_BEAR_SPAWN_EGG: ItemType = get("polar_bear_spawn_egg")
    @JvmField
    public val PUFFERFISH_SPAWN_EGG: ItemType = get("pufferfish_spawn_egg")
    @JvmField
    public val RABBIT_SPAWN_EGG: ItemType = get("rabbit_spawn_egg")
    @JvmField
    public val RAVAGER_SPAWN_EGG: ItemType = get("ravager_spawn_egg")
    @JvmField
    public val SALMON_SPAWN_EGG: ItemType = get("salmon_spawn_egg")
    @JvmField
    public val SHEEP_SPAWN_EGG: ItemType = get("sheep_spawn_egg")
    @JvmField
    public val SHULKER_SPAWN_EGG: ItemType = get("shulker_spawn_egg")
    @JvmField
    public val SILVERFISH_SPAWN_EGG: ItemType = get("silverfish_spawn_egg")
    @JvmField
    public val SKELETON_SPAWN_EGG: ItemType = get("skeleton_spawn_egg")
    @JvmField
    public val SKELETON_HORSE_SPAWN_EGG: ItemType = get("skeleton_horse_spawn_egg")
    @JvmField
    public val SLIME_SPAWN_EGG: ItemType = get("slime_spawn_egg")
    @JvmField
    public val SPIDER_SPAWN_EGG: ItemType = get("spider_spawn_egg")
    @JvmField
    public val SQUID_SPAWN_EGG: ItemType = get("squid_spawn_egg")
    @JvmField
    public val STRAY_SPAWN_EGG: ItemType = get("stray_spawn_egg")
    @JvmField
    public val STRIDER_SPAWN_EGG: ItemType = get("strider_spawn_egg")
    @JvmField
    public val TRADER_LLAMA_SPAWN_EGG: ItemType = get("trader_llama_spawn_egg")
    @JvmField
    public val TROPICAL_FISH_SPAWN_EGG: ItemType = get("tropical_fish_spawn_egg")
    @JvmField
    public val TURTLE_SPAWN_EGG: ItemType = get("turtle_spawn_egg")
    @JvmField
    public val VEX_SPAWN_EGG: ItemType = get("vex_spawn_egg")
    @JvmField
    public val VILLAGER_SPAWN_EGG: ItemType = get("villager_spawn_egg")
    @JvmField
    public val VINDICATOR_SPAWN_EGG: ItemType = get("vindicator_spawn_egg")
    @JvmField
    public val WANDERING_TRADER_SPAWN_EGG: ItemType = get("wandering_trader_spawn_egg")
    @JvmField
    public val WITCH_SPAWN_EGG: ItemType = get("witch_spawn_egg")
    @JvmField
    public val WITHER_SKELETON_SPAWN_EGG: ItemType = get("wither_skeleton_spawn_egg")
    @JvmField
    public val WOLF_SPAWN_EGG: ItemType = get("wolf_spawn_egg")
    @JvmField
    public val ZOGLIN_SPAWN_EGG: ItemType = get("zoglin_spawn_egg")
    @JvmField
    public val ZOMBIE_SPAWN_EGG: ItemType = get("zombie_spawn_egg")
    @JvmField
    public val ZOMBIE_HORSE_SPAWN_EGG: ItemType = get("zombie_horse_spawn_egg")
    @JvmField
    public val ZOMBIE_VILLAGER_SPAWN_EGG: ItemType = get("zombie_villager_spawn_egg")
    @JvmField
    public val ZOMBIFIED_PIGLIN_SPAWN_EGG: ItemType = get("zombified_piglin_spawn_egg")
    @JvmField
    public val EXPERIENCE_BOTTLE: ItemType = get("experience_bottle")
    @JvmField
    public val FIRE_CHARGE: ItemType = get("fire_charge")
    @JvmField
    public val WRITABLE_BOOK: ItemType = get("writable_book")
    @JvmField
    public val WRITTEN_BOOK: ItemType = get("written_book")
    @JvmField
    public val ITEM_FRAME: ItemType = get("item_frame")
    @JvmField
    public val GLOW_ITEM_FRAME: ItemType = get("glow_item_frame")
    @JvmField
    public val FLOWER_POT: ItemType = get("flower_pot")
    @JvmField
    public val CARROT: ItemType = get("carrot")
    @JvmField
    public val POTATO: ItemType = get("potato")
    @JvmField
    public val BAKED_POTATO: ItemType = get("baked_potato")
    @JvmField
    public val POISONOUS_POTATO: ItemType = get("poisonous_potato")
    @JvmField
    public val MAP: ItemType = get("map")
    @JvmField
    public val GOLDEN_CARROT: ItemType = get("golden_carrot")
    @JvmField
    public val SKELETON_SKULL: ItemType = get("skeleton_skull")
    @JvmField
    public val WITHER_SKELETON_SKULL: ItemType = get("wither_skeleton_skull")
    @JvmField
    public val PLAYER_HEAD: ItemType = get("player_head")
    @JvmField
    public val ZOMBIE_HEAD: ItemType = get("zombie_head")
    @JvmField
    public val CREEPER_HEAD: ItemType = get("creeper_head")
    @JvmField
    public val DRAGON_HEAD: ItemType = get("dragon_head")
    @JvmField
    public val NETHER_STAR: ItemType = get("nether_star")
    @JvmField
    public val PUMPKIN_PIE: ItemType = get("pumpkin_pie")
    @JvmField
    public val FIREWORK_ROCKET: ItemType = get("firework_rocket")
    @JvmField
    public val FIREWORK_STAR: ItemType = get("firework_star")
    @JvmField
    public val ENCHANTED_BOOK: ItemType = get("enchanted_book")
    @JvmField
    public val NETHER_BRICK: ItemType = get("nether_brick")
    @JvmField
    public val PRISMARINE_SHARD: ItemType = get("prismarine_shard")
    @JvmField
    public val PRISMARINE_CRYSTALS: ItemType = get("prismarine_crystals")
    @JvmField
    public val RABBIT: ItemType = get("rabbit")
    @JvmField
    public val COOKED_RABBIT: ItemType = get("cooked_rabbit")
    @JvmField
    public val RABBIT_STEW: ItemType = get("rabbit_stew")
    @JvmField
    public val RABBIT_FOOT: ItemType = get("rabbit_foot")
    @JvmField
    public val RABBIT_HIDE: ItemType = get("rabbit_hide")
    @JvmField
    public val ARMOR_STAND: ItemType = get("armor_stand")
    @JvmField
    public val IRON_HORSE_ARMOR: ItemType = get("iron_horse_armor")
    @JvmField
    public val GOLDEN_HORSE_ARMOR: ItemType = get("golden_horse_armor")
    @JvmField
    public val DIAMOND_HORSE_ARMOR: ItemType = get("diamond_horse_armor")
    @JvmField
    public val LEATHER_HORSE_ARMOR: ItemType = get("leather_horse_armor")
    @JvmField
    public val LEAD: ItemType = get("lead")
    @JvmField
    public val NAME_TAG: ItemType = get("name_tag")
    @JvmField
    public val COMMAND_BLOCK_MINECART: ItemType = get("command_block_minecart")
    @JvmField
    public val MUTTON: ItemType = get("mutton")
    @JvmField
    public val COOKED_MUTTON: ItemType = get("cooked_mutton")
    @JvmField
    public val WHITE_BANNER: ItemType = get("white_banner")
    @JvmField
    public val ORANGE_BANNER: ItemType = get("orange_banner")
    @JvmField
    public val MAGENTA_BANNER: ItemType = get("magenta_banner")
    @JvmField
    public val LIGHT_BLUE_BANNER: ItemType = get("light_blue_banner")
    @JvmField
    public val YELLOW_BANNER: ItemType = get("yellow_banner")
    @JvmField
    public val LIME_BANNER: ItemType = get("lime_banner")
    @JvmField
    public val PINK_BANNER: ItemType = get("pink_banner")
    @JvmField
    public val GRAY_BANNER: ItemType = get("gray_banner")
    @JvmField
    public val LIGHT_GRAY_BANNER: ItemType = get("light_gray_banner")
    @JvmField
    public val CYAN_BANNER: ItemType = get("cyan_banner")
    @JvmField
    public val PURPLE_BANNER: ItemType = get("purple_banner")
    @JvmField
    public val BLUE_BANNER: ItemType = get("blue_banner")
    @JvmField
    public val BROWN_BANNER: ItemType = get("brown_banner")
    @JvmField
    public val GREEN_BANNER: ItemType = get("green_banner")
    @JvmField
    public val RED_BANNER: ItemType = get("red_banner")
    @JvmField
    public val BLACK_BANNER: ItemType = get("black_banner")
    @JvmField
    public val END_CRYSTAL: ItemType = get("end_crystal")
    @JvmField
    public val CHORUS_FRUIT: ItemType = get("chorus_fruit")
    @JvmField
    public val POPPED_CHORUS_FRUIT: ItemType = get("popped_chorus_fruit")
    @JvmField
    public val BEETROOT: ItemType = get("beetroot")
    @JvmField
    public val BEETROOT_SEEDS: ItemType = get("beetroot_seeds")
    @JvmField
    public val BEETROOT_SOUP: ItemType = get("beetroot_soup")
    @JvmField
    public val DRAGON_BREATH: ItemType = get("dragon_breath")
    @JvmField
    public val SPLASH_POTION: ItemType = get("splash_potion")
    @JvmField
    public val SPECTRAL_ARROW: ItemType = get("spectral_arrow")
    @JvmField
    public val TIPPED_ARROW: ItemType = get("tipped_arrow")
    @JvmField
    public val LINGERING_POTION: ItemType = get("lingering_potion")
    @JvmField
    public val SHIELD: ItemType = get("shield")
    @JvmField
    public val TOTEM_OF_UNDYING: ItemType = get("totem_of_undying")
    @JvmField
    public val SHULKER_SHELL: ItemType = get("shulker_shell")
    @JvmField
    public val IRON_NUGGET: ItemType = get("iron_nugget")
    @JvmField
    public val KNOWLEDGE_BOOK: ItemType = get("knowledge_book")
    @JvmField
    public val DEBUG_STICK: ItemType = get("debug_stick")
    @JvmField
    public val MUSIC_DISC_13: ItemType = get("music_disc_13")
    @JvmField
    public val MUSIC_DISC_CAT: ItemType = get("music_disc_cat")
    @JvmField
    public val MUSIC_DISC_BLOCKS: ItemType = get("music_disc_blocks")
    @JvmField
    public val MUSIC_DISC_CHIRP: ItemType = get("music_disc_chirp")
    @JvmField
    public val MUSIC_DISC_FAR: ItemType = get("music_disc_far")
    @JvmField
    public val MUSIC_DISC_MALL: ItemType = get("music_disc_mall")
    @JvmField
    public val MUSIC_DISC_MELLOHI: ItemType = get("music_disc_mellohi")
    @JvmField
    public val MUSIC_DISC_STAL: ItemType = get("music_disc_stal")
    @JvmField
    public val MUSIC_DISC_STRAD: ItemType = get("music_disc_strad")
    @JvmField
    public val MUSIC_DISC_WARD: ItemType = get("music_disc_ward")
    @JvmField
    public val MUSIC_DISC_11: ItemType = get("music_disc_11")
    @JvmField
    public val MUSIC_DISC_WAIT: ItemType = get("music_disc_wait")
    @JvmField
    public val MUSIC_DISC_OTHERSIDE: ItemType = get("music_disc_otherside")
    @JvmField
    public val MUSIC_DISC_PIGSTEP: ItemType = get("music_disc_pigstep")
    @JvmField
    public val TRIDENT: ItemType = get("trident")
    @JvmField
    public val PHANTOM_MEMBRANE: ItemType = get("phantom_membrane")
    @JvmField
    public val NAUTILUS_SHELL: ItemType = get("nautilus_shell")
    @JvmField
    public val HEART_OF_THE_SEA: ItemType = get("heart_of_the_sea")
    @JvmField
    public val CROSSBOW: ItemType = get("crossbow")
    @JvmField
    public val SUSPICIOUS_STEW: ItemType = get("suspicious_stew")
    @JvmField
    public val LOOM: ItemType = get("loom")
    @JvmField
    public val FLOWER_BANNER_PATTERN: ItemType = get("flower_banner_pattern")
    @JvmField
    public val CREEPER_BANNER_PATTERN: ItemType = get("creeper_banner_pattern")
    @JvmField
    public val SKULL_BANNER_PATTERN: ItemType = get("skull_banner_pattern")
    @JvmField
    public val MOJANG_BANNER_PATTERN: ItemType = get("mojang_banner_pattern")
    @JvmField
    public val GLOBE_BANNER_PATTERN: ItemType = get("globe_banner_pattern")
    @JvmField
    public val PIGLIN_BANNER_PATTERN: ItemType = get("piglin_banner_pattern")
    @JvmField
    public val COMPOSTER: ItemType = get("composter")
    @JvmField
    public val BARREL: ItemType = get("barrel")
    @JvmField
    public val SMOKER: ItemType = get("smoker")
    @JvmField
    public val BLAST_FURNACE: ItemType = get("blast_furnace")
    @JvmField
    public val CARTOGRAPHY_TABLE: ItemType = get("cartography_table")
    @JvmField
    public val FLETCHING_TABLE: ItemType = get("fletching_table")
    @JvmField
    public val GRINDSTONE: ItemType = get("grindstone")
    @JvmField
    public val SMITHING_TABLE: ItemType = get("smithing_table")
    @JvmField
    public val STONECUTTER: ItemType = get("stonecutter")
    @JvmField
    public val BELL: ItemType = get("bell")
    @JvmField
    public val LANTERN: ItemType = get("lantern")
    @JvmField
    public val SOUL_LANTERN: ItemType = get("soul_lantern")
    @JvmField
    public val SWEET_BERRIES: ItemType = get("sweet_berries")
    @JvmField
    public val GLOW_BERRIES: ItemType = get("glow_berries")
    @JvmField
    public val CAMPFIRE: ItemType = get("campfire")
    @JvmField
    public val SOUL_CAMPFIRE: ItemType = get("soul_campfire")
    @JvmField
    public val SHROOMLIGHT: ItemType = get("shroomlight")
    @JvmField
    public val HONEYCOMB: ItemType = get("honeycomb")
    @JvmField
    public val BEE_NEST: ItemType = get("bee_nest")
    @JvmField
    public val BEEHIVE: ItemType = get("beehive")
    @JvmField
    public val HONEY_BOTTLE: ItemType = get("honey_bottle")
    @JvmField
    public val HONEYCOMB_BLOCK: ItemType = get("honeycomb_block")
    @JvmField
    public val LODESTONE: ItemType = get("lodestone")
    @JvmField
    public val CRYING_OBSIDIAN: ItemType = get("crying_obsidian")
    @JvmField
    public val BLACKSTONE: ItemType = get("blackstone")
    @JvmField
    public val BLACKSTONE_SLAB: ItemType = get("blackstone_slab")
    @JvmField
    public val BLACKSTONE_STAIRS: ItemType = get("blackstone_stairs")
    @JvmField
    public val GILDED_BLACKSTONE: ItemType = get("gilded_blackstone")
    @JvmField
    public val POLISHED_BLACKSTONE: ItemType = get("polished_blackstone")
    @JvmField
    public val POLISHED_BLACKSTONE_SLAB: ItemType = get("polished_blackstone_slab")
    @JvmField
    public val POLISHED_BLACKSTONE_STAIRS: ItemType = get("polished_blackstone_stairs")
    @JvmField
    public val CHISELED_POLISHED_BLACKSTONE: ItemType = get("chiseled_polished_blackstone")
    @JvmField
    public val POLISHED_BLACKSTONE_BRICKS: ItemType = get("polished_blackstone_bricks")
    @JvmField
    public val POLISHED_BLACKSTONE_BRICK_SLAB: ItemType = get("polished_blackstone_brick_slab")
    @JvmField
    public val POLISHED_BLACKSTONE_BRICK_STAIRS: ItemType = get("polished_blackstone_brick_stairs")
    @JvmField
    public val CRACKED_POLISHED_BLACKSTONE_BRICKS: ItemType = get("cracked_polished_blackstone_bricks")
    @JvmField
    public val RESPAWN_ANCHOR: ItemType = get("respawn_anchor")
    @JvmField
    public val CANDLE: ItemType = get("candle")
    @JvmField
    public val WHITE_CANDLE: ItemType = get("white_candle")
    @JvmField
    public val ORANGE_CANDLE: ItemType = get("orange_candle")
    @JvmField
    public val MAGENTA_CANDLE: ItemType = get("magenta_candle")
    @JvmField
    public val LIGHT_BLUE_CANDLE: ItemType = get("light_blue_candle")
    @JvmField
    public val YELLOW_CANDLE: ItemType = get("yellow_candle")
    @JvmField
    public val LIME_CANDLE: ItemType = get("lime_candle")
    @JvmField
    public val PINK_CANDLE: ItemType = get("pink_candle")
    @JvmField
    public val GRAY_CANDLE: ItemType = get("gray_candle")
    @JvmField
    public val LIGHT_GRAY_CANDLE: ItemType = get("light_gray_candle")
    @JvmField
    public val CYAN_CANDLE: ItemType = get("cyan_candle")
    @JvmField
    public val PURPLE_CANDLE: ItemType = get("purple_candle")
    @JvmField
    public val BLUE_CANDLE: ItemType = get("blue_candle")
    @JvmField
    public val BROWN_CANDLE: ItemType = get("brown_candle")
    @JvmField
    public val GREEN_CANDLE: ItemType = get("green_candle")
    @JvmField
    public val RED_CANDLE: ItemType = get("red_candle")
    @JvmField
    public val BLACK_CANDLE: ItemType = get("black_candle")
    @JvmField
    public val SMALL_AMETHYST_BUD: ItemType = get("small_amethyst_bud")
    @JvmField
    public val MEDIUM_AMETHYST_BUD: ItemType = get("medium_amethyst_bud")
    @JvmField
    public val LARGE_AMETHYST_BUD: ItemType = get("large_amethyst_bud")
    @JvmField
    public val AMETHYST_CLUSTER: ItemType = get("amethyst_cluster")
    @JvmField
    public val POINTED_DRIPSTONE: ItemType = get("pointed_dripstone")

    // @formatter:on
    @JvmStatic
    private fun get(key: String): ItemType = Registries.ITEM[Key.key(key)]!!
}
