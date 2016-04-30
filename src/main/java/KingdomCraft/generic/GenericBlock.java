package KingdomCraft.generic;

import KingdomCraft.Kingdomcraft;
import KingdomCraft.util.RefStrings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GenericBlock extends Block {

	public GenericBlock(Material material, String name, float hardness) {
		super(material);
		setBlockName(name);
		setBlockTextureName(RefStrings.MODID + ":" + name);
		setCreativeTab(Kingdomcraft.KingdomCraftTab);
		setHardness(hardness);
		getUnlocalizedName();
		GameRegistry.registerBlock(this, name);
	}

}
