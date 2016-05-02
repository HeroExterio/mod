package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BronzeIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item BronzeIngot;
	
	public static void initializeItem(){
		BronzeIngot = new Item().setUnlocalizedName("BronzeIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Bronze_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(BronzeIngot, BronzeIngot.getUnlocalizedName());
	}
}