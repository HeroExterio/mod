package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PinkDiamond {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item PinkDiamond;
	
	public static void initializeItem(){
		PinkDiamond = new Item().setUnlocalizedName("PinkDiamond").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Pink_Diamond");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(PinkDiamond, PinkDiamond.getUnlocalizedName());
	}
}