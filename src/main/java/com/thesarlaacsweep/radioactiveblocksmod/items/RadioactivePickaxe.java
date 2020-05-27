package com.thesarlaacsweep.radioactiveblocksmod.items;

import com.thesarlaacsweep.radioactiveblocksmod.Main;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModItems;
import com.thesarlaacsweep.radioactiveblocksmod.util.IHasModel;

import net.minecraft.item.ItemPickaxe;
public class RadioactivePickaxe extends ItemPickaxe implements IHasModel {

	public RadioactivePickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.radioactiveblockstab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
