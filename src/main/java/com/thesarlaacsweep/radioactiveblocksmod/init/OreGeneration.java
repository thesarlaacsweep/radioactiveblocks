package com.thesarlaacsweep.radioactiveblocksmod.init;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case -1:
			break;
		case 0:
			break;
		case 1:
			break;
		default:
			break;
		}
		
		runGenerator(ModBlocks.AMERICIUM_ORE.getDefaultState(),    5, 6, 28, 90, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
		runGenerator(ModBlocks.BERKELIUM_ORE.getDefaultState(),    4, 4, 24, 84, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
		runGenerator(ModBlocks.NEPTUNIUM_ORE.getDefaultState(),    3, 4, 2, 36, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
		runGenerator(ModBlocks.PLUTONIUM_ORE.getDefaultState(),    6, 9, 36, 100, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);		
		runGenerator(ModBlocks.PROTACTINIUM_ORE.getDefaultState(), 3, 7, 12, 48, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
		runGenerator(ModBlocks.RADIUM_ORE.getDefaultState(),       3, 3, 18, 52, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
		runGenerator(ModBlocks.TECHNETIUM_ORE.getDefaultState(),   4, 6, 8, 74, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
		runGenerator(ModBlocks.THORIUM_ORE.getDefaultState(),      3, 2, 4, 44, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
		runGenerator(ModBlocks.URANIUM_ORE.getDefaultState(),      7, 9, 36, 100, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
	}
	
	private void runGenerator(IBlockState blockToGen, int blockAmount, int chancesToSpawn, int minHeight, int maxHeight, Predicate<IBlockState> blockToReplace, World world, Random rand, int chunk_x, int chunk_z) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}
		
		WorldGenMinable generator = new WorldGenMinable(blockToGen, blockAmount, blockToReplace);
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_x * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_z * 16 + rand.nextInt(16);
			
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
