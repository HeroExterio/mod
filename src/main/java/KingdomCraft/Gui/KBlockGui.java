package KingdomCraft.Gui;

import com.Kingdomcraft.lib.RefStrings;

import KingdomCraft.BlockStorage.KBlockContainer;
import KingdomCraft.tileEntity.KBlockTileEntity;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class KBlockGui extends GuiContainer {
	
	protected final ResourceLocation gui = new ResourceLocation(RefStrings.MODID + ":textures/gui/KB_GUI.png");
	
	public KBlockGui(KBlockTileEntity te, InventoryPlayer inventory){
		super(new KBlockContainer(inventory, te));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseY) {
		
		mc.getTextureManager().bindTexture(gui);
		drawTexturedModalRect(this.guiLeft, this.guiTop/2, 0, 0, 176, 222);
	}

}
