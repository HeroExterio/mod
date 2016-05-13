package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import KingdomCraft.util.RefStrings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AmethysOre extends GenericBlock {

	public AmethysOre() {
		super(Material.rock, "AmethysOre", 3f);
		setHarvestLevel("pickaxe", 2);
	}

}