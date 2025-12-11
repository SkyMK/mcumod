package com.flansmod.client.gui;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ContainerGunModTable;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketGunPaint;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.util.Random;

public class GuiGunModTable extends GuiContainer {

    private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/gunTable.png");
    private static final Random rand = new Random();
    private Paintjob hoveringOver = null;
    private int mouseX;
    private int mouseY;
    private final InventoryPlayer inventory;

    public GuiGunModTable(InventoryPlayer inv, World w) {
        super(new ContainerGunModTable(inv, w));
        this.inventory = inv;
        super.ySize = 256;
    }

    protected void drawGuiContainerForegroundLayer(int x, int y) {
        super.fontRendererObj.drawString("Inventory", 8, super.ySize - 94 + 2, 4210752);
        super.fontRendererObj.drawString("Gun Modification Table", 8, 6, 4210752);
        ItemStack gunStack = super.inventorySlots.getSlot(0).getStack();
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            GunType gunType = ((ItemGun) gunStack.getItem()).type;
            if (gunType.model != null) {
                GL11.glPushMatrix();
                GL11.glColor3f(1.0F, 1.0F, 1.0F);
                GL11.glTranslatef(110.0F, 54.0F, 100.0F);
                GL11.glRotatef(160.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(20.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(-50.0F, 50.0F, 50.0F);
                ClientProxy.gunRenderer.renderGun(gunStack, gunType, 0.0625F, gunType.model, GunAnimations.defaults, 0);
                GL11.glPopMatrix();
            }
        }

    }

    protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        super.mc.renderEngine.bindTexture(texture);
        int xOrigin = (super.width - super.xSize) / 2;
        int yOrigin = (super.height - super.ySize) / 2;
        this.drawTexturedModalRect(xOrigin, yOrigin, 0, 0, super.xSize, super.ySize);

        for (int gunStack = 1; gunStack < 13; ++gunStack) {
            super.inventorySlots.getSlot(gunStack).yDisplayPosition = -1000;
        }

        ItemStack var14 = super.inventorySlots.getSlot(0).getStack();
        int originX;
        int originY;
        int s;
        if (var14 != null && var14.getItem() instanceof ItemGun) {
            GunType numDyes = ((ItemGun) var14.getItem()).type;
            if (numDyes.allowBarrelAttachments) {
                this.drawTexturedModalRect(xOrigin + 51, yOrigin + 107, 176, 122, 22, 22);
                super.inventorySlots.getSlot(1).yDisplayPosition = 110;
            }

            if (numDyes.allowScopeAttachments) {
                this.drawTexturedModalRect(xOrigin + 77, yOrigin + 81, 202, 96, 22, 22);
                super.inventorySlots.getSlot(2).yDisplayPosition = 84;
            }

            if (numDyes.allowStockAttachments) {
                this.drawTexturedModalRect(xOrigin + 103, yOrigin + 107, 228, 122, 22, 22);
                super.inventorySlots.getSlot(3).yDisplayPosition = 110;
            }

            if (numDyes.allowGripAttachments) {
                this.drawTexturedModalRect(xOrigin + 77, yOrigin + 133, 202, 148, 22, 22);
                super.inventorySlots.getSlot(4).yDisplayPosition = 136;
            }

            int haveDyes;
            for (haveDyes = 0; haveDyes < 2; ++haveDyes) {
                for (originX = 0; originX < 4; ++originX) {
                    if (haveDyes + originX * 2 < numDyes.numGenericAttachmentSlots) {
                        super.inventorySlots.getSlot(5 + haveDyes + originX * 2).yDisplayPosition = 83 + 18 * originX;
                        this.drawTexturedModalRect(xOrigin + 9 + 18 * haveDyes, yOrigin + 82 + 18 * originX, 178, 54,
                                18, 18);
                    }
                }
            }

            haveDyes = numDyes.paintjobs.size();
            originX = haveDyes / 2 + 1;

            for (originY = 0; originY < originX; ++originY) {
                for (s = 0; s < 2; ++s) {
                    if (2 * originY + s < haveDyes) {
                        this.drawTexturedModalRect(xOrigin + 131 + 18 * s, yOrigin + 82 + 18 * originY, 178, 54, 18,
                                18);
                    }
                }
            }

            for (originY = 0; originY < originX; ++originY) {
                for (s = 0; s < 2; ++s) {
                    if (2 * originY + s < haveDyes) {
                        Paintjob stack = (Paintjob) numDyes.paintjobs.get(2 * originY + s);
                        ItemStack stack1 = var14.copy();
                        stack1.stackTagCompound.setString("Paint", stack.iconName);
                        GuiScreen.itemRender.renderItemIntoGUI(super.fontRendererObj, super.mc.getTextureManager(),
                                stack1, xOrigin + 132 + s * 18, yOrigin + 83 + originY * 18);
                    }
                }
            }
        }

        if (this.hoveringOver != null) {
            int var15 = this.hoveringOver.dyesNeeded.length;
            if (var15 != 0 && !this.inventory.player.capabilities.isCreativeMode) {
                boolean[] var16 = new boolean[var15];

                for (originX = 0; originX < var15; ++originX) {
                    originY = this.hoveringOver.dyesNeeded[originX].stackSize;

                    for (s = 0; s < this.inventory.getSizeInventory(); ++s) {
                        ItemStack var17 = this.inventory.getStackInSlot(s);
                        if (var17 != null && var17.getItem() == Items.dye
                                && var17.getItemDamage() == this.hoveringOver.dyesNeeded[originX].getItemDamage()) {
                            originY -= var17.stackSize;
                        }
                    }

                    if (originY <= 0) {
                        var16[originX] = true;
                    }
                }

                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glDisable(2896);
                super.mc.renderEngine.bindTexture(texture);
                originX = this.mouseX + 6;
                originY = this.mouseY - 20;
                if (var15 == 1) {
                    this.drawTexturedModalRect(originX, originY, var16[0] ? 201 : 178, 218, 22, 22);
                } else {
                    this.drawTexturedModalRect(originX, originY, 178, var16[0] ? 195 : 172, 20, 22);

                    for (s = 1; s < var15 - 1; ++s) {
                        this.drawTexturedModalRect(originX + 2 + 18 * s, originY, 199, var16[s] ? 195 : 172, 18, 22);
                    }

                    this.drawTexturedModalRect(originX + 2 + 18 * (var15 - 1), originY, 218,
                            var16[var15 - 1] ? 195 : 172, 20, 22);
                }

                for (s = 0; s < var15; ++s) {
                    GuiScreen.itemRender.renderItemIntoGUI(super.fontRendererObj, super.mc.getTextureManager(),
                            this.hoveringOver.dyesNeeded[s], originX + 3 + s * 18, originY + 3);
                    GuiScreen.itemRender.renderItemOverlayIntoGUI(super.fontRendererObj, super.mc.getTextureManager(),
                            this.hoveringOver.dyesNeeded[s], originX + 3 + s * 18, originY + 3);
                }
            }
        }

    }

