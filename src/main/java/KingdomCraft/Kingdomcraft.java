package KingdomCraft;

import KingdomCraft.gui.GuiHandler;
import KingdomCraft.proxy.ServerProxy;
import KingdomCraft.tileEntity.KBlockTileEntity;
import KingdomCraft.util.KingdomProtectionUtil;
import KingdomCraft.util.RefStrings;
import KingdomCraft.worldgen.CopperOreGenerator;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

@Mod (modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class Kingdomcraft {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance(RefStrings.MODID)
	public static Kingdomcraft instance;
	
	public static CreativeTabs KingdomCraftTab = new KingdomcraftCreativeTab();
	
	@EventHandler
	public static void PreLoad (FMLPreInitializationEvent PreEvent){
		KingdomcraftBlocks.register();
		KingdomcraftItems.register();
		CraftingManager.init();
		proxy.registerRenderInfo();
		MinecraftForge.EVENT_BUS.register(new KingdomProtectionUtil());
	}
	
	@EventHandler
	public static void Load (FMLInitializationEvent event){
		GameRegistry.registerTileEntity(KBlockTileEntity.class, "tileEntityKBlock");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		GameRegistry.registerWorldGenerator(new CopperOreGenerator(), 0);
	}
	
	@EventHandler
	public static void PostLoad (FMLPostInitializationEvent PostEvent){
		
	}
}
