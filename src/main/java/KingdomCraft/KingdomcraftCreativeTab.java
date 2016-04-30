package KingdomCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KingdomcraftCreativeTab extends CreativeTabs {

	public KingdomcraftCreativeTab() {
		super("ctab");
	}

	@Override
	public Item getTabIconItem() {
		return KingdomcraftItems.DevineIngot;
	}
	
	@Override
	public String getTranslatedTabLabel() {
		return "Kingdomcraft";
	}

}