    public void handleMouseInput() {
        super.handleMouseInput();
        this.mouseX = Mouse.getEventX() * super.width / super.mc.displayWidth;
        this.mouseY = super.height - Mouse.getEventY() * super.height / super.mc.displayHeight - 1;
        int mouseXInGUI = this.mouseX - super.guiLeft;
        int mouseYInGUI = this.mouseY - super.guiTop;
        this.hoveringOver = null;
        ItemStack gunStack = super.inventorySlots.getSlot(0).getStack();
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            GunType gunType = ((ItemGun) gunStack.getItem()).type;
            int numPaintjobs = gunType.paintjobs.size();
            int numRows = numPaintjobs / 2 + 1;

            for (int j = 0; j < numRows; ++j) {
                for (int i = 0; i < 2; ++i) {
                    if (2 * j + i < numPaintjobs) {
                        Paintjob paintjob = (Paintjob) gunType.paintjobs.get(2 * j + i);
                        ItemStack stack = gunStack.copy();
                        stack.stackTagCompound.setString("Paint", paintjob.iconName);
                        int slotX = 131 + i * 18;
                        int slotY = 82 + j * 18;
                        if (mouseXInGUI >= slotX && mouseXInGUI < slotX + 18 && mouseYInGUI >= slotY
                                && mouseYInGUI < slotY + 18) {
                            this.hoveringOver = paintjob;
                        }
                    }
                }
            }
        }

    }

    protected void mouseClicked(int x, int y, int button) {
        super.mouseClicked(x, y, button);
        if (button == 0) {
            if (this.hoveringOver != null) {
                FlansMod.getPacketHandler().sendToServer(new PacketGunPaint(this.hoveringOver.iconName));
                ((ContainerGunModTable) super.inventorySlots).clickPaintjob(this.hoveringOver);
            }
        }
    }

}
