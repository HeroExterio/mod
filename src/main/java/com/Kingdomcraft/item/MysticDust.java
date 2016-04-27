package com.Kingdomcraft.item;

import com.Kingdomcraft.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MysticDust {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item MysticDust;
	
	public static void initializeItem(){
		MysticDust = new Item().setUnlocalizedName("MysticDust").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + ":" + "Mystic_Dust");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(MysticDust, MysticDust.getUnlocalizedName());
	}
}