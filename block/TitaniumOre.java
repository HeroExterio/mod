package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TitaniumOre extends GenericBlock {

	public TitaniumOre() {
		super(Material.rock, "TitaniumOre", 3f);
		setHarvestLevel("pickaxe", 3);
	}

}
