package com.Kingdomcraft.lib;

import java.util.ArrayList;
import java.util.List;

import KingdomCraft.tileEntity.KBlockTileEntity;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class KingdomProtectionUtil {

	public static List<KBlockTileEntity> kingdoms = new ArrayList<KBlockTileEntity>();
	
	public static boolean isBlockProtected(int x, int z){
		for(KBlockTileEntity te : kingdoms){

			System.out.println("testing");
			if(te.isBlockProtected(x, z)){
				return true;
			}
		}
			
		return false;
	}
	
	@SubscribeEvent
	public void onBlockBreak(BreakEvent e){
		if(e.world.isRemote) return;
		System.out.println(isBlockProtected(e.x, e.z));
	}
	
}
