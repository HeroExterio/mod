package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PinkDiamond extends GenericBlock {

	public PinkDiamond() {
		super(Material.rock, "PinkDiamond", 3f);
		setHarvestLevel("pickaxe", 2);
	}

}
