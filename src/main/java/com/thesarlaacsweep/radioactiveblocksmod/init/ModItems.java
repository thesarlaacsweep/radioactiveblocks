package com.thesarlaacsweep.radioactiveblocksmod.init;

import java.util.ArrayList;
import java.util.List;

import com.thesarlaacsweep.radioactiveblocksmod.items.ItemBase;
import com.thesarlaacsweep.radioactiveblocksmod.items.RadioactiveArmor;
import com.thesarlaacsweep.radioactiveblocksmod.items.RadioactiveAxe;
import com.thesarlaacsweep.radioactiveblocksmod.items.RadioactiveHoe;
import com.thesarlaacsweep.radioactiveblocksmod.items.RadioactivePickaxe;
import com.thesarlaacsweep.radioactiveblocksmod.items.RadioactiveShovel;
import com.thesarlaacsweep.radioactiveblocksmod.items.RadioactiveSword;
import com.thesarlaacsweep.radioactiveblocksmod.items.RockHammer;
import com.thesarlaacsweep.radioactiveblocksmod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ToolMaterial MATERIAL_AMERICIUM = EnumHelper.addToolMaterial("material_americium", 2, 2000, 7.0f, 5.0f, 17);
	public static final ToolMaterial MATERIAL_BERKELIUM = EnumHelper.addToolMaterial("material_berkelium", 2, 2000, 7.0f, 6.0f, 19);
	public static final ToolMaterial MATERIAL_NEPTUNIUM = EnumHelper.addToolMaterial("material_neptunium", 2, 2000, 9.0f, 5.0f, 21);
	public static final ToolMaterial MATERIAL_PLUTONIUM = EnumHelper.addToolMaterial("material_plutonium", 2, 2000, 9.0f, 6.0f, 16);
	public static final ToolMaterial MATERIAL_PROTACTINIUM = EnumHelper.addToolMaterial("material_protactinium", 2, 2000, 6.0f, 4.0f, 19);
	public static final ToolMaterial MATERIAL_RADIUM = EnumHelper.addToolMaterial("material_radium", 2, 2000, 8.0f, 5.0f, 20);
	public static final ToolMaterial MATERIAL_TECHNETIUM = EnumHelper.addToolMaterial("material_technetium", 2, 2000, 10.0f, 6.0f, 20);
	public static final ToolMaterial MATERIAL_THORIUM = EnumHelper.addToolMaterial("material_thorium", 2, 2000, 12.0f, 7.0f, 22);
	public static final ToolMaterial MATERIAL_URANIUM = EnumHelper.addToolMaterial("material_uranium", 2, 2000, 10.0f, 8.0f, 16);

	public static final ArmorMaterial ARMOR_MATERIAL_AMERICIUM = EnumHelper.addArmorMaterial(
			"armor_material_americium",
			Reference.MOD_ID + ":americium",
			28,
			new int[] {4, 6, 8, 4},
			17,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			3.0f
	);
	public static final ArmorMaterial ARMOR_MATERIAL_BERKELIUM = EnumHelper.addArmorMaterial(
			"armor_material_berkelium",
			Reference.MOD_ID + ":berkelium",
			28,
			new int[] {4, 6, 8, 4},
			19,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			3.0f
	);
	public static final ArmorMaterial ARMOR_MATERIAL_NEPTUNIUM = EnumHelper.addArmorMaterial(
			"armor_material_neptunium",
			Reference.MOD_ID + ":neptunium",
			30,
			new int[] {4, 6, 8, 4},
			21,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			3.0f
	);
	public static final ArmorMaterial ARMOR_MATERIAL_PLUTONIUM = EnumHelper.addArmorMaterial(
			"armor_material_plutonium",
			Reference.MOD_ID + ":plutonium",
			30,
			new int[] {4, 6, 8, 4},
			16,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			3.0f
	);
	public static final ArmorMaterial ARMOR_MATERIAL_PROTACTINIUM = EnumHelper.addArmorMaterial(
			"armor_material_protactinium",
			Reference.MOD_ID + ":protactinium",
			24,
			new int[] {4, 6, 8, 4},
			19,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			3.0f
	);
	public static final ArmorMaterial ARMOR_MATERIAL_RADIUM = EnumHelper.addArmorMaterial(
			"armor_material_radium",
			Reference.MOD_ID + ":radium",
			24,
			new int[] {4, 6, 8, 4},
			20,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			3.0f
	);
	public static final ArmorMaterial ARMOR_MATERIAL_TECHNETIUM = EnumHelper.addArmorMaterial(
			"armor_material_technetium",
			Reference.MOD_ID + ":technetium",
			32,
			new int[] {4, 6, 8, 4},
			20,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			3.0f
	);
	public static final ArmorMaterial ARMOR_MATERIAL_THORIUM = EnumHelper.addArmorMaterial(
			"armor_material_thorium",
			Reference.MOD_ID + ":thorium",
			40,
			new int[] {4, 6, 8, 4},
			22,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			3.0f
	);
	public static final ArmorMaterial ARMOR_MATERIAL_URANIUM = EnumHelper.addArmorMaterial(
			"armor_material_uranium",
			Reference.MOD_ID + ":uranium",
			36,
			new int[] {4, 6, 8, 4},
			16,
			SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
			3.0f
	);
	
	// Radioactive material must have a half-life of at least 1000 years anything under is not included here...	
	
	// Ingots
	public static final Item AMERICIUM_INGOT = new ItemBase("americium_ingot");
	public static final Item BERKELIUM_INGOT = new ItemBase("berkelium_ingot");
	public static final Item NEPTUNIUM_INGOT = new ItemBase("neptunium_ingot");
	public static final Item PLUTONIUM_INGOT = new ItemBase("plutonium_ingot");
	public static final Item PROTACTINIUM_INGOT = new ItemBase("protactinium_ingot");
	public static final Item RADIUM_INGOT = new ItemBase("radium_ingot");
	public static final Item TECHNETIUM_INGOT = new ItemBase("technetium_ingot");
	public static final Item THORIUM_INGOT = new ItemBase("thorium_ingot");
	public static final Item URANIUM_INGOT = new ItemBase("uranium_ingot");
	
	// Nuggets
	public static final Item AMERICIUM_NUGGET = new ItemBase("americium_nugget");
	public static final Item BERKELIUM_NUGGET = new ItemBase("berkelium_nugget");
	public static final Item NEPTUNIUM_NUGGET = new ItemBase("neptunium_nugget");
	public static final Item PLUTONIUM_NUGGET = new ItemBase("plutonium_nugget");
	public static final Item PROTACTINIUM_NUGGET = new ItemBase("protactinium_nugget");
	public static final Item RADIUM_NUGGET = new ItemBase("radium_nugget");
	public static final Item TECHNETIUM_NUGGET = new ItemBase("technetium_nugget");
	public static final Item THORIUM_NUGGET = new ItemBase("thorium_nugget");
	public static final Item URANIUM_NUGGET = new ItemBase("uranium_nugget");
	
	// Powders/Grit
	public static final Item AMERICIUM_DUST = new ItemBase("americium_dust");
	public static final Item BERKELIUM_DUST = new ItemBase("berkelium_dust");
	public static final Item NEPTUNIUM_DUST = new ItemBase("neptunium_dust");
	public static final Item PLUTONIUM_DUST = new ItemBase("plutonium_dust");
	public static final Item PROTACTINIUM_DUST = new ItemBase("protactinium_dust");
	public static final Item RADIUM_DUST = new ItemBase("radium_dust");
	public static final Item TECHNETIUM_DUST = new ItemBase("technetium_dust");
	public static final Item THORIUM_DUST = new ItemBase("thorium_dust");
	public static final Item URANIUM_DUST = new ItemBase("uranium_dust");
	
	// Armor
	public static final Item AMERICIUM_HELMET = new RadioactiveArmor("americium_helmet", ARMOR_MATERIAL_AMERICIUM, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item AMERICIUM_CHESTPLATE = new RadioactiveArmor("americium_chestplate", ARMOR_MATERIAL_AMERICIUM, EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item AMERICIUM_LEGGINGS = new RadioactiveArmor("americium_leggings", ARMOR_MATERIAL_AMERICIUM, EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item AMERICIUM_BOOTS = new RadioactiveArmor("americium_boots", ARMOR_MATERIAL_AMERICIUM, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.REGENERATION, 1, 1000, true, false));
	
	public static final Item BERKELIUM_HELMET = new RadioactiveArmor("berkelium_helmet", ARMOR_MATERIAL_BERKELIUM, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item BERKELIUM_CHESTPLATE = new RadioactiveArmor("berkelium_chestplate", ARMOR_MATERIAL_BERKELIUM, EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item BERKELIUM_LEGGINGS = new RadioactiveArmor("berkelium_leggings", ARMOR_MATERIAL_BERKELIUM, EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item BERKELIUM_BOOTS = new RadioactiveArmor("berkelium_boots", ARMOR_MATERIAL_BERKELIUM, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.REGENERATION, 1, 1000, true, false));
	
	public static final Item NEPTUNIUM_HELMET = new RadioactiveArmor("neptunium_helmet", ARMOR_MATERIAL_NEPTUNIUM, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item NEPTUNIUM_CHESTPLATE = new RadioactiveArmor("neptunium_chestplate", ARMOR_MATERIAL_NEPTUNIUM, EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item NEPTUNIUM_LEGGINGS = new RadioactiveArmor("neptunium_leggings", ARMOR_MATERIAL_NEPTUNIUM, EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item NEPTUNIUM_BOOTS = new RadioactiveArmor("neptunium_boots", ARMOR_MATERIAL_NEPTUNIUM, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.REGENERATION, 1, 1000, true, false));
	
	public static final Item PLUTONIUM_HELMET = new RadioactiveArmor("plutonium_helmet", ARMOR_MATERIAL_PLUTONIUM, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item PLUTONIUM_CHESTPLATE = new RadioactiveArmor("plutonium_chestplate", ARMOR_MATERIAL_PLUTONIUM, EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item PLUTONIUM_LEGGINGS = new RadioactiveArmor("plutonium_leggings", ARMOR_MATERIAL_PLUTONIUM, EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item PLUTONIUM_BOOTS = new RadioactiveArmor("plutonium_boots", ARMOR_MATERIAL_PLUTONIUM, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.REGENERATION, 1, 1000, true, false));
	
	public static final Item PROTACTINIUM_HELMET = new RadioactiveArmor("protactinium_helmet", ARMOR_MATERIAL_PROTACTINIUM, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item PROTACTINIUM_CHESTPLATE = new RadioactiveArmor("protactinium_chestplate", ARMOR_MATERIAL_PROTACTINIUM, EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item PROTACTINIUM_LEGGINGS = new RadioactiveArmor("protactinium_leggings", ARMOR_MATERIAL_PROTACTINIUM, EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item PROTACTINIUM_BOOTS = new RadioactiveArmor("protactinium_boots", ARMOR_MATERIAL_PROTACTINIUM, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.REGENERATION, 1, 1000, true, false));
	
	public static final Item RADIUM_HELMET = new RadioactiveArmor("radium_helmet", ARMOR_MATERIAL_RADIUM, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item RADIUM_CHESTPLATE = new RadioactiveArmor("radium_chestplate", ARMOR_MATERIAL_RADIUM, EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item RADIUM_LEGGINGS = new RadioactiveArmor("radium_leggings", ARMOR_MATERIAL_RADIUM, EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item RADIUM_BOOTS = new RadioactiveArmor("radium_boots", ARMOR_MATERIAL_RADIUM, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.REGENERATION, 1, 1000, true, false));
	
	public static final Item TECHNETIUM_HELMET = new RadioactiveArmor("technetium_helmet", ARMOR_MATERIAL_TECHNETIUM, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item TECHNETIUM_CHESTPLATE = new RadioactiveArmor("technetium_chestplate", ARMOR_MATERIAL_TECHNETIUM, EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item TECHNETIUM_LEGGINGS = new RadioactiveArmor("technetium_leggings", ARMOR_MATERIAL_TECHNETIUM, EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item TECHNETIUM_BOOTS = new RadioactiveArmor("technetium_boots", ARMOR_MATERIAL_TECHNETIUM, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.REGENERATION, 1, 1000, true, false));
	
	public static final Item THORIUM_HELMET = new RadioactiveArmor("thorium_helmet", ARMOR_MATERIAL_THORIUM, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item THORIUM_CHESTPLATE = new RadioactiveArmor("thorium_chestplate", ARMOR_MATERIAL_THORIUM, EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item THORIUM_LEGGINGS = new RadioactiveArmor("thorium_leggings", ARMOR_MATERIAL_THORIUM, EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item THORIUM_BOOTS = new RadioactiveArmor("thorium_boots", ARMOR_MATERIAL_THORIUM, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.REGENERATION, 1, 1000, true, false));
	
	public static final Item URANIUM_HELMET = new RadioactiveArmor("uranium_helmet", ARMOR_MATERIAL_URANIUM, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item URANIUM_CHESTPLATE = new RadioactiveArmor("uranium_chestplate", ARMOR_MATERIAL_URANIUM, EntityEquipmentSlot.CHEST, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item URANIUM_LEGGINGS = new RadioactiveArmor("uranium_leggings", ARMOR_MATERIAL_URANIUM, EntityEquipmentSlot.LEGS, new PotionEffect(MobEffects.REGENERATION, 1, 0, true, false));
	public static final Item URANIUM_BOOTS = new RadioactiveArmor("uranium_boots", ARMOR_MATERIAL_URANIUM, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.REGENERATION, 1, 1000, true, false));
	
	// Tools/Weapons
	public static final Item AMERICIUM_SWORD = new RadioactiveSword("americium_sword", MATERIAL_AMERICIUM);
	public static final Item AMERICIUM_PICKAXE = new RadioactivePickaxe("americium_pickaxe", MATERIAL_AMERICIUM);
	public static final Item AMERICIUM_AXE = new RadioactiveAxe("americium_axe", MATERIAL_AMERICIUM, -2.5f, 7.8f); // 1.5 speed in game and 8.8 damage in game
	public static final Item AMERICIUM_SHOVEL = new RadioactiveShovel("americium_shovel", MATERIAL_AMERICIUM);
	public static final Item AMERICIUM_HOE = new RadioactiveHoe("americium_hoe", MATERIAL_AMERICIUM);
	
	public static final Item BERKELIUM_SWORD = new RadioactiveSword("berkelium_sword", MATERIAL_BERKELIUM);
	public static final Item BERKELIUM_PICKAXE = new RadioactivePickaxe("berkelium_pickaxe", MATERIAL_BERKELIUM);
	public static final Item BERKELIUM_AXE = new RadioactiveAxe("berkelium_axe", MATERIAL_BERKELIUM, -3f, 8f);
	public static final Item BERKELIUM_SHOVEL = new RadioactiveShovel("berkelium_shovel", MATERIAL_BERKELIUM);
	public static final Item BERKELIUM_HOE = new RadioactiveHoe("berkelium_hoe", MATERIAL_BERKELIUM);
	
	public static final Item NEPTUNIUM_SWORD = new RadioactiveSword("neptunium_sword", MATERIAL_NEPTUNIUM);
	public static final Item NEPTUNIUM_PICKAXE = new RadioactivePickaxe("neptunium_pickaxe", MATERIAL_NEPTUNIUM);
	public static final Item NEPTUNIUM_AXE = new RadioactiveAxe("neptunium_axe", MATERIAL_NEPTUNIUM, -1.6f, 6.6f);
	public static final Item NEPTUNIUM_SHOVEL = new RadioactiveShovel("neptunium_shovel", MATERIAL_NEPTUNIUM);
	public static final Item NEPTUNIUM_HOE = new RadioactiveHoe("neptunium_hoe", MATERIAL_NEPTUNIUM);
	
	public static final Item PLUTONIUM_SWORD = new RadioactiveSword("plutonium_sword", MATERIAL_PLUTONIUM);
	public static final Item PLUTONIUM_PICKAXE = new RadioactivePickaxe("plutonium_pickaxe", MATERIAL_PLUTONIUM);
	public static final Item PLUTONIUM_AXE = new RadioactiveAxe("plutonium_axe", MATERIAL_PLUTONIUM, -3f, 9f);
	public static final Item PLUTONIUM_SHOVEL = new RadioactiveShovel("plutonium_shovel", MATERIAL_PLUTONIUM);
	public static final Item PLUTONIUM_HOE = new RadioactiveHoe("plutonium_hoe", MATERIAL_PLUTONIUM);
	
	public static final Item PROTACTINIUM_SWORD = new RadioactiveSword("protactinium_sword", MATERIAL_PROTACTINIUM);
	public static final Item PROTACTINIUM_PICKAXE = new RadioactivePickaxe("protactinium_pickaxe", MATERIAL_PROTACTINIUM);
	public static final Item PROTACTINIUM_AXE = new RadioactiveAxe("protactinium_axe", MATERIAL_PROTACTINIUM, -1.8f, 6.2f);
	public static final Item PROTACTINIUM_SHOVEL = new RadioactiveShovel("protactinium_shovel", MATERIAL_PROTACTINIUM);
	public static final Item PROTACTINIUM_HOE = new RadioactiveHoe("protactinium_hoe", MATERIAL_PROTACTINIUM);
	
	public static final Item RADIUM_SWORD = new RadioactiveSword("radium_sword", MATERIAL_RADIUM);
	public static final Item RADIUM_PICKAXE = new RadioactivePickaxe("radium_pickaxe", MATERIAL_RADIUM);
	public static final Item RADIUM_AXE = new RadioactiveAxe("radium_axe", MATERIAL_RADIUM, -3f, 7f);
	public static final Item RADIUM_SHOVEL = new RadioactiveShovel("radium_shovel", MATERIAL_RADIUM);
	public static final Item RADIUM_HOE = new RadioactiveHoe("radium_hoe", MATERIAL_RADIUM);
	
	public static final Item TECHNETIUM_SWORD = new RadioactiveSword("technetium_sword", MATERIAL_TECHNETIUM);
	public static final Item TECHNETIUM_PICKAXE = new RadioactivePickaxe("technetium_pickaxe", MATERIAL_TECHNETIUM);
	public static final Item TECHNETIUM_AXE = new RadioactiveAxe("technetium_axe", MATERIAL_TECHNETIUM, -1f, 7.4f);
	public static final Item TECHNETIUM_SHOVEL = new RadioactiveShovel("technetium_shovel", MATERIAL_TECHNETIUM);
	public static final Item TECHNETIUM_HOE = new RadioactiveHoe("technetium_hoe", MATERIAL_TECHNETIUM);
	
	public static final Item THORIUM_SWORD = new RadioactiveSword("thorium_sword", MATERIAL_THORIUM);
	public static final Item THORIUM_PICKAXE = new RadioactivePickaxe("thorium_pickaxe", MATERIAL_THORIUM);
	public static final Item THORIUM_AXE = new RadioactiveAxe("thorium_axe", MATERIAL_THORIUM, -1f, 9.2f);
	public static final Item THORIUM_SHOVEL = new RadioactiveShovel("thorium_shovel", MATERIAL_THORIUM);
	public static final Item THORIUM_HOE = new RadioactiveHoe("thorium_hoe", MATERIAL_THORIUM);
	
	public static final Item URANIUM_SWORD = new RadioactiveSword("uranium_sword", MATERIAL_URANIUM);
	public static final Item URANIUM_PICKAXE = new RadioactivePickaxe("uranium_pickaxe", MATERIAL_URANIUM);
	public static final Item URANIUM_AXE = new RadioactiveAxe("uranium_axe", MATERIAL_URANIUM, -2.5f, 8.4f);
	public static final Item URANIUM_SHOVEL = new RadioactiveShovel("uranium_shovel", MATERIAL_URANIUM);
	public static final Item URANIUM_HOE = new RadioactiveHoe("uranium_hoe", MATERIAL_URANIUM);
	
	public static final Item ROCK_HAMMER = new RockHammer("radioactive_ore_maul");
}
