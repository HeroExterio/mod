package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TinIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item TinIngot;
	
	public static void initializeItem(){
		TinIngot = new Item().setUnlocalizedName("TinIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Tin_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(TinIngot, TinIngot.getUnlocalizedName());
	}
}