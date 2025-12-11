package mcu.client;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModPlayerData;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.mcu.BulletSpread;
import com.flansmod.mcu.CrosshairRenderer;
import com.flansmod.mcu.EntityBulletHoleFX;
import com.flansmod.mcu.Util;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.DayZ;
import mcu.items.armors.JuggernautArmor;
import mcu.client.gui.inventory.CustomPlayerGui;
import mcu.client.gui.mcumenu.MCUMenu;
import mcu.client.gui.menu.EventHandler;
import mcu.client.gui.menu.GuiMCUMenu;
import mcu.client.gui.menu.GuiMCUSettings;
import mcu.client.hud.DayZHud;
import mcu.client.models.ArmorRender;
import mcu.client.models.IArmorModel;
import mcu.entity.EntityCorpse;
import mcu.entity.EntityHouse;
import mcu.entity.ExtendedPlayer;
import mcu.friend.entity.FriendsPlayer;
import mcu.items.ItemHouse;
import mcu.items.Items;
import mcu.movement.Movement;
import mcu.movement.MovementClient;
import mcu.movement.MovementUtils;
import mcu.network.PacketHandler;
import mcu.trade.TradeMod;
import mcu.trade.network.TradePacketHandler;
import mcu.utils.MCUInteract;
import mcu.utils.MCUInteractable;
import mcu.utils.SidedProtection;
import mcu.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.util.*;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.GuiScreenEvent.InitGuiEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.player.*;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.util.*;

@SideOnly(Side.CLIENT)
public class ClientEventHandler {
    public static MCUMenu menu = new MCUMenu();
    public static int modelTimer;
    public static boolean sprint;
    public static EntityBullet bullet;
    public static int motionTimer;
    public static boolean dodickDetected;
    public static byte detect_level = 0, shoot_time;
    public static List<EntityBullet> clientBullets = new LinkedList<>();
    public static List<MCUInteractable> interactables = new ArrayList<MCUInteractable>();
    public static Object interactTarget;
    public static long lastDamage;
    public static int drawTimer;
    public static boolean firstTick;
    public static int swingTimer;
    public static boolean oldGuns = true;
    public static String server = "unknown";
    private static final ResourceLocation tex1 = new ResourceLocation("flansmod", "textures/gun_shot0.png");
    private static final ResourceLocation tex2 = new ResourceLocation("flansmod", "textures/gun_shot1.png");
    private static boolean playerExisted;
    private final Minecraft mc = Minecraft.getMinecraft();
    public WorldClient lastClientWorld;
    public EntityHouse house = null;
    public Integer[] bindings = {Integer.valueOf(Minecraft.getMinecraft().gameSettings.keyBindForward.getKeyCode()),
            Integer.valueOf(Minecraft.getMinecraft().gameSettings.keyBindBack.getKeyCode()),
            Integer.valueOf(Minecraft.getMinecraft().gameSettings.keyBindRight.getKeyCode()),
            Integer.valueOf(Minecraft.getMinecraft().gameSettings.keyBindLeft.getKeyCode()),
            Integer.valueOf(Minecraft.getMinecraft().gameSettings.keyBindJump.getKeyCode()),
            Integer.valueOf(Minecraft.getMinecraft().gameSettings.keyBindSprint.getKeyCode())};
    private long nextBHCleanup;
    private final long[] a;
    private final long b;

    public ClientEventHandler() {
        this.a = new long[100];
        this.b = (long) (50.0 * this.a.length);
    }

    public static void setFire(EntityBullet bullet) {
        if (Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() instanceof ItemGun) {
            drawTimer = 1;
            ClientEventHandler.bullet = bullet;
            if (modelTimer == 0)
                modelTimer = Math.max(3,
                        2 + (int) (ItemGun.getClientSpread(Minecraft.getMinecraft().thePlayer.getHeldItem())
                                + ItemGun.getClientSpread(Minecraft.getMinecraft().thePlayer.getHeldItem())) / 10);
        }
    }

    public static double boundingBoxDelta(EntityPlayer player) {
        double d = player.boundingBox.maxX - player.boundingBox.minX;
        d += player.boundingBox.maxZ - player.boundingBox.minZ;
        return d;
    }

