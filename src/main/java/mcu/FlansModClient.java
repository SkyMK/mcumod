package com.flansmod.client;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;
import com.flansmod.mcu.EntityTraceFX;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.opengl.GL11;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FlansModClient extends FlansMod {

    public static boolean doneTutorial = false;
    public static boolean controlModeMouse = true;
    public static int controlModeSwitchTimer = 20;
    public static int shootTimeLeft;
    public static int shootTimeRight;
    public static float playerRecoilPitch;
    public static float playerRecoilYaw;
    public static float antiRecoilPitch;
    public static float antiRecoilYaw;
    public static HashMap gunAnimationsRight = new HashMap();
    public static HashMap gunAnimationsLeft = new HashMap();
    public static int scopeTime;
    public static IScope currentScope = null;
    public static float zoomProgress = 0.0F;
    public static float lastZoomProgress = 0.0F;
    public static float lastZoomLevel = 1.0F;
    public static float lastFOVZoomLevel = 1.0F;
    public static float originalMouseSensitivity = 0.5F;
    public static float recoilUp;
    public static float recoilSide;
    public static int recoilTicks;
    public static int recoilSwitch;
    public static boolean recoilLeft;
    public static float recoilDirection;
    public static float recoilDampen;
    public static List<EntityTraceFX> clientTracers = new LinkedList<EntityTraceFX>();
    public static float originalFOV = 90.0F;
    public static int originalThirdPerson = 0;
    public static boolean inPlane = false;
    public static int ticks;
    public static PacketTeamInfo teamInfo;
    public static int teamsScoreGUILock = 0;
    public static Minecraft minecraft = FMLClientHandler.instance().getClient();
    public static FlansModPlayerData clientPlayerData = new FlansModPlayerData();
    public static boolean bipod;

    public static int shootTime(boolean left) {
        return left ? shootTimeLeft : shootTimeRight;
    }

    public static void tick() {
        if (minecraft.thePlayer != null && minecraft.theWorld != null) {
            if (minecraft.thePlayer.ridingEntity instanceof IControllable && minecraft.currentScreen == null) {
                minecraft
                        .displayGuiScreen(new GuiDriveableController((IControllable) minecraft.thePlayer.ridingEntity));
            }

            if (teamInfo != null) {
                PacketTeamInfo var10000 = teamInfo;
                if (PacketTeamInfo.timeLeft > 0) {
                    var10000 = teamInfo;
                    --PacketTeamInfo.timeLeft;
                }
            }
            if (FlansModClient.clientPlayerData.shootTime > 0) {
                --FlansModClient.clientPlayerData.shootTime;
            }

            if (teamsScoreGUILock > 0) {
                --teamsScoreGUILock;
                if (minecraft.currentScreen == null) {
                    minecraft.displayGuiScreen(new GuiTeamScores());
                }
            }

            if (shootTimeLeft > 0) {
                --shootTimeLeft;
            }

            if (shootTimeRight > 0) {
                --shootTimeRight;
            }

            if (scopeTime > 0) {
                --scopeTime;
            }
            float f;
            if (recoilSwitch > 0 && ++recoilTicks > recoilSwitch) {
                recoilSwitch = 0;
                recoilTicks = 0;
                boolean bl = recoilLeft = !recoilLeft;
            }
            if (recoilLeft) {
                if (recoilDirection > -1.0f) {
                    float f2 = 0;
                    recoilDirection -= 0.05f;
                    if (f2 < -1.0f) {
                        recoilDirection = -1.0f;
                    }
                }
            } else if (recoilDirection < 1.0f) {
                float f3 = 0;
                recoilDirection += 0.05f;
                if (f3 > 1.0f) {
                    recoilDirection = 1.0f;
                }
            }
            if ((f = recoilUp - recoilDampen) != 0.0f) {
                if (Math.abs(f) > 0.01f) {
                    recoilDampen += f * 0.19999999f;
                    if (f < 0.0f) {
                        f *= 0.8f;
                    }
                    FlansModClient.minecraft.thePlayer.rotationPitch -= f * 0.14142136f;
                } else {
                    recoilDampen = recoilUp;
                }
            }
            FlansModClient.minecraft.thePlayer.rotationYaw += recoilSide * recoilDirection * 0.14142136f;
            if (recoilUp != 0.0f) {
                float f4 = 0;
                recoilUp *= 0.8f;
                if (f4 < 0.01f) {
                    recoilUp = 0.0f;
                }
            }
            if (recoilSide != 0.0f) {
                float f5 = 0;
                recoilSide *= 0.8f;
                if (f5 < 0.01f) {
                    recoilSide = 0.0f;
                }
            }
            Iterator itemInHand = gunAnimationsRight.values().iterator();

            GunAnimations itemstackInHand;
            while (itemInHand.hasNext()) {
                itemstackInHand = (GunAnimations) itemInHand.next();
                itemstackInHand.update();
            }

            itemInHand = gunAnimationsLeft.values().iterator();

            while (itemInHand.hasNext()) {
                itemstackInHand = (GunAnimations) itemInHand.next();
                itemstackInHand.update();
            }

            itemInHand = minecraft.theWorld.playerEntities.iterator();

            while (itemInHand.hasNext()) {
                Object var9 = itemInHand.next();
                EntityPlayer e = (EntityPlayer) var9;
                ItemStack currentItem = e.getCurrentEquippedItem();
                if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
                    if (e == minecraft.thePlayer && minecraft.gameSettings.thirdPersonView == 0) {
                        e.clearItemInUse();
                    } else if (currentItem.getItemUseAction() == EnumAction.bow
                            || currentItem.getItemUseAction() == EnumAction.block) {
                        e.setItemInUse(currentItem, 100);
                    }
                }
            }

            Item var8 = null;
            ItemStack var10 = minecraft.thePlayer.inventory.getCurrentItem();
            if (var10 != null) {
                var8 = var10.getItem();
            }

            if (currentScope != null && (var8 == null || !(var8 instanceof ItemGun)
                    || ((ItemGun) var8).type.getCurrentScope(var10) != currentScope)) {
                currentScope = null;
                minecraft.gameSettings.fovSetting = originalFOV;
                minecraft.gameSettings.mouseSensitivity = originalMouseSensitivity;
                minecraft.gameSettings.thirdPersonView = originalThirdPerson;
            }

            lastZoomProgress = zoomProgress;
            if (currentScope == null) {
                zoomProgress *= 0.66F;
            } else {
                zoomProgress = 1.0F - (1.0F - zoomProgress) * 0.66F;
            }

            if (minecraft.thePlayer.ridingEntity instanceof IControllable) {
                inPlane = true;

                try {
                    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer,
                            Float.valueOf(((IControllable) minecraft.thePlayer.ridingEntity).getPlayerRoll()),
                            "camRoll", "R", "field_78495_O");
                } catch (Exception var7) {
                    log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(var7);
                }

                if (minecraft.thePlayer.ridingEntity instanceof IControllable) {
                    try {
                        ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer,
                                Float.valueOf(((IControllable) minecraft.thePlayer.ridingEntity).getCameraDistance()),
                                "thirdPersonDistance", "E", "field_78490_B");
                    } catch (Exception var6) {
                        log("I forgot to update obfuscated reflection D:");
                        throw new RuntimeException(var6);
                    }
                }
            } else if (inPlane) {
                try {
                    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer,
                            Float.valueOf(0.0F), "camRoll", "R", "field_78495_O");
                } catch (Exception var5) {
                    log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(var5);
                }

                try {
                    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer,
                            Float.valueOf(4.0F), "thirdPersonDistance", "E", "field_78490_B");
                } catch (Exception var4) {
                    log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(var4);
                }

                inPlane = false;
            }

            if (controlModeSwitchTimer > 0) {
                --controlModeSwitchTimer;
            }

        }
    }

    public static void renderTick(float smoothing) {
        if (Math.abs(zoomProgress - lastZoomProgress) > 1.0E-4F) {
            float actualZoomProgress = lastZoomProgress + (zoomProgress - lastZoomProgress) * smoothing;
            float botchedZoomProgress = zoomProgress > 0.8F ? 1.0F : 0.0F;
            double zoomLevel = botchedZoomProgress * lastZoomLevel + (1.0F - botchedZoomProgress);
            float FOVZoomLevel = actualZoomProgress * lastFOVZoomLevel + (1.0F - actualZoomProgress);
            if (Math.abs(zoomLevel - 1.0D) < 0.009999999776482582D) {
                zoomLevel = 1.0D;
            }

            try {
                ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer,
                        Double.valueOf(zoomLevel), "cameraZoom", "af", "field_78503_V");
                minecraft.gameSettings.fovSetting = ((originalFOV * 40.0F + 70.0F) / FOVZoomLevel - 70.0F) / 40.0F;
            } catch (Exception var7) {
                log("I forgot to update obfuscated reflection D:");
                throw new RuntimeException(var7);
            }
        }

    }

    public static boolean flipControlMode() {
        if (controlModeSwitchTimer > 0) {
            return false;
        } else {
            controlModeMouse = !controlModeMouse;
            FMLClientHandler.instance().getClient()
                    .displayGuiScreen(controlModeMouse
                            ? new GuiDriveableController(
                            (IControllable) FMLClientHandler.instance().getClient().thePlayer.ridingEntity)
                            : null);
            controlModeSwitchTimer = 40;
            return true;
        }
    }

    public static void reloadModels(boolean reloadSkins) {
        Iterator var1 = InfoType.infoTypes.iterator();

        while (var1.hasNext()) {
            InfoType type = (InfoType) var1.next();
            type.reloadModel();
        }

        if (reloadSkins) {
            FlansMod.proxy.forceReload();
        }

    }

    public static Team getTeam(int spawnerTeamID) {
        return teamInfo == null ? null : teamInfo.getTeam(spawnerTeamID);
    }

    public static boolean isCurrentMap(String map) {
        boolean var1;
        if (teamInfo != null) {
            PacketTeamInfo var10000 = teamInfo;
            if (PacketTeamInfo.mapShortName != null) {
                var10000 = teamInfo;
                if (PacketTeamInfo.mapShortName.equals(map)) {
                    var1 = true;
                    return var1;
                }
            }
        }

        var1 = false;
        return var1;
    }

    @SideOnly(Side.CLIENT)
    public static EntityFX getParticle(String s, World w, double x, double y, double z) {
        Minecraft mc = Minecraft.getMinecraft();
        Object fx = null;
        if (s.equals("hugeexplosion")) {
            fx = new EntityHugeExplodeFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("largeexplode")) {
            fx = new EntityLargeExplodeFX(mc.renderEngine, w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("fireworksSpark")) {
            fx = new EntityFireworkSparkFX(w, x, y, z, 0.0D, 0.0D, 0.0D, mc.effectRenderer);
        } else if (s.equals("bubble")) {
            fx = new EntityBubbleFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("suspended")) {
            fx = new EntitySuspendFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("depthsuspend")) {
            fx = new EntityAuraFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("townaura")) {
            fx = new EntityAuraFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("crit")) {
            fx = new EntityCritFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("magicCrit")) {
            fx = new EntityCritFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
            ((EntityFX) fx).setRBGColorF(((EntityFX) fx).getRedColorF() * 0.3F, ((EntityFX) fx).getGreenColorF() * 0.8F,
                    ((EntityFX) fx).getBlueColorF());
            ((EntityFX) fx).nextTextureIndexX();
        } else if (s.equals("smoke")) {
            fx = new EntitySmokeFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("mobSpell")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
            ((EntityFX) fx).setRBGColorF(0.0F, 0.0F, 0.0F);
        } else if (s.equals("mobSpellAmbient")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
            ((EntityFX) fx).setAlphaF(0.15F);
            ((EntityFX) fx).setRBGColorF(0.0F, 0.0F, 0.0F);
        } else if (s.equals("spell")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("instantSpell")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
            ((EntitySpellParticleFX) fx).setBaseSpellTextureIndex(144);
        } else if (s.equals("witchMagic")) {
            fx = new EntitySmokeFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
            ((EntitySpellParticleFX) fx).setBaseSpellTextureIndex(144);
            float k = w.rand.nextFloat() * 0.5F + 0.35F;
            ((EntityFX) fx).setRBGColorF(1.0F * k, 0.0F * k, 1.0F * k);
        } else if (s.equals("note")) {
            fx = new EntityNoteFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("portal")) {
            fx = new EntityPortalFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("enchantmenttable")) {
            fx = new EntityEnchantmentTableParticleFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("explode")) {
            fx = new EntityExplodeFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("flame")) {
            fx = new EntityFlameFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("lava")) {
            fx = new EntityLavaFX(w, x, y, z);
        } else if (s.equals("footstep")) {
            fx = new EntityFootStepFX(mc.renderEngine, w, x, y, z);
        } else if (s.equals("splash")) {
            fx = new EntitySplashFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("wake")) {
            fx = new EntityFishWakeFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("largesmoke")) {
            fx = new EntitySmokeFX(w, x, y, z, 0.0D, 0.0D, 0.0D, 2.5F);
        } else if (s.equals("cloud")) {
            fx = new EntityCloudFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("reddust")) {
            fx = new EntityReddustFX(w, x, y, z, 0.0F, 0.0F, 0.0F);
        } else if (s.equals("snowballpoof")) {
            fx = new EntityBreakingFX(w, x, y, z, Items.snowball);
        } else if (s.equals("dripWater")) {
            fx = new EntityDropParticleFX(w, x, y, z, Material.water);
        } else if (s.equals("dripLava")) {
            fx = new EntityDropParticleFX(w, x, y, z, Material.lava);
        } else if (s.equals("snowshovel")) {
            fx = new EntitySnowShovelFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("slime")) {
            fx = new EntityBreakingFX(w, x, y, z, Items.slime_ball);
        } else if (s.equals("heart")) {
            fx = new EntityHeartFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("angryVillager")) {
            fx = new EntityHeartFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
            ((EntityFX) fx).setParticleTextureIndex(81);
            ((EntityFX) fx).setRBGColorF(1.0F, 1.0F, 1.0F);
        } else if (s.equals("happyVillager")) {
            fx = new EntityAuraFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
            ((EntityFX) fx).setParticleTextureIndex(82);
            ((EntityFX) fx).setRBGColorF(1.0F, 1.0F, 1.0F);
        } else if (s.equals("snowshovel")) {
            fx = new EntitySnowShovelFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("snowshovel")) {
            fx = new EntitySnowShovelFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else if (s.equals("snowshovel")) {
            fx = new EntitySnowShovelFX(w, x, y, z, 0.0D, 0.0D, 0.0D);
        } else {
            String[] astring;
            int k1;
            if (s.startsWith("iconcrack_")) {
                astring = s.split("_", 3);
                int block = Integer.parseInt(astring[1]);
                if (astring.length > 2) {
                    k1 = Integer.parseInt(astring[2]);
                    fx = new EntityBreakingFX(w, x, y, z, 0.0D, 0.0D, 0.0D, Item.getItemById(block), k1);
                } else {
                    fx = new EntityBreakingFX(w, x, y, z, 0.0D, 0.0D, 0.0D, Item.getItemById(block), 0);
                }
            } else {
                Block block1;
                if (s.startsWith("blockcrack_")) {
                    astring = s.split("_", 3);
                    block1 = Block.getBlockById(Integer.parseInt(astring[1]));
                    k1 = Integer.parseInt(astring[2]);
                    fx = (new EntityDiggingFX(w, x, y, z, 0.0D, 0.0D, 0.0D, block1, k1)).applyRenderColor(k1);
                } else if (s.startsWith("blockdust_")) {
                    astring = s.split("_", 3);
                    block1 = Block.getBlockById(Integer.parseInt(astring[1]));
                    k1 = Integer.parseInt(astring[2]);
                    fx = (new EntityBlockDustFX(w, x, y, z, 0.0D, 0.0D, 0.0D, block1, k1)).applyRenderColor(k1);
                }
            }
        }

        if (mc.gameSettings.fancyGraphics) {
            ((Entity) fx).renderDistanceWeight = 200.0D;
        }

        if (fx != null) {
            mc.effectRenderer.addEffect((EntityFX) fx);
        }

        return (EntityFX) fx;
    }

    public static GunAnimations getGunAnimations(EntityLivingBase living, boolean offHand) {
        GunAnimations animations = null;
        if (offHand) {
            if (gunAnimationsLeft.containsKey(living)) {
                animations = (GunAnimations) gunAnimationsLeft.get(living);
            } else {
                animations = new GunAnimations();
                gunAnimationsLeft.put(living, animations);
            }
        } else if (gunAnimationsRight.containsKey(living)) {
            animations = (GunAnimations) gunAnimationsRight.get(living);
        } else {
            animations = new GunAnimations();
            gunAnimationsRight.put(living, animations);
        }

        return animations;
    }

    public void load() {
        log("Loading Flan's mod client side.");
        MinecraftForge.EVENT_BUS.register(this);
    }

    private float interpolateRotation(float x, float y, float dT) {
        float f3;
        for (f3 = y - x; f3 < -180.0F; f3 += 360.0F) {
        }

        while (f3 >= 180.0F) {
            f3 -= 360.0F;
        }

        return x + dT * f3;
    }

    @SubscribeEvent
    public void chatMessage(ClientChatReceivedEvent event) {
        if (event.message.getUnformattedText().equals("#flansmod")) {
            event.setCanceled(true);
        }

    }

    private boolean checkFileExists(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception var3) {
                FlansMod.log("Failed to create file");
                FlansMod.log(file.getAbsolutePath());
            }

            return false;
        } else {
            return true;
        }
    }

    @SubscribeEvent
    public void $(RenderWorldLastEvent renderWorldLastEvent) {
        EntityClientPlayerMP entityClientPlayerMP = Minecraft.getMinecraft().thePlayer;
        if (entityClientPlayerMP != null) {
            float f = entityClientPlayerMP.rotationYaw;
            float f2 = zoomProgress;
            float f3 = 1.0f - f2;
            entityClientPlayerMP.prevRenderArmYaw *= f3;
            entityClientPlayerMP.prevRenderArmYaw += f * f2;
            entityClientPlayerMP.renderArmYaw *= f3;
            entityClientPlayerMP.renderArmYaw += f * f2;
            f = entityClientPlayerMP.rotationPitch;
            f2 = zoomProgress;
            f3 = 1.0f - f2;
            entityClientPlayerMP.prevRenderArmPitch *= f3;
            entityClientPlayerMP.prevRenderArmPitch += f * f2;
            entityClientPlayerMP.renderArmPitch *= f3;
            entityClientPlayerMP.renderArmPitch += f * f2;
        }
        if (clientTracers.isEmpty()) {
            return;
        }
        GL11.glColor4f(1.0f, 1.0f, 0.0f, 1.0f);
        GL11.glEnable(32826);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0f, 240.0f);
        GL11.glDisable(3553);
        GL11.glPushMatrix();
        GL11.glTranslatef((float) (-RenderManager.renderPosX), (float) (-RenderManager.renderPosY),
                (float) (-RenderManager.renderPosZ));
        GL11.glPushAttrib(11063);
        GL11.glDisable(2884);
        GL11.glLineWidth(1.0f);
        GL11.glPointSize(2.0f);
        Iterator<EntityTraceFX> iterator = clientTracers.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().renderParticleAndDelete(renderWorldLastEvent.partialTicks))
                continue;
            iterator.remove();
        }
        GL11.glPopAttrib();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
    }

}
