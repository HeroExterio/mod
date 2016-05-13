package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PlatinumOre extends GenericBlock {

	public PlatinumOre() {
		super(Material.rock, "PlatinumOre", 3f);
		setHarvestLevel("pickaxe", 2);
	}

}
