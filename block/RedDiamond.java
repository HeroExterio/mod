package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RedDiamond extends GenericBlock {

	public RedDiamond() {
		super(Material.rock, "RedDiamond", 3f);
		setHarvestLevel("pickaxe", 2);
	}

}