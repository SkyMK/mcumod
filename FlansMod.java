package com.flansmod.common;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.hole.EntityBulletHole;
import com.flansmod.common.driveables.*;
import com.flansmod.common.driveables.mechas.*;
import com.flansmod.common.guns.*;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.network.PacketHandler;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.*;
import com.flansmod.common.tools.EntityParachute;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import cpw.mods.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.material.Material;
import net.minecraft.command.CommandHandler;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent.CheckSpawn;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;

import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

@Mod(modid = "flansmod", name = "Flan's Mod", version = "@VERSION@", acceptableRemoteVersions = "@ALLOWEDVERSIONS@", guiFactory = "com.flansmod.client.gui.config.ModGuiFactory")
public class FlansMod {

    public static final String MODID = "flansmod";
    public static final String VERSION = "@VERSION@";
    public static final float soundRange = 50.0F;
    public static final float driveableUpdateRange = 200.0F;
    public static final int numPlayerSnapshots = 20;
    public static final PacketHandler packetHandler = new PacketHandler();
    public static final PlayerHandler playerHandler = new PlayerHandler();
    public static final TeamsManager teamsManager = new TeamsManager();
    public static final CommonTickHandler tickHandler = new CommonTickHandler();
    public static boolean DEBUG = false;
    public static Configuration configFile;
    @Instance("flansmod")
    public static FlansMod INSTANCE;
    public static int generalConfigInteger = 32;
    public static String generalConfigString = "Hello!";
    public static boolean printDebugLog = true;
    public static boolean printStackTrace = true;
    public static int noticeSpawnKillTime = 10;
    public static float[] hitCrossHairColor = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
    public static boolean addGunpowderRecipe = true;
    public static int teamsConfigInteger = 32;
    public static String teamsConfigString = "Hello!";
    public static boolean teamsConfigBoolean = false;
    public static CommonProxy proxy;
    public static int ticker = 0;
    public static long lastTime;
    public static File flanDir;
    public static float armourSpawnRate = 0.25F;
    public static Team spectators = new Team("spectators", "Spectators", 4210752, '7');
    public static FlansHooks hooks = new FlansHooks();
    public static boolean isInFlash = false;
    public static int flashTime = 10;
    public static BlockFlansWorkbench workbench;
    public static BlockSpawner spawner;
    public static ItemOpStick opStick;
    public static ItemFlagpole flag;
    public static ArrayList gunBoxBlocks = new ArrayList();
    public static ArrayList bulletItems = new ArrayList();
    public static ArrayList gunItems = new ArrayList();
    public static ArrayList attachmentItems = new ArrayList();
    public static ArrayList partItems = new ArrayList();
    public static ArrayList planeItems = new ArrayList();
    public static ArrayList vehicleItems = new ArrayList();
    public static ArrayList mechaToolItems = new ArrayList();
    public static ArrayList mechaItems = new ArrayList();
    public static ArrayList aaGunItems = new ArrayList();
    public static ArrayList grenadeItems = new ArrayList();
    public static ArrayList toolItems = new ArrayList();
    public static ArrayList armourItems = new ArrayList();
    public static ArrayList armourBoxBlocks = new ArrayList();
    public static CreativeTabFlan tabFlanGuns = new CreativeTabFlan(0);
    public static CreativeTabFlan tabFlanDriveables = new CreativeTabFlan(1);
    public static CreativeTabFlan tabFlanParts = new CreativeTabFlan(2);
    public static CreativeTabFlan tabFlanTeams = new CreativeTabFlan(3);
    public static CreativeTabFlan tabFlanMechas = new CreativeTabFlan(4);

