package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GoldIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item GoldIngot;
	
	public static void initializeItem(){
		GoldIngot = new Item().setUnlocalizedName("GoldIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Gold_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(GoldIngot, GoldIngot.getUnlocalizedName());
	}
}