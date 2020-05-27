package com.thesarlaacsweep.radioactiveblocksmod.blocks;

import com.thesarlaacsweep.radioactiveblocksmod.Main;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModBlocks;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModItems;
import com.thesarlaacsweep.radioactiveblocksmod.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RadioactiveBlockSlabs extends BlockSlab implements IHasModel {
	protected final Material blockMaterial;
	public static final PropertyEnum<RadioactiveBlockSlabs.Variant> VARIANT = PropertyEnum.<RadioactiveBlockSlabs.Variant>create("variant", RadioactiveBlockSlabs.Variant.class);
	private static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public RadioactiveBlockSlabs(String name, Material material, SoundType sound, String toolClass) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
		this.blockMaterial = material;
		setHardness(3.0f);
		setResistance(6000.0f);
		setLightLevel(15/16f);
		setCreativeTab(Main.radioactiveblockstab);
		setDefaultState(blockState.getBaseState().withProperty(VARIANT, RadioactiveBlockSlabs.Variant.DEFAULT).withProperty(HALF, EnumBlockHalf.BOTTOM).withProperty(FACING, EnumFacing.NORTH));
		
		setHarvestLevel(toolClass, 2);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
		return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer, hand).withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }
	
	@Override
	public Material getMaterial(IBlockState state) {
		return this.blockMaterial;
	}
	
	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}
	
	@Override
	public boolean isDouble() {
		return false;
	}
	
	public static enum Variant implements IStringSerializable {
		DEFAULT;

		@Override
		public String getName() {
			return "default";
		}
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return RadioactiveBlockSlabs.Variant.DEFAULT;
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		int meta = state.getValue(FACING).ordinal();
		if (state.getValue(HALF) == EnumBlockHalf.TOP) {
			meta |= 0b1000;
		}
		return meta;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		EnumFacing facing = EnumFacing.VALUES[meta & 0b0111];
		if (!EnumFacing.Plane.HORIZONTAL.apply(facing)) facing = EnumFacing.NORTH;
		boolean top = meta >> 3 == 1;
		return getDefaultState().withProperty(FACING, facing).withProperty(HALF, top ? EnumBlockHalf.TOP : EnumBlockHalf.BOTTOM);
	}
	
	@Override
    protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, VARIANT, HALF, FACING);
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
