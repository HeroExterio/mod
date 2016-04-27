package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AluminiumIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item AluminiumIngot;
	
	public static void initializeItem(){
		AluminiumIngot = new Item().setUnlocalizedName("AluminiumIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Aluminium_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(AluminiumIngot, AluminiumIngot.getUnlocalizedName());
	}
}