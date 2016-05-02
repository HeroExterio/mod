package net.kingdomcraft.mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class KingdomBlock {
	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	public static Block KBlock;
	
	public static void initializeBlock(){
		KBlock = new KBlock(Material.ground).setBlockName("KBlock").setCreativeTab(CreativeTabs.tabBlock).setHardness(1);
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(KBlock, KBlock.getUnlocalizedName());
	}
}