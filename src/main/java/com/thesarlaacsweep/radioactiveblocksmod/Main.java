package com.thesarlaacsweep.radioactiveblocksmod;

import com.thesarlaacsweep.radioactiveblocksmod.init.ModBlocks;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModItems;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModRecipes;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModTabs;
import com.thesarlaacsweep.radioactiveblocksmod.init.OreGeneration;
import com.thesarlaacsweep.radioactiveblocksmod.proxy.CommonProxy;
import com.thesarlaacsweep.radioactiveblocksmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	public static final CreativeTabs radioactiveblockstab = new ModTabs("radioactive_blocks_tab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		// will have to somehow teach other mods about these ores somehow
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);

		OreDictionary.registerOre("ingotAmericium", ModItems.AMERICIUM_INGOT);
		OreDictionary.registerOre("ingotBerkelium", ModItems.BERKELIUM_INGOT);
		OreDictionary.registerOre("ingotNeptunium", ModItems.NEPTUNIUM_INGOT);
		OreDictionary.registerOre("ingotPlutonium", ModItems.PLUTONIUM_INGOT);
		OreDictionary.registerOre("ingotProtactinium", ModItems.PROTACTINIUM_INGOT);
		OreDictionary.registerOre("ingotRadium", ModItems.RADIUM_INGOT);
		OreDictionary.registerOre("ingotTechnetium", ModItems.TECHNETIUM_INGOT);
		OreDictionary.registerOre("ingotThorium", ModItems.THORIUM_INGOT);
		OreDictionary.registerOre("ingotUranium", ModItems.URANIUM_INGOT);
		
		OreDictionary.registerOre("nuggetAmericium", ModItems.AMERICIUM_NUGGET);
		OreDictionary.registerOre("nuggetBerkelium", ModItems.BERKELIUM_NUGGET);
		OreDictionary.registerOre("nuggetNeptunium", ModItems.NEPTUNIUM_NUGGET);
		OreDictionary.registerOre("nuggetPlutonium", ModItems.PLUTONIUM_NUGGET);
		OreDictionary.registerOre("nuggetProtactinium", ModItems.PROTACTINIUM_NUGGET);
		OreDictionary.registerOre("nuggetRadium", ModItems.RADIUM_NUGGET);
		OreDictionary.registerOre("nuggetTechnetium", ModItems.TECHNETIUM_NUGGET);
		OreDictionary.registerOre("nuggetThorium", ModItems.THORIUM_NUGGET);
		OreDictionary.registerOre("nuggetUranium", ModItems.URANIUM_NUGGET);
		
		OreDictionary.registerOre("dustAmericium", ModItems.AMERICIUM_DUST);
		OreDictionary.registerOre("dustBerkelium", ModItems.BERKELIUM_DUST);
		OreDictionary.registerOre("dustNeptunium", ModItems.NEPTUNIUM_DUST);
		OreDictionary.registerOre("dustPlutonium", ModItems.PLUTONIUM_DUST);
		OreDictionary.registerOre("dustProtactinium", ModItems.PROTACTINIUM_DUST);
		OreDictionary.registerOre("dustRadium", ModItems.RADIUM_DUST);
		OreDictionary.registerOre("dustTechnetium", ModItems.TECHNETIUM_DUST);
		OreDictionary.registerOre("dustThorium", ModItems.THORIUM_DUST);
		OreDictionary.registerOre("dustUranium", ModItems.URANIUM_DUST);

		OreDictionary.registerOre("blockAmericium", ModBlocks.AMERICIUM_BLOCK);
		OreDictionary.registerOre("blockBerkelium", ModBlocks.BERKELIUM_BLOCK);
		OreDictionary.registerOre("blockNeptunium", ModBlocks.NEPTUNIUM_BLOCK);
		OreDictionary.registerOre("blockPlutonium", ModBlocks.PLUTONIUM_BLOCK);
		OreDictionary.registerOre("blockProtactinium", ModBlocks.PROTACTINIUM_BLOCK);
		OreDictionary.registerOre("blockRadium", ModBlocks.RADIUM_BLOCK);
		OreDictionary.registerOre("blockTechnetium", ModBlocks.TECHNETIUM_BLOCK);
		OreDictionary.registerOre("blockThorium", ModBlocks.THORIUM_BLOCK);
		OreDictionary.registerOre("blockUranium", ModBlocks.URANIUM_BLOCK);

		OreDictionary.registerOre("oreAmericium", ModBlocks.AMERICIUM_ORE);
		OreDictionary.registerOre("oreBerkelium", ModBlocks.BERKELIUM_ORE);
		OreDictionary.registerOre("oreNeptunium", ModBlocks.NEPTUNIUM_ORE);
		OreDictionary.registerOre("orePlutonium", ModBlocks.PLUTONIUM_ORE);
		OreDictionary.registerOre("oreProtactinium", ModBlocks.PROTACTINIUM_ORE);
		OreDictionary.registerOre("oreRadium", ModBlocks.RADIUM_ORE);
		OreDictionary.registerOre("oreTechnetium", ModBlocks.TECHNETIUM_ORE);
		OreDictionary.registerOre("oreThorium", ModBlocks.THORIUM_ORE);
		OreDictionary.registerOre("oreUranium", ModBlocks.URANIUM_ORE);
		
		OreDictionary.registerOre("grassRadioactive", ModBlocks.RADIOACTIVE_GRASS_BLOCK);
		OreDictionary.registerOre("cobblestoneRadioactive", ModBlocks.RADIOACTIVE_COBBLESTONE_BLOCK);
		OreDictionary.registerOre("mossyCobblestoneRadioactive", ModBlocks.RADIOACTIVE_MOSSY_COBBLESTONE_BLOCK);
		OreDictionary.registerOre("stoneRadioactive", ModBlocks.RADIOACTIVE_STONE_BLOCK);
		OreDictionary.registerOre("stoneBrickRadioactive", ModBlocks.RADIOACTIVE_STONE_BRICK_BLOCK);
		OreDictionary.registerOre("bricksRadioactive", ModBlocks.RADIOACTIVE_BRICK_BLOCK);

		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
	}
}
