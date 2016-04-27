package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Amethys {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item Amethys;
	
	public static void initializeItem(){
		Amethys = new Item().setUnlocalizedName("Amethys").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Amethys");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(Amethys, Amethys.getUnlocalizedName());
	}
}