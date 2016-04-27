package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DevineNugget {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item DevineNugget;
	
	public static void initializeItem(){
		DevineNugget = new Item().setUnlocalizedName("DevineNugget").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Devine_Nugget");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(DevineNugget, DevineNugget.getUnlocalizedName());
	}
}