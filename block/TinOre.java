package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TinOre extends GenericBlock {

	public TinOre() {
		super(Material.rock, "TinOre", 2f);
		setHarvestLevel("pickaxe", 0);
	}

}
