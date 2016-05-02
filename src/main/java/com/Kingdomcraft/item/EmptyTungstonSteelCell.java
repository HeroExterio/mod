package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EmptyTungstonSteelCell {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item EmptyTungstonSteelCell;
	
	public static void initializeItem(){
		EmptyTungstonSteelCell = new Item().setUnlocalizedName("EmptyTungstonSteelCell").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Empty_Tungston_Steel_Cell");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(EmptyTungstonSteelCell, EmptyTungstonSteelCell.getUnlocalizedName());
	}
}