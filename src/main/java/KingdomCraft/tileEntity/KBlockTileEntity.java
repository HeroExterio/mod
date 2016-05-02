package KingdomCraft.tileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.chunk.Chunk;

public class KBlockTileEntity extends TileEntity implements IInventory{

	ItemStack[] inventory = new ItemStack[getSizeInventory()]; //An array that stores the ItemStacks
	int expansion_amount = 0;
	
	@Override
	public void updateEntity(){ //Called every single tick
	}
	
	public boolean isBlockProtected(int x, int z){
		Chunk current = worldObj.getChunkFromBlockCoords(xCoord, yCoord);
		Chunk mod = worldObj.getChunkFromBlockCoords(x, z);
		if(expansion_amount > 0){
			for(int cx = 1; cx <= expansion_amount; cx++){
				for(int cz = 1; cz <= expansion_amount; cz++){
					current = worldObj.getChunkFromBlockCoords(cx, cz);
					if(mod.xPosition == current.xPosition && mod.zPosition == current.zPosition){
						return true;
					}
				}
			}
			return false;
		}else{
			if(mod.xPosition == current.xPosition && mod.zPosition == current.zPosition){
				return true;
			}else{
				return false;
			}
		}
	}
	
	 public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
	  return true;
	 }

	@Override
	public int getSizeInventory() {
		return 8;
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(int index, int amount){
        if (inventory[index] != null){
            ItemStack itemstack;
            if (inventory[index].stackSize <= amount){
                itemstack = inventory[index];
                inventory[index] = null;
                this.markDirty();
                return itemstack;
            }
            else{
                itemstack = inventory[index].splitStack(amount);

                if (inventory[index].stackSize == 0){
                	inventory[index] = null;
                }
                this.markDirty();
                return itemstack;
            }
        }
        else{
            return null;
        }
    }

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		return null;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		inventory[slot]=stack;
	}

	@Override
	public String getInventoryName() {
		return "KBlockTileEntity";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		return 1; //What is the stack limit? no like what is the stack size of items in here
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		tag.setInteger("expansion", expansion_amount);
	}
	@Override
	public void readFromNBT(NBTTagCompound tag){
		super.readFromNBT(tag);
		expansion_amount = tag.getInteger("expansion");
	}
	
	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack) {
		return true;
	}
}

