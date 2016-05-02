package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TitaniumIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item TitaniumIngot;
	
	public static void initializeItem(){
		TitaniumIngot = new Item().setUnlocalizedName("TitaniumIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Titanium_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(TitaniumIngot, TitaniumIngot.getUnlocalizedName());
	}
}