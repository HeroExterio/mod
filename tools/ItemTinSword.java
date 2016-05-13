package KingdomCraft.tools;

import KingdomCraft.Kingdomcraft;
import KingdomCraft.util.RefStrings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemTinSword extends ItemSword {

	public ItemTinSword() {
		super(Kingdomcraft.TinToolMaterial);
		setCreativeTab(Kingdomcraft.KingdomCraftTab);
		setTextureName(RefStrings.MODID + ":TinSword");
		setUnlocalizedName("TinSword");
	}

}