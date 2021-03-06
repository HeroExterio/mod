package KingdomCraft.worldgen;

import java.util.Random;

import KingdomCraft.KingdomcraftBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class CopperOreGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
		    generateNether(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 0:
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 1:
		    generateEnd(world, random, chunkX * 16, chunkZ * 16);
		    break;
		}
	}
	
	private void generateEnd(World world, Random random, int i, int j) {
		
	}

	private void generateSurface(World world, Random random, int i, int j) {
		for(int k = 0; k < 10; k++) {
			int firstBlockXCoord = i + random.nextInt(16);
			int firstBlockYCoord = random.nextInt(64);
			int firstBlockZCoord = j + random.nextInt(16);
			(new WorldGenMinable(KingdomcraftBlocks.copperOre, 5)).generate(world, random, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
		}
	}

	private void generateNether(World world, Random random, int i, int j) {
		
	}

}
