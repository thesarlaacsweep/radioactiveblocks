package com.thesarlaacsweep.radioactiveblocksmod.blocks;

import com.thesarlaacsweep.radioactiveblocksmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RadioactiveBlock extends BlockBase {
	public RadioactiveBlock(String name, Material material, SoundType soundtype, String toolClass) {
		super(name, material);
		setSoundType(soundtype);
		setHardness(3.0f);
		setResistance(6000.0f);
		setHarvestLevel(toolClass, 2);
		setLightLevel(15/16f);
		setCreativeTab(Main.radioactiveblockstab);
	}
}
