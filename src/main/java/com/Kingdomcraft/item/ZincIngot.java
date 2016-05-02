package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ZincIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item ZincIngot;
	
	public static void initializeItem(){
		ZincIngot = new Item().setUnlocalizedName("ZincIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Zinc_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(ZincIngot, ZincIngot.getUnlocalizedName());
	}
}