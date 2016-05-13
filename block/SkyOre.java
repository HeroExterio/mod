package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SkyOre extends GenericBlock {

	public SkyOre() {
		super(Material.rock, "SkyOre", 3f);
		setHarvestLevel("pickaxe", 4);
	}

}
