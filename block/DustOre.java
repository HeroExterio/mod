package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DustOre extends GenericBlock {

	public DustOre() {
		super(Material.rock, "DustOre", 3f);
		setHarvestLevel("pickaxe", 0);
	}

}
