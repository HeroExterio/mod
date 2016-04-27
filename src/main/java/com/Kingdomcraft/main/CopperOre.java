package com.Kingdomcraft.main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class CopperOre extends Block
{
public CopperOre()
{
super(Material.rock);
setBlockName(Kingdomcraft.MODID + "_" + "CopperOre");
setCreativeTab(CreativeTabs.tabBlock);
}
}
