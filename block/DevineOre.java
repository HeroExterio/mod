package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import KingdomCraft.util.RefStrings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DevineOre extends GenericBlock {

	public DevineOre() {
		super(Material.rock, "DevineOre", 20f);
		setHarvestLevel("pickaxe", 5);
		setLightLevel(2.0F);
	}

}