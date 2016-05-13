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

public class ItemRubySpade extends ItemSpade {

	public ItemRubySpade() {
		super(Kingdomcraft.RubyToolMaterial);
		setCreativeTab(Kingdomcraft.KingdomCraftTab);
		setTextureName(RefStrings.MODID + ":RubySpade");
		setUnlocalizedName("RubySpade");
	}

}