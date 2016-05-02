package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SteelIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item SteelIngot;
	
	public static void initializeItem(){
		SteelIngot = new Item().setUnlocalizedName("SteelIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Steel_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(SteelIngot, SteelIngot.getUnlocalizedName());
	}
}