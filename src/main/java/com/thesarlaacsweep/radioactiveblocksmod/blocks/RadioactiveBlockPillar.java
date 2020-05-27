package com.thesarlaacsweep.radioactiveblocksmod.blocks;

import com.thesarlaacsweep.radioactiveblocksmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RadioactiveBlockPillar extends BlockBase {
	public static final PropertyEnum<RadioactiveBlockPillar.EnumAxis> AXIS = PropertyEnum.<RadioactiveBlockPillar.EnumAxis>create("axis", RadioactiveBlockPillar.EnumAxis.class);

	public RadioactiveBlockPillar(String name, Material material, SoundType sound, String toolClass) {
		super(name, material);
		setSoundType(sound);
		setHardness(3.0f);
		setResistance(6000.0f);
		setLightLevel(15/16f);
		setCreativeTab(Main.radioactiveblockstab);
		setHarvestLevel(toolClass, 2);
	}
	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		return this.getStateFromMeta(meta).withProperty(AXIS, RadioactiveBlockPillar.EnumAxis.fromFacingAxis(facing.getAxis()));
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		RadioactiveBlockPillar.EnumAxis enumfacing$axis = RadioactiveBlockPillar.EnumAxis.Y;
        int i = meta & 12;
        
        if (i == 4) {
        	enumfacing$axis = RadioactiveBlockPillar.EnumAxis.X;
        } else if (i == 8) {
        	enumfacing$axis = RadioactiveBlockPillar.EnumAxis.Z;
        }
        return this.getDefaultState().withProperty(AXIS, enumfacing$axis);
    }
	
	@Override
	public int getMetaFromState(IBlockState state) {
		int meta = state.getValue(AXIS).ordinal();
		return meta;
    }
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {AXIS});
	}

	public static enum EnumAxis implements IStringSerializable {
		X("x"),
        Y("y"),
        Z("z"),
        NONE("none");

        private final String name;
        
        private EnumAxis(String name) {
        	this.name = name;
        }
        
        public String toString() {
        	return this.name;
        }
        
        public static RadioactiveBlockPillar.EnumAxis fromFacingAxis(EnumFacing.Axis axis) {
        	switch (axis) {
        	case X:
        		return X;
        	case Y:
        		return Y;
        	case Z:
        		return Z;
        	default:
        		return NONE;
        	}
        }
        
        public String getName() {
        	return this.name;
        }
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
