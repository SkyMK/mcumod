package com.flansmod.client;

import com.flansmod.client.debug.*;
import com.flansmod.client.gui.*;
import com.flansmod.client.model.*;
import com.flansmod.common.CommonProxy;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.*;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.*;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.network.*;
import com.flansmod.common.teams.*;
import com.flansmod.common.tools.EntityParachute;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLModContainer;
import cpw.mods.fml.common.MetadataCollection;
import cpw.mods.fml.common.discovery.ContainerType;
import cpw.mods.fml.common.discovery.ModCandidate;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.*;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ClientProxy extends CommonProxy {

    public static String modelDir = "com.flansmod.client.model.";
    public static RenderGun gunRenderer;
    public static RenderGrenade grenadeRenderer;
    public static RenderPlane planeRenderer;
    public static RenderVehicle vehicleRenderer;
    public static RenderMecha mechaRenderer;
    public List contentPacks;

    private static EntityFX doSpawnParticle(String p_72726_1_, double p_72726_2_, double p_72726_4_, double p_72726_6_,
                                            double p_72726_8_, double p_72726_10_, double p_72726_12_) {
        Minecraft mc = Minecraft.getMinecraft();
        World theWorld = mc.theWorld;
        if (mc != null && mc.renderViewEntity != null && mc.effectRenderer != null) {
            int i = mc.gameSettings.particleSetting;
            if (i == 1 && theWorld.rand.nextInt(3) == 0) {
                i = 2;
            }

            double d6 = mc.renderViewEntity.posX - p_72726_2_;
            double d7 = mc.renderViewEntity.posY - p_72726_4_;
            double d8 = mc.renderViewEntity.posZ - p_72726_6_;
            EntityFX entityfx = null;
            if (p_72726_1_.equals("hugeexplosion")) {
                mc.effectRenderer.addEffect(entityfx = new EntityHugeExplodeFX(theWorld, p_72726_2_,
                        p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_));
            } else if (p_72726_1_.equals("largeexplode")) {
                mc.effectRenderer.addEffect(entityfx = new EntityLargeExplodeFX(mc.renderEngine, theWorld,
                        p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_));
            } else if (p_72726_1_.equals("fireworksSpark")) {
                mc.effectRenderer.addEffect(entityfx = new EntityFireworkSparkFX(theWorld, p_72726_2_,
                        p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, mc.effectRenderer));
            }

            if (entityfx != null) {
                return entityfx;
            } else {
                double d9 = 160.0D;
                if (d6 * d6 + d7 * d7 + d8 * d8 > d9 * d9) {
                    return null;
                } else if (i > 1) {
                    return null;
                } else {
                    if (p_72726_1_.equals("flansmod.flare")) {
                        entityfx = new EntityFlare(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    }

                    if (p_72726_1_.equals("bubble")) {
                        entityfx = new EntityBubbleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("suspended")) {
                        entityfx = new EntitySuspendFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("depthsuspend")) {
                        entityfx = new EntityAuraFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("townaura")) {
                        entityfx = new EntityAuraFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("crit")) {
                        entityfx = new EntityCritFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("magicCrit")) {
                        entityfx = new EntityCritFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                        entityfx.setRBGColorF(entityfx.getRedColorF() * 0.3F,
                                entityfx.getGreenColorF() * 0.8F, entityfx.getBlueColorF());
                        entityfx.nextTextureIndexX();
                    } else if (p_72726_1_.equals("smoke")) {
                        entityfx = new EntitySmokeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("mobSpell")) {
                        entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, 0.0D, 0.0D,
                                0.0D);
                        entityfx.setRBGColorF((float) p_72726_8_, (float) p_72726_10_,
                                (float) p_72726_12_);
                    } else if (p_72726_1_.equals("mobSpellAmbient")) {
                        entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, 0.0D, 0.0D,
                                0.0D);
                        entityfx.setAlphaF(0.15F);
                        entityfx.setRBGColorF((float) p_72726_8_, (float) p_72726_10_,
                                (float) p_72726_12_);
                    } else if (p_72726_1_.equals("spell")) {
                        entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("instantSpell")) {
                        entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                        ((EntitySpellParticleFX) entityfx).setBaseSpellTextureIndex(144);
                    } else if (p_72726_1_.equals("witchMagic")) {
                        entityfx = new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                        ((EntitySpellParticleFX) entityfx).setBaseSpellTextureIndex(144);
                        float f = theWorld.rand.nextFloat() * 0.5F + 0.35F;
                        entityfx.setRBGColorF(1.0F * f, 0.0F * f, 1.0F * f);
                    } else if (p_72726_1_.equals("note")) {
                        entityfx = new EntityNoteFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("portal")) {
                        entityfx = new EntityPortalFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("enchantmenttable")) {
                        entityfx = new EntityEnchantmentTableParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_,
                                p_72726_8_, p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("explode")) {
                        entityfx = new EntityExplodeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("flame")) {
                        entityfx = new EntityFlameFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("lava")) {
                        entityfx = new EntityLavaFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_);
                    } else if (p_72726_1_.equals("footstep")) {
                        entityfx = new EntityFootStepFX(mc.renderEngine, theWorld, p_72726_2_, p_72726_4_, p_72726_6_);
                    } else if (p_72726_1_.equals("splash")) {
                        entityfx = new EntitySplashFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("wake")) {
                        entityfx = new EntityFishWakeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("largesmoke")) {
                        entityfx = new EntitySmokeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_, 2.5F);
                    } else if (p_72726_1_.equals("cloud")) {
                        entityfx = new EntityCloudFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("reddust")) {
                        entityfx = new EntityReddustFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, (float) p_72726_8_,
                                (float) p_72726_10_, (float) p_72726_12_);
                    } else if (p_72726_1_.equals("snowballpoof")) {
                        entityfx = new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Items.snowball);
                    } else if (p_72726_1_.equals("dripWater")) {
                        entityfx = new EntityDropParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_,
                                Material.water);
                    } else if (p_72726_1_.equals("dripLava")) {
                        entityfx = new EntityDropParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_,
                                Material.lava);
                    } else if (p_72726_1_.equals("snowshovel")) {
                        entityfx = new EntitySnowShovelFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("slime")) {
                        entityfx = new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Items.slime_ball);
                    } else if (p_72726_1_.equals("heart")) {
                        entityfx = new EntityHeartFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                    } else if (p_72726_1_.equals("angryVillager")) {
                        entityfx = new EntityHeartFX(theWorld, p_72726_2_, p_72726_4_ + 0.5D, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                        entityfx.setParticleTextureIndex(81);
                        entityfx.setRBGColorF(1.0F, 1.0F, 1.0F);
                    } else if (p_72726_1_.equals("happyVillager")) {
                        entityfx = new EntityAuraFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_,
                                p_72726_10_, p_72726_12_);
                        entityfx.setParticleTextureIndex(82);
                        entityfx.setRBGColorF(1.0F, 1.0F, 1.0F);
                    } else {
                        String[] astring;
                        int k;
                        if (p_72726_1_.startsWith("iconcrack_")) {
                            astring = p_72726_1_.split("_", 3);
                            int j = Integer.parseInt(astring[1]);
                            if (astring.length > 2) {
                                k = Integer.parseInt(astring[2]);
                                entityfx = new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_,
                                        p_72726_8_, p_72726_10_, p_72726_12_, Item.getItemById(j), k);
                            } else {
                                entityfx = new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_,
                                        p_72726_8_, p_72726_10_, p_72726_12_, Item.getItemById(j), 0);
                            }
                        } else {
                            Block block;
                            if (p_72726_1_.startsWith("blockcrack_")) {
                                astring = p_72726_1_.split("_", 3);
                                block = Block.getBlockById(Integer.parseInt(astring[1]));
                                k = Integer.parseInt(astring[2]);
                                entityfx = (new EntityDiggingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_,
                                        p_72726_8_, p_72726_10_, p_72726_12_, block, k)).applyRenderColor(k);
                            } else if (p_72726_1_.startsWith("blockdust_")) {
                                astring = p_72726_1_.split("_", 3);
                                block = Block.getBlockById(Integer.parseInt(astring[1]));
                                k = Integer.parseInt(astring[2]);
                                entityfx = (new EntityBlockDustFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_,
                                        p_72726_8_, p_72726_10_, p_72726_12_, block, k)).applyRenderColor(k);
                            }
                        }
                    }

                    if (entityfx != null) {
                        mc.effectRenderer.addEffect(entityfx);
                    }

                    return entityfx;
                }
            }
        } else {
            return null;
        }
    }

    public void load() {
        (new FlansModClient()).load();
        gunRenderer = new RenderGun();
        grenadeRenderer = new RenderGrenade();
        planeRenderer = new RenderPlane();
        vehicleRenderer = new RenderVehicle();
        mechaRenderer = new RenderMecha();
        Iterator var1 = GunType.guns.values().iterator();

        while (var1.hasNext()) {
            GunType mechaType = (GunType) var1.next();
            MinecraftForgeClient.registerItemRenderer(mechaType.item, gunRenderer);
        }

        var1 = GrenadeType.grenades.iterator();

        while (var1.hasNext()) {
            GrenadeType mechaType1 = (GrenadeType) var1.next();
            MinecraftForgeClient.registerItemRenderer(mechaType1.item, grenadeRenderer);
        }

        var1 = PlaneType.types.iterator();

        while (var1.hasNext()) {
            PlaneType mechaType2 = (PlaneType) var1.next();
            MinecraftForgeClient.registerItemRenderer(mechaType2.item, planeRenderer);
        }

        var1 = VehicleType.types.iterator();

        while (var1.hasNext()) {
            VehicleType mechaType3 = (VehicleType) var1.next();
            MinecraftForgeClient.registerItemRenderer(mechaType3.item, vehicleRenderer);
        }

        var1 = MechaType.types.iterator();

        while (var1.hasNext()) {
            MechaType mechaType4 = (MechaType) var1.next();
            MinecraftForgeClient.registerItemRenderer(mechaType4.item, mechaRenderer);
        }

        FMLCommonHandler.instance().bus().register(new KeyInputHandler());
        new TickHandlerClient();
    }

    public void forceReload() {
        Minecraft.getMinecraft().refreshResources();
    }

    public List getContentList(Method method, ClassLoader classloader) {
        this.contentPacks = new ArrayList();
        File[] var3 = FlansMod.flanDir.listFiles();
        int var4 = var3.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            File file = var3[var5];
            if (file.isDirectory() || CommonProxy.zipJar.matcher(file.getName()).matches()) {
                try {
                    method.invoke(classloader, file.toURI().toURL());
                    HashMap e = new HashMap();
                    e.put("modid", "FlansMod");
                    e.put("name", "Flan's Mod : " + file.getName());
                    e.put("version", "1");
                    FMLModContainer container = new FMLModContainer("com.flansmod.common.FlansMod",
                            new ModCandidate(file, file, file.isDirectory() ? ContainerType.DIR : ContainerType.JAR),
                            e);
                    container.bindMetadata(MetadataCollection.from(null, ""));
                    FMLClientHandler.instance().addModAsResource(container);
                } catch (Exception var9) {
                    FlansMod.log("Failed to load images for content pack : " + file.getName());
                    var9.printStackTrace();
                }

                FlansMod.log("Loaded content pack : " + file.getName());
                this.contentPacks.add(file);
            }
        }

        FlansMod.log("Loaded textures and models.");
        return this.contentPacks;
    }

    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
        RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderGrenade());
        RenderingRegistry.registerEntityRenderingHandler(EntityPlane.class, new RenderPlane());
        RenderingRegistry.registerEntityRenderingHandler(EntityVehicle.class, new RenderVehicle());
        RenderingRegistry.registerEntityRenderingHandler(EntityAAGun.class, new RenderAAGun());
        RenderingRegistry.registerEntityRenderingHandler(EntityFlagpole.class, new RenderFlagpole());
        RenderingRegistry.registerEntityRenderingHandler(EntityFlag.class, new RenderFlag());
        RenderingRegistry.registerEntityRenderingHandler(EntitySeat.class, new RenderNull());
        RenderingRegistry.registerEntityRenderingHandler(EntityWheel.class, new RenderNull());
        RenderingRegistry.registerEntityRenderingHandler(EntityMG.class, new RenderMG());
        RenderingRegistry.registerEntityRenderingHandler(EntityParachute.class, new RenderParachute());
        RenderingRegistry.registerEntityRenderingHandler(EntityDebugDot.class, new RenderDebugDot());
        RenderingRegistry.registerEntityRenderingHandler(EntityDebugVector.class, new RenderDebugVector());
        RenderingRegistry.registerEntityRenderingHandler(EntityDebugAABB.class, new RenderDebugAABB());
        RenderingRegistry.registerEntityRenderingHandler(EntityMecha.class, new RenderMecha());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpawner.class, new TileEntitySpawnerRenderer());
    }

    public void doTutorialStuff(EntityPlayer player, EntityDriveable entityType) {

    }

    public void changeControlMode(EntityPlayer player) {
        if (FlansModClient.flipControlMode()) {
            player.addChatComponentMessage(
                    new ChatComponentText("Mouse Control mode is now set to " + FlansModClient.controlModeMouse));
        }

    }

    public boolean mouseControlEnabled() {
        return FlansModClient.controlModeMouse;
    }

    public Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if ((ID >= 6 && ID <= 10 || ID == 12) && player.ridingEntity == null) {
            return null;
        } else {
            switch (ID) {
                case 0:
                    return new GuiDriveableCrafting(player.inventory, world, x, y, z);
                case 1:
                    return new GuiDriveableRepair(player);
                case 2:
                    return new GuiGunModTable(player.inventory, world);
                case 3:
                case 4:
                default:
                    return null;
                case 5:
                    return new GuiGunBox(player.inventory, ((BlockGunBox) world.getBlock(x, y, z)).type);
                case 6:
                    return new GuiDriveableInventory(player.inventory, world, ((EntitySeat) player.ridingEntity).driveable,
                            0);
                case 7:
                    return new GuiDriveableInventory(player.inventory, world, ((EntitySeat) player.ridingEntity).driveable,
                            1);
                case 8:
                    return new GuiDriveableFuel(player.inventory, world, ((EntitySeat) player.ridingEntity).driveable);
                case 9:
                    return new GuiDriveableInventory(player.inventory, world, ((EntitySeat) player.ridingEntity).driveable,
                            2);
                case 10:
                    return new GuiMechaInventory(player.inventory, world,
                            (EntityMecha) ((EntitySeat) player.ridingEntity).driveable);
                case 11:
                    return new GuiArmourBox(player.inventory, ((BlockArmourBox) world.getBlock(x, y, z)).type);
                case 12:
                    return new GuiDriveableInventory(player.inventory, world, ((EntitySeat) player.ridingEntity).driveable,
                            3);
            }
        }
    }

    public void openDriveableMenu(EntityPlayer player, World world, EntityDriveable driveable) {
        FMLClientHandler.instance().getClient()
                .displayGuiScreen(new GuiDriveableMenu(player.inventory, world, driveable));
    }

    private String getModelName(String in) {
        String[] split = in.split("\\.");
        if (split.length == 1) {
            return "Model" + in;
        } else if (split.length <= 1) {
            return in;
        } else {
            String out = "Model" + split[split.length - 1];

            for (int i = split.length - 2; i >= 0; --i) {
                out = split[i] + "." + out;
            }

            return out;
        }
    }

    public Object loadModel(String s, String shortName, Class typeClass) {
        if (s != null && shortName != null) {
            try {
                return typeClass.cast(Class.forName(modelDir + this.getModelName(s)).getConstructor(new Class[0])
                        .newInstance());
            } catch (Exception var5) {
                FlansMod.log("Failed to load model : " + shortName + " (" + s + ")");
                var5.printStackTrace();

                return null;
            }
        } else {
            return null;
        }
    }

    public void loadSound(String contentPack, String type, String sound) {
        FlansModResourceHandler.getSound(sound);
    }

    public boolean isThePlayer(EntityPlayer player) {
        return player == FMLClientHandler.instance().getClient().thePlayer;
    }

    public boolean isOnSameTeamClientPlayer(EntityLivingBase entity) {
        return FMLClientHandler.instance().getClient().thePlayer.isOnSameTeam(entity);
    }

    public void buyGun(GunBoxType type, int gun) {
        FlansMod.getPacketHandler().sendToServer(new PacketBuyWeapon(type, 0, gun));
        FlansModClient.shootTimeRight = 10;
        FlansModClient.shootTimeLeft = 10;
    }

    public void buyAmmo(GunBoxType box, int ammo, int type) {
        FlansMod.getPacketHandler().sendToServer(new PacketBuyWeapon(box, type, ammo));
        FlansModClient.shootTimeRight = 10;
        FlansModClient.shootTimeLeft = 10;
    }

    public void buyArmour(String shortName, int piece, ArmourBoxType box) {
        FlansMod.getPacketHandler().sendToServer(new PacketBuyArmour(box.shortName, shortName, piece));
        FlansModClient.shootTimeRight = 10;
        FlansModClient.shootTimeLeft = 10;
    }

    public void craftDriveable(EntityPlayer player, DriveableType type) {
        super.craftDriveable(player, type);
        if (player.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToServer(new PacketCraftDriveable(type.shortName));
        }

    }

    public void repairDriveable(EntityPlayer driver, EntityDriveable driving, DriveablePart part) {
        super.repairDriveable(driver, driving, part);
        if (driver.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToServer(new PacketRepairDriveable(part.type));
        }

    }

    public boolean isScreenOpen() {
        return Minecraft.getMinecraft().currentScreen != null;
    }

    public boolean isKeyDown(int key) {
        switch (key) {
            case 0:
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindForward.getKeyCode());
            case 1:
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindBack.getKeyCode());
            case 2:
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindLeft.getKeyCode());
            case 3:
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindRight.getKeyCode());
            case 4:
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindJump.getKeyCode());
            default:
                return false;
        }
    }

    public boolean keyDown(int keyCode) {
        boolean state = keyCode < 0 ? Mouse.isButtonDown(keyCode + 100) : Keyboard.isKeyDown(keyCode);
        return state;
    }

    public void spawnParticle(String s, double x, double y, double z, double mx, double my, double mz) {
        try {
            doSpawnParticle(s, x, y, z, mx, my, mz);
        } catch (Throwable var15) {
            var15.printStackTrace();
        }

    }

    public float getMouseSensitivity() {
        return Minecraft.getMinecraft().gameSettings.mouseSensitivity;
    }

}
