package KingdomCraft.BlockStorage;

import KingdomCraft.tileEntity.KBlockTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class KBlockContainer extends Container{
	
	KBlockTileEntity te;
	int slotAmount;
	
	public KBlockContainer(InventoryPlayer pl, KBlockTileEntity te){
		  this.te = te;
		  this.slotAmount = 0;
		  addPlayerSlots(pl, 8 + addOffsetX(), 84 + addOffsetY());
		  for(int i = 0; i < 6; i++){
			  addSlot(62+ (i*18), 18);
		  }
		 }

	@Override
	 public boolean canInteractWith(EntityPlayer player) {
	  return te.isUseableByPlayer(player);
	 }
	
	public void addSlot(int x, int y){
		this.addSlotToContainer(new Slot(te, slotAmount, x, y));
		slotAmount++;
	}
	
	protected void addPlayerSlots(InventoryPlayer pl, int x, int y){
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 9; ++j){
                this.addSlotToContainer(new Slot(pl, j + i * 9 + 9, x + j * 18, y + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i){
            this.addSlotToContainer(new Slot(pl, i, x + i * 18, y + 58));
        }
 }

	protected int addOffsetX(){
		return 0;
	}
 
	protected int addOffsetY(){
		return -30;
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int sourceSlotIndex){
		return null;
	}

}
