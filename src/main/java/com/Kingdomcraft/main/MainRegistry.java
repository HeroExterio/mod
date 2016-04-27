package com.Kingdomcraft.main;

import com.Kingdomcraft.item.AlLiIngot;
import com.Kingdomcraft.item.AluminiumIngot;
import com.Kingdomcraft.item.Amethys;
import com.Kingdomcraft.item.BlackDiamond;
import com.Kingdomcraft.item.BlankRune;
import com.Kingdomcraft.item.BrassIngot;
import com.Kingdomcraft.item.BronzeIngot;
import com.Kingdomcraft.item.CopperIngot;
import com.Kingdomcraft.item.DevineIngot;
import com.Kingdomcraft.item.DevineNugget;
import com.Kingdomcraft.item.EmptyTungstonCell;
import com.Kingdomcraft.item.EmptyTungstonSteelCell;
import com.Kingdomcraft.item.GoldCoin;
import com.Kingdomcraft.item.GoldIngot;
import com.Kingdomcraft.item.IronIngot;
import com.Kingdomcraft.item.LeadIngot;
import com.Kingdomcraft.item.LithiumIngot;
import com.Kingdomcraft.item.MysticDust;
import com.Kingdomcraft.item.PinkDiamond;
import com.Kingdomcraft.item.RedDiamond;
import com.Kingdomcraft.item.Ruby;
import com.Kingdomcraft.item.Sapphire;
import com.Kingdomcraft.item.SilverCoin;
import com.Kingdomcraft.item.SteelIngot;
import com.Kingdomcraft.item.TinIngot;
import com.Kingdomcraft.item.TitaniumIngot;
import com.Kingdomcraft.item.Topaz;
import com.Kingdomcraft.item.TungstenIngot;
import com.Kingdomcraft.item.TungstenSteelIngot;
import com.Kingdomcraft.item.ZincIngot;
import com.Kingdomcraft.lib.KingdomProtectionUtil;
import com.Kingdomcraft.lib.RefStrings;
import KingdomCraft.Gui.GuiHandler;
import KingdomCraft.tileEntity.KBlockTileEntity;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.kingdomcraft.mod.block.KingdomBlock;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod (modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance(RefStrings.MODID)
	public static MainRegistry instance;
	
	public static Block CopperOre;
	
	@EventHandler
	public static void PreLoad (FMLPreInitializationEvent PreEvent){
		//Items
		CopperIngot.mainRegistry();
		AlLiIngot.mainRegistry();
		BrassIngot.mainRegistry();
		AluminiumIngot.mainRegistry();
		BronzeIngot.mainRegistry();
		LeadIngot.mainRegistry();
		GoldIngot.mainRegistry();
		IronIngot.mainRegistry();
		SteelIngot.mainRegistry();
		TitaniumIngot.mainRegistry();
		TungstenSteelIngot.mainRegistry();
		TungstenIngot.mainRegistry();
		ZincIngot.mainRegistry();
		TinIngot.mainRegistry();
		LithiumIngot.mainRegistry();
		RedDiamond.mainRegistry();
		BlankRune.mainRegistry();
		MysticDust.mainRegistry();
		BlackDiamond.mainRegistry();
		PinkDiamond.mainRegistry();
		Ruby.mainRegistry();
		Sapphire.mainRegistry();
		Topaz.mainRegistry();
		DevineIngot.mainRegistry();
		DevineNugget.mainRegistry();
		GoldCoin.mainRegistry();
		SilverCoin.mainRegistry();
		Amethys.mainRegistry();
		EmptyTungstonCell.mainRegistry();
		EmptyTungstonSteelCell.mainRegistry();
		//Blocks		
		KingdomBlock.mainRegistry();
		CopperOre = new CopperOre();
		//Tools
		//Weapons
		//Recipes 
		
		GameRegistry.registerBlock(CopperOre, "CopperOre");
		
		GameRegistry.addRecipe(new ItemStack(DevineIngot.DevineIngot), new Object[]{
	    		"AAA",
	    		"AAA",
	    		"AAA",
	    		'A', DevineNugget.DevineNugget
	    	});
		GameRegistry.addRecipe(new ItemStack(DevineNugget.DevineNugget), new Object[]{
	    		"A",
	    		'A', DevineIngot.DevineIngot
	    	});
		proxy.registerRenderInfo();
		
		
		MinecraftForge.EVENT_BUS.register(new KingdomProtectionUtil());
	}
	@EventHandler
	
	
	public static void Load (FMLInitializationEvent event){
   	GameRegistry.registerTileEntity(KBlockTileEntity.class, "tileEntityKBlock");
    NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		
	}
	@EventHandler
	public static void PostLoad (FMLPostInitializationEvent PostEvent){
		
	}
}
