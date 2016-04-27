package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AlLiIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item AlLiIngot;
	
	public static void initializeItem(){
		AlLiIngot = new Item().setUnlocalizedName("AlLiIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "AL_LI_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(AlLiIngot, AlLiIngot.getUnlocalizedName());
	}
}