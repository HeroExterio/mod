package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Ruby {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item Ruby;
	
	public static void initializeItem(){
		Ruby = new Item().setUnlocalizedName("Ruby").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Ruby");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(Ruby, Ruby.getUnlocalizedName());
	}
}