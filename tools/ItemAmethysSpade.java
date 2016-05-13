package KingdomCraft.tools;

import KingdomCraft.Kingdomcraft;
import KingdomCraft.util.RefStrings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;

public class ItemAmethysSpade extends ItemSpade {

	public ItemAmethysSpade() {
		super(Kingdomcraft.AmethysToolMaterial);
		setCreativeTab(Kingdomcraft.KingdomCraftTab);
		setTextureName(RefStrings.MODID + ":AmethysSpade");
		setUnlocalizedName("AmethysSpade");
	}

}