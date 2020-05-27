package com.thesarlaacsweep.radioactiveblocksmod.items;

import com.thesarlaacsweep.radioactiveblocksmod.Main;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModItems;
import com.thesarlaacsweep.radioactiveblocksmod.util.IHasModel;

import net.minecraft.item.ItemSpade;

public class RadioactiveShovel extends ItemSpade implements IHasModel {

	public RadioactiveShovel(String name, ToolMaterial material) {
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
