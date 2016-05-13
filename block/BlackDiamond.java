package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import KingdomCraft.util.RefStrings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlackDiamond extends GenericBlock {

	public BlackDiamond() {
		super(Material.rock, "BlackDiamond", 3f);
		setHarvestLevel("pickaxe", 2);
	}

}
