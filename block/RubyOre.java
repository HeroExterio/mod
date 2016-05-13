package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import KingdomCraft.util.RefStrings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubyOre extends GenericBlock {

	public RubyOre() {
		super(Material.rock, "RubyOre", 3f);
		setHarvestLevel("pickaxe", 2);
	}

}