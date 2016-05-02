package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Topaz {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item Topaz;
	
	public static void initializeItem(){
		Topaz = new Item().setUnlocalizedName("Topaz").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Topaz");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(Topaz, Topaz.getUnlocalizedName());
	}
}