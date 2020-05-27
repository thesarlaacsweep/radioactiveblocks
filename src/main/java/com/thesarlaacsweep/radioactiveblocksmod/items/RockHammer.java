package com.thesarlaacsweep.radioactiveblocksmod.items;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;
import com.thesarlaacsweep.radioactiveblocksmod.Main;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModBlocks;
import com.thesarlaacsweep.radioactiveblocksmod.init.ModItems;
import com.thesarlaacsweep.radioactiveblocksmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class RockHammer extends ItemTool implements IHasModel {
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(
			ModBlocks.AMERICIUM_ORE,
			ModBlocks.BERKELIUM_ORE,
			ModBlocks.NEPTUNIUM_ORE,
			ModBlocks.PLUTONIUM_ORE,
			ModBlocks.PROTACTINIUM_ORE,
			ModBlocks.RADIUM_ORE,
			ModBlocks.TECHNETIUM_ORE,
			ModBlocks.THORIUM_ORE,
			ModBlocks.URANIUM_ORE
	);
	
	private final Set<String> toolTypes;

	public RockHammer(String name) {
		super(3.4F, -2.8F, ToolMaterial.IRON, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.radioactiveblockstab);
		this.toolTypes = new HashSet<>();
		this.toolTypes.add("rockhammer");
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState blockIn) { // uses the same harvesting as pickaxe
        Block block = blockIn.getBlock();

        if (block == Blocks.OBSIDIAN) {
            return this.toolMaterial.getHarvestLevel() == 3;
        }
        else if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE) {
            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK) {
                if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE) {
                    if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE) {
                        if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE) {
                            if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE) {
                                Material material = blockIn.getMaterial();

                                if (material == Material.ROCK) {
                                    return true;
                                }
                                else if (material == Material.IRON) {
                                    return true;
                                }
                                else {
                                    return material == Material.ANVIL;
                                }
                            }
                            else {
                                return this.toolMaterial.getHarvestLevel() >= 2;
                            }
                        }
                        else {
                            return this.toolMaterial.getHarvestLevel() >= 1;
                        }
                    }
                    else {
                        return this.toolMaterial.getHarvestLevel() >= 1;
                    }
                }
                else {
                    return this.toolMaterial.getHarvestLevel() >= 2;
                }
            }
            else {
                return this.toolMaterial.getHarvestLevel() >= 2;
            }
        }
        else {
            return this.toolMaterial.getHarvestLevel() >= 2;
        }
    }
	
	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return this.toolTypes;
    }
}
