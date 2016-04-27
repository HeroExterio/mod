package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DevineIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item DevineIngot;
	
	public static void initializeItem(){
		DevineIngot = new Item().setUnlocalizedName("DevineIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Devine_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(DevineIngot, DevineIngot.getUnlocalizedName());
	}
}