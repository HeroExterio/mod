package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverOre extends GenericBlock {

	public SilverOre() {
		super(Material.rock, "SilverOre", 3f);
		setHarvestLevel("pickaxe", 3);
	}

}