    private static Object getTargetObject(final World World, final EntityPlayer entityPlayer) {
        final Vec3 getPosition = entityPlayer.getPosition(1.0f);
        final Vec3 getLookVec = entityPlayer.getLookVec();
        final MovingObjectPosition func_72831_a = World.func_147447_a(getPosition,
                Vec3.createVectorHelper(getPosition.xCoord + getLookVec.xCoord * 2.5,
                        getPosition.yCoord + getLookVec.yCoord * 2.5, getPosition.zCoord + getLookVec.zCoord * 2.5),
                true, true, true);
        final Vec3 a = Vec3.createVectorHelper(entityPlayer.posX, entityPlayer.posY + entityPlayer.getEyeHeight(),
                entityPlayer.posZ);
        Vec3 vec3;
        if (func_72831_a != null) {
            vec3 = Vec3.createVectorHelper(func_72831_a.hitVec.xCoord, func_72831_a.hitVec.yCoord,
                    func_72831_a.hitVec.zCoord);
        } else {
            vec3 = Vec3.createVectorHelper(entityPlayer.posX + getLookVec.xCoord * 2.5,
                    entityPlayer.getEyeHeight() + entityPlayer.posY + getLookVec.yCoord * 2.5,
                    entityPlayer.posZ + getLookVec.zCoord * 2.5);
        }
        double d = vec3.distanceTo(a);
        Object o = null;
        final List getEntitiesWithinAABBExcludingEntity = World.getEntitiesWithinAABBExcludingEntity(entityPlayer,
                entityPlayer.boundingBox.expand(0.25, 0.0, 0.25).addCoord(getLookVec.xCoord * 3.0,
                        getLookVec.yCoord * 3.0, getLookVec.zCoord * 3.0));
        for (int i = 0; i < getEntitiesWithinAABBExcludingEntity.size(); ++i) {
            final Entity entity = (Entity) getEntitiesWithinAABBExcludingEntity.get(i);
            AxisAlignedBB AxisAlignedBB = entity.boundingBox;
            if (entity instanceof EntityCorpse) {
                AxisAlignedBB = AxisAlignedBB.expand(0.25, 0.0, 0.25);
            } else if (entity instanceof EntityPlayer) {
                AxisAlignedBB = AxisAlignedBB.copy().offset(0.0, 0.25, 0.0);
            }
            final MovingObjectPosition calculateIntercept = AxisAlignedBB.calculateIntercept(a, vec3);
            if (calculateIntercept != null) {
                final double d2 = a.distanceTo(calculateIntercept.hitVec);
                if (d2 < d) {
                    o = entity;
                    d = d2;
                }
            }
        }
        final List<MCUInteractable> interactables = ClientEventHandler.interactables;
        for (int j = 0; j < interactables.size(); ++j) {
            final MCUInteractable hcsInteractable = interactables.get(j);
            final AxisAlignedBB boundingBox = hcsInteractable.boundingBox();
            if (entityPlayer.getDistanceSq((boundingBox.minX + boundingBox.maxX) / 2.0,
                    (boundingBox.minY + boundingBox.maxY) / 2.0, (boundingBox.minZ + boundingBox.maxZ) / 2.0) <= 16.0) {
                final MovingObjectPosition calculateIntercept2 = boundingBox.calculateIntercept(a, vec3);
                if (calculateIntercept2 != null) {
                    final double d3 = a.distanceTo(calculateIntercept2.hitVec);
                    if (d3 < d) {
                        o = hcsInteractable;
                        d = d3;
                    }
                }
            }
        }
        return MCUInteract.findInteractable(func_72831_a, o, Minecraft.getMinecraft().objectMouseOver);
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void interact(PlayerInteractEvent playerInteractEvent) {
        if (ClientProxy.interact.getIsKeyPressed())
            return;

        if (Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode)
            return;
        if (playerInteractEvent.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
            if (playerInteractEvent.entity.worldObj.isRemote) {
                if (!isAllowedItem(playerInteractEvent.entityPlayer.getCurrentEquippedItem())) {
                    playerInteractEvent.setCanceled(true);
                }
            } else if (!MCUInteract.$) {
                if (!isAllowedItem(playerInteractEvent.entityPlayer.getCurrentEquippedItem())) {
                    playerInteractEvent.setCanceled(true);
                } else {
                    playerInteractEvent.useBlock = Event.Result.DENY;
                    playerInteractEvent.useItem = Event.Result.ALLOW;
                }
            }
        }
    }

    private static boolean isAllowedItem(final ItemStack ItemStack) {
        return ItemStack != null
                && (ItemStack.getItem() instanceof ItemHouse || ItemStack.getItem() instanceof ItemBow);
    }

    private static void drawShield(final EntityPlayer entityPlayer, final float n) {
        final double n2 = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * n;
        final double n3 = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * n
                - (entityPlayer.boundingBox.minY - entityPlayer.boundingBox.maxY);
        final double n4 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * n;
        GL11.glPushMatrix();
        GL11.glTranslated(n2 - RenderManager.renderPosX, n3 - RenderManager.renderPosY, n4 - RenderManager.renderPosZ);
        drawBB(entityPlayer);
        GL11.glPopMatrix();
    }

    public static void drawBB(final Entity entity) {
        final double n = entity.boundingBox.minY - entity.boundingBox.maxY - 0.029999999329447746;
        final double n2 = entity.isSneaking() ? 0.05 : 0.15;
        final Tessellator instance = Tessellator.instance;
        instance.startDrawingQuads();
        instance.addVertex(-0.45, n2, -0.45);
        instance.addVertex(0.45, n2, -0.45);
        instance.addVertex(0.45, n, -0.45);
        instance.addVertex(-0.45, n, -0.45);
        instance.addVertex(-0.45, n, 0.45);
        instance.addVertex(0.45, n, 0.45);
        instance.addVertex(0.45, n2, 0.45);
        instance.addVertex(-0.45, n2, 0.45);
        instance.addVertex(-0.45, n, -0.45);
        instance.addVertex(0.45, n, -0.45);
        instance.addVertex(0.45, n, 0.45);
        instance.addVertex(-0.45, n, 0.45);
        instance.addVertex(-0.45, n2, 0.45);
        instance.addVertex(0.45, n2, 0.45);
        instance.addVertex(0.45, n2, -0.45);
        instance.addVertex(-0.45, n2, -0.45);
        instance.addVertex(-0.45, n, 0.45);
        instance.addVertex(-0.45, n2, 0.45);
        instance.addVertex(-0.45, n2, -0.45);
        instance.addVertex(-0.45, n, -0.45);
        instance.addVertex(0.45, n, -0.45);
        instance.addVertex(0.45, n2, -0.45);
        instance.addVertex(0.45, n2, 0.45);
        instance.addVertex(0.45, n, 0.45);
        instance.draw();
    }

    public static void clientShoot(EntityPlayer player, long seed, float spread) {
        if (player != Minecraft.getMinecraft().thePlayer) {
            Util.areClientBulletsBeingUpdated = true;
            EntityBullet bullet = new EntityBullet(player, spread, 0, 1, seed);
            if (!bullet.isDead)
                ItemGun.bullets.add(bullet);
            Util.areClientBulletsBeingUpdated = false;
            if (player.getHeldItem() == null)
                return;
            if (!(player.getHeldItem().getItem() instanceof ItemGun))
                return;
            ItemGun gun = (ItemGun) player.getHeldItem().getItem();
            AttachmentType itemShootable = gun.type.getBarrel(player.getHeldItem());
            boolean shootableType = itemShootable != null && itemShootable.silencer;
            Random rand = new Random();
            FMLClientHandler.instance().getClient().getSoundHandler()
                    .playSound(new PositionedSoundRecord(FlansModResourceHandler.getSound(gun.type.shootSound),
                            shootableType ? 5.0F : 10.0F,
                            (gun.type.distortSound ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1.0F)
                                    * (shootableType ? 2.0F : 1.0F),
                            (float) player.posX, (float) player.posY, (float) player.posZ));
        }
    }

    @SubscribeEvent
    public void key(InputEvent.KeyInputEvent e) {
        if (!SidedProtection.CLIENT)
            return;
        if (ClientProxy.gunUnload.isPressed()) {
            DayZ.network.sendToServer(DayZ.network.createPacket(PacketHandler.UNLOAD, 0));
        }
        if (ClientProxy.openGuiKey.isPressed()) {
            DayZ.network.sendToServer(DayZ.network.createPacket(PacketHandler.OPEN_WORKBENCH, 0));
        }
        if (ClientProxy.mcu_menu.isPressed() && Utils.canTeleport(Minecraft.getMinecraft().thePlayer)) {
            Minecraft.getMinecraft().displayGuiScreen(menu);
        }

    }

    @SubscribeEvent
    public void jump(LivingJumpEvent event) {
        if (!SidedProtection.CLIENT)
            return;
    }

    @SubscribeEvent
    public void huinya(ClientChatReceivedEvent event) {
        if (event.message.getFormattedText().equals("§r")) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void guiOpenEvent(GuiOpenEvent event) {
        if (event.gui instanceof GuiMainMenu) {
            event.gui = new GuiMCUMenu();
        }
    }

    @SubscribeEvent
    public void update(LivingEvent.LivingUpdateEvent event) {
        if (Minecraft.getMinecraft().thePlayer == event.entity) {
            for (EntityBullet entityBullet : ItemGun.bullets) {
                entityBullet.onUpdate();
            }
            ItemGun.bullets.removeIf(w -> w.isDead);
        }
    }

    @SubscribeEvent
    public void tick(TickEvent event) {
        if (SidedProtection.CLIENT) {
            if (event.type == TickEvent.Type.CLIENT && event.phase == TickEvent.Phase.END) {
                tick();
            }
            if (event.type == TickEvent.Type.CLIENT && event.phase == TickEvent.Phase.START) {
                ++FlansModClient.ticks;
                long l = System.currentTimeMillis();
                if (l > this.nextBHCleanup) {
                    this.nextBHCleanup = l + 10000L;
                    EntityBulletHoleFX.bulletHoles.clear();
                }
                if (Minecraft.getMinecraft().theWorld != this.lastClientWorld) {
                    clientBullets.clear();
                    this.lastClientWorld = Minecraft.getMinecraft().theWorld;
                }
                if (this.lastClientWorld != null) {
                    Iterator<EntityBullet> iterator = clientBullets.iterator();
                    Util.areClientBulletsBeingUpdated = true;
                    while (iterator.hasNext()) {
                        EntityBullet entityBullet = iterator.next();
                        ++entityBullet.ticksExisted;
                        entityBullet.onUpdate();
                        if (!entityBullet.isDead)
                            continue;
                        iterator.remove();
                    }
                    Util.areClientBulletsBeingUpdated = false;
                }
                if (Minecraft.getMinecraft().thePlayer != null) {
                    FlansModPlayerData flansModPlayerData = FlansModClient.clientPlayerData;
                    BulletSpread.prevClientSpread = flansModPlayerData.bulletSpread;
                    BulletSpread.tickWeaponSpread(Minecraft.getMinecraft().thePlayer, flansModPlayerData);
                }
            }
        }
    }

    public void tick() {
        EntityClientPlayerMP entityClientPlayerMP = Minecraft.getMinecraft().thePlayer;
        int n;
        if (swingTimer > 0)
            swingTimer--;
        if (Movement.soundTimer > 0)
            Movement.soundTimer--;
        n = entityClientPlayerMP != null ? 1 : 0;
        if (n == 0 && playerExisted) {
            EventHandler.savePlayer(EventHandler.menuPlayer);
        }
        playerExisted = n == 1;
        if (n == 0) {
            ++EventHandler.menuPlayer().ticksExisted;
            if (EventHandler.menuPlayer().hurtTime > 0) {
                --EventHandler.menuPlayer().hurtTime;
            }
        } else {
        }
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event) {
        if (SidedProtection.CLIENT) {
            if (Minecraft.getMinecraft().thePlayer == null)
                return;
            if (!firstTick) {
                Utils.applyBlockMods();
                firstTick = true;
            }
            if (sprint != Minecraft.getMinecraft().gameSettings.keyBindSprint.getIsKeyPressed()) {
                Minecraft.getMinecraft().thePlayer.setSprinting(false);
                sprint = Minecraft.getMinecraft().gameSettings.keyBindSprint.getIsKeyPressed();
            }
            if (Minecraft.getMinecraft().thePlayer.hurtTime > 0) {
                lastDamage = System.currentTimeMillis();
            }
            if (Minecraft.getMinecraft().thePlayer != null && motionTimer > 0) {
                motionTimer--;
                MovementUtils.getInstance().modMotionX = 0;
                MovementUtils.getInstance().modMotionY = 0;
                MovementUtils.getInstance().modMotionZ = 0;
            }
            for (Object o : Minecraft.getMinecraft().theWorld.loadedEntityList) {
                if (o instanceof EntityPlayer) {
                    EntityPlayer player = (EntityPlayer) o;
                    if (Math.abs(boundingBoxDelta(player)) > 1.21) {
                        FMLCommonHandler.instance().exitJava(0, true);
                    }
                }
            }
            {
                EntityPlayer h = Minecraft.getMinecraft().thePlayer;
                final double n = h.posX - MathHelper.sin(h.rotationYaw / 180.0f * 3.141593f) * 0.425;
                final double n2 = h.posZ + MathHelper.cos(h.rotationYaw / 180.0f * 3.141593f) * 0.425;
                double n3 = h.posY + h.getEyeHeight();
                n3 -= 0.125;
                final Vec3 a = Vec3.createVectorHelper(h.posX, n3, h.posZ);
                final Vec3 a2 = Vec3.createVectorHelper(n, n3, n2);
                if (h.worldObj.func_147447_a(a, a2, false, true, false) == null) {
                    FlansModClient.bipod = (h.worldObj.func_147447_a(Vec3.createVectorHelper(n, n3, n2),
                            Vec3.createVectorHelper(n, n3 - 0.7, n2), false, true, false) != null);
                } else {
                    FlansModClient.bipod = false;
                }
            }
            interactTarget = null;
            if (Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityHouse) {
                interactTarget = MCUInteract.$(Minecraft.getMinecraft().thePlayer, MCUInteract.OPEN_INVENTORY);
            } else {
                interactTarget = getTargetObject(Minecraft.getMinecraft().thePlayer.worldObj,
                        Minecraft.getMinecraft().thePlayer);
            }
            EntityClientPlayerMP t = Minecraft.getMinecraft().thePlayer;
            if (ClientProxy.chest.isPressed()) {
                DayZ.network.sendToServer(DayZ.network.createPacket(59, 0));
            }
            if (ClientProxy.interact.isPressed()) {
                MovingObjectPosition mop = Minecraft.getMinecraft().objectMouseOver;
                if (mop != null && mop.typeOfHit == MovingObjectType.ENTITY) {
                    try {
                        if(mc.pointedEntity instanceof EntityPlayer){
                            EntityPlayer target = (EntityPlayer)mc.pointedEntity;
                            FMLProxyPacket packet = TradeMod.network.createPacket(TradePacketHandler.TRADE_REQUEST, target.getEntityId());
                            TradeMod.network.sendToServer(packet);
                        }
                        Minecraft.getMinecraft().playerController
                                .interactWithEntitySendPacket(Minecraft.getMinecraft().thePlayer, mop.entityHit);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (mc.theWorld.isRemote && mc.objectMouseOver != null && mc.objectMouseOver.hitVec != null) {
                    Vec3 hitVec = mc.objectMouseOver.hitVec;
                    EntityClientPlayerMP player = mc.thePlayer;
                    double playerX = player.posX;
                    double playerY = player.posY;
                    double segLen = 0.25;
                    double segLend2 = 0.125;
                    double playerZ = player.posZ;
                    double dx = hitVec.xCoord - playerX;
                    double dy = hitVec.yCoord - playerY;
                    double dz = hitVec.zCoord - playerZ;
                    double lineLen = Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0) + Math.pow(dz, 2.0));
                    double segNumDouble = lineLen / segLen;
                    int segNum = (int) segNumDouble;
                    World world = player.getEntityWorld();
                    ArrayList<EntityItem> items = null;
                    int index = 0;
                    while (++index <= segNum) {
                        double cenX = playerX + dx / segNumDouble * (double) index;
                        double cenY = playerY + dy / segNumDouble * (double) index;
                        double cenZ = playerZ + dz / segNumDouble * (double) index;
                        AxisAlignedBB curAABB = AxisAlignedBB.getBoundingBox(cenX - segLend2,
                                cenY - segLend2, cenZ - segLend2, cenX + segLend2,
                                cenY + segLend2, cenZ + segLend2);
                        items = (ArrayList) world.getEntitiesWithinAABB(EntityItem.class, curAABB);
                        if (items == null || items.isEmpty())
                            continue;
                        index = segNum + 1;
                    }
                    if (items != null && !items.isEmpty()) {
                        EntityItem closeItem = items.get(0);
                        double closeDist = 100.0;
                        for (EntityItem item : items) {
                            double itemDist = Math.pow(item.posX - playerX, 2.0) + Math.pow(item.posY - playerY, 2.0)
                                    + Math.pow(item.posZ - playerZ, 2.0);
                            if (itemDist >= closeDist)
                                continue;
                            closeDist = itemDist;
                            closeItem = item;
                        }
                        DayZ.network.sendToServer(DayZ.network.createPacket((byte) 6, closeItem.getEntityId()));
                    }
                }
                if (ClientEventHandler.interactTarget instanceof EntityOtherPlayerMP) {
                    DayZ.network.sendToServer(DayZ.network.createPacket(66,
                            ((EntityPlayer) ClientEventHandler.interactTarget).getEntityId()));
                } else if (ClientEventHandler.interactTarget instanceof MCUInteract) {
                    MCUInteract hcsInteract = (MCUInteract) ClientEventHandler.interactTarget;
                    if (hcsInteract.type == MovingObjectType.BLOCK) {
                        if (hcsInteract == MCUInteract.DOOR) {
                            DayZ.network.sendToServer(DayZ.network.createPacket(67, MCUInteract.blockX, MCUInteract.blockY,
                                    MCUInteract.blockZ, MCUInteract.blockF));
                            int c = ((BlockDoor) Minecraft.getMinecraft().theWorld.getBlock(MCUInteract.blockX,
                                    MCUInteract.blockY, MCUInteract.blockZ)).func_150012_g(t.worldObj, MCUInteract.blockX,
                                    MCUInteract.blockY, MCUInteract.blockZ);
                            final int n = (c & 0x7) ^ 0x4;
                            if ((c & 0x8) == 0x0) {
                                t.worldObj.setBlockMetadataWithNotify(MCUInteract.blockX, MCUInteract.blockY,
                                        MCUInteract.blockZ, n, 2);
                            } else {
                                t.worldObj.setBlockMetadataWithNotify(MCUInteract.blockX, MCUInteract.blockY - 1,
                                        MCUInteract.blockZ, n, 2);
                            }
                            t.worldObj.playAuxSFXAtEntity(t, 1003, MCUInteract.blockX, MCUInteract.blockY,
                                    MCUInteract.blockZ, 0);
                        } else {
                            Block block = Minecraft.getMinecraft().theWorld.getBlock(MCUInteract.blockX, MCUInteract.blockY, MCUInteract.blockZ);
                            if (!(block instanceof BlockChest)) {
                                Minecraft.getMinecraft().playerController.onPlayerRightClick(Minecraft.getMinecraft().thePlayer, Minecraft.getMinecraft().theWorld, Minecraft.getMinecraft().thePlayer.getHeldItem(), MCUInteract.blockX, MCUInteract.blockY, MCUInteract.blockZ, MCUInteract.blockF, Minecraft.getMinecraft().objectMouseOver.hitVec);
                            }
                        }
                    } else if (hcsInteract.type == MovingObjectType.ENTITY) {

                    }
                }
            }
            if (!Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode)
                Minecraft.getMinecraft().gameSettings.thirdPersonView = 0;
            Minecraft.getMinecraft().gameSettings.gammaSetting = 0.5F;
            if (ClientProxy.climb.isPressed()) {
                MovementClient.toggleCrawling = true;
            }
            if (event.phase == TickEvent.Phase.START) {
                final long currentTimeMillis = System.currentTimeMillis();
                if (this.b / (double) (currentTimeMillis - this.a[0]) > 1.25) {
                    System.exit(0);
                }
                detect_level = Detectibility.update(Minecraft.getMinecraft().thePlayer);
                if (shoot_time > 0) {
                    --shoot_time;
                }
                System.arraycopy(this.a, 1, this.a, 0, this.a.length - 1);
                this.a[this.a.length - 1] = currentTimeMillis;
            }
            Minecraft.getMinecraft().gameSettings.enableVsync = false;
            Minecraft.getMinecraft().gameSettings.showInventoryAchievementHint = false;
            DayZHud.tickHints();
            if (event.phase == Phase.END) {
                if (CrosshairRenderer.death_count > 0) {
                    --CrosshairRenderer.death_count;
                }
                if (CrosshairRenderer.hit_count > 0) {
                    --CrosshairRenderer.hit_count;
                }
                PacketHandler.lastUpdate++;
            }
            EntityPlayer p = Minecraft.getMinecraft().thePlayer;
            update();
            p.stepHeight = 1;
            if (p.equals(Minecraft.getMinecraft().thePlayer) && p.getActivePotionEffect(Potion.nightVision) != null
                    && p.getActivePotionEffect(Potion.nightVision).getDuration() <= 0) {
                p.removePotionEffectClient(Potion.nightVision.getId());
            }
            if (Minecraft.getMinecraft().theWorld == null) {
                house = null;
            }
            Minecraft.getMinecraft().gameSettings.advancedItemTooltips = Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode;
            if (RenderManager.debugBoundingBox && !Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode)
                RenderManager.debugBoundingBox = false;
            stayAliveToMe();
            if (Minecraft.getMinecraft().currentScreen instanceof CustomPlayerGui
                    || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative)
                for (int i = 0; i < this.bindings.length; i++) {
                    Integer keybind = this.bindings[i];
                    KeyBinding.setKeyBindState(keybind, Keyboard.isKeyDown(keybind));
                }
        }
    }

    @SubscribeEvent
    public void interact(EntityInteractEvent event) {
        if (!Keyboard.isKeyDown(ClientProxy.interact.getKeyCode())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void fuck(ClientChatReceivedEvent clientChatReceivedEvent) {
        if (clientChatReceivedEvent.message != null
                && (clientChatReceivedEvent.message.getFormattedText().contains(" left the game.")
                || clientChatReceivedEvent.message.getFormattedText().contains(" joined the game."))) {
            clientChatReceivedEvent.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void ach(AchievementEvent event) {
        event.setCanceled(true);
    }

    @SubscribeEvent
    public void renderGameOverlay(RenderGameOverlayEvent.Pre pre) {
        if (pre.type == RenderGameOverlayEvent.ElementType.PLAYER_LIST) {
            int n;
            pre.setCanceled(true);
            NetHandlerPlayClient netClientHandler = Minecraft.getMinecraft().thePlayer.sendQueue;
            List list = netClientHandler.playerInfoList;
            list.sort(new Comparator<GuiPlayerInfo>() {

                @Override
                public int compare(GuiPlayerInfo guiPlayerInfo, GuiPlayerInfo guiPlayerInfo2) {
                    FontRenderer fontRenderer = mc.fontRenderer;
                    return Integer.compare(fontRenderer.getStringWidth(guiPlayerInfo2.name),
                            fontRenderer.getStringWidth(guiPlayerInfo.name));
                }
            });
            if (netClientHandler.currentServerMaxPlayers < 0) {
                netClientHandler.currentServerMaxPlayers &= 0xFF;
            }
            int n2 = netClientHandler.currentServerMaxPlayers;
            if (list.size() > n2) {
                n2 = list.size();
            }
            int n3 = pre.resolution.getScaledHeight() - 21;
            int n4 = n3 - 15;
            int n5 = n4 / 9;
            n4 = n5 * 9;
            int n6 = -3;
            int n7 = 0;
            for (n = 0; n < n2; n += n5) {
                if (n < list.size()) {
                    n6 += Math.max(Minecraft.getMinecraft().fontRenderer
                            .getStringWidth(((GuiPlayerInfo) list.get(n)).name), 50);
                    n6 += 3;
                    continue;
                }
                n6 += 53;
            }
            n = pre.resolution.getScaledWidth() / 2 - n6 / 2;
            Gui.drawRect(n - 1, 14, n + n6 + 1, 15 + n4, Integer.MIN_VALUE);
            int n8 = n;
            int n9 = 15;
            int n10 = 0;
            for (int i = 0; i < n2; ++i) {
                if (i < list.size()) {
                    GuiPlayerInfo guiPlayerInfo = (GuiPlayerInfo) list.get(i);
                    if (n10 == 0) {
                        n10 = Math.max(Minecraft.getMinecraft().fontRenderer
                                .getStringWidth(((GuiPlayerInfo) list.get(i)).name), 50);
                    }
                    Gui.drawRect(n8, n9, n8 + n10, n9 + 8, 550895526);
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    GL11.glEnable(3008);
                    ScorePlayerTeam scorePlayerTeam = Minecraft.getMinecraft().theWorld.getScoreboard().getPlayersTeam(guiPlayerInfo.name);
                    String string = ScorePlayerTeam.formatPlayerName(scorePlayerTeam, guiPlayerInfo.name);
                    FriendsPlayer client = FriendsPlayer.forPlayer(Minecraft.getMinecraft().thePlayer);
                    Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(string, n8, n9, client.isInFriend(guiPlayerInfo.name) ? 0x55FF55 : 0xFFFFFF);
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    if (n10 == 0) {
                        n10 = 50;
                    }
                    Gui.drawRect(n8, n9, n8 + n10, n9 + 8, 550895526);
                }
                n9 += 9;
                if (++n7 < n5)
                    continue;
                n9 = 15;
                n8 += n10 + 3;
                n7 = 0;
                n10 = 0;
            }
        }
    }

    public void update() {
        if (modelTimer > 0) {
            --modelTimer;
        }
        if (drawTimer >= 0) {
            drawTimer--;
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onPlayerRenderTick(final RenderPlayerEvent.Specials.Post e) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(32826);
        final EntityPlayer player = e.entityPlayer;
        String nameArmor = "customArmorModel";
        if (player.getCurrentArmor(3) != null) {
            ItemStack equipStack = player.getCurrentArmor(3);
            net.minecraft.item.Item equip = equipStack.getItem();
            if (equip == Items.juggernautHelmet)
                JuggernautArmor.Helmet.render(e.renderer);
            if (equip instanceof IArmorModel) {
                IArmorModel model = (IArmorModel) equip;
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(model.getTexture());
                e.renderer.modelBipedMain.bipedHead.postRender(0.0625F);
                model.getRenderer().render(ArmorRender.ModelPart.HEAD);
                GL11.glPopMatrix();
            }
        }
        if (player.getCurrentArmor(2) != null) {
            ItemStack equipStack = player.getCurrentArmor(2);
            net.minecraft.item.Item equip = equipStack.getItem();
            if (equip == Items.juggernautChestplate)
                JuggernautArmor.Body.render(e.renderer);
            if (equip instanceof IArmorModel) {
                IArmorModel model = (IArmorModel) equip;
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(model.getTexture());
                e.renderer.modelBipedMain.bipedBody.postRender(0.0625F);
                model.getRenderer().render(ArmorRender.ModelPart.BODY);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(model.getTexture());
                e.renderer.modelBipedMain.bipedRightArm.postRender(0.0625F);
                model.getRenderer().render(ArmorRender.ModelPart.RARM);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(model.getTexture());
                e.renderer.modelBipedMain.bipedLeftArm.postRender(0.0625F);
                model.getRenderer().render(ArmorRender.ModelPart.LARM);
                GL11.glPopMatrix();
            }
        }
        if (player.getCurrentArmor(1) != null) {
            ItemStack equipStack = player.getCurrentArmor(1);
            net.minecraft.item.Item equip = equipStack.getItem();
            if (equip == Items.juggernautPants)
                JuggernautArmor.Pants.render(e.renderer);
            if (equip instanceof IArmorModel) {
                IArmorModel model = (IArmorModel) equip;
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(model.getTexture());
                e.renderer.modelBipedMain.bipedLeftLeg.postRender(0.0625F);
                model.getRenderer().render(ArmorRender.ModelPart.LLEG);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(model.getTexture());
                e.renderer.modelBipedMain.bipedRightLeg.postRender(0.0625F);
                model.getRenderer().render(ArmorRender.ModelPart.RLEG);
                GL11.glPopMatrix();
            }
        }
        if (player.getCurrentArmor(0) != null) {
            ItemStack equipStack = player.getCurrentArmor(0);
            net.minecraft.item.Item equip = equipStack.getItem();
            if (equip == Items.juggernautBoots)
                JuggernautArmor.Boots.render(e.renderer);
            if (equip instanceof IArmorModel) {
                IArmorModel model = (IArmorModel) equip;
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(model.getTexture());
                e.renderer.modelBipedMain.bipedLeftLeg.postRender(0.0625F);
                model.getRenderer().render(ArmorRender.ModelPart.LBOOT);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(model.getTexture());
                e.renderer.modelBipedMain.bipedRightLeg.postRender(0.0625F);
                model.getRenderer().render(ArmorRender.ModelPart.RBOOT);
                GL11.glPopMatrix();
            }
        }
        GL11.glEnable(3008);
        GL11.glDisable(3042);
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void customAttack(AttackEntityEvent event) {
        if (event.entity == mc.thePlayer && event.target instanceof EntityPlayer) {
            event.setCanceled(true);
        }
    }



    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onItemTooltip(final ItemTooltipEvent e) {
        if (e.itemStack.getItem() instanceof JuggernautArmor.IItemPersonal) {
            final NBTTagCompound nbt = JuggernautArmor.getTagCompound(e.itemStack);
            if (nbt.hasKey("owner")) {
                e.toolTip.add(StatCollector.translateToLocalFormatted("item.tooltip.personal",
                        nbt.getString("owner")));
            }
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void drawArmorShield(final RenderWorldLastEvent e) {
        GL11.glPushMatrix();
        draw(Tessellator.instance);
        GL11.glPopMatrix();
        GL11.glDisable(2896);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(2884);
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        GL11.glDepthMask(false);
        GL11.glDisable(3553);
        List<EntityPlayer> hoe = new ArrayList<EntityPlayer>(Minecraft.getMinecraft().theWorld.playerEntities);
        for (final EntityPlayer player : hoe) {
            if (player != Minecraft.getMinecraft().thePlayer)
                if (JuggernautArmor.isFullSet(player)) {
                    final ItemStack armor = player.getCurrentArmor(3);
                    final NBTTagCompound nbt = JuggernautArmor.getTagCompound(armor);
                    if (!nbt.getString("owner").equals(player.getCommandSenderName())
                            || nbt.getInteger("cooldown") < 600) {
                        continue;
                    }
                    final boolean shield = nbt.getBoolean("damaged");
                    if (shield) {
                        GL11.glColor4d(0.5, 0.0, 0.0, 0.2);
                    } else {
                        GL11.glColor4d(0.0, 0.0, 0.5, 0.2);
                    }
                    drawShield(player, e.partialTicks);
                }
        }
        GL11.glEnable(3553);
        GL11.glDepthMask(true);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(2884);
        GL11.glDisable(3042);
    }

    public void stayAliveToMe() {
        if (!SidedProtection.CLIENT)
            return;
        MovingObjectPosition mop = Minecraft.getMinecraft().thePlayer
                .rayTrace(Minecraft.getMinecraft().playerController.getBlockReachDistance(), 1);
        if (Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house2d
                || Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house3d
                || Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house7d
                || Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house30d
                || Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house90d) {
            if (house == null) {
                Minecraft.getMinecraft().theWorld.spawnEntityInWorld(
                        house = new EntityHouse(Minecraft.getMinecraft().theWorld, "null", 1000, true));
            }
        } else {
            if (house != null) {
                house.setPosition(-10000, 200, -10000);
            }
        }
        if (house != null && mop != null) {
            if (mop.typeOfHit == MovingObjectType.BLOCK) {
                int y = Minecraft.getMinecraft().theWorld.getBlock(mop.blockX, mop.blockY, mop.blockZ)
                        .getMaterial() == Material.vine ? mop.blockY : mop.blockY + 1;
                house.setPosition(mop.blockX, y, mop.blockZ);
            } else {
                house.setPosition(-10000, 200, -10000);
            }
            if (!(Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                    && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house2d
                    || Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                    && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house3d
                    || Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                    && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house7d
                    || Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                    && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house30d
                    || Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                    && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == Items.house90d)) {
                house.setPosition(-10000, 200, -10000);
            }
        }
    }

    @SubscribeEvent
    public void outLine(DrawBlockHighlightEvent event) {
        event.setCanceled(true);
    }

    @SubscribeEvent
    public void onPlayerConstructing(EntityEvent.EntityConstructing event) {
        EntityPlayer player = null;
        if (event.entity instanceof EntityPlayer && (player = (EntityPlayer) event.entity)
                .getExtendedProperties(ExtendedPlayer.PROPERTIES_NAME) == null) {
            player.registerExtendedProperties(ExtendedPlayer.PROPERTIES_NAME, new ExtendedPlayer(player));
        }
    }

    @SubscribeEvent
    public void onGuiOpen(GuiOpenEvent event) {
        if (!SidedProtection.CLIENT)
            return;
        if (event.gui != null && event.gui instanceof GuiGameOver) {
            event.setCanceled(true);
            Minecraft.getMinecraft().thePlayer.respawnPlayer();
        }
        if (event.gui instanceof GuiHopper) {
            this.mc.thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Ты де бил?"));
            event.setCanceled(true);
        }
        if (event.gui instanceof GuiCommandBlock) {
            this.mc.thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Ты де бил?"));
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void initGui(InitGuiEvent.Post event) {
        try {
            if (event.gui != null && event.gui instanceof GuiIngameMenu) {
                event.buttonList.set(0,
                        new GuiButton(1, event.gui.width / 2 - 100, event.gui.height / 4 + 120 - 16, "§4Отключиться") {
                            @Override
                            public boolean mousePressed(Minecraft mc, int x, int y) {
                                int cooldown = mc.thePlayer.getDataWatcher().getWatchableObjectInt(26);
                                return cooldown == 0 && super.mousePressed(mc, x, y);
                            }

                            @Override
                            public void drawButton(Minecraft mc, int x, int y) {
                                int cooldown = mc.thePlayer.getDataWatcher().getWatchableObjectInt(26);
                                if (cooldown == 0)
                                    displayString = "§aОтключиться";
                                else
                                    displayString = "§4Отключиться через " + cooldown + " с.";
                                super.drawButton(mc, x, y);
                            }
                        });
                event.buttonList.set(5, new GuiButton(52525, event.gui.width / 2 - 100, event.gui.height / 4 + 120 - 88,
                        "§5MC Settings") {
                    @Override
                    public boolean mousePressed(Minecraft mc, int x, int y) {
                        boolean click = this.enabled && this.visible && x >= this.xPosition && y >= this.yPosition
                                && x < this.xPosition + this.width && y < this.yPosition + this.height;
                        if (click)
                            mc.displayGuiScreen(new GuiMCUSettings(mc.currentScreen));
                        return click;
                    }

                    @Override
                    public void drawButton(Minecraft mc, int x, int y) {
                        displayString = "§5MCU Settings";
                        super.drawButton(mc, x, y);
                    }
                });
                ((GuiButton) event.buttonList.get(3)).xPosition = -100;
                ((GuiButton) event.buttonList.get(4)).width = 98;
                ((GuiButton) event.buttonList.get(4)).xPosition = ((GuiButton) event.buttonList.get(4)).xPosition + 102;
                ((GuiButton) event.buttonList.get(4)).yPosition = ((GuiButton) event.buttonList.get(4)).yPosition + 24;
                ((GuiButton) event.buttonList.get(5)).displayString = EnumChatFormatting.GOLD + "MCU Settings";
                ((GuiButton) event.buttonList.get(5)).width = 200;
                ((GuiButton) event.buttonList.get(6)).xPosition = -100;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void draw(final Tessellator v1) {
        if (drawTimer < 0) {
            bullet = null;
            return;
        }
        if (Minecraft.getMinecraft().thePlayer == null || bullet == null
                || Math.abs(Minecraft.getMinecraft().thePlayer.rotationPitch) > 80)
            return;
        double posX = 0;
        double posY = 0;
        double posZ = 0;
        float rotationYaw = -bullet.rotationYaw;
        float rotationPitch = -bullet.rotationPitch;
        posX -= MathHelper.sin(rotationYaw / 180.0f * 3.141593f) * MathHelper.cos(rotationPitch / 180.0f * 3.141593f)
                * 0.75f;
        posZ += MathHelper.cos(rotationYaw / 180.0f * 3.141593f) * MathHelper.cos(rotationPitch / 180.0f * 3.141593f)
                * 0.75f;
        posY -= MathHelper.sin(rotationPitch / 180.0f * 3.141593f) * 0.75f;
        if (!Util.isAiming(null)) {
            posX -= MathHelper.cos(rotationYaw / 180.0f * 3.141593f) * 0.15f;
            posZ -= MathHelper.sin(rotationYaw / 180.0f * 3.141593f) * 0.15f;
        }
        final float n6 = 0.4f;
        posX -= MathHelper.sin(rotationYaw / 180.0f * 3.141593f) * MathHelper.cos(rotationPitch / 180.0f * 3.141593f)
                * n6;
        posZ += MathHelper.cos(rotationYaw / 180.0f * 3.141593f) * MathHelper.cos(rotationPitch / 180.0f * 3.141593f)
                * n6;
        posY -= MathHelper.sin(rotationPitch / 180.0f * 3.141593f) * n6;
        final float rotationYaw2 = rotationYaw;
        final float n7 = rotationPitch + 90.0f;
        posX -= MathHelper.sin(rotationYaw2 / 180.0f * 3.141593f) * MathHelper.cos(n7 / 180.0f * 3.141593f) * 0.12f;
        posZ += MathHelper.cos(rotationYaw2 / 180.0f * 3.141593f) * MathHelper.cos(n7 / 180.0f * 3.141593f) * 0.12f;
        posY -= MathHelper.sin(n7 / 180.0f * 3.141593f) * 0.12f;
        GL11.glPushMatrix();
        GL11.glTranslated(posX, posY, posZ);
        GL11.glScalef(0.4f, 0.4f, 0.4f);
        GL11.glEnable(3553);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(2896);
        Minecraft.getMinecraft().renderEngine.bindTexture(tex1);
        final Tessellator instance = Tessellator.instance;
        GL11.glRotatef(90.0f - rotationYaw, 0.0f, 1.0f, 0.0f);
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        final double radians = Math.toRadians(rotationPitch);
        final double distance = 1.5;
        final double n8 = distance + 1.0;
        final double n9 = Math.sin(radians) * 0.5;
        final double n10 = Math.cos(radians) * 0.5;
        final double n11 = Math.sin(radians) * distance;
        final double n12 = Math.sin(radians) * n8;
        final double n13 = Math.cos(radians) * distance;
        final double n14 = Math.cos(radians) * n8;
        GL11.glTranslatef((float) (-2.0 * n10), (float) (-n9) * 2.0f, 0.0f);
        instance.startDrawingQuads();
        instance.addVertexWithUV(n13 + n9, n11 - n10, 0.0, 0.0, 1.0);
        instance.addVertexWithUV(n14 + n9, n12 - n10, 0.0, 1.0, 1.0);
        instance.addVertexWithUV(n14 - n9, n12 + n10, 0.0, 1.0, 0.0);
        instance.addVertexWithUV(n13 - n9, n11 + n10, 0.0, 0.0, 0.0);
        instance.draw();
        instance.startDrawingQuads();
        instance.addVertexWithUV(n13 + n9, n11 - n10, 0.0, 0.0, 1.0);
        instance.addVertexWithUV(n13 - n9, n11 + n10, 0.0, 0.0, 0.0);
        instance.addVertexWithUV(n14 - n9, n12 + n10, 0.0, 1.0, 0.0);
        instance.addVertexWithUV(n14 + n9, n12 - n10, 0.0, 1.0, 1.0);
        instance.draw();
        instance.startDrawingQuads();
        instance.addVertexWithUV(n13, n11, -0.5, 0.0, 1.0);
        instance.addVertexWithUV(n14, n12, -0.5, 1.0, 1.0);
        instance.addVertexWithUV(n14, n12, 0.5, 1.0, 0.0);
        instance.addVertexWithUV(n13, n11, 0.5, 0.0, 0.0);
        instance.draw();
        instance.startDrawingQuads();
        instance.addVertexWithUV(n13, n11, -0.5, 0.0, 1.0);
        instance.addVertexWithUV(n13, n11, 0.5, 0.0, 0.0);
        instance.addVertexWithUV(n14, n12, 0.5, 1.0, 0.0);
        instance.addVertexWithUV(n14, n12, -0.5, 1.0, 1.0);
        instance.draw();
        Minecraft.getMinecraft().renderEngine.bindTexture(tex2);
        instance.startDrawingQuads();
        instance.addVertexWithUV(n14 + n9, n12 - n10, -0.5, 0.0, 1.0);
        instance.addVertexWithUV(n14 + n9, n12 - n10, 0.5, 1.0, 1.0);
        instance.addVertexWithUV(n14 - n9, n12 + n10, 0.5, 1.0, 0.0);
        instance.addVertexWithUV(n14 - n9, n12 + n10, -0.5, 0.0, 0.0);
        instance.draw();
        GL11.glEnable(2896);
        GL11.glPopMatrix();
    }

}
