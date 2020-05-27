package com.thesarlaacsweep.radioactiveblocksmod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.thesarlaacsweep.radioactiveblocksmod.Main;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModBlocks;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModItems;
import com.thesarlaacsweep.radioactiveblocksmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving.SpawnPlacementType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBase extends Block implements IHasModel {
	private boolean isRockHammerUsed = false;

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.radioactiveblockstab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn.isCreatureType(EnumCreatureType.MONSTER, false)) {
			entityIn.setFire(5000);
			entityIn.attackEntityFrom(DamageSource.ON_FIRE, 3.0f);
		}
		
		super.onEntityWalk(worldIn, pos, entityIn);
	}
	
	@Override
	public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, SpawnPlacementType type) {
		return false;
	}
	
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return quantityDropped(random) + random.nextInt(fortune + 1);
	}
	
	@Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) {
            return 1 + RANDOM.nextInt(5);
        }
        return 0;
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		if (this.isRockHammerUsed) {
			return null;
		}
        return Item.getItemFromBlock(this);
    }
	
	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
        player.addStat(StatList.getBlockStats(this));
        player.addExhaustion(0.005F);
        System.out.println("stack: " + stack.getDisplayName());
        
        if (stack.getDisplayName().equalsIgnoreCase("Radioactive Ore Maul")) {
        	this.isRockHammerUsed = true;
        	java.util.List<ItemStack> items = new java.util.ArrayList<ItemStack>();
        	System.out.println(state.getBlock());

        	if (state.getBlock() == ModBlocks.AMERICIUM_ORE) {
        		ItemStack itemstack = new ItemStack(ModItems.AMERICIUM_DUST, 3);

        		if (!itemstack.isEmpty()) {
            		// Get three powders as drops
                    items.add(itemstack);
                }
            	
            	for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
        	} else if (state.getBlock() == ModBlocks.BERKELIUM_ORE) {
        		ItemStack itemstack = new ItemStack(ModItems.BERKELIUM_DUST, 3);

        		if (!itemstack.isEmpty()) {
            		// Get three powders as drops
                    items.add(itemstack);
                }
            	
            	for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
        	} else if (state.getBlock() == ModBlocks.NEPTUNIUM_ORE) {
        		ItemStack itemstack = new ItemStack(ModItems.NEPTUNIUM_DUST, 3);

        		if (!itemstack.isEmpty()) {
            		// Get three powders as drops
                    items.add(itemstack);
                }
            	
            	for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
        	} else if (state.getBlock() == ModBlocks.PLUTONIUM_ORE) {
        		ItemStack itemstack = new ItemStack(ModItems.PLUTONIUM_DUST, 3);

        		if (!itemstack.isEmpty()) {
            		// Get three powders as drops
                    items.add(itemstack);
                }
            	
            	for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
        	} else if (state.getBlock() == ModBlocks.PROTACTINIUM_ORE) {
        		ItemStack itemstack = new ItemStack(ModItems.PROTACTINIUM_DUST, 3);

        		if (!itemstack.isEmpty()) {
            		// Get three powders as drops
                    items.add(itemstack);
                }
            	
            	for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
        	} else if (state.getBlock() == ModBlocks.RADIUM_ORE) {
        		ItemStack itemstack = new ItemStack(ModItems.RADIUM_DUST, 3);

        		if (!itemstack.isEmpty()) {
            		// Get three powders as drops
                    items.add(itemstack);
                }
            	
            	for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
        	} else if (state.getBlock() == ModBlocks.TECHNETIUM_ORE) {
        		ItemStack itemstack = new ItemStack(ModItems.TECHNETIUM_DUST, 3);

        		if (!itemstack.isEmpty()) {
            		// Get three powders as drops
                    items.add(itemstack);
                }
            	
            	for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
        	} else if (state.getBlock() == ModBlocks.THORIUM_ORE) {
        		ItemStack itemstack = new ItemStack(ModItems.THORIUM_DUST, 3);

        		if (!itemstack.isEmpty()) {
            		// Get three powders as drops
                    items.add(itemstack);
                }
            	
            	for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
        	} else if (state.getBlock() == ModBlocks.URANIUM_ORE) {
        		ItemStack itemstack = new ItemStack(ModItems.URANIUM_DUST, 3);

        		if (!itemstack.isEmpty()) {
            		// Get three powders as drops
                    items.add(itemstack);
                }
            	
            	for (ItemStack item : items) {
                    spawnAsEntity(worldIn, pos, item);
                }
        	} else {
        		items.clear();
        	}
        } else {
        	this.isRockHammerUsed = false;
        }

        if (this.canSilkHarvest(worldIn, pos, state, player) && EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) > 0) {
            java.util.List<ItemStack> items = new java.util.ArrayList<ItemStack>();
            ItemStack itemstack = this.getSilkTouchDrop(state);

            if (!itemstack.isEmpty()) {
                items.add(itemstack);
            }

            net.minecraftforge.event.ForgeEventFactory.fireBlockHarvesting(items, worldIn, pos, state, 0, 1.0f, true, player);
            for (ItemStack item : items) {
                spawnAsEntity(worldIn, pos, item);
            }
        }
        else {
            harvesters.set(player);
            int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
            this.dropBlockAsItem(worldIn, pos, state, i);
            harvesters.set(null);
        }
    }
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "Inventory");
	}
}
