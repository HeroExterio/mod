package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends GenericBlock {


	public CopperOre() {
		super(Material.rock, "copperOre", 2f);
		setHarvestLevel("pickaxe", 1);
	}

}
