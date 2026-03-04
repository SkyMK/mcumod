package mcu.client;

import api.player.model.ModelPlayerAPI;
import api.player.render.RenderPlayerAPI;
import com.flansmod.mcu.CrosshairRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import mcu.CommonProxy;
import mcu.client.gui.house.GuiHouse;
import mcu.client.gui.utils.CustomFontRenderer;
import mcu.client.hud.DayZHud;
import mcu.client.render.MovementModel;
import mcu.client.render.MovementRender;
import mcu.client.render.RenderCorpse;
import mcu.client.render.RenderHouse;
import mcu.entity.EntityCorpse;
import mcu.entity.EntityHouse;
import mcu.utils.SidedProtection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.HashMap;

public class ClientProxy extends CommonProxy {

    private static final HashMap<String, Integer> hash = new HashMap<String, Integer>();
    public static KeyBinding gunUnload = new KeyBinding("Gun Unload", Keyboard.KEY_GRAVE, "MCUBinds");
    public static KeyBinding openGuiKey = new KeyBinding("Gun Mod Key", Keyboard.KEY_U, "MCUBinds");
    public static KeyBinding interact = new KeyBinding("Interact", Keyboard.KEY_F, "MCUBinds");
    public static KeyBinding f5 = new KeyBinding("Shop", Keyboard.KEY_F5, "MCUBinds");
    public static KeyBinding climb = new KeyBinding("Climb", Keyboard.KEY_Z, "MCUBinds");
    public static KeyBinding chest = new KeyBinding("Chest", Keyboard.KEY_U, "MCUBinds");
    public static KeyBinding mcu_menu = new KeyBinding("MCU Menu", Keyboard.KEY_M, "MCUBinds");

    public static int getRenderPart(String model, String partName) {
        if (hash.containsKey(model + "_" + partName))
            return hash.get(model + "_" + partName);

        int displayList = GLAllocation.generateDisplayLists(1);
        GL11.glNewList(displayList, GL11.GL_COMPILE);
        AdvancedModelLoader.loadModel(new ResourceLocation("mcuniversal", "models/items/owner.obj"))
                .renderPart(partName);
        GL11.glEndList();
        hash.put(model + "_" + partName, displayList);
        return displayList;
    }

    private static GuiScreen getGui(final int id, final EntityPlayer player, final Entity entity, NBTTagCompound nbt) {
        switch (id) {
            case 0:
                if (!(entity instanceof EntityHouse))
                    return null;
                return new GuiHouse(player, (EntityHouse) entity, nbt);
            default:
                return null;
        }
    }

    public void preInit() {
        super.preInit();
    }

    public void init() {
        if (!SidedProtection.CLIENT)
            return;
        ClientRegistry.registerKeyBinding(gunUnload);
        ClientRegistry.registerKeyBinding(openGuiKey);
        ClientRegistry.registerKeyBinding(interact);
        ClientRegistry.registerKeyBinding(f5);
        ClientRegistry.registerKeyBinding(climb);
        ClientRegistry.registerKeyBinding(chest);
        ClientRegistry.registerKeyBinding(mcu_menu);
        ModelPlayerAPI.register("mcumovement", MovementModel.class);
        RenderPlayerAPI.register("mcumovement", MovementRender.class);
        LanguageRegistry.instance().addStringLocalization("Climb", "Crawl");
        LanguageRegistry.instance().addStringLocalization("Climb", "ru_RU", "\u041b\u0435\u0447\u044c");
        renderModels();
        Display.setTitle("MCU DayZ Client");
        FMLCommonHandler.instance().bus().register(new ClientEventHandler());
        FMLCommonHandler.instance().bus().register(new DayZHud());
        MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
        MinecraftForge.EVENT_BUS.register(new DayZHud());
        FMLCommonHandler.instance().bus().register(new CrosshairRenderer());
        MinecraftForge.EVENT_BUS.register(new CrosshairRenderer());
        RenderingRegistry.registerEntityRenderingHandler(EntityCorpse.class, new RenderCorpse());
        RenderingRegistry.registerEntityRenderingHandler(EntityHouse.class, new RenderHouse());
        DayZHud.color = DayZHud.loadUiColor();
        FMLCommonHandler.instance().bus().register(new CustomFontRenderer());
        CustomFontRenderer.registerColors();
        CustomFontRenderer.strings.add("о");
        CustomFontRenderer.strings.add("o");
        CustomFontRenderer.strings.add("е");
        CustomFontRenderer.strings.add("e");
        CustomFontRenderer.strings.add("с");
        CustomFontRenderer.strings.add("c");
        ArrayList<String> newArrayList = new ArrayList<String>();
        for (String s : CustomFontRenderer.strings) {
            newArrayList.add(s.toUpperCase());
        }
        CustomFontRenderer.strings.addAll(newArrayList);
        super.init();
    }

    public void renderModels() {
        for (int i = 1; i <= 1; i++) {
            String model = "";
            switch (i) {
                case (1):
                    model = "customArmorModel";
                    break;
                default:
                    break;
            }

            for (int j = 1; j <= 8; j++) {
                String part = "";
                switch (j) {
                    case (1):
                        part = "head";
                        break;
                    case (2):
                        part = "body";
                        break;
                    case (3):
                        part = "bodyHandLeft";
                        break;
                    case (4):
                        part = "bodyHandRight";
                        break;
                    case (5):
                        part = "legLeft";
                        break;
                    case (6):
                        part = "legRight";
                        break;
                    case (7):
                        part = "bootLeft";
                        break;
                    case (8):
                        part = "bootRight";
                        break;
                    default:
                        break;
                }

                GL11.glCallList(ClientProxy.getRenderPart(model, part));
            }
        }
    }

    public void openGuiHouse(byte id, EntityPlayer player, Entity entity, NBTTagCompound nbt) {
        if (player instanceof EntityPlayerMP)
            super.openGuiHouse(id, player, entity, nbt);
        else if (FMLCommonHandler.instance().getSide().equals(Side.CLIENT)) {
            GuiScreen gui = getGui(id, player, entity, nbt);
            if (gui == null)
                return;
            Minecraft.getMinecraft().displayGuiScreen(gui);
        }
    }
}