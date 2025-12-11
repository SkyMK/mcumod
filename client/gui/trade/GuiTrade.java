// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.gui.trade;

import cpw.mods.fml.common.network.ByteBufUtils;
import mcu.DayZ;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.EnumChatFormatting;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GuiTrade extends GuiScreen {
    public static final GuiTrade INSTANCE;
    public static final Minecraft mc;
    public static final RenderItem itemRenderer;
    public static final int LOCK_TICKS = 60;

    static {
        INSTANCE = new GuiTrade();
        mc = Minecraft.getMinecraft();
        itemRenderer = new RenderItem();
    }

    public final List<ItemButton> inventoryItems;
    public final List<ItemButton> selectedItems;
    public final List<Integer> selectedSlots;
    public final List<ItemButton> otherItems;
    public GuiTextField input;
    public String exchangingWithPlayer;
    public int ownBalance;
    public int otherBalance;
    public int ownCash;
    public int otherCash;
    public boolean lockInput;
    public boolean ready;
    public boolean otherReady;
    public ItemButton hoveredButton;
    public ColoredButton readyButton;
    public int readyLock;
    public int transaction;

    public GuiTrade() {
        this.inventoryItems = new ArrayList<ItemButton>();
        this.selectedItems = new ArrayList<ItemButton>();
        this.selectedSlots = new ArrayList<Integer>();
        this.otherItems = new ArrayList<ItemButton>();
        this.ownBalance = -1;
        this.otherBalance = -1;
    }

    public static void drawItemStack(final ItemStack stack, final int x, final int y) {
        Minecraft mc = Minecraft.getMinecraft();
        GL11.glTranslatef(0.0f, 0.0f, 32.0f);
        itemRender.zLevel = 200.0f;
        FontRenderer font = null;
        if (stack != null) {
        }
        if (font == null) {
            font = mc.fontRenderer;
        }
        itemRender.renderItemAndEffectIntoGUI(font, mc.getTextureManager(), stack, x, y);
        GL11.glTranslatef(itemRender.zLevel = 0.0f, 0.0f, -32.0f);
        RenderHelper.disableStandardItemLighting();
    }

    public void read(int id, PacketBuffer buf) {
        if (id == 0) {
            exchangingWithPlayer = ByteBufUtils.readUTF8String(buf);
        }
    }

    public <T> void sendToOther(int id, T... objects) {
        DayZ.network.sendToServer(DayZ.network.createPacket(id, exchangingWithPlayer, objects));
    }

    public void actionPerformed(GuiButton b) {
        if (b.id >= 0 && b.id <= 35) {
            sendToOther(65, b.id);
        }
    }

    public void open() {
        for (int i = 0; i < GuiTrade.mc.thePlayer.inventory.mainInventory.length; ++i) {
            final ItemStack ItemStack = GuiTrade.mc.thePlayer.inventory.mainInventory[i];
            if (ItemStack != null) {
                this.inventoryItems.add(new ItemButton(i, ItemStack));
            }
        }
    }

    @Override
    public void initGui() {
        if (this.exchangingWithPlayer == null) {
            this.open();
        }
        this.buttonList.clear();
        final int n = this.width / 2 - 125;
        final int n2 = this.height / 2 - 115;
        for (final ItemButton itemButton : this.inventoryItems) {
            if (this.selectedSlots.contains(itemButton.id)) {
                continue;
            }
            this.buttonList.add(itemButton);
            itemButton.xPosition = itemButton.id % 9 * 18 + n + 10;
            itemButton.yPosition = itemButton.id / 9 * 18 + n2 + 230 - 10 - 90;
            if (itemButton.id < 9) {
                final ItemButton itemButton2 = itemButton;
                itemButton2.yPosition += 72;
            }
            final ItemButton itemButton3 = itemButton;
            ++itemButton3.xPosition;
            final ItemButton itemButton4 = itemButton;
            ++itemButton4.yPosition;
        }
        int n3 = 0;
        for (final ItemButton itemButton5 : this.selectedItems) {
            this.buttonList.add(itemButton5);
            itemButton5.xPosition = n3 % 6 * 18 + n + 10;
            itemButton5.yPosition = n3 / 6 * 18 + n2 + 28;
            final ItemButton itemButton6 = itemButton5;
            ++itemButton6.xPosition;
            final ItemButton itemButton7 = itemButton5;
            ++itemButton7.yPosition;
            ++n3;
        }
        int n4 = 0;
        for (final ItemButton itemButton8 : this.otherItems) {
            this.buttonList.add(itemButton8);
            itemButton8.xPosition = n4 % 6 * 18 + n + 250 - 108 - 10;
            itemButton8.yPosition = n4 / 6 * 18 + n2 + 28;
            final ItemButton itemButton9 = itemButton8;
            ++itemButton9.xPosition;
            final ItemButton itemButton10 = itemButton8;
            ++itemButton10.yPosition;
            ++n4;
        }
        final int n5 = n2 + 230 - 19 - 72;
        final ColoredButton coloredButton = new ColoredButton(-2, n + 20 + 162, n5 + 43, 58, 10,
                "\u0437\u0430\u0434\u0430\u0442\u044c", -1068149419, -1065386113);
        if (this.ready || this.lockInput) {
            coloredButton.enabled = false;
        }
        this.buttonList.add(coloredButton);
        final ColoredButton coloredButton2 = this.readyButton = new ColoredButton(-3, n + 20 + 162, n5 + 55, 58, 12,
                "\u0413\u043e\u0442\u043e\u0432", -1073709312, -1069563841);
        if (this.ready || this.lockInput || this.ownBalance == -1 || this.otherBalance == -1) {
            coloredButton2.enabled = false;
        }
        this.buttonList.add(coloredButton2);
        this.buttonList.add(new ColoredButton(-4, n + 20 + 162, n5 + 69, 58, 12, "\u041e\u0442\u043c\u0435\u043d\u0430",
                -1065418752, -1061142721));
        final GuiTextField input = this.input;
        (this.input = new GuiTextField(this.fontRendererObj, n + 21 + 162, n5 + 28, 56, 12)).setEnabled(true);
        this.input.setMaxStringLength(8);
        if (this.ready || this.lockInput) {
            this.input.setEnabled(false);
        }
        if (input != null) {
            this.input.setText(input.getText());
        }
        if (!this.lockInput && this.readyLock > 0) {
            this.readyButton.enabled = false;
            this.readyButton.displayString = Integer.toString(this.readyLock / 20);
        }
    }

    public void drawToolTip(ItemStack stack, int x, int y) {
        List list = stack.getTooltip(Minecraft.getMinecraft().thePlayer,
                Minecraft.getMinecraft().gameSettings.advancedItemTooltips);

        for (int k = 0; k < list.size(); ++k) {
            if (k == 0) {
                list.set(k, stack.getRarity().rarityColor + (String) list.get(k));
            } else {
                list.set(k, EnumChatFormatting.GRAY + (String) list.get(k));
            }
        }

        drawHoveringText(list, x, y, Minecraft.getMinecraft().fontRenderer);
    }

    public void drawGradientRect(double par1, double par2, double par3, double par4, int col1, int col2) {
        float f = (float) (col1 >> 24 & 0xFF) / 255F;
        float f1 = (float) (col1 >> 16 & 0xFF) / 255F;
        float f2 = (float) (col1 >> 8 & 0xFF) / 255F;
        float f3 = (float) (col1 & 0xFF) / 255F;

        float f4 = (float) (col2 >> 24 & 0xFF) / 255F;
        float f5 = (float) (col2 >> 16 & 0xFF) / 255F;
        float f6 = (float) (col2 >> 8 & 0xFF) / 255F;
        float f7 = (float) (col2 & 0xFF) / 255F;

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_LINE_SMOOTH);
        GL11.glShadeModel(GL11.GL_SMOOTH);

        GL11.glPushMatrix();
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glColor4f(f1, f2, f3, f);
        GL11.glVertex2d(par3, par4);
        GL11.glVertex2d(par3, par2);

        GL11.glColor4f(f5, f6, f7, f4);
        GL11.glVertex2d(par1, par2);
        GL11.glVertex2d(par1, par4);
        GL11.glEnd();
        GL11.glPopMatrix();

        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_LINE_SMOOTH);
        GL11.glShadeModel(GL11.GL_FLAT);
    }

    public void drawHoveringText(List p_146283_1_, int p_146283_2_, int p_146283_3_, FontRenderer font) {
        if (!p_146283_1_.isEmpty()) {
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            RenderHelper.disableStandardItemLighting();
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            int k = 0;
            Iterator iterator = p_146283_1_.iterator();

            while (iterator.hasNext()) {
                String s = (String) iterator.next();
                int l = font.getStringWidth(s);

                if (l > k) {
                    k = l;
                }
            }

            int j2 = p_146283_2_ + 12;
            int k2 = p_146283_3_ - 12;
            int i1 = 8;

            if (p_146283_1_.size() > 1) {
                i1 += 2 + (p_146283_1_.size() - 1) * 10;
            }

            /*
             * if (j2 + k > width) { j2 -= 28 + k; }
             *
             * if (k2 + i1 + 6 > height) { k2 = height - i1 - 6; }
             */

            itemRender.zLevel = 300.0F;
            int j1 = -267386864;
            drawGradientRect(j2 - 3, k2 - 4, j2 + k + 3, k2 - 3, j1, j1);
            drawGradientRect(j2 - 3, k2 + i1 + 3, j2 + k + 3, k2 + i1 + 4, j1, j1);
            drawGradientRect(j2 - 3, k2 - 3, j2 + k + 3, k2 + i1 + 3, j1, j1);
            drawGradientRect(j2 - 4, k2 - 3, j2 - 3, k2 + i1 + 3, j1, j1);
            drawGradientRect(j2 + k + 3, k2 - 3, j2 + k + 4, k2 + i1 + 3, j1, j1);
            int k1 = 1347420415;
            int l1 = (k1 & 16711422) >> 1 | k1 & -16777216;
            drawGradientRect(j2 - 3, k2 - 3 + 1, j2 - 3 + 1, k2 + i1 + 3 - 1, k1, l1);
            drawGradientRect(j2 + k + 2, k2 - 3 + 1, j2 + k + 3, k2 + i1 + 3 - 1, k1, l1);
            drawGradientRect(j2 - 3, k2 - 3, j2 + k + 3, k2 - 3 + 1, k1, k1);
            drawGradientRect(j2 - 3, k2 + i1 + 2, j2 + k + 3, k2 + i1 + 3, l1, l1);

            for (int i2 = 0; i2 < p_146283_1_.size(); ++i2) {
                String s1 = (String) p_146283_1_.get(i2);
                font.drawStringWithShadow(s1, j2, k2, -1);

                if (i2 == 0) {
                    k2 += 2;
                }

                k2 += 10;
            }

            itemRender.zLevel = 0.0F;
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            RenderHelper.enableStandardItemLighting();
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        }
    }

    @Override
    public void drawScreen(final int n, final int n2, final float n3) {
        final int n4 = this.width / 2 - 125;
        final int n5 = this.height / 2 - 115;
        GuiScreen.drawRect(n4, n5, n4 + 250, n5 + 230, -1073741824);
        GuiScreen.drawRect(n4 + 10, n5 + 28, n4 + 10 + 108, n5 + 28 + 108, this.ready ? 1437269930 : 1442840575);
        GuiScreen.drawRect(n4 + 250 - 10 - 108, n5 + 28, n4 + 250 - 10, n5 + 28 + 108,
                this.otherReady ? 1437269930 : 1442840575);
        GuiScreen.drawRect(n4 + 10, n5 + 230 - 10 - 72, n4 + 10 + 162, n5 + 230 - 10,
                this.ready ? 1437248170 : 1442840575);
        this.drawCenteredString(GuiTrade.mc.fontRenderer, GuiTrade.mc.thePlayer.getCommandSenderName(), n4 + 62, n5 + 1,
                -22016);
        this.drawCenteredString(GuiTrade.mc.fontRenderer, this.ready
                        ? "§a\u041e\u0431\u043c\u0435\u043d \u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0451\u043d"
                        : ("\u0411\u0430\u043b\u0430\u043d\u0441: "
                        + ((this.ownBalance == -1) ? "\u0437\u0430\u0433\u0440\u0443\u0437\u043a\u0430"
                        : Integer.valueOf(this.ownBalance))),
                n4 + 62, n5 + 10, -5592406);
        this.drawCenteredString(GuiTrade.mc.fontRenderer,
                "\u041e\u0442\u0434\u0430\u044e \u043c\u043e\u043d\u0435\u0442: §c" + this.ownCash, n4 + 62, n5 + 19,
                -1);
        this.drawCenteredString(GuiTrade.mc.fontRenderer, this.exchangingWithPlayer, n4 + 187, n5 + 1, -22016);
        this.drawCenteredString(GuiTrade.mc.fontRenderer, this.otherReady
                        ? "§a\u041e\u0431\u043c\u0435\u043d \u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0451\u043d"
                        : ("\u0411\u0430\u043b\u0430\u043d\u0441: "
                        + ((this.otherBalance == -1) ? "\u0437\u0430\u0433\u0440\u0443\u0437\u043a\u0430"
                        : Integer.valueOf(this.otherBalance))),
                n4 + 187, n5 + 10, -5592406);
        this.drawCenteredString(GuiTrade.mc.fontRenderer,
                "\u041f\u043e\u043b\u0443\u0447\u0430\u044e \u043c\u043e\u043d\u0435\u0442: §a" + this.otherCash,
                n4 + 187, n5 + 19, -1);
        final int n6 = n5 + 230 - 19 - 72;
        this.drawCenteredString(GuiTrade.mc.fontRenderer, "\u0418\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u044c",
                n4 + 5 + 81, n6, -1);
        this.drawCenteredString(GuiTrade.mc.fontRenderer, "\u041f\u0435\u0440\u0435\u0432\u043e\u0434",
                n4 + 5 + 81 + 125, n6, -1);
        this.drawCenteredString(GuiTrade.mc.fontRenderer, "\u043c\u043e\u043d\u0435\u0442 \u043b\u043a",
                n4 + 5 + 81 + 125, n6 + 9, -1);
        this.drawCenteredString(GuiTrade.mc.fontRenderer, "\u043a\u043e\u043c\u0438\u0441\u0441\u0438\u044f 10%",
                n4 + 5 + 81 + 125, n6 + 18, -5592406);
        this.input.drawTextBox();
        this.hoveredButton = null;
        super.drawScreen(n, n2, n3);
        if (this.hoveredButton != null) {
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            final int xPosition = this.hoveredButton.xPosition;
            final int yPosition = this.hoveredButton.yPosition;
            if (this.hoveredButton.id != -1337 && !this.lockInput) {
                this.drawGradientRect(xPosition, yPosition, xPosition + 16, yPosition + 16, -2130706433, -2130706433);
            }
            GL11.glEnable(2896);
            GL11.glEnable(2929);
        }
    }

    @Override
    public void onGuiClosed() {
        this.inventoryItems.clear();
        this.selectedItems.clear();
        this.selectedSlots.clear();
        this.otherItems.clear();
        final int n = -1;
        this.otherBalance = n;
        this.ownBalance = n;
        final int n2 = 0;
        this.otherCash = n2;
        this.ownCash = n2;
        final boolean lockInput = false;
        this.ready = lockInput;
        this.otherReady = lockInput;
        this.lockInput = lockInput;
        this.exchangingWithPlayer = null;
        this.input = null;
        // net close
    }

    protected void keyTyped(final char c, final int n) {
        if ((c >= '0' && c <= '9') || n == 14 || n == 211) {
            this.input.textboxKeyTyped(c, n);
        }
        super.keyTyped(c, n);
    }

    protected void mouseClicked(final int n, final int n2, final int n3) {
        this.input.mouseClicked(n, n2, n3);
        super.mouseClicked(n, n2, n3);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void updateScreen() {
        if (!this.lockInput) {
            if (this.readyLock > 0) {
                --this.readyLock;
                this.readyButton.displayString = Integer.toString(this.readyLock / 20 + 1);
            } else if (!this.readyButton.enabled) {
                this.readyButton.enabled = true;
                this.readyButton.displayString = "\u0413\u043e\u0442\u043e\u0432";
            }
        }
    }

    public class ItemButton extends GuiButton {
        public final ItemStack is;

        public ItemButton(final int n, final ItemStack ItemStack) {
            super(n, 0, 0, 16, 16, null);
            this.is = ItemStack.copy();
        }

        public ItemButton(final GuiTrade GuiTrade, final ItemStack ItemStack) {
            this(-1337, ItemStack);
            this.enabled = false;
        }

        @Override
        public void drawButton(final Minecraft Minecraft, final int n, final int n2) {
            RenderHelper.disableStandardItemLighting();
            GL11.glPushMatrix();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glEnable(32826);
            final int xPosition = this.xPosition;
            final int yPosition = this.yPosition;
            drawItemStack(is, xPosition, yPosition);
            GL11.glPopMatrix();
            if (n >= this.xPosition && n2 >= this.yPosition && n < this.xPosition + this.width
                    && n2 < this.yPosition + this.height) {
                GuiTrade.this.hoveredButton = this;
            }
        }
    }

    public class ColoredButton extends GuiButton {
        public final int background;
        public final int hovered;
        public boolean field_82253_i;

        public ColoredButton(final int n, final int n2, final int n3, final int n4, final int n5, final String s,
                             final int background, final int hovered) {
            super(n, n2, n3, n4, n5, s);
            this.background = background;
            this.hovered = hovered;
        }

        @Override
        public void drawButton(final Minecraft Minecraft, final int n, final int n2) {
            if (this.visible) {
                RenderHelper.disableStandardItemLighting();
                final FontRenderer z = Minecraft.fontRenderer;
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                this.field_82253_i = (n >= this.xPosition && n2 >= this.yPosition && n < this.xPosition + this.width
                        && n2 < this.yPosition + this.height);
                GuiScreen.drawRect(this.xPosition, this.yPosition, this.xPosition + this.width,
                        this.yPosition + this.height,
                        ((this.enabled && this.field_82253_i)) ? this.hovered : this.background);
                // this.func_73739_b(Minecraft, n, n2);
                int n3 = 14737632;
                if (!this.enabled) {
                    n3 = -6250336;
                } else if (this.field_82253_i) {
                    n3 = 16777120;
                }
                this.drawCenteredString(z, this.displayString, this.xPosition + this.width / 2,
                        this.yPosition + (this.height - 8) / 2, n3);
            }
        }
    }
}
