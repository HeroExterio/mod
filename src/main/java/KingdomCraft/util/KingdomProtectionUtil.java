package KingdomCraft.util;

import java.util.ArrayList;
import java.util.List;

import KingdomCraft.tileEntity.KBlockTileEntity;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.WorldEvent;

public class KingdomProtectionUtil {

	public static List<KBlockTileEntity> kingdoms = new ArrayList<KBlockTileEntity>();
	
	public static boolean isBlockProtected(int x, int z){
		try{
			for(KBlockTileEntity te : kingdoms){
				System.out.println("testing");
				if(te.isBlockProtected(x, z)){
					return true;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
			
		return false;
	}
	
	@SubscribeEvent
	public void onBlockBreak(BreakEvent e){
//		if(e.world.isRemote) return;
//		System.out.println(isBlockProtected(e.x, e.z));
	}
	
	@SubscribeEvent
	public void onWorldTick(WorldTickEvent e){
		if(e.side == Side.SERVER) KingdomProtectionUtil.kingdoms.clear();
	}
	
}
