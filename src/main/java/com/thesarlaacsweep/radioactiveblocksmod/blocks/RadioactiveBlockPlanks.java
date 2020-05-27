package com.thesarlaacsweep.radioactiveblocksmod.blocks;

import com.thesarlaacsweep.radioactiveblocksmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RadioactiveBlockPlanks extends BlockBase {

	public RadioactiveBlockPlanks(String name, Material material) {
		super(name, material);
		this.setSoundType(SoundType.WOOD);
		this.setHardness(3.0f);
		this.setResistance(6000.0f);
		setLightLevel(15/16f);
		this.setCreativeTab(Main.radioactiveblockstab);
		
		this.setHarvestLevel("axe", 2);
	}
}
