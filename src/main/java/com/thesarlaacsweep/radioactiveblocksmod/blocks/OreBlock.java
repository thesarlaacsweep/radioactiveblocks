package com.thesarlaacsweep.radioactiveblocksmod.blocks;

import com.thesarlaacsweep.radioactiveblocksmod.Main;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class OreBlock extends BlockBase {

	public OreBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(2000.0f);
		setHarvestLevel("rockhammer", 2);
		setLightLevel(6/16f);
		setCreativeTab(Main.radioactiveblockstab);
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) {
            return 2 + RANDOM.nextInt(5);
        }
		return 4;
	}
}
