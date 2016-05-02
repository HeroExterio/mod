package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BrassIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item BrassIngot;
	
	public static void initializeItem(){
		BrassIngot = new Item().setUnlocalizedName("BrassIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Brass_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(BrassIngot, BrassIngot.getUnlocalizedName());
	}
}