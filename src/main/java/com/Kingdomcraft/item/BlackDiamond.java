package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlackDiamond {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item BlackDiamond;
	
	public static void initializeItem(){
		BlackDiamond = new Item().setUnlocalizedName("BlackDiamond").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Black_Diamond");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(BlackDiamond, BlackDiamond.getUnlocalizedName());
	}
}