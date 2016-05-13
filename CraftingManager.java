package KingdomCraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingManager {

	public static void init(){
		addIngotNuggerRecipe(KingdomcraftItems.DevineIngot, KingdomcraftItems.DevineNugget);
	}
	
	// DO NOT CHANGE
	private static void addIngotNuggerRecipe(Item ingot, Item nugget){
		GameRegistry.addRecipe(new ItemStack(ingot), new Object[]{
	    		"AAA",
	    		"AAA",
	    		"AAA",
	    		'A', nugget
	    	});
		
		GameRegistry.addRecipe(new ItemStack(nugget, 9), new Object[]{
	    		"A",
	    		'A', ingot
	    	});
		//tin
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TinSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.TinIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TinPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.TinIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TinAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.TinIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TinHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.TinIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TinSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.TinIngot, 'S', Items.stick
	    	});
		//Copper
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.CopperSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.CopperIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.CopperPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.CopperIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.CopperAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.CopperIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.CopperHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.CopperIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.CopperSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.CopperIngot, 'S', Items.stick
	    	});
		//Amethys
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.AmethysSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.Amethys, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.AmethysPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.Amethys, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.AmethysAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.Amethys, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.AmethysHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.Amethys, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.AmethysSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.Amethys, 'S', Items.stick
			});
		//BlackDiamond
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.BlackDiamondSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.BlackDiamond, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.BlackDiamondPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.BlackDiamond, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.BlackDiamondAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.BlackDiamond, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.BlackDiamondHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.BlackDiamond, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.BlackDiamondSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.BlackDiamond, 'S', Items.stick
			});
		//Devine
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.DevineSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.DevineIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.DevinePickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.DevineIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.DevineAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.DevineIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.DevineHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.DevineIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.DevineSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.DevineIngot, 'S', Items.stick
			});
		//Lead
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.LeadSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.LeadIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.LeadPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.LeadIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.LeadAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.LeadIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.LeadHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.LeadIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.LeadSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.LeadIngot, 'S', Items.stick
			});
		//Silver
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SilverSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.SilverIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SilverPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.SilverIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SilverAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.SilverIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SilverHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.SilverIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SilverSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.SilverIngot, 'S', Items.stick
			});
		//Titanium
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TitaniumSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.TitaniumIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TitaniumPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.TitaniumIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TitaniumAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.TitaniumIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TitaniumHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.TitaniumIngot, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TitaniumSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.TitaniumIngot, 'S', Items.stick
			});
		//Ruby
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.RubySpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.Ruby, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.RubyPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.Ruby, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.RubyAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.Ruby, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.RubyHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.Ruby, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.RubySword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.Ruby, 'S', Items.stick
			});
		//Sapphire
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SapphireSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.Sapphire, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SapphirePickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.Sapphire, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SapphireAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.Sapphire, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SapphireHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.Sapphire, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SapphireSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.Sapphire, 'S', Items.stick
			});
		//Topaz
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TopazSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.Topaz, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TopazPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.Topaz, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TopazAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.Topaz, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TopazHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.Topaz, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.TopazSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.Topaz, 'S', Items.stick
			});
		//PinkDiamond
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.PinkDiamondSpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.PinkDiamond, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.PinkDiamondPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.PinkDiamond, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.PinkDiamondAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.PinkDiamond, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.PinkDiamondHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.PinkDiamond, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.PinkDiamondSword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.PinkDiamond, 'S', Items.stick
			});
		//Sky
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SkySpade), new Object[]{
	    		"I",
	    		"S",
	    		"S",
	    		'I', KingdomcraftItems.FallenStar, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SkyPickaxe), new Object[]{
	    		"III",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.FallenStar, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SkyAxe), new Object[]{
	    		"II ",
	    		"IS ",
	    		" S ",
	    		'I', KingdomcraftItems.FallenStar, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SkyHoe), new Object[]{
	    		"II ",
	    		" S ",
	    		" S ",
	    		'I', KingdomcraftItems.FallenStar, 'S', Items.stick
	    	});
		GameRegistry.addRecipe(new ItemStack(KingdomcraftItems.SkySword), new Object[]{
	    		"I",
	    		"I",
	    		"S",
	    		'I', KingdomcraftItems.FallenStar, 'S', Items.stick
			});
		
		
		
		GameRegistry.addSmelting(KingdomcraftBlocks.copperOre, new ItemStack(KingdomcraftItems.CopperIngot, 1), 0.4f);
		GameRegistry.addSmelting(KingdomcraftBlocks.TinOre, new ItemStack(KingdomcraftItems.TinIngot, 1), 0.2f);
		GameRegistry.addSmelting(KingdomcraftBlocks.LeadOre, new ItemStack(KingdomcraftItems.LeadIngot, 1), 0.6f);
		GameRegistry.addSmelting(KingdomcraftBlocks.DevineOre, new ItemStack(KingdomcraftItems.DevineNugget, 1), 6f);
		GameRegistry.addSmelting(KingdomcraftBlocks.TitaniumOre, new ItemStack(KingdomcraftItems.TitaniumIngot, 1), 1f);
		GameRegistry.addSmelting(KingdomcraftBlocks.SilverOre, new ItemStack(KingdomcraftItems.SilverIngot, 1), 6f);
	}
	
}
