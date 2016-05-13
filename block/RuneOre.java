package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RuneOre extends GenericBlock {

	public RuneOre() {
		super(Material.rock, "RuneOre", 3f);
		setHarvestLevel("pickaxe", 3);
	}

}
