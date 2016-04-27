package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TungstenIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item TungstenIngot;
	
	public static void initializeItem(){
		TungstenIngot = new Item().setUnlocalizedName("TungstenIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Tungsten_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(TungstenIngot, TungstenIngot.getUnlocalizedName());
	}
}