package mcu.client.gui.house;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.DayZ;
import mcu.entity.EntityHouse;
import mcu.network.PacketHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

@SideOnly(Side.CLIENT)
public class GuiHouse extends GuiContainer {

    private static final ResourceLocation texture = new ResourceLocation("textures/gui/container/generic_54.png");
    private final EntityHouse house;
    private final NBTTagCompound nbt;
    private ScaledResolution sr;

    public GuiHouse(EntityPlayer player, EntityHouse entity, NBTTagCompound nbt) {
        super(new ContainerHouse(player, entity, nbt));
        this.house = entity;
        this.nbt = nbt;
        xSize = 180;
        ySize = 222;
    }

    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(Integer.MAX_VALUE, width - 100, height - 20, 100, 20,
                this.house.isStoveEnabled()
                        ? "\u041f\u043e\u0433\u0430\u0441\u0438\u0442\u044c \u043f\u0435\u0447\u044c"
                        : "\u0417\u0430\u0436\u0435\u0447\u044c \u043f\u0435\u0447\u044c"));
    }

    @Override
    protected void actionPerformed(GuiButton b) {
        if (b.id == Integer.MAX_VALUE) {
            DayZ.network.sendToServer(
                    DayZ.network.createPacket(PacketHandler.STOVE_CHANGE, !this.house.isStoveEnabled()));
        }
        if (b instanceof SpawnVehiclesButton) {
            SpawnVehiclesButton button = (SpawnVehiclesButton) b;
            int cur = button.id - 1;
            DayZ.network.sendToServer(
                    DayZ.network.createPacket(PacketHandler.TAKE_VEHICLE, cur, house.getEntityId()));
        }
        if (b instanceof OtherVehiclesButton) {
            OtherVehiclesButton button = (OtherVehiclesButton) b;
            DayZ.network.sendToServer(
                    DayZ.network.createPacket(PacketHandler.SAVE_VEHICLE, button.id, house.getEntityId()));
        }
    }

    public void updateScreen() {
        int i = 0;
        ((GuiButton) this.buttonList.get(0)).displayString = Minecraft.getMinecraft().thePlayer.ridingEntity != null
                ? this.house.isStoveEnabled()
                ? "\u041f\u043e\u0433\u0430\u0441\u0438\u0442\u044c \u043f\u0435\u0447\u044c"
                : "\u0417\u0430\u0436\u0435\u0447\u044c \u043f\u0435\u0447\u044c"
                : "Сядь в дом";
        ((GuiButton) this.buttonList.get(0)).enabled = Minecraft.getMinecraft().thePlayer.ridingEntity != null;
        this.buttonList.removeIf(w -> w instanceof SpawnVehiclesButton || w instanceof OtherVehiclesButton);
        for (String s : house.listVehicles()) {
            i++;
            this.buttonList.add(new SpawnVehiclesButton(0, 2, (i * 20) - 10, s, i));
        }
        int i2 = 0;
        for (Entity e : (ArrayList<Entity>) Minecraft.getMinecraft().theWorld.loadedEntityList) {
            /*
             * if (Minecraft.getMinecraft().thePlayer.getDistanceToEntity(e) < 32 &&
             * Vehicle.isVehicle(e) && !e.isDead) { i2++; if (i2 < 4)
             * this.buttonList.add(new OtherVehiclesButton(i2, width - 100, (i2 * 20) - 10,
             * Vehicle.getName(e), e.getEntityId())); }
             */
        }
        super.updateScreen();
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        long value = Long.valueOf(nbt.getString("HouseTime"));
        long seconds = (value / 20);
        int minutes = (int) (seconds / 60);
        int hours = minutes / 60;
        int days = 0;
        int month = 0;
        int years = 0;
        while (hours > 24) {
            hours = hours - 24;
            days++;
        }
        while (days > 30) {
            days = days - 30;
            month++;
        }
        while (month > 12) {
            month = month - 12;
            years++;
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Дом на ");
        if (years != 0)
            builder.append(years + " г ");
        if (month != 0)
            builder.append(month + " м ");
        if (days != 0)
            builder.append(days + " д ");
        if (hours != 0)
            builder.append(hours + " ч");
        fontRendererObj.drawString(builder.toString(), 8, 6, 4210752);
        fontRendererObj.drawString("Инвентарь", 8, ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float parTick, int mouseX, int mouseY) {
        this.sr = new ScaledResolution(super.mc, super.mc.displayWidth, super.mc.displayHeight);
        int wight = this.sr.getScaledWidth() / 2;
        int height = this.sr.getScaledHeight() / 2;
        fontRendererObj.drawString("Сохранённый транспорт", 1, 1, 0xFFFFFF);
        fontRendererObj.drawString("Транспорт около дома",
                width - fontRendererObj.getStringWidth("Транспорт около дома"), 1, 0xFFFFFF);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, 6 * 18 + 17);
        drawTexturedModalRect(guiLeft, guiTop + 6 * 18 + 17, 0, 126, xSize, 96);
    }

    public class SpawnVehiclesButton extends GuiButton {
        public int id;

        public SpawnVehiclesButton(int p_i1020_1_, int p_i1020_2_, int p_i1020_3_, String p_i1020_4_, int id) {
            super(p_i1020_1_, p_i1020_2_, p_i1020_3_, 100, 20, p_i1020_4_);
            this.id = id;
        }
    }

    public class OtherVehiclesButton extends GuiButton {
        public int id;

        public OtherVehiclesButton(int p_i1020_1_, int p_i1020_2_, int p_i1020_3_, String p_i1020_4_, int id) {
            super(p_i1020_1_, p_i1020_2_, p_i1020_3_, 100, 20, p_i1020_4_);
            this.id = id;
        }
    }
}
