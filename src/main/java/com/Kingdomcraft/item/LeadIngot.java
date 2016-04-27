package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LeadIngot {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item LeadIngot;
	
	public static void initializeItem(){
		LeadIngot = new Item().setUnlocalizedName("LeadIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Lead_Ingot");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(LeadIngot, LeadIngot.getUnlocalizedName());
	}
}