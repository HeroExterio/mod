package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Sapphire {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item Sapphire;
	
	public static void initializeItem(){
		Sapphire = new Item().setUnlocalizedName("Sapphire").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Sapphire");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(Sapphire, Sapphire.getUnlocalizedName());
	}
}