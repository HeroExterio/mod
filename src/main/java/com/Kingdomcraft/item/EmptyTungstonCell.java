package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EmptyTungstonCell {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item EmptyTungstonCell;
	
	public static void initializeItem(){
		EmptyTungstonCell = new Item().setUnlocalizedName("EmptyTungstonCell").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Empty_Tungston_Cell");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(EmptyTungstonCell, EmptyTungstonCell.getUnlocalizedName());
	}
}