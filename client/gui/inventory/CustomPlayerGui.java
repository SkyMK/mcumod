package mcu.client.gui.inventory;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.DayZ;
import mcu.inventory.Reference;
import mcu.inventory.network.AbstractPacket;
import mcu.inventory.network.NetworkWrapper;
import mcu.inventory.network.packages.PackageDropItem;
import mcu.inventory.network.packages.TakePacket;
import mcu.network.PacketHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.net.URI;
import java.util.List;
import java.util.*;

public class CustomPlayerGui extends GuiContainer {
    public static final int updateInterval = 10;
    public static final Map<String, IPlayerState> playerState;
    private static final List<String> tmp_list;
    public static RenderItem itemRender;
    private static InventoryPlayer p_i1084_1_;

    static {
        CustomPlayerGui.itemRender = new RenderItem();
    }

    static {
        (playerState = new LinkedHashMap<String, IPlayerState>()).put("\u041a\u0440\u043e\u0432\u044c",
                new IPlayerState() {
                    @Override
                    public String status(final EntityPlayer entityPlayer) {
                        return (int) (entityPlayer.getHealth() * 600.0f) + "/12000";
                    }

                    @Override
                    public void description(final List<String> list, final EntityPlayer entityPlayer) {
                        list.add("Отображает ваше здоровье");
                    }
                });
        CustomPlayerGui.playerState.put("Кровотечение", new IPlayerState() {
            @Override
            public String status(final EntityPlayer entityPlayer) {
                return "Нет";
            }

            @Override
            public void description(final List<String> list, final EntityPlayer entityPlayer) {
                list.add("Выключено на данном сервере");
            }
        });
        CustomPlayerGui.playerState.put("\u041d\u043e\u0433\u0438", new IPlayerState() {
            @Override
            public String status(final EntityPlayer entityPlayer) {
                return "целы";
            }

            @Override
            public void description(final List<String> list, final EntityPlayer entityPlayer) {
                list.add("Поломка ног выключена на данном сервере");
            }
        });
        CustomPlayerGui.playerState.put("\u0415\u0434\u0430", new IPlayerState() {
            @Override
            public String status(final EntityPlayer entityPlayer) {
                return "сыт";
            }

            @Override
            public void description(final List<String> list, final EntityPlayer entityPlayer) {
                list.add("Еда выключена на данном сервере");
            }
        });
        CustomPlayerGui.playerState.put("\u0412\u043e\u0434\u0430", new IPlayerState() {
            @Override
            public String status(final EntityPlayer entityPlayer) {
                String s = "насыщен";
                return s;
            }

            @Override
            public void description(final List<String> list, final EntityPlayer entityPlayer) {
                list.add("Вода выключена на данном сервере");
            }
        });
        CustomPlayerGui.playerState.put("\u0422\u0435\u043c\u043f\u0435\u0440\u0430\u0442\u0443\u0440\u0430",
                new IPlayerState() {
                    @Override
                    public String status(final EntityPlayer entityPlayer) {
                        String s = "норма";
                        return s;
                    }

                    @Override
                    public void description(final List<String> list, final EntityPlayer entityPlayer) {
                        list.add("Температура выключена на данном сервере");
                    }
                });
        tmp_list = new ArrayList<String>();
    }

    private final CustomPlayerInventory inventory;
    public List<EntityItem> items = new ArrayList<>();
    public HashMap<EntityItem, Integer> ignoreItems = new HashMap<EntityItem, Integer>();
    public EntityItem stackInHand;
    public int hoverSlot;
    public int mouseX;
    public int mouseY;
    public int timer;
    public int cooldown;
    private float xSizeFloat;
    private float ySizeFloat;
    private int guiTop;
    private int guiLeft;
    private int brButtonsOffset;
    private GuiTextField gpsX;
    private GuiTextField gpsZ;
    private GuiButton gpsButton;

    public CustomPlayerGui(final EntityPlayer player, final InventoryPlayer inventoryPlayer,
                           final CustomPlayerInventory inventoryCustom) {
        super(new CustomPlayerContainer(player, inventoryPlayer, inventoryCustom));
        this.mc = Minecraft.getMinecraft();
        this.inventory = inventoryCustom;
        this.stackInHand = null;
        this.timer = 10;
        this.ignoreItems = new HashMap<EntityItem, Integer>();
        this.xSize += 112;
        this.updateList();
    }

    private static void drawOutlinedRect(final int n, final int mouseX, final int mouseY, final int n4, final int n5) {
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        drawRect(n + 1, mouseX + 1, n + mouseY - 1, mouseX + n4 - 1, n5);
        drawRect(n, mouseX, n + mouseY, mouseX + 1, -8947849);
        drawRect(n, mouseX + 1, n + 1, mouseX + n4, -8947849);
        drawRect(n + mouseY - 1, mouseX + 1, n + mouseY, mouseX + n4, -8947849);
        drawRect(n + 1, mouseX + n4 - 1, n + mouseY - 1, mouseX + n4, -8947849);
    }

    protected void keyTyped(final char c, final int n) {
        final String b = this.gpsX.getText();
        final String b2 = this.gpsZ.getText();
        final int h = this.gpsX.getMaxStringLength();
        final int h2 = this.gpsZ.getMaxStringLength();
        GuiTextField tdzz = null;
        if (this.gpsX.textboxKeyTyped(c, n)) {
            tdzz = this.gpsX;
        }
        if (this.gpsZ.textboxKeyTyped(c, n)) {
            tdzz = this.gpsZ;
        }
        if (tdzz == null) {
            super.keyTyped(c, n);
        } else {
            try {
                final String b3 = tdzz.getText();
                if (b3.isEmpty() || b3.equals("-") || Math.abs(Integer.parseInt(b3)) < 10000) {
                    tdzz = null;
                }
            } catch (Throwable t) {
            }
            if (tdzz == null) {
                DayZ.gpsEnabled = false;
            } else if (tdzz == this.gpsX) {
                this.gpsX.setText(b);
                this.gpsX.setMaxStringLength(h);
            } else if (tdzz == this.gpsZ) {
                this.gpsZ.setText(b2);
                this.gpsZ.setMaxStringLength(h2);
            }
        }
    }

