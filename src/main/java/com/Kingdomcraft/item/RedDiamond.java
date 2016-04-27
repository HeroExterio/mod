package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RedDiamond {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item RedDiamond;
	
	public static void initializeItem(){
		RedDiamond = new Item().setUnlocalizedName("RedDiamond").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Red_Diamond");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(RedDiamond, RedDiamond.getUnlocalizedName());
	}
}