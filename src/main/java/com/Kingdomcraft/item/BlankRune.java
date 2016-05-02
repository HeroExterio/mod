package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlankRune {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item BlankRune;
	
	public static void initializeItem(){
		BlankRune = new Item().setUnlocalizedName("BlankRune").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Blank_Rune");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(BlankRune, BlankRune.getUnlocalizedName());
	}
}