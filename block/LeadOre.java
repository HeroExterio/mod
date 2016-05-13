package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import KingdomCraft.util.RefStrings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LeadOre extends GenericBlock {

	public LeadOre() {
		super(Material.rock, "LeadOre", 2f);
		setHarvestLevel("pickaxe", 2);
		setBlockTextureName("generic:LeadOre");
	}

}
