package KingdomCraft.Gui;

import KingdomCraft.container.KBlockContainer;
import KingdomCraft.tileEntity.KBlockTileEntity;
import KingdomCraft.util.RefStrings;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class KBlockGui extends GuiContainer {
	
	protected final ResourceLocation gui = new ResourceLocation(RefStrings.MODID + ":textures/gui/kingdomblockgui.png");
	
	public KBlockGui(KBlockTileEntity te, InventoryPlayer inventory){
		super(new KBlockContainer(inventory, te));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseY) {
		mc.getTextureManager().bindTexture(gui);
		drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 256, 256);
		fontRendererObj.drawString("Whitelist:", guiLeft + 10, guiTop + 62, 4210752);
		drawCenteredString("Expansion", guiLeft + 22, guiTop + 45, 4210752);
		drawCenteredString("Rank", guiLeft + 119, guiTop + 45, 4210752);
		GuiFurnace f;
	}
	
	
    public void drawCenteredString(String str, int x, int y, int color){
        fontRendererObj.drawString(str, x - fontRendererObj.getStringWidth(str) / 2, y, color);
    }

}
