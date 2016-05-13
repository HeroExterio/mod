package KingdomCraft.block;

import KingdomCraft.generic.GenericBlock;
import KingdomCraft.util.RefStrings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MysticOre extends GenericBlock {

	public MysticOre() {
		super(Material.rock, "MysticOre", 3f);
		setHarvestLevel("pickaxe", 3);
		setStepSound(soundTypeStone);
		}

}
