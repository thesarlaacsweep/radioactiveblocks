package com.thesarlaacsweep.radioactiveblocksmod.blocks;

import com.thesarlaacsweep.radioactiveblocksmod.Main;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModBlocks;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModItems;
import com.thesarlaacsweep.radioactiveblocksmod.util.IHasModel;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RadioactiveBlockStairs extends BlockStairs implements IHasModel {
	protected final Material blockMaterial;
	public RadioactiveBlockStairs(String name, Material material, SoundType sound, String toolClass, IBlockState modelState) {
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.blockMaterial = material;
		setSoundType(sound);
		setHardness(3.0f);
		setResistance(6000.0f);
		setLightLevel(15/16f);
		setCreativeTab(Main.radioactiveblockstab);
		
		setHarvestLevel(toolClass, 2);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public Material getMaterial(IBlockState state) {
		return this.blockMaterial;
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn.isCreatureType(EnumCreatureType.MONSTER, false)) {
			entityIn.setFire(2000);
			entityIn.attackEntityFrom(DamageSource.ON_FIRE, 3.0f);
		}
		
		super.onEntityWalk(worldIn, pos, entityIn);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "Inventory");
	}
}
