package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import KingdomCraft.util.RefStrings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SapphireOre extends GenericBlock {

	public SapphireOre() {
		super(Material.rock, "SapphireOre", 3f);
		setHarvestLevel("pickaxe", 2);
	}

}