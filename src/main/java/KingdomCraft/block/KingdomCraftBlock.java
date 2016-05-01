package KingdomCraft.block;

import KingdomCraft.generic.GenericTEBlock;
import KingdomCraft.gui.GuiHandler;
import KingdomCraft.tileEntity.KBlockTileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class KingdomCraftBlock extends GenericTEBlock {

	public KingdomCraftBlock() {
		super(Material.ground, "kingdomblock", 1f);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new KBlockTileEntity();
	}

	@Override
	protected int guiID() {
		return GuiHandler.EnumGui.KBlock.ordinal();
	}

}