    static {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            proxy = new ClientProxy();
        } else {
            proxy = new CommonProxy();
        }
    }

    public static PacketHandler getPacketHandler() {
        FlansMod var10000 = INSTANCE;
        return packetHandler;
    }

    public static void syncConfig() {
        printDebugLog = configFile.getBoolean("Print Debug Log", "general", printDebugLog, "");
        printStackTrace = configFile.getBoolean("Print Stack Trace", "general", printStackTrace, "");
        addGunpowderRecipe = configFile.getBoolean("Gunpowder Recipe", "general", addGunpowderRecipe,
                "Whether or not to add the extra gunpowder recipe (3 charcoal + 1 lightstone)");
        noticeSpawnKillTime = configFile.getInt("NoticeSpawnKillTime", "general", 10, 0, 600, "Min(default=10)");
        TeamsManager.bulletSnapshotMin = configFile.getInt("BltSS_Min", "general", 0, 0, 1000, "Min(default=0)");
        TeamsManager.bulletSnapshotDivisor = configFile.getInt("BltSS_Divisor", "general", 50, 0, 1000,
                "Divisor(default=50)");

        for (int i = 0; i < hitCrossHairColor.length; ++i) {
            String[] COLOR = new String[]{"Alpha", "Red", "Green", "Blue"};
            hitCrossHairColor[i] = configFile.getFloat("HitCrossHairColor" + COLOR[i], "general", hitCrossHairColor[i],
                    0.0F, 1.0F, "Hit cross hair color " + COLOR[i] + "(default=1.0)");
        }

        if (configFile.hasChanged()) {
            configFile.save();
        }

    }

    public static void updateBltssConfig(int min, int divisor) {
        ConfigCategory category = configFile.getCategory("general");
        if (category != null) {
            if (category.containsKey("BltSS_Min")) {
                category.get("BltSS_Min").set(min);
            }

            if (category.containsKey("BltSS_Divisor")) {
                category.get("BltSS_Divisor").set(divisor);
            }

            TeamsManager.bulletSnapshotMin = min;
            TeamsManager.bulletSnapshotDivisor = divisor;
            configFile.save();
        }
    }

    public static void log(String string) {
        if (printDebugLog) {
            System.out.println("[Flan's Mod] " + string);
        }

    }

    public static void log(String format, Object... args) {
        log(String.format(format, args));
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        log("Preinitialising Flan's mod.");
        configFile = new Configuration(event.getSuggestedConfigurationFile());
        syncConfig();
        flanDir = new File(event.getModConfigurationDirectory().getParentFile(), "/Flan/");
        if (!flanDir.exists()) {
            log("Flan folder not found. Creating empty folder.");
            log("You should get some content packs and put them in the Flan folder.");
            flanDir.mkdirs();
            flanDir.mkdir();
        }

        workbench = (BlockFlansWorkbench) (new BlockFlansWorkbench(1, 0))
                .setBlockName("flansWorkbench").setBlockTextureName("flansWorkbench");
        GameRegistry.registerBlock(workbench, ItemBlockManyNames.class, "flansWorkbench");
        GameRegistry.addRecipe(new ItemStack(workbench, 1, 0), "BBB", "III", "III",
                Character.valueOf('B'), Items.bowl, Character.valueOf('I'), Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(workbench, 1, 1), "ICI", "III", Character.valueOf('C'),
                Items.cauldron, Character.valueOf('I'), Items.iron_ingot);
        opStick = new ItemOpStick();
        GameRegistry.registerItem(opStick, "opStick", "flansmod");
        flag = (ItemFlagpole) (new ItemFlagpole()).setUnlocalizedName("flagpole");
        GameRegistry.registerItem(flag, "flagpole", "flansmod");
        spawner = (BlockSpawner) (new BlockSpawner(Material.iron)).setBlockName("teamsSpawner")
                .setBlockUnbreakable().setResistance(1000000.0F);
        GameRegistry.registerBlock(spawner, ItemBlockManyNames.class, "teamsSpawner");
        GameRegistry.registerTileEntity(TileEntitySpawner.class, "teamsSpawner");
        proxy.registerRenderers();
        this.readContentPacks(event);
        if (gunItems.size() >= 1) {
            MinecraftForge.EVENT_BUS.register(gunItems.get(0));
        }

        proxy.load();
        proxy.forceReload();
        log("Preinitializing complete.");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        log("Initialising Flan's Mod.");
        packetHandler.initialise();
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonGuiHandler());
        Iterator charcoal = InfoType.infoTypes.iterator();

        while (charcoal.hasNext()) {
            InfoType type = (InfoType) charcoal.next();
            type.addRecipe();
        }

        if (addGunpowderRecipe) {
            ItemStack charcoal1 = new ItemStack(Items.coal, 1, 1);
            GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder),
                    charcoal1, charcoal1, charcoal1, new ItemStack(Items.glowstone_dust));
        }

        log("Loaded recipes.");
        EntityRegistry.registerModEntity(EntityBulletHole.class, "EntityBulletHole",
                EntityRegistry.findGlobalUniqueEntityId(), INSTANCE, 64, 10000, true);
        EntityRegistry.registerGlobalEntityID(EntityFlagpole.class, "Flagpole",
                EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityFlagpole.class, "Flagpole", 93, this, 40, 5, true);
        EntityRegistry.registerGlobalEntityID(EntityFlag.class, "Flag", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityFlag.class, "Flag", 94, this, 40, 5, true);
        EntityRegistry.registerGlobalEntityID(EntityTeamItem.class, "TeamsItem",
                EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityTeamItem.class, "TeamsItem", 97, this, 100, 10000, true);
        EntityRegistry.registerGlobalEntityID(EntityGunItem.class, "GunItem",
                EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityGunItem.class, "GunItem", 98, this, 100, 20, true);
        EntityRegistry.registerGlobalEntityID(EntityPlane.class, "Plane", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityPlane.class, "Plane", 90, this, 200, 3, true);
        EntityRegistry.registerGlobalEntityID(EntityVehicle.class, "Vehicle",
                EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityVehicle.class, "Vehicle", 95, this, 200, 10, true);
        EntityRegistry.registerGlobalEntityID(EntitySeat.class, "Seat", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntitySeat.class, "Seat", 99, this, 200, 20, true);
        EntityRegistry.registerGlobalEntityID(EntityWheel.class, "Wheel", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityWheel.class, "Wheel", 103, this, 200, 20, true);
        EntityRegistry.registerGlobalEntityID(EntityParachute.class, "Parachute",
                EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityParachute.class, "Parachute", 101, this, 40, 20, false);
        EntityRegistry.registerGlobalEntityID(EntityMecha.class, "Mecha", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityMecha.class, "Mecha", 102, this, 250, 20, false);
        EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", 96, this, 40, 100, false);
        EntityRegistry.registerGlobalEntityID(EntityGrenade.class, "Grenade",
                EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 100, this, 40, 100, true);
        EntityRegistry.registerGlobalEntityID(EntityMG.class, "MG", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityMG.class, "MG", 91, this, 40, 5, true);
        EntityRegistry.registerGlobalEntityID(EntityAAGun.class, "AAGun", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityAAGun.class, "AAGun", 92, this, 40, 500, false);
        ForgeChunkManager.setForcedChunkLoadingCallback(this, new ChunkLoadingHandler());
        FMLCommonHandler.instance().bus().register(INSTANCE);
        log("Loading complete.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        packetHandler.postInitialise();
        hooks.hook();
    }

    @SubscribeEvent
    public void playerDrops(PlayerDropsEvent event) {
        for (int i = event.drops.size() - 1; i >= 0; --i) {
            EntityItem ent = event.drops.get(i);
            InfoType type = InfoType.getType(ent.getEntityItem());
            if (type != null && !type.canDrop) {
                event.drops.remove(i);
            }
        }

    }

    @SubscribeEvent
    public void playerDrops(ItemTossEvent event) {
        InfoType type = InfoType.getType(event.entityItem.getEntityItem());
        if (type != null && !type.canDrop) {
            event.setCanceled(true);
        }

    }

    @EventHandler
    public void registerCommand(FMLServerStartedEvent e) {
        CommandHandler handler = (CommandHandler) FMLCommonHandler.instance().getSidedDelegate().getServer()
                .getCommandManager();
        handler.registerCommand(new CommandTeams());
    }

    @SubscribeEvent
    public void onConfigChanged(OnConfigChangedEvent eventArgs) {
        if (eventArgs.modID.equals("flansmod")) {
            syncConfig();
        }

    }

    @SubscribeEvent
    public void onLivingSpecialSpawn(CheckSpawn event) {
        double chance = event.world.rand.nextDouble();
        if (chance < (double) armourSpawnRate && event.entityLiving instanceof EntityZombie
                || event.entityLiving instanceof EntitySkeleton) {
            if (event.world.rand.nextBoolean() && ArmourType.armours.size() > 0) {
                ArmourType team1 = (ArmourType) ArmourType.armours
                        .get(event.world.rand.nextInt(ArmourType.armours.size()));
                if (team1 != null && team1.type != 2) {
                    event.entityLiving.setCurrentItemOrArmor(team1.type + 1, new ItemStack(team1.item));
                }
            } else if (Team.teams.size() > 0) {
                Team team = (Team) Team.teams.get(event.world.rand.nextInt(Team.teams.size()));
                if (team.hat != null) {
                    event.entityLiving.setCurrentItemOrArmor(1, team.hat.copy());
                }

                if (team.chest != null) {
                    event.entityLiving.setCurrentItemOrArmor(2, team.chest.copy());
                }

                if (team.shoes != null) {
                    event.entityLiving.setCurrentItemOrArmor(4, team.shoes.copy());
                }
            }
        }

    }

    private void getTypeFiles(List contentPacks) {
        Iterator var2 = contentPacks.iterator();

        while (var2.hasNext()) {
            File contentPack = (File) var2.next();
            int e1;
            int var11;
            if (contentPack.isDirectory()) {
                EnumType[] var23 = EnumType.values();
                int var24 = var23.length;

                for (int var25 = 0; var25 < var24; ++var25) {
                    EnumType var26 = var23[var25];
                    File var27 = new File(contentPack, "/" + var26.folderName + "/");
                    if (var27.exists()) {
                        File[] var29 = var27.listFiles();
                        e1 = var29.length;

                        for (var11 = 0; var11 < e1; ++var11) {
                            File var30 = var29[var11];

                            try {
                                BufferedReader var31 = new BufferedReader(
                                        new InputStreamReader(new FileInputStream(var30), StandardCharsets.UTF_8));
                                String[] splitName1 = var30.getName().split("/");
                                TypeFile typeFile1 = new TypeFile(var26,
                                        splitName1[splitName1.length - 1].split("\\.")[0], contentPack.getName());

                                while (true) {
                                    String line1 = null;

                                    try {
                                        line1 = var31.readLine();
                                    } catch (Exception var18) {
                                        break;
                                    }

                                    if (line1 == null) {
                                        break;
                                    }

                                    typeFile1.lines.add(line1);
                                }

                                var31.close();
                            } catch (FileNotFoundException var19) {
                                var19.printStackTrace();
                            } catch (IOException var20) {
                                var20.printStackTrace();
                            }
                        }
                    }
                }
            } else {
                try {
                    ZipFile e = new ZipFile(contentPack);
                    ZipInputStream zipStream = new ZipInputStream(new FileInputStream(contentPack));
                    BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream, StandardCharsets.UTF_8));
                    ZipEntry zipEntry = zipStream.getNextEntry();

                    do {
                        zipEntry = zipStream.getNextEntry();
                        if (zipEntry != null) {
                            TypeFile typeFile = null;
                            EnumType[] line = EnumType.values();
                            e1 = line.length;

                            for (var11 = 0; var11 < e1; ++var11) {
                                EnumType type = line[var11];
                                if (zipEntry.getName().startsWith(type.folderName + "/")
                                        && zipEntry.getName().split(type.folderName + "/").length > 1
                                        && zipEntry.getName().split(type.folderName + "/")[1].length() > 0) {
                                    String[] splitName = zipEntry.getName().split("/");
                                    typeFile = new TypeFile(type, splitName[splitName.length - 1].split("\\.")[0],
                                            contentPack.getName());
                                }
                            }

                            if (typeFile != null) {
                                while (true) {
                                    line = null;

                                    String var28;
                                    try {
                                        var28 = reader.readLine();
                                    } catch (Exception var21) {
                                        break;
                                    }

                                    if (var28 == null) {
                                        break;
                                    }

                                    typeFile.lines.add(var28);
                                }
                            }
                        }
                    } while (zipEntry != null);

                    reader.close();
                    e.close();
                    zipStream.close();
                } catch (IOException var22) {
                    var22.printStackTrace();
                }
            }
        }

    }

    private void readContentPacks(FMLPreInitializationEvent event) {
        ClassLoader classloader = MinecraftServer.class.getClassLoader();
        Method method = null;

        try {
            method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
            method.setAccessible(true);
        } catch (Exception var14) {
            log("Failed to get class loader. All content loading will now fail.");
            if (printStackTrace) {
                var14.printStackTrace();
            }
        }

        List<File> contentPacks = proxy.getContentList(method, classloader);
        if (!event.getSide().equals(Side.CLIENT)) {
        }

        this.getTypeFiles(contentPacks);
        EnumType[] var5 = EnumType.values();
        int var6 = var5.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            EnumType type = var5[var7];
            Class<? extends InfoType> typeClass = type.getTypeClass();
            Iterator var10 = ((ArrayList) TypeFile.files.get(type)).iterator();

            while (var10.hasNext()) {
                TypeFile typeFile = (TypeFile) var10.next();

                try {
                    InfoType infoType = typeClass.getConstructor(TypeFile.class).newInstance(typeFile);
                    infoType.read(typeFile);
                    switch (type) {
                        case bullet:
                            bulletItems.add((new ItemBullet((BulletType) infoType))
                                    .setUnlocalizedName(infoType.shortName));
                            break;
                        case attachment:
                            attachmentItems.add((new ItemAttachment((AttachmentType) infoType))
                                    .setUnlocalizedName(infoType.shortName));
                            break;
                        case gun:
                            gunItems.add(
                                    (new ItemGun((GunType) infoType)).setUnlocalizedName(infoType.shortName));
                            break;
                        case grenade:
                            grenadeItems.add((new ItemGrenade((GrenadeType) infoType))
                                    .setUnlocalizedName(infoType.shortName));
                            break;
                        case part:
                            partItems.add(
                                    (new ItemPart((PartType) infoType)).setUnlocalizedName(infoType.shortName));
                            break;
                        case plane:
                            planeItems.add((new ItemPlane((PlaneType) infoType))
                                    .setUnlocalizedName(infoType.shortName));
                            break;
                        case vehicle:
                            vehicleItems.add((new ItemVehicle((VehicleType) infoType))
                                    .setUnlocalizedName(infoType.shortName));
                            break;
                        case aa:
                            aaGunItems.add((new ItemAAGun((AAGunType) infoType))
                                    .setUnlocalizedName(infoType.shortName));
                            break;
                        case mechaItem:
                            mechaToolItems.add((new ItemMechaAddon((MechaItemType) infoType))
                                    .setUnlocalizedName(infoType.shortName));
                            break;
                        case mecha:
                            mechaItems.add((new ItemMecha((MechaType) infoType))
                                    .setUnlocalizedName(infoType.shortName));
                            break;
                        case tool:
                            toolItems.add(
                                    (new ItemTool((ToolType) infoType)).setUnlocalizedName(infoType.shortName));
                            break;
                        case box:
                            gunBoxBlocks.add((new BlockGunBox((GunBoxType) infoType))
                                    .setBlockName(infoType.shortName));
                            break;
                        case armour:
                            armourItems.add((new ItemTeamArmour((ArmourType) infoType))
                                    .setUnlocalizedName(infoType.shortName));
                            break;
                        case armourBox:
                            armourBoxBlocks.add((new BlockArmourBox((ArmourBoxType) infoType))
                                    .setBlockName(infoType.shortName));
                        case playerClass:
                        case team:
                            break;
                        default:
                            log("Unrecognised type for " + infoType.shortName);
                    }
                } catch (Exception var13) {
                    log("Failed to add " + type.name() + " : " + typeFile.name);
                    if (printStackTrace) {
                        var13.printStackTrace();
                    }
                }
            }

            log("Loaded " + type.name() + ".");
        }

        Team.spectators = spectators;
    }
}
