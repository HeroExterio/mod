package KingdomCraft.generic;

import KingdomCraft.Kingdomcraft;
import KingdomCraft.gui.GuiHandler;
import KingdomCraft.tileEntity.KBlockTileEntity;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class GenericTEBlock extends GenericBlock implements ITileEntityProvider{

	public GenericTEBlock(Material material, String name, float hardness) {
		super(material, name, hardness);
	}
	
	protected abstract int guiID();
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float px, float py, float pz) {
		player.openGui(Kingdomcraft.instance, guiID(), world, x, y, z);
		return true;
	}

}
