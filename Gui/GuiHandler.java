package KingdomCraft.Gui;

import KingdomCraft.container.KBlockContainer;
import KingdomCraft.tileEntity.KBlockTileEntity;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	public enum EnumGui{
		KBlock;
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(EnumGui.values()[ID]){
		case KBlock:
			return new KBlockContainer(player.inventory, (KBlockTileEntity) world.getTileEntity(x, y, z));
		default:
			break;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(EnumGui.values()[ID]){
		case KBlock:
			return new KBlockGui((KBlockTileEntity) world.getTileEntity(x, y, z), player.inventory);
		default:
			break;
		}
		return null;
	}

}
