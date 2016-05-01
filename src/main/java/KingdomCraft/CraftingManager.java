package KingdomCraft;

import cpw.mods.fml.common.registry.GameRegistry;
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
	}
	
}
