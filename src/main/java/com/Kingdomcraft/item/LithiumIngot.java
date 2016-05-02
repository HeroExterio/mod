package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LithiumIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item LithiumIngot;
	
	public static void initializeItem(){
		LithiumIngot = new Item().setUnlocalizedName("LithiumIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Lithium_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(LithiumIngot, LithiumIngot.getUnlocalizedName());
	}
}