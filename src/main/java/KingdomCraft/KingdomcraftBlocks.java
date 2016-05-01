package KingdomCraft;

import KingdomCraft.block.CopperOre;
import KingdomCraft.block.KingdomCraftBlock;
import KingdomCraft.generic.GenericBlock;
import KingdomCraft.generic.GenericTEBlock;
import net.minecraft.block.material.Material;

public class KingdomcraftBlocks {

	public static GenericTEBlock KingdomBlock;
	public static CopperOre copperOre;
	
	public static void register(){
		KingdomBlock = new KingdomCraftBlock();
		copperOre = new CopperOre();
	}
	
}
