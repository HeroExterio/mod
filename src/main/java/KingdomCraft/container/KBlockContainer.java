package KingdomCraft.container;

import KingdomCraft.tileEntity.KBlockTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class KBlockContainer extends Container{
	
	KBlockTileEntity te;
	int slotAmount;

	 public KBlockContainer(InventoryPlayer ip, KBlockTileEntity te){
	        this.te = te;
	        slotAmount = 0;
	        for(int i = 0; i < 6; i++){
	        	addSlot(61 + (i*18), 59);
	        }
	        addSlot(37, 27);
	        addSlot(122, 27);
	        addPlayerSlots(ip);
	 }
	
	@Override
	 public boolean canInteractWith(EntityPlayer player) {
	  return te.isUseableByPlayer(player);
	 }
	
	public void addSlot(int x, int y){
		this.addSlotToContainer(new Slot(te, slotAmount, x, y));
		slotAmount++;
	}
	
	protected void addPlayerSlots(InventoryPlayer ip){
		int i;
		for (i = 0; i < 3; ++i){
			for (int j = 0; j < 9; ++j){
				this.addSlotToContainer(new Slot(ip, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for (i = 0; i < 9; ++i){
			this.addSlotToContainer(new Slot(ip, i, 8 + i * 18, 142));
		}
	}
	
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int sourceSlotIndex){
		return null;
	}

}
