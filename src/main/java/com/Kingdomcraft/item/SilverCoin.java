package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SilverCoin {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item SilverCoin;
	
	public static void initializeItem(){
		SilverCoin = new Item().setUnlocalizedName("SilverCoin").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Silver_Coin");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(SilverCoin, SilverCoin.getUnlocalizedName());
	}
}