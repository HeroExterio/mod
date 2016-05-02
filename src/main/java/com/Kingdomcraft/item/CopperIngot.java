package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CopperIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item CopperIngot;
	
	public static void initializeItem(){
		CopperIngot = new Item().setUnlocalizedName("CopperIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Copper_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(CopperIngot, CopperIngot.getUnlocalizedName());
	}
}