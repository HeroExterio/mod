package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GoldCoin {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item GoldCoin;
	
	public static void initializeItem(){
		GoldCoin = new Item().setUnlocalizedName("GoldCoin").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Gold_Coin");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(GoldCoin, GoldCoin.getUnlocalizedName());
	}
}