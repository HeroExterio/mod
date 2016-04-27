package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TungstenSteelIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item TungstenSteelIngot;
	
	public static void initializeItem(){
		TungstenSteelIngot = new Item().setUnlocalizedName("TungstenSteelIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Tungsten_Steel_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(TungstenSteelIngot, TungstenSteelIngot.getUnlocalizedName());
	}
}