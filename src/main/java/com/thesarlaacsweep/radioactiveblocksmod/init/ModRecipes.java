package com.thesarlaacsweep.radioactiveblocksmod.init;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_COBBLESTONE_BLOCK, new ItemStack(ModBlocks.RADIOACTIVE_STONE_BLOCK), 0.2f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_STONE_BRICK_BLOCK, new ItemStack(ModBlocks.RADIOACTIVE_CRACKED_STONE_BRICK_BLOCK), 0.2f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_SANDSTONE_BLOCK, new ItemStack(ModBlocks.RADIOACTIVE_SMOOTH_SANDSTONE_BLOCK), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_RED_SANDSTONE_BLOCK, new ItemStack(ModBlocks.RADIOACTIVE_RED_SMOOTH_SANDSTONE_BLOCK), 0.1f);
		
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_BLACK_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_BLACK_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_BLUE_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_BLUE_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_BROWN_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_BROWN_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_CYAN_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_CYAN_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_GRAY_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_GRAY_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_GREEN_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_GREEN_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_LIGHT_BLUE_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_LIGHT_BLUE_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_LIGHT_GRAY_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_LIGHT_GRAY_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_LIME_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_LIME_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_MAGENTA_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_MAGENTA_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_ORANGE_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_ORANGE_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_PINK_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_PINK_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_PURPLE_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_PURPLE_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_RED_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_RED_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_WHITE_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_WHITE_GLAZED_TERRACOTTA), 0.1f);
		GameRegistry.addSmelting(ModBlocks.RADIOACTIVE_BLOCK_YELLOW_TERRACOTTA, new ItemStack(ModBlocks.RADIOACTIVE_BLOCK_YELLOW_GLAZED_TERRACOTTA), 0.1f);
		
		// Ore to Ingot
		GameRegistry.addSmelting(ModBlocks.AMERICIUM_ORE, new ItemStack(ModItems.AMERICIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModBlocks.BERKELIUM_ORE, new ItemStack(ModItems.BERKELIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModBlocks.NEPTUNIUM_ORE, new ItemStack(ModItems.NEPTUNIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModBlocks.PLUTONIUM_ORE, new ItemStack(ModItems.PLUTONIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModBlocks.PROTACTINIUM_ORE, new ItemStack(ModItems.PROTACTINIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModBlocks.RADIUM_ORE, new ItemStack(ModItems.RADIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModBlocks.TECHNETIUM_ORE, new ItemStack(ModItems.TECHNETIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModBlocks.THORIUM_ORE, new ItemStack(ModItems.THORIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModBlocks.URANIUM_ORE, new ItemStack(ModItems.URANIUM_INGOT, 1), 0.5f);
		
		// Dust to Ingot
		GameRegistry.addSmelting(ModItems.AMERICIUM_DUST, new ItemStack(ModItems.AMERICIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.BERKELIUM_DUST, new ItemStack(ModItems.BERKELIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.NEPTUNIUM_DUST, new ItemStack(ModItems.NEPTUNIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.PLUTONIUM_DUST, new ItemStack(ModItems.PLUTONIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.PROTACTINIUM_DUST, new ItemStack(ModItems.PROTACTINIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.RADIUM_DUST, new ItemStack(ModItems.RADIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.TECHNETIUM_DUST, new ItemStack(ModItems.TECHNETIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.THORIUM_DUST, new ItemStack(ModItems.THORIUM_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.URANIUM_DUST, new ItemStack(ModItems.URANIUM_INGOT, 1), 0.5f);

		// Americium Tools
		ItemStack stackAmericiumSword = new ItemStack(ModItems.AMERICIUM_SWORD);
		ItemStack stackAmericiumPickaxe = new ItemStack(ModItems.AMERICIUM_PICKAXE);
		ItemStack stackAmericiumAxe = new ItemStack(ModItems.AMERICIUM_AXE);
		ItemStack stackAmericiumShovel = new ItemStack(ModItems.AMERICIUM_SHOVEL);
		ItemStack stackAmericiumHoe = new ItemStack(ModItems.AMERICIUM_HOE);
		
		stackAmericiumSword.addEnchantment(Enchantment.getEnchantmentByLocation("looting"), 2);
		stackAmericiumPickaxe.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 2);
		stackAmericiumAxe.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 2);
		stackAmericiumShovel.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 2);
		stackAmericiumHoe.addEnchantment(Enchantment.getEnchantmentByLocation("mending"), 1);

		
		ResourceLocation radioactiveSwordGroup = new ResourceLocation("rb_swordgroup");
		ResourceLocation radioactivePickaxeGroup = new ResourceLocation("rb_pickaxegroup");
		ResourceLocation radioactiveAxeGroup = new ResourceLocation("rb_axegroup");
		ResourceLocation radioactiveShovelGroup = new ResourceLocation("rb_shovelgroup");
		ResourceLocation radioactiveHoeGroup = new ResourceLocation("rb_hoegroup");
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_americium_sword"), radioactiveSwordGroup, stackAmericiumSword, new Object [] {
				" I ",
				" I ",
				" S ",
				'I', ModItems.AMERICIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_americium_pickaxe"), radioactivePickaxeGroup, stackAmericiumPickaxe, new Object [] {
				"III",
				" S ",
				" S ",
				'I', ModItems.AMERICIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_americium_axe"), radioactiveAxeGroup, stackAmericiumAxe, new Object [] {
				"II ",
				"IS ",
				" S ",
				'I', ModItems.AMERICIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_americium_shovel"), radioactiveShovelGroup, stackAmericiumShovel, new Object [] {
				" I ",
				" S ",
				" S ",
				'I', ModItems.AMERICIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_americium_hoe"), radioactiveHoeGroup, stackAmericiumHoe, new Object [] {
				"II ",
				" S ",
				" S ",
				'I', ModItems.AMERICIUM_INGOT,
				'S', Items.STICK
		});
		
		// Berkelium Tools
		ItemStack stackBerkeliumSword = new ItemStack(ModItems.BERKELIUM_SWORD);
		ItemStack stackBerkeliumPickaxe = new ItemStack(ModItems.BERKELIUM_PICKAXE);
		ItemStack stackBerkeliumAxe = new ItemStack(ModItems.BERKELIUM_AXE);
		ItemStack stackBerkeliumShovel = new ItemStack(ModItems.BERKELIUM_SHOVEL);
		ItemStack stackBerkeliumHoe = new ItemStack(ModItems.BERKELIUM_HOE);
		
		stackBerkeliumSword.addEnchantment(Enchantment.getEnchantmentByLocation("sweeping"), 2);
		stackBerkeliumPickaxe.addEnchantment(Enchantment.getEnchantmentByLocation("silk_touch"), 1);
		stackBerkeliumAxe.addEnchantment(Enchantment.getEnchantmentByLocation("silk_touch"), 1);
		stackBerkeliumShovel.addEnchantment(Enchantment.getEnchantmentByLocation("silk_touch"), 1);
		stackBerkeliumHoe.addEnchantment(Enchantment.getEnchantmentByLocation("mending"), 1);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_berkelium_sword"), radioactiveSwordGroup, stackBerkeliumSword, new Object [] {
				" I ",
				" I ",
				" S ",
				'I', ModItems.BERKELIUM_INGOT,
				'S', Items.STICK
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_berkelium_pickaxe"), radioactivePickaxeGroup, stackBerkeliumPickaxe, new Object [] {
				"III",
				" S ",
				" S ",
				'I', ModItems.BERKELIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_berkelium_axe"), radioactiveAxeGroup, stackBerkeliumAxe, new Object [] {
				"II ",
				"IS ",
				" S ",
				'I', ModItems.BERKELIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_berkelium_shovel"), radioactiveShovelGroup, stackBerkeliumShovel, new Object [] {
				" I ",
				" S ",
				" S ",
				'I', ModItems.BERKELIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_berkelium_hoe"), radioactiveHoeGroup, stackBerkeliumHoe, new Object [] {
				"II ",
				" S ",
				" S ",
				'I', ModItems.BERKELIUM_INGOT,
				'S', Items.STICK
		});

		// Neptunium Tools
		ItemStack stackNeptuniumSword = new ItemStack(ModItems.NEPTUNIUM_SWORD);
		ItemStack stackNeptuniumPickaxe = new ItemStack(ModItems.NEPTUNIUM_PICKAXE);
		ItemStack stackNeptuniumAxe = new ItemStack(ModItems.NEPTUNIUM_AXE);
		ItemStack stackNeptuniumShovel = new ItemStack(ModItems.NEPTUNIUM_SHOVEL);
		ItemStack stackNeptuniumHoe = new ItemStack(ModItems.NEPTUNIUM_HOE);
		
		stackNeptuniumSword.addEnchantment(Enchantment.getEnchantmentByLocation("looting"), 3);
		stackNeptuniumPickaxe.addEnchantment(Enchantment.getEnchantmentByLocation("efficiency"), 3);
		stackNeptuniumAxe.addEnchantment(Enchantment.getEnchantmentByLocation("efficiency"), 3);
		stackNeptuniumShovel.addEnchantment(Enchantment.getEnchantmentByLocation("efficiency"), 3);
		stackNeptuniumHoe.addEnchantment(Enchantment.getEnchantmentByLocation("unbreaking"), 3);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_neptunium_sword"), radioactiveSwordGroup, stackNeptuniumSword, new Object [] {
				" I ",
				" I ",
				" S ",
				'I', ModItems.NEPTUNIUM_INGOT,
				'S', Items.STICK
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_neptunium_pickaxe"), radioactivePickaxeGroup, stackNeptuniumPickaxe, new Object [] {
				"III",
				" S ",
				" S ",
				'I', ModItems.NEPTUNIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_neptunium_axe"), radioactiveAxeGroup, stackNeptuniumAxe, new Object [] {
				"II ",
				"IS ",
				" S ",
				'I', ModItems.NEPTUNIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_neptunium_shovel"), radioactiveShovelGroup, stackNeptuniumShovel, new Object [] {
				" I ",
				" S ",
				" S ",
				'I', ModItems.NEPTUNIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_neptunium_hoe"), radioactiveHoeGroup, stackNeptuniumHoe, new Object [] {
				"II ",
				" S ",
				" S ",
				'I', ModItems.NEPTUNIUM_INGOT,
				'S', Items.STICK
		});

		// Plutonium Tools
		ItemStack stackPlutoniumSword = new ItemStack(ModItems.PLUTONIUM_SWORD);
		ItemStack stackPlutoniumPickaxe = new ItemStack(ModItems.PLUTONIUM_PICKAXE);
		ItemStack stackPlutoniumAxe = new ItemStack(ModItems.PLUTONIUM_AXE);
		ItemStack stackPlutoniumShovel = new ItemStack(ModItems.PLUTONIUM_SHOVEL);
		ItemStack stackPlutoniumHoe = new ItemStack(ModItems.PLUTONIUM_HOE);
		
		stackPlutoniumSword.addEnchantment(Enchantment.getEnchantmentByLocation("knockback"), 2);
		stackPlutoniumPickaxe.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 3);
		stackPlutoniumAxe.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 3);
		stackPlutoniumShovel.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 3);
		stackPlutoniumHoe.addEnchantment(Enchantment.getEnchantmentByLocation("unbreaking"), 2);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_plutonium_sword"), radioactiveSwordGroup, stackPlutoniumSword, new Object [] {
				" I ",
				" I ",
				" S ",
				'I', ModItems.PLUTONIUM_INGOT,
				'S', Items.STICK
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_plutonium_pickaxe"), radioactivePickaxeGroup, stackPlutoniumPickaxe, new Object [] {
				"III",
				" S ",
				" S ",
				'I', ModItems.PLUTONIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_plutonium_axe"), radioactiveAxeGroup, stackPlutoniumAxe, new Object [] {
				"II ",
				"IS ",
				" S ",
				'I', ModItems.PLUTONIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_plutonium_shovel"), radioactiveShovelGroup, stackPlutoniumShovel, new Object [] {
				" I ",
				" S ",
				" S ",
				'I', ModItems.PLUTONIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_plutonium_hoe"), radioactiveHoeGroup, stackPlutoniumHoe, new Object [] {
				"II ",
				" S ",
				" S ",
				'I', ModItems.PLUTONIUM_INGOT,
				'S', Items.STICK
		});

		// Protactinium Tools
		ItemStack stackProtactiniumSword = new ItemStack(ModItems.PROTACTINIUM_SWORD);
		ItemStack stackProtactiniumPickaxe = new ItemStack(ModItems.PROTACTINIUM_PICKAXE);
		ItemStack stackProtactiniumAxe = new ItemStack(ModItems.PROTACTINIUM_AXE);
		ItemStack stackProtactiniumShovel = new ItemStack(ModItems.PROTACTINIUM_SHOVEL);
		ItemStack stackProtactiniumHoe = new ItemStack(ModItems.PROTACTINIUM_HOE);
		
		stackProtactiniumSword.addEnchantment(Enchantment.getEnchantmentByLocation("mending"), 1);
		stackProtactiniumPickaxe.addEnchantment(Enchantment.getEnchantmentByLocation("efficiency"), 3);
		stackProtactiniumAxe.addEnchantment(Enchantment.getEnchantmentByLocation("efficiency"), 3);
		stackProtactiniumShovel.addEnchantment(Enchantment.getEnchantmentByLocation("efficiency"), 3);
		stackProtactiniumHoe.addEnchantment(Enchantment.getEnchantmentByLocation("mending"), 1);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_protactinium_sword"), radioactiveSwordGroup, stackProtactiniumSword, new Object [] {
				" I ",
				" I ",
				" S ",
				'I', ModItems.PROTACTINIUM_INGOT,
				'S', Items.STICK
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_protactinium_pickaxe"), radioactivePickaxeGroup, stackProtactiniumPickaxe, new Object [] {
				"III",
				" S ",
				" S ",
				'I', ModItems.PROTACTINIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_protactinium_axe"), radioactiveAxeGroup, stackProtactiniumAxe, new Object [] {
				"II ",
				"IS ",
				" S ",
				'I', ModItems.PROTACTINIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_protactinium_shovel"), radioactiveShovelGroup, stackProtactiniumShovel, new Object [] {
				" I ",
				" S ",
				" S ",
				'I', ModItems.PROTACTINIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_protactinium_hoe"), radioactiveHoeGroup, stackProtactiniumHoe, new Object [] {
				"II ",
				" S ",
				" S ",
				'I', ModItems.PROTACTINIUM_INGOT,
				'S', Items.STICK
		});

		// Radium Tools
		ItemStack stackRadiumSword = new ItemStack(ModItems.RADIUM_SWORD);
		ItemStack stackRadiumPickaxe = new ItemStack(ModItems.RADIUM_PICKAXE);
		ItemStack stackRadiumAxe = new ItemStack(ModItems.RADIUM_AXE);
		ItemStack stackRadiumShovel = new ItemStack(ModItems.RADIUM_SHOVEL);
		ItemStack stackRadiumHoe = new ItemStack(ModItems.RADIUM_HOE);
		
		stackRadiumSword.addEnchantment(Enchantment.getEnchantmentByLocation("bane_of_arthropods"), 4);
		stackRadiumPickaxe.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 2);
		stackRadiumAxe.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 2);
		stackRadiumShovel.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 2);
		stackRadiumHoe.addEnchantment(Enchantment.getEnchantmentByLocation("mending"), 1);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_radium_sword"), radioactiveSwordGroup, stackRadiumSword, new Object [] {
				" I ",
				" I ",
				" S ",
				'I', ModItems.RADIUM_INGOT,
				'S', Items.STICK
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_radium_pickaxe"), radioactivePickaxeGroup, stackRadiumPickaxe, new Object [] {
				"III",
				" S ",
				" S ",
				'I', ModItems.RADIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_radium_axe"), radioactiveAxeGroup, stackRadiumAxe, new Object [] {
				"II ",
				"IS ",
				" S ",
				'I', ModItems.RADIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_radium_shovel"), radioactiveShovelGroup, stackRadiumShovel, new Object [] {
				" I ",
				" S ",
				" S ",
				'I', ModItems.RADIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_radium_hoe"), radioactiveHoeGroup, stackRadiumHoe, new Object [] {
				"II ",
				" S ",
				" S ",
				'I', ModItems.RADIUM_INGOT,
				'S', Items.STICK
		});

		// Technetium Tools
		ItemStack stackTechnetiumSword = new ItemStack(ModItems.TECHNETIUM_SWORD);
		ItemStack stackTechnetiumPickaxe = new ItemStack(ModItems.TECHNETIUM_PICKAXE);
		ItemStack stackTechnetiumAxe = new ItemStack(ModItems.TECHNETIUM_AXE);
		ItemStack stackTechnetiumShovel = new ItemStack(ModItems.TECHNETIUM_SHOVEL);
		ItemStack stackTechnetiumHoe = new ItemStack(ModItems.TECHNETIUM_HOE);
		
		stackTechnetiumSword.addEnchantment(Enchantment.getEnchantmentByLocation("sharpness"), 5);
		stackTechnetiumPickaxe.addEnchantment(Enchantment.getEnchantmentByLocation("silk_touch"), 1);
		stackTechnetiumAxe.addEnchantment(Enchantment.getEnchantmentByLocation("silk_touch"), 1);
		stackTechnetiumShovel.addEnchantment(Enchantment.getEnchantmentByLocation("silk_touch"), 1);
		stackTechnetiumHoe.addEnchantment(Enchantment.getEnchantmentByLocation("unbreaking"), 3);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_technetium_sword"), radioactiveSwordGroup, stackTechnetiumSword, new Object [] {
				" I ",
				" I ",
				" S ",
				'I', ModItems.TECHNETIUM_INGOT,
				'S', Items.STICK
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_technetium_pickaxe"), radioactivePickaxeGroup, stackTechnetiumPickaxe, new Object [] {
				"III",
				" S ",
				" S ",
				'I', ModItems.TECHNETIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_technetium_axe"), radioactiveAxeGroup, stackTechnetiumAxe, new Object [] {
				"II ",
				"IS ",
				" S ",
				'I', ModItems.TECHNETIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_technetium_shovel"), radioactiveShovelGroup, stackTechnetiumShovel, new Object [] {
				" I ",
				" S ",
				" S ",
				'I', ModItems.TECHNETIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_technetium_hoe"), radioactiveHoeGroup, stackTechnetiumHoe, new Object [] {
				"II ",
				" S ",
				" S ",
				'I', ModItems.TECHNETIUM_INGOT,
				'S', Items.STICK
		});

		// Thorium Tools
		ItemStack stackThoriumSword = new ItemStack(ModItems.THORIUM_SWORD);
		ItemStack stackThoriumPickaxe = new ItemStack(ModItems.THORIUM_PICKAXE);
		ItemStack stackThoriumAxe = new ItemStack(ModItems.THORIUM_AXE);
		ItemStack stackThoriumShovel = new ItemStack(ModItems.THORIUM_SHOVEL);
		ItemStack stackThoriumHoe = new ItemStack(ModItems.THORIUM_HOE);
		
		stackThoriumSword.addEnchantment(Enchantment.getEnchantmentByLocation("smite"), 5);
		stackThoriumPickaxe.addEnchantment(Enchantment.getEnchantmentByLocation("efficiency"), 5);
		stackThoriumAxe.addEnchantment(Enchantment.getEnchantmentByLocation("efficiency"), 5);
		stackThoriumShovel.addEnchantment(Enchantment.getEnchantmentByLocation("efficiency"), 5);
		stackThoriumHoe.addEnchantment(Enchantment.getEnchantmentByLocation("unbreaking"), 3);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_thorium_sword"), radioactiveSwordGroup, stackThoriumSword, new Object [] {
				" I ",
				" I ",
				" S ",
				'I', ModItems.THORIUM_INGOT,
				'S', Items.STICK
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_thorium_pickaxe"), radioactivePickaxeGroup, stackThoriumPickaxe, new Object [] {
				"III",
				" S ",
				" S ",
				'I', ModItems.THORIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_thorium_axe"), radioactiveAxeGroup, stackThoriumAxe, new Object [] {
				"II ",
				"IS ",
				" S ",
				'I', ModItems.THORIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_thorium_shovel"), radioactiveShovelGroup, stackThoriumShovel, new Object [] {
				" I ",
				" S ",
				" S ",
				'I', ModItems.THORIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_thorium_hoe"), radioactiveHoeGroup, stackThoriumHoe, new Object [] {
				"II ",
				" S ",
				" S ",
				'I', ModItems.THORIUM_INGOT,
				'S', Items.STICK
		});

		// Uranium Tools
		ItemStack stackUraniumSword = new ItemStack(ModItems.URANIUM_SWORD);
		ItemStack stackUraniumPickaxe = new ItemStack(ModItems.URANIUM_PICKAXE);
		ItemStack stackUraniumAxe = new ItemStack(ModItems.URANIUM_AXE);
		ItemStack stackUraniumShovel = new ItemStack(ModItems.URANIUM_SHOVEL);
		ItemStack stackUraniumHoe = new ItemStack(ModItems.URANIUM_HOE);
		
		stackUraniumSword.addEnchantment(Enchantment.getEnchantmentByLocation("knockback"), 3);
		stackUraniumPickaxe.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 3);
		stackUraniumAxe.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 3);
		stackUraniumShovel.addEnchantment(Enchantment.getEnchantmentByLocation("fortune"), 3);
		stackUraniumHoe.addEnchantment(Enchantment.getEnchantmentByLocation("mending"), 1);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_uranium_sword"), radioactiveSwordGroup, stackUraniumSword, new Object [] {
				" I ",
				" I ",
				" S ",
				'I', ModItems.URANIUM_INGOT,
				'S', Items.STICK
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_uranium_pickaxe"), radioactivePickaxeGroup, stackUraniumPickaxe, new Object [] {
				"III",
				" S ",
				" S ",
				'I', ModItems.URANIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_uranium_axe"), radioactiveAxeGroup, stackUraniumAxe, new Object [] {
				"II ",
				"IS ",
				" S ",
				'I', ModItems.URANIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_uranium_shovel"), radioactiveShovelGroup, stackUraniumShovel, new Object [] {
				" I ",
				" S ",
				" S ",
				'I', ModItems.URANIUM_INGOT,
				'S', Items.STICK
		});
		
		GameRegistry.addShapedRecipe(new ResourceLocation("radioactiveblocks:recipe_uranium_hoe"), radioactiveHoeGroup, stackUraniumHoe, new Object [] {
				"II ",
				" S ",
				" S ",
				'I', ModItems.URANIUM_INGOT,
				'S', Items.STICK
		});
	}
}
