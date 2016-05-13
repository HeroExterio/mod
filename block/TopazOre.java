package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import KingdomCraft.util.RefStrings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TopazOre extends GenericBlock {

	public TopazOre() {
		super(Material.rock, "TopazOre", 3f);
		setHarvestLevel("pickaxe", 2);
	}

}