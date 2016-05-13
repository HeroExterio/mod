package KingdomCraft;

import KingdomCraft.Gui.GuiHandler;
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
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod (modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class Kingdomcraft {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance(RefStrings.MODID)
	public static Kingdomcraft instance;
	
	public static CreativeTabs KingdomCraftTab = new KingdomcraftCreativeTab();
	public static final Item.ToolMaterial TinToolMaterial = EnumHelper.addToolMaterial("TinToolMaterial", 1, 118, 2.0F, 1.0F, 22);
	public static final Item.ToolMaterial CopperToolMaterial = EnumHelper.addToolMaterial("CopperToolMaterial", 1, 264, 1.0F, 1.5F, 6);
	public static final Item.ToolMaterial AmethysToolMaterial = EnumHelper.addToolMaterial("AmethysToolMaterial", 3, 64, 5.0F, 2.0F, 0);
	public static final Item.ToolMaterial BlackDiamondToolMaterial = EnumHelper.addToolMaterial("BlackDiamondToolMaterial", 3, 3112, 8.0F, 3.5F, 10);
	public static final Item.ToolMaterial DevineToolMaterial = EnumHelper.addToolMaterial("DevineToolMaterial", 10, 10000000, 100.0F, 10F, 0);
	public static final Item.ToolMaterial LeadToolMaterial = EnumHelper.addToolMaterial("LeadToolMaterial", 2, 125, 4.0F, 1.5F, 5);
	public static final Item.ToolMaterial SilverToolMaterial = EnumHelper.addToolMaterial("SilverToolMaterial", 3, 390, 6.0F, 2.5F, 10);
	public static final Item.ToolMaterial TitaniumToolMaterial = EnumHelper.addToolMaterial("TitaniumToolMaterial", 3, 2000, 8.0F, 3.0F, 22);
	public static final Item.ToolMaterial RubyToolMaterial = EnumHelper.addToolMaterial("RubyToolMaterial", 2, 780, 6.0F, 2.5F, 0);
	public static final Item.ToolMaterial SapphireToolMaterial = EnumHelper.addToolMaterial("SapphireToolMaterial", 2, 780, 6.0F, 2.5F, 0);
	public static final Item.ToolMaterial TopazToolMaterial = EnumHelper.addToolMaterial("TopazToolMaterial", 2, 780, 6.0F, 2.5F, 0);
	public static final Item.ToolMaterial PinkDiamondToolMaterial = EnumHelper.addToolMaterial("PinkDiamondToolMaterial", 4, 3112, 8.0F, 3.5F, 10);
	public static final Item.ToolMaterial SkyToolMaterial = EnumHelper.addToolMaterial("SkyToolMaterial", 10, 264, 2.0F, 1.5F, 30);
	
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