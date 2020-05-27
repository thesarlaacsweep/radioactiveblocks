package com.thesarlaacsweep.radioactiveblocksmod.init;

import java.util.ArrayList;
import java.util.List;

import com.thesarlaacsweep.radioactiveblocksmod.blocks.OreBlock;
import com.thesarlaacsweep.radioactiveblocksmod.blocks.RadioactiveBlock;
import com.thesarlaacsweep.radioactiveblocksmod.blocks.RadioactiveBlockPillar;
import com.thesarlaacsweep.radioactiveblocksmod.blocks.RadioactiveBlockPlanks;
import com.thesarlaacsweep.radioactiveblocksmod.blocks.RadioactiveBlockSlabs;
import com.thesarlaacsweep.radioactiveblocksmod.blocks.RadioactiveBlockStairs;
import com.thesarlaacsweep.radioactiveblocksmod.blocks.RadioactiveGrassBlock;
import com.thesarlaacsweep.radioactiveblocksmod.blocks.RadioactiveMetalBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks {
	/* TODO:
	 * Add recipes for blocks that don't have them.
	 * Complete the rest of the stone based blocks including bricks, stairs and slabs.
	 * Add Dirt, Sand, Sandstone etc.
	 * Add terracotta and concrete blocks.
	 * Complete Ore Dictionary registration.
	 * Add tools, weapons, armor.
	 * 
	 * */
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	// Ore
	public static final Block AMERICIUM_ORE = new OreBlock("americium_ore", Material.ROCK);
	public static final Block BERKELIUM_ORE = new OreBlock("berkelium_ore", Material.ROCK);
	public static final Block NEPTUNIUM_ORE = new OreBlock("neptunium_ore", Material.ROCK);
	public static final Block PLUTONIUM_ORE = new OreBlock("plutonium_ore", Material.ROCK);
	public static final Block PROTACTINIUM_ORE = new OreBlock("protactinium_ore", Material.ROCK);
	public static final Block RADIUM_ORE = new OreBlock("radium_ore", Material.ROCK);
	public static final Block TECHNETIUM_ORE = new OreBlock("technetium_ore", Material.ROCK);
	public static final Block THORIUM_ORE = new OreBlock("thorium_ore", Material.ROCK);
	public static final Block URANIUM_ORE = new OreBlock("uranium_ore", Material.ROCK);
	
	// Radioactive Material Blocks
	public static final Block AMERICIUM_BLOCK = new RadioactiveMetalBlock("americium_block", Material.IRON);
	public static final Block BERKELIUM_BLOCK = new RadioactiveMetalBlock("berkelium_block", Material.IRON);
	public static final Block NEPTUNIUM_BLOCK = new RadioactiveMetalBlock("neptunium_block", Material.IRON);
	public static final Block PLUTONIUM_BLOCK = new RadioactiveMetalBlock("plutonium_block", Material.IRON);
	public static final Block PROTACTINIUM_BLOCK = new RadioactiveMetalBlock("protactinium_block", Material.IRON);
	public static final Block RADIUM_BLOCK = new RadioactiveMetalBlock("radium_block", Material.IRON);
	public static final Block TECHNETIUM_BLOCK = new RadioactiveMetalBlock("technetium_block", Material.IRON);
	public static final Block THORIUM_BLOCK = new RadioactiveMetalBlock("thorium_block", Material.IRON);
	public static final Block URANIUM_BLOCK = new RadioactiveMetalBlock("uranium_block", Material.IRON);
	
	// Grass
	public static final Block RADIOACTIVE_GRASS_BLOCK = new RadioactiveGrassBlock("radioactive_landscape_grass", Material.GRASS);
	
	// Stone and Bricks
	public static final Block RADIOACTIVE_COBBLESTONE_BLOCK = new RadioactiveBlock("radioactive_cobblestone_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_MOSSY_COBBLESTONE_BLOCK = new RadioactiveBlock("radioactive_mossy_cobblestone_block", Material.ROCK, SoundType.STONE, "pickaxe");

	public static final Block RADIOACTIVE_STONE_BLOCK = new RadioactiveBlock("radioactive_stone_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_STONE_BRICK_BLOCK = new RadioactiveBlock("radioactive_stone_brick", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_CRACKED_STONE_BRICK_BLOCK = new RadioactiveBlock("radioactive_cracked_stone_brick", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_MOSSY_STONE_BRICK_BLOCK = new RadioactiveBlock("radioactive_mossy_stone_brick", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_CHISELED_STONE_BRICK_BLOCK = new RadioactiveBlock("radioactive_chiseled_stone_brick", Material.ROCK, SoundType.STONE, "pickaxe");

	public static final Block RADIOACTIVE_COBBLESTONE_SLAB = new RadioactiveBlockSlabs("radioactive_cobblestone_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_STONE_SLAB = new RadioactiveBlockSlabs("radioactive_stone_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_STONE_BRICK_SLAB = new RadioactiveBlockSlabs("radioactive_stone_brick_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	
	public static final Block RADIOACTIVE_ANDESITE_BLOCK = new RadioactiveBlock("radioactive_andesite_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_POLISHED_ANDESITE_BLOCK = new RadioactiveBlock("radioactive_polished_andesite_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_DIORITE_BLOCK = new RadioactiveBlock("radioactive_diorite_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_POLISHED_DIORITE_BLOCK = new RadioactiveBlock("radioactive_polished_diorite_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_GRANITE_BLOCK = new RadioactiveBlock("radioactive_granite_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_POLISHED_GRANITE_BLOCK = new RadioactiveBlock("radioactive_polished_granite_block", Material.ROCK, SoundType.STONE, "pickaxe");
	
	public static final Block RADIOACTIVE_BLOCK_COBBLESTONE_STAIRS = new RadioactiveBlockStairs("radioactive_cobblestone_stairs", Material.ROCK, SoundType.STONE, "pickaxe", Block.getStateById(67));
	public static final Block RADIOACTIVE_BLOCK_STONE_BRICK_STAIRS = new RadioactiveBlockStairs("radioactive_stone_brick_stairs", Material.ROCK, SoundType.STONE, "pickaxe", Block.getStateById(109));
	
	public static final Block RADIOACTIVE_BRICK_BLOCK = new RadioactiveBlock("radioactive_brick_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BRICK_SLAB = new RadioactiveBlockSlabs("radioactive_brick_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BRICK_STAIRS = new RadioactiveBlockStairs("radioactive_brick_stairs", Material.ROCK, SoundType.STONE, "pickaxe", Block.getStateById(108));
	
	public static final Block RADIOACTIVE_ENDSTONE_BLOCK = new RadioactiveBlock("radioactive_end_stone", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_ENDSTONE_BRICK_BLOCK = new RadioactiveBlock("radioactive_end_bricks", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_ENDSTONE_BRICK_SLAB = new RadioactiveBlockSlabs("radioactive_end_bricks_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_ENDSTONE_BRICK_STAIRS = new RadioactiveBlockStairs("radioactive_end_bricks_stairs", Material.ROCK, SoundType.STONE, "pickaxe", Block.getStateById(67));
	
	public static final Block RADIOACTIVE_NETHER_BRICK_BLOCK = new RadioactiveBlock("radioactive_nether_brick_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_NETHER_BRICK_SLAB = new RadioactiveBlockSlabs("radioactive_nether_brick_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_NETHER_BLOCK_BRICK_STAIRS = new RadioactiveBlockStairs("radioactive_nether_brick_stairs", Material.ROCK, SoundType.STONE, "pickaxe", Block.getStateById(114));
	
	public static final Block RADIOACTIVE_PRISMARINE_BLOCK = new RadioactiveBlock("radioactive_prismarine_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_PRISMARINE_SLAB = new RadioactiveBlockSlabs("radioactive_prismarine_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_PRISMARINE_STAIRS = new RadioactiveBlockStairs("radioactive_prismarine_stairs", Material.ROCK, SoundType.STONE, "pickaxe", Block.getStateById(67));
	public static final Block RADIOACTIVE_PRISMARINE_BRICK_BLOCK = new RadioactiveBlock("radioactive_prismarine_brick_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_DARK_PRISMARINE_BLOCK = new RadioactiveBlock("radioactive_dark_prismarine_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_DARK_PRISMARINE_SLAB = new RadioactiveBlockSlabs("radioactive_dark_prismarine_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_DARK_PRISMARINE_STAIRS = new RadioactiveBlockStairs("radioactive_dark_prismarine_stairs", Material.ROCK, SoundType.STONE, "pickaxe", Block.getStateById(67));

	public static final Block RADIOACTIVE_PURPUR_BLOCK = new RadioactiveBlock("radioactive_purpur_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_PURPUR_PILLAR = new RadioactiveBlockPillar("radioactive_purpur_pillar", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_PURPUR_SLAB = new RadioactiveBlockSlabs("radioactive_purpur_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_PURPUR_STAIRS = new RadioactiveBlockStairs("radioactive_purpur_stairs", Material.ROCK, SoundType.STONE, "pickaxe", Block.getStateById(203));
	
	public static final Block RADIOACTIVE_QUARTZ_BLOCK = new RadioactiveBlock("radioactive_quartz_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_CHISELED_QUARTZ_BLOCK = new RadioactiveBlock("radioactive_chiseled_quartz_block", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_QUARTZ_PILLAR = new RadioactiveBlockPillar("radioactive_quartz_pillar", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_QUARTZ_SLAB = new RadioactiveBlockSlabs("radioactive_quartz_slab", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_QUARTZ_STAIRS = new RadioactiveBlockStairs("radioactive_quartz_stairs", Material.ROCK, SoundType.STONE, "pickaxe", Block.getStateById(156));

	// Sandstone
	public static final Block RADIOACTIVE_SANDSTONE_BLOCK = new RadioactiveBlock("radioactive_sandstone_block", Material.ROCK, SoundType.GROUND, "pickaxe");
	public static final Block RADIOACTIVE_CHISELED_SANDSTONE_BLOCK = new RadioactiveBlock("radioactive_chiseled_sandstone_block", Material.ROCK, SoundType.GROUND, "pickaxe");
	public static final Block RADIOACTIVE_SMOOTH_SANDSTONE_BLOCK = new RadioactiveBlock("radioactive_smooth_sandstone_block", Material.ROCK, SoundType.GROUND, "pickaxe");
	public static final Block RADIOACTIVE_SANDSTONE_SLAB = new RadioactiveBlockSlabs("radioactive_sandstone_slab", Material.ROCK, SoundType.GROUND, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_SANDSTONE_STAIRS = new RadioactiveBlockStairs("radioactive_sandstone_stairs", Material.ROCK, SoundType.GROUND, "pickaxe", Block.getStateById(128));
	
	public static final Block RADIOACTIVE_RED_SANDSTONE_BLOCK = new RadioactiveBlock("radioactive_red_sandstone_block", Material.ROCK, SoundType.GROUND, "pickaxe");
	public static final Block RADIOACTIVE_RED_CHISELED_SANDSTONE_BLOCK = new RadioactiveBlock("radioactive_red_chiseled_sandstone_block", Material.ROCK, SoundType.GROUND, "pickaxe");
	public static final Block RADIOACTIVE_RED_SMOOTH_SANDSTONE_BLOCK = new RadioactiveBlock("radioactive_red_smooth_sandstone_block", Material.ROCK, SoundType.GROUND, "pickaxe");
	public static final Block RADIOACTIVE_RED_SANDSTONE_SLAB = new RadioactiveBlockSlabs("radioactive_red_sandstone_slab", Material.ROCK, SoundType.GROUND, "pickaxe");
	public static final Block RADIOACTIVE_RED_BLOCK_SANDSTONE_STAIRS = new RadioactiveBlockStairs("radioactive_red_sandstone_stairs", Material.ROCK, SoundType.GROUND, "pickaxe", Block.getStateById(180));
	
	// Wood
	public static final Block RADIOACTIVE_BLOCK_ACACIA_LOG = new RadioactiveBlockPillar("radioactive_acacia_log", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_BIRCH_LOG = new RadioactiveBlockPillar("radioactive_birch_log", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_DARK_OAK_LOG = new RadioactiveBlockPillar("radioactive_dark_oak_log", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_JUNGLE_LOG = new RadioactiveBlockPillar("radioactive_jungle_log", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_OAK_LOG = new RadioactiveBlockPillar("radioactive_oak_log", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_SPRUCE_LOG = new RadioactiveBlockPillar("radioactive_spruce_log", Material.ROCK, SoundType.WOOD, "axe");
	
	public static final Block RADIOACTIVE_BLOCK_ACACIA_PLANKS = new RadioactiveBlockPlanks("radioactive_acacia_planks", Material.ROCK);
	public static final Block RADIOACTIVE_BLOCK_BIRCH_PLANKS = new RadioactiveBlockPlanks("radioactive_birch_planks", Material.ROCK);
	public static final Block RADIOACTIVE_BLOCK_DARK_OAK_PLANKS = new RadioactiveBlockPlanks("radioactive_dark_oak_planks", Material.ROCK);
	public static final Block RADIOACTIVE_BLOCK_JUNGLE_PLANKS = new RadioactiveBlockPlanks("radioactive_jungle_planks", Material.ROCK);
	public static final Block RADIOACTIVE_BLOCK_OAK_PLANKS = new RadioactiveBlockPlanks("radioactive_oak_planks", Material.ROCK);
	public static final Block RADIOACTIVE_BLOCK_SPRUCE_PLANKS = new RadioactiveBlockPlanks("radioactive_spruce_planks", Material.ROCK);
	
	public static final Block RADIOACTIVE_BLOCK_ACACIA_SLAB = new RadioactiveBlockSlabs("radioactive_acacia_slab", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_BIRCH_SLAB = new RadioactiveBlockSlabs("radioactive_birch_slab", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_DARK_OAK_SLAB = new RadioactiveBlockSlabs("radioactive_dark_oak_slab", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_JUNGLE_SLAB = new RadioactiveBlockSlabs("radioactive_jungle_slab", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_OAK_SLAB = new RadioactiveBlockSlabs("radioactive_oak_slab", Material.ROCK, SoundType.WOOD, "axe");
	public static final Block RADIOACTIVE_BLOCK_SPRUCE_SLAB = new RadioactiveBlockSlabs("radioactive_spruce_slab", Material.ROCK, SoundType.WOOD, "axe");
	
	public static final Block RADIOACTIVE_BLOCK_ACACIA_STAIRS = new RadioactiveBlockStairs("radioactive_acacia_stairs", Material.ROCK, SoundType.WOOD, "axe", Block.getStateById(163));
	public static final Block RADIOACTIVE_BLOCK_BIRCH_STAIRS = new RadioactiveBlockStairs("radioactive_birch_stairs", Material.ROCK, SoundType.WOOD, "axe", Block.getStateById(135));
	public static final Block RADIOACTIVE_BLOCK_DARK_OAK_STAIRS = new RadioactiveBlockStairs("radioactive_dark_oak_stairs", Material.ROCK, SoundType.WOOD, "axe", Block.getStateById(164));
	public static final Block RADIOACTIVE_BLOCK_JUNGLE_STAIRS = new RadioactiveBlockStairs("radioactive_jungle_stairs", Material.ROCK, SoundType.WOOD, "axe", Block.getStateById(136));
	public static final Block RADIOACTIVE_BLOCK_OAK_STAIRS = new RadioactiveBlockStairs("radioactive_oak_stairs", Material.ROCK, SoundType.WOOD, "axe",Block.getStateById(53));
	public static final Block RADIOACTIVE_BLOCK_SPRUCE_STAIRS = new RadioactiveBlockStairs("radioactive_spruce_stairs", Material.ROCK, SoundType.WOOD, "axe", Block.getStateById(134));

	// Terracotta
	public static final Block RADIOACTIVE_BLOCK_WHITE_TERRACOTTA = new RadioactiveBlock("radioactive_white_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_ORANGE_TERRACOTTA = new RadioactiveBlock("radioactive_orange_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_MAGENTA_TERRACOTTA = new RadioactiveBlock("radioactive_magenta_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_LIGHT_BLUE_TERRACOTTA = new RadioactiveBlock("radioactive_light_blue_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_YELLOW_TERRACOTTA = new RadioactiveBlock("radioactive_yellow_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_LIME_TERRACOTTA = new RadioactiveBlock("radioactive_lime_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_PINK_TERRACOTTA = new RadioactiveBlock("radioactive_pink_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_GRAY_TERRACOTTA = new RadioactiveBlock("radioactive_gray_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_LIGHT_GRAY_TERRACOTTA = new RadioactiveBlock("radioactive_light_gray_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_CYAN_TERRACOTTA = new RadioactiveBlock("radioactive_cyan_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_PURPLE_TERRACOTTA = new RadioactiveBlock("radioactive_purple_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BLUE_TERRACOTTA = new RadioactiveBlock("radioactive_blue_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BROWN_TERRACOTTA = new RadioactiveBlock("radioactive_brown_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_GREEN_TERRACOTTA = new RadioactiveBlock("radioactive_green_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_RED_TERRACOTTA = new RadioactiveBlock("radioactive_red_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BLACK_TERRACOTTA = new RadioactiveBlock("radioactive_black_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");

	public static final Block RADIOACTIVE_BLOCK_TERRACOTTA = new RadioactiveBlock("radioactive_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");

	public static final Block RADIOACTIVE_BLOCK_WHITE_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_white_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_ORANGE_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_orange_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_MAGENTA_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_magenta_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_LIGHT_BLUE_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_light_blue_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_YELLOW_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_yellow_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_LIME_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_lime_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_PINK_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_pink_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_GRAY_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_gray_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_LIGHT_GRAY_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_light_gray_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_CYAN_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_cyan_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_PURPLE_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_purple_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BLUE_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_blue_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BROWN_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_brown_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_GREEN_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_green_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_RED_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_red_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BLACK_GLAZED_TERRACOTTA = new RadioactiveBlock("radioactive_black_glazed_terracotta", Material.ROCK, SoundType.STONE, "pickaxe");

	// Concrete
	public static final Block RADIOACTIVE_BLOCK_WHITE_CONCRETE = new RadioactiveBlock("radioactive_white_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_ORANGE_CONCRETE = new RadioactiveBlock("radioactive_orange_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_MAGENTA_CONCRETE = new RadioactiveBlock("radioactive_magenta_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_LIGHT_BLUE_CONCRETE = new RadioactiveBlock("radioactive_light_blue_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_YELLOW_CONCRETE = new RadioactiveBlock("radioactive_yellow_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_LIME_CONCRETE = new RadioactiveBlock("radioactive_lime_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_PINK_CONCRETE = new RadioactiveBlock("radioactive_pink_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_GRAY_CONCRETE = new RadioactiveBlock("radioactive_gray_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_LIGHT_GRAY_CONCRETE = new RadioactiveBlock("radioactive_light_gray_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_CYAN_CONCRETE = new RadioactiveBlock("radioactive_cyan_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_PURPLE_CONCRETE = new RadioactiveBlock("radioactive_purple_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BLUE_CONCRETE = new RadioactiveBlock("radioactive_blue_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BROWN_CONCRETE = new RadioactiveBlock("radioactive_brown_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_GREEN_CONCRETE = new RadioactiveBlock("radioactive_green_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_RED_CONCRETE = new RadioactiveBlock("radioactive_red_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
	public static final Block RADIOACTIVE_BLOCK_BLACK_CONCRETE = new RadioactiveBlock("radioactive_black_concrete", Material.ROCK, SoundType.STONE, "pickaxe");
}