    @Override
    public void initGui() {
        try {
            final int n = this.guiLeft;
            this.gpsButton = new GuiTransparentButton(1, 0, 0, 32, 25, null, "\u041d\u0430\u0432\u0438\u0433\u0430\u0446\u0438\u044f \u043f\u043e \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u043c (X, Z).",
                    "\u0412\u0432\u0435\u0434\u0438 \u0438\u0445 \u0438 \u043d\u0430\u0436\u043c\u0438 \u0412\u041a\u041b, \u043f\u043e\u0441\u043b\u0435 \u0447\u0435\u0433\u043e",
                    "\u0438\u0434\u0438 \u043f\u043e \u0441\u0442\u0440\u0435\u043b\u043a\u0435 \u043d\u0430\u0434 \u0445\u043e\u0442\u0431\u0430\u0440\u043e\u043c.");
            this.gpsX = new GuiTextField(this.mc.fontRenderer, this.width / 2 + 7, this.height / 2 - 28, 39, 10);
            this.gpsZ = new GuiTextField(this.mc.fontRenderer, this.width / 2 + 7, this.height / 2 - 15, 39, 10);
            this.gpsX.setMaxStringLength(5);
            this.gpsZ.setMaxStringLength(5);
            this.gpsX.setText(Integer.toString(DayZ.gpsX));
            this.gpsZ.setText(Integer.toString(DayZ.gpsZ));
            this.buttonList.add(this.gpsButton);
            this.gpsButton.displayString = (DayZ.gpsEnabled ? "\u0412\u044b\u043a\u043b" : "\u0412\u043a\u043b");
            this.gpsButton.xPosition = this.width / 2 + 48;
            this.gpsButton.yPosition = this.height / 2 - 29;
            final int n2 = this.width / 2 + 84;
            this.brButtonsOffset = height / 2 + 80;
            this.buttonList.add(new GuiTransparentButton(2, n2 - 2, this.brButtonsOffset -= 12, 112, 10,
                    "\u0410\u043f\u0433\u0440\u0435\u0439\u0434 \u043e\u0440\u0443\u0436\u0438\u044f",
                    "\u041e\u0442\u043a\u0440\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u043a\u043d\u043e\u043f\u043a\u043e\u0439 U",
                    "(\u0435\u0441\u043b\u0438 \u0442\u044b \u043d\u0435 \u043c\u0435\u043d\u044f\u043b \u0435\u0435 \u0432 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430\u0445)"));
            this.buttonList.add(new GuiTransparentButton(3, n2 - 2, this.brButtonsOffset -= 12, 112, 10,
                    "\u041c\u0430\u0433\u0430\u0437\u0438\u043d \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432",
                    "\u041e\u0442\u043a\u0440\u044b\u0432\u0430\u0435\u0442\u0441\u044f \u043a\u043d\u043e\u043f\u043a\u043e\u0439 F5"));
            this.buttonList.add(new GuiTransparentButton(4, n2 - 2, this.brButtonsOffset -= 12, 112, 10,
                    "Донат магазин", "Ссылка https://vk.com/wwidecraft"));
            this.buttonList.add(new GuiTransparentButton(6, n2 - 2, this.brButtonsOffset -= 12, 112, 10,
                    "Онлайн карта DayZ", "Ничего не откроет)) до связи"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.initGui();

    }

    @Override
    public void actionPerformed(GuiButton b) {
        if (b.id == 1) {
            if (DayZ.gpsEnabled = !DayZ.gpsEnabled) {
                try {
                    DayZ.gpsX = Integer.parseInt(CustomPlayerGui.this.gpsX.getText());
                } catch (Throwable t) {
                    CustomPlayerGui.this.gpsZ.setText("0");
                    DayZ.gpsX = 0;
                }
                try {
                    DayZ.gpsZ = Integer.parseInt(CustomPlayerGui.this.gpsZ.getText());
                } catch (Throwable t2) {
                    CustomPlayerGui.this.gpsZ.setText("0");
                    DayZ.gpsZ = 0;
                }
            }
            CustomPlayerGui.this.gpsButton.displayString = (DayZ.gpsEnabled ? "\u0412\u044b\u043a\u043b"
                    : "\u0412\u043a\u043b");
        }
        try {
            if (b.id == 4) {
                Desktop.getDesktop().browse(new URI("https://vk.com/mcuniversal"));
            }
            if (b.id == 2) {
                DayZ.network.sendToServer(DayZ.network.createPacket(PacketHandler.OPEN_WORKBENCH, 0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void drawDefaultBackground() {
        this.drawGradientRect(0, 0, this.width, this.height, 70 << 24 | 20 << 16 | 20 << 8 | 20,
                100 << 24 | 20 << 16 | 20 << 8 | 20);
    }

    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        tmp_list.clear();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.xSizeFloat = (float) mouseX;
        this.ySizeFloat = (float) mouseY;
        try {
            if (hoverSlot != -999) {
                this.renderToolTip(items.get(hoverSlot).getEntityItem(), mouseX, mouseY);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        fontRendererObj.drawString("Состояние персонажа", width / 2 + 82, height / 2 - 82, Color.white.getRGB());
        fontRendererObj.drawString("Полезные кнопки", width / 2 + 82, height / 2 + 20, Color.white.getRGB());
        if (!tmp_list.isEmpty()) {
            drawHoveringText(tmp_list, mouseX, mouseY, mc.fontRenderer);
        }
    }

    @SideOnly(Side.CLIENT)
    protected void drawGuiContainerBackgroundLayer(final float f, final int mouseX, final int mouseY) {
        this.guiLeft = (this.width - this.xSize) / 2 - 60;
        this.guiTop = (this.height - this.ySize) / 2;
        this.mouseX = mouseX - this.guiLeft;
        this.mouseY = mouseY - this.guiTop;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(3042);
        this.mc.getTextureManager().bindTexture(Reference.inventoryTexture);
        this.drawTexturedModalRect(this.guiLeft + 112, this.guiTop, 0, 0, this.xSize - 112, this.ySize);
        GuiInventory.func_147046_a(this.guiLeft + 182, this.guiTop + 73, 30, this.guiLeft + 182 - this.xSizeFloat,
                this.guiTop + 16 - this.ySizeFloat, this.mc.thePlayer);
        this.mc.getTextureManager().bindTexture(new ResourceLocation("lootmod:textures/frame.png"));
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 10.0f);
        GL11.glEnable(3042);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 143, 0, 112, 166);
        this.drawTexturedModalRect(this.guiLeft + this.xSize, this.guiTop, 0, 0, 112, 166);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(3042);
        this.gpsX.drawTextBox();
        this.gpsZ.drawTextBox();
        GL11.glEnable(3042);
        this.drawCenteredString(this.fontRendererObj, "GPS (x, z)", this.width / 2 + 40, this.height / 2 - 39,
                14737632);
        this.mc.fontRenderer.drawString(
                "\u041b\u0443\u0442 \u043f\u043e\u0431\u043b\u0438\u0437\u043e\u0441\u0442\u0438", this.guiLeft + 8,
                this.guiTop + 4, 14737632);
        GL11.glEnable(3042);
        final int n5 = this.guiLeft + this.xSize - 2;
        int n6 = this.guiTop + 10;
        final EntityClientPlayerMP r = this.mc.thePlayer;
        for (final Map.Entry<String, IPlayerState> entry : CustomPlayerGui.playerState.entrySet()) {
            drawOutlinedRect(n5, n6, 112, 10, -1773647800);
            this.mc.fontRenderer.drawString(entry.getKey() + ": " + entry.getValue().status(r), n5 + 1,
                    n6 + 1, -1);
            if (mouseX >= n5 && mouseY >= n6 && mouseX <= n5 + 112 && mouseY <= n6 + 10
                    && CustomPlayerGui.tmp_list.isEmpty()) {
                entry.getValue().description(CustomPlayerGui.tmp_list, r);
            }
            n6 += 12;
        }
    }

    public void drawGuiContainerForegroundLayer(final int mouseX, final int mouseY) {
        GL11.glTranslatef(-58.0f, 0.0f, 0);
        GL11.glTranslatef(58.0f, 0.0f, .0f);
        if (this.stackInHand != null) {
            GL11.glTranslatef(0.0f, 0.0f, 64.0f);
            GL11.glTranslatef(-58.0f, 0.0f, .0f);
            this.drawItemStack(this.stackInHand.getEntityItem(), this.mouseX - 8, this.mouseY - 8, false);
            GL11.glTranslatef(0.0f, 0.0f, -64.0f);
        }
        GL11.glTranslatef(0.0f, 0.0f, 64.0f);
        final int localMouseX = this.mouseX - 6;
        final int localMouseY = this.mouseY - 14;
        this.hoverSlot = 6 * (localMouseY / 18) + localMouseX / 18;
        if (this.hoverSlot >= this.items.size() || this.hoverSlot < 0 || !this.isHover()) {
            this.hoverSlot = -999;
        }
        if (this.hoverSlot != -999) {
            GL11.glTranslatef(-58.0f, 0.0f, .0f);
            Gui.drawRect(this.hoverSlot % 6 * 18 + 6, this.hoverSlot / 6 * 18 + 14, this.hoverSlot % 6 * 18 + 24,
                    this.hoverSlot / 6 * 18 + 32, 1442840575);
        }
    }

    protected void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        gpsX.mouseClicked(mouseX, mouseY, mouseButton);
        gpsZ.mouseClicked(mouseX, mouseY, mouseButton);
        if (this.isHover()) {
            if (this.stackInHand != null) {
                this.stackInHand = null;
                this.updateList();
            } else {
                if (this.items.size() <= this.hoverSlot) {
                    return;
                }
                final boolean go = this.mc.thePlayer.inventory.getItemStack() == null;
                final int freeSlot = (this.hoverSlot != -999)
                        ? this.getFreeSlot(this.items.get(this.hoverSlot).getEntityItem())
                        : -999;
                if (Keyboard.isKeyDown(42) && freeSlot != -999) {
                    if (this.cooldown <= 0) {
                        NetworkWrapper.instance
                                .sendToServer(new TakePacket(
                                        this.items.get(this.hoverSlot).getEntityId(), freeSlot, true));
                        if (!this.mc.thePlayer.openContainer.getSlot(freeSlot).getHasStack()) {
                            this.ignoreItems.put(this.items.get(this.hoverSlot), 50);
                        }
                        Minecraft.getMinecraft().thePlayer.playSound("gui.button.press", 1.0f, 1.0f);
                        cooldown = 4;
                    }
                } else if (go) {
                    if (this.hoverSlot != -999) {
                        this.stackInHand = this.items.get(this.hoverSlot);
                        this.items.remove(this.hoverSlot);
                        this.updateList();
                        Minecraft.getMinecraft().thePlayer.playSound("gui.button.press", 1.0f, 1.0f);
                    }
                } else {
                    NetworkWrapper.instance.sendToServer(new PackageDropItem());
                }
            }
        }
    }

    public void updateScreen() {
        super.updateScreen();
        gpsX.updateCursorCounter();
        gpsZ.updateCursorCounter();
    }

    private int getFreeSlot(final ItemStack stack) {
        final CustomPlayerContainer container = (CustomPlayerContainer) this.inventorySlots;
        final int level = 3;
        for (int i = 36; i < 45; ++i) {
            if (container.getSlot(i).getStack() != null && container.getSlot(i).getStack().getItem() == stack.getItem()
                    && container.getSlot(i).getStack().stackSize != container.getSlot(i).getSlotStackLimit()
                    && container.getSlot(i).getStack().stackSize < container.getSlot(i).getStack().getMaxStackSize()
                    && container.getSlot(i).getStack().getItemDamage() == stack.getItemDamage()) {
                if (container.getSlot(i).getStack().getTagCompound() != null) {
                    if (!container.getSlot(i).getStack().getTagCompound().equals(stack.getTagCompound())) {
                        continue;
                    }
                } else if (stack.getTagCompound() != null) {
                    continue;
                }
                return i;
            }
        }
        for (int i = 36; i < 45; ++i) {
            if (!container.getSlot(i).getHasStack()) {
                return i;
            }
        }
        for (int i = 9; i <= 35; ++i) {
            if (i < 9 + level * 9) {
                if (container.getSlot(i).getStack() != null
                        && container.getSlot(i).getStack().getItem() == stack.getItem()
                        && container.getSlot(i).getStack().stackSize != container.getSlot(i).getSlotStackLimit()
                        && container.getSlot(i).getStack().stackSize < container.getSlot(i).getStack().getMaxStackSize()
                        && container.getSlot(i).getStack().getItemDamage() == stack.getItemDamage()) {
                    if (container.getSlot(i).getStack().getTagCompound() != null) {
                        if (!container.getSlot(i).getStack().getTagCompound().equals(stack.getTagCompound())) {
                            continue;
                        }
                    } else if (stack.getTagCompound() != null) {
                        continue;
                    }
                    return i;
                }
            }
        }
        for (int i = 9; i <= 35; ++i) {
            if (i < 9 + level * 9) {
                if (!container.getSlot(i).getHasStack()) {
                    return i;
                }
            }
        }
        return -999;
    }

    private boolean isHover() {
        return this.mouseX > 6 && this.mouseX < 114 && this.mouseY > 15 && this.mouseY < 159;
    }

    private void updateList() {
    }

    private void drawItemStack(final ItemStack stack, final int x, final int y, boolean left) {
        GL11.glTranslatef(0.0f, 0.0f, 32.0f);
        CustomPlayerGui.itemRender.zLevel = 200.0f;
        FontRenderer font = null;
        if (stack != null) {
            font = stack.getItem().getFontRenderer(stack);
        }
        if (font == null) {
            font = this.mc.fontRenderer;
        }
        RenderHelper.enableGUIStandardItemLighting();
        CustomPlayerGui.itemRender.renderItemAndEffectIntoGUI(font, this.mc.getTextureManager(), stack, x + 2, y);
        CustomPlayerGui.itemRender.renderItemOverlayIntoGUI(font, this.mc.getTextureManager(), stack, x + 2, y,
                null);
        GL11.glTranslatef(CustomPlayerGui.itemRender.zLevel = 0.0f, 0.0f, -32.0f);
    }

    public interface IPlayerState {
        String status(final EntityPlayer p0);

        void description(final List<String> p0, final EntityPlayer p1);
    }

    private class GuiTransparentButton extends GuiButton {
        private final String[] description;
        private final int backround_color;

        private GuiTransparentButton(final int n, final int mouseX, final int mouseY, final int n4, final int n5,
                                     final String s, final String... description) {
            super(n, mouseX, mouseY, n4, n5, s);
            this.backround_color = 4737096;
            this.description = description;
        }

        public boolean mousePressed(Minecraft p_146116_1_, int p_146116_2_, int p_146116_3_) {
            boolean pressed = this.enabled && this.visible && p_146116_2_ >= this.xPosition
                    && p_146116_3_ >= this.yPosition && p_146116_2_ < this.xPosition + this.width
                    && p_146116_3_ < this.yPosition + this.height;
            return pressed;
        }

        public void drawButton(final Minecraft Minecraft, final int n, final int mouseX) {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.enabled = (n >= this.xPosition && mouseX >= this.yPosition && n < this.xPosition + this.width
                    && mouseX < this.yPosition + this.height);
            drawOutlinedRect(this.xPosition, this.yPosition, this.width, this.height,
                    (this.enabled ? 192 : 100) << 24 | (this.backround_color & 0xFFFFFF));
            this.drawCenteredString(net.minecraft.client.Minecraft.getMinecraft().fontRenderer, this.displayString,
                    this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, 14737632);
            if (this.description != null && n >= this.xPosition && mouseX >= this.yPosition
                    && n <= this.xPosition + this.width && mouseX <= this.yPosition + this.height) {
                final String[] description = this.description;
                for (int length = description.length, i = 0; i < length; ++i) {
                    CustomPlayerGui.tmp_list.add(description[i]);
                }
            }
        }
    }
}
