package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class UraniumOre extends GenericBlock {

	public UraniumOre() {
		super(Material.rock, "UraniumOre", 3f);
		setHarvestLevel("pickaxe", 2);
	}

}
