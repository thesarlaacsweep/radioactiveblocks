package com.thesarlaacsweep.radioactiveblocksmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTabs extends CreativeTabs {
	public ModTabs(String label) {
		super("radioactive_blocks_tab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.URANIUM_INGOT);
	}
}
