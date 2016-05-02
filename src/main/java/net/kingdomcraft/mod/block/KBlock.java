package net.kingdomcraft.mod.block;

import com.Kingdomcraft.lib.KingdomProtectionUtil;
import com.Kingdomcraft.main.MainRegistry;

import KingdomCraft.Gui.GuiHandler;
import KingdomCraft.tileEntity.KBlockTileEntity;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class KBlock extends BlockContainer{

	protected KBlock(Material material) {
		super(material);
		
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		if(!world.isRemote){
			FMLNetworkHandler.openGui(player, MainRegistry.instance, GuiHandler.EnumGui.KBlock.ordinal(), world, x, y, z);
		}
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_) {
		KBlockTileEntity te = new KBlockTileEntity();
		if(!world.isRemote)KingdomProtectionUtil.kingdoms.add(te);
		return te;
	}
	
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block p_149749_5_, int p_149749_6_){
		if(!world.isRemote)KingdomProtectionUtil.kingdoms.remove(world.getTileEntity(x, y, z));
		super.breakBlock(world, x, y, z, p_149749_5_, p_149749_6_);
	}
}