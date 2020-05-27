package com.thesarlaacsweep.radioactiveblocksmod.blocks;

import com.thesarlaacsweep.radioactiveblocksmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RadioactiveMetalBlock extends BlockBase {
	public RadioactiveMetalBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(2000.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(9/16f);
		setCreativeTab(Main.radioactiveblockstab);
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn.isCreatureType(EnumCreatureType.MONSTER, false)) {
			entityIn.setFire(2000);
			entityIn.attackEntityFrom(DamageSource.ON_FIRE, 3.0f);
		}
		
		super.onEntityWalk(worldIn, pos, entityIn);
	}
}
