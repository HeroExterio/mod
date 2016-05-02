package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item IronIngot;
	
	public static void initializeItem(){
		IronIngot = new Item().setUnlocalizedName("IronIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Iron_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(IronIngot, IronIngot.getUnlocalizedName());
	}
}