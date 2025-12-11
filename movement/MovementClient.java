package mcu.movement;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.DayZ;
import mcu.utils.SidedProtection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

@SideOnly(Side.CLIENT)
public class MovementClient {
    public static boolean toggleCrawling;
    public static float sprinting;
    private static int crawlingToggleTimeout;
    private static float crawlingToggleDistance;
    private static float sliding;
    private static boolean lockJump;
    private static boolean wasSwimming;

    static {
        MovementClient.crawlingToggleTimeout = 0;
        MovementClient.crawlingToggleDistance = 0.0f;
    }

    static void init() {
        if (!SidedProtection.CLIENT)
            return;
        MovementClient movementClient = new MovementClient();
        MinecraftForge.EVENT_BUS.register(movementClient);
        FMLCommonHandler.instance().bus().register(movementClient);
    }

    public static void movePlayer(EntityClientPlayerMP entityClientPlayerMP, final float n, final float n2,
                                  final float n3) {
        if (SidedProtection.CLIENT) {
            if (entityClientPlayerMP.isRiding()) {
                return;
            }
            while (entityClientPlayerMP.rotationYaw >= 360.0f) {
                entityClientPlayerMP.rotationYaw -= 360.0f;
                entityClientPlayerMP.prevRotationYaw -= 360.0f;
                entityClientPlayerMP.prevRenderArmYaw -= 360.0f;
                entityClientPlayerMP.renderArmYaw -= 360.0f;
            }
            while (entityClientPlayerMP.rotationYaw < 0.0f) {
                entityClientPlayerMP.rotationYaw += 360.0f;
                entityClientPlayerMP.prevRotationYaw += 360.0f;
                entityClientPlayerMP.prevRenderArmYaw += 360.0f;
                entityClientPlayerMP.renderArmYaw += 360.0f;
            }
            final boolean playerCrawling = Movement.isPlayerCrawling(entityClientPlayerMP);
            if (MovementClient.toggleCrawling
                    && (MovementClient.crawlingToggleTimeout == 0 || MovementClient.crawlingToggleDistance == 0.0f)) {
                MovementClient.toggleCrawling = false;
                if ((entityClientPlayerMP.onGround || Movement.canClimb(entityClientPlayerMP, 0.5))
                        && Movement.togglePlayerCrawling(entityClientPlayerMP, !entityClientPlayerMP.onGround)) {
                    MovementClient.crawlingToggleTimeout = 6;
                    MovementClient.crawlingToggleDistance = 1.5625f;
                    MovementClient.lockJump = true;
                }
            }
            if (!entityClientPlayerMP.movementInput.jump && MovementClient.lockJump) {
                MovementClient.lockJump = false;
            }
            if (entityClientPlayerMP.onGround && entityClientPlayerMP.movementInput.jump
                    && !entityClientPlayerMP.isInWater() && Movement.isPlayerCrawling(entityClientPlayerMP)) {
                if (MovementClient.crawlingToggleTimeout == 0 || MovementClient.crawlingToggleDistance == 0.0f) {
                    if (Movement.togglePlayerCrawling(entityClientPlayerMP)) {
                        MovementClient.lockJump = true;
                        MovementClient.crawlingToggleTimeout = 6;
                        MovementClient.crawlingToggleDistance = 1.5625f;
                    }
                } else {
                    MovementClient.toggleCrawling = true;
                }
            } else if (!entityClientPlayerMP.onGround && n2 > 0.0f && entityClientPlayerMP.movementInput.jump
                    && !Movement.isPlayerCrawling(entityClientPlayerMP) && Movement.canClimb(entityClientPlayerMP, 0.5)
                    && Movement.calcOffset(entityClientPlayerMP, 0.5)) {
                final MovingObjectPosition func_72831_a = entityClientPlayerMP.worldObj.func_147447_a(
                        Vec3.createVectorHelper(entityClientPlayerMP.posX, entityClientPlayerMP.boundingBox.maxY,
                                entityClientPlayerMP.posZ),
                        Vec3.createVectorHelper(Movement.offsetX, entityClientPlayerMP.boundingBox.maxY,
                                Movement.offsetZ),
                        false, true, true);
                if (func_72831_a != null) {
                    Movement.offsetX = func_72831_a.hitVec.xCoord;
                    Movement.offsetZ = func_72831_a.hitVec.zCoord;
                }
                if (!entityClientPlayerMP.worldObj.getCollidingBoundingBoxes(entityClientPlayerMP,
                        AxisAlignedBB.getBoundingBox(Math.min(Movement.offsetX, entityClientPlayerMP.boundingBox.minX),
                                entityClientPlayerMP.boundingBox.maxY,
                                Math.min(Movement.offsetZ, entityClientPlayerMP.boundingBox.minZ),
                                Math.max(Movement.offsetX, entityClientPlayerMP.boundingBox.maxX),
                                entityClientPlayerMP.boundingBox.maxY + 0.2,
                                Math.max(Movement.offsetZ, entityClientPlayerMP.boundingBox.maxZ)))
                        .isEmpty()) {
                    Movement.togglePlayerCrawling(entityClientPlayerMP, true);
                }
            }
            if (Movement.isPlayerCrawling(entityClientPlayerMP)) {
                Movement.yOffset2 = 1.25f;
                if (!entityClientPlayerMP.isInWater() && MovementClient.wasSwimming && entityClientPlayerMP.onGround) {
                    Movement.togglePlayerCrawling(entityClientPlayerMP);
                }
                if (entityClientPlayerMP.isInWater()) {
                    MovementClient.wasSwimming = true;
                }
                if (!playerCrawling && entityClientPlayerMP.onGround && MovementClient.sprinting > 0.5) {
                    MovementClient.sliding = Math.min(MovementClient.sprinting, 0.75f);
                }
                if (entityClientPlayerMP.onGround && MovementClient.sprinting > 0.0f && MovementClient.sliding > 0.0f
                        && !entityClientPlayerMP.isInWater()) {
                    final float n4 = MovementClient.sliding * 0.25f;
                    final double sin = Math.sin(entityClientPlayerMP.rotationYaw * 3.141592653589793 / 180.0);
                    final double cos = Math.cos(entityClientPlayerMP.rotationYaw * 3.141592653589793 / 180.0);
                    entityClientPlayerMP.motionX -= n4 * sin;
                    entityClientPlayerMP.motionZ += n4 * cos;
                }
            } else {
                MovementClient.sliding = 0.0f;
                MovementClient.wasSwimming = false;
            }
            final double posX = entityClientPlayerMP.posX;
            final double posZ = entityClientPlayerMP.posZ;
            Movement.movePlayer(entityClientPlayerMP, MovementUtils.getInstance(), n, n2,
                    !MovementClient.lockJump && entityClientPlayerMP.movementInput.jump, n3);
            final double n5 = posX - entityClientPlayerMP.posX;
            final double n6 = posZ - entityClientPlayerMP.posZ;
            if (MovementClient.crawlingToggleTimeout > 0) {
                --MovementClient.crawlingToggleTimeout;
            }
            if ((MovementClient.crawlingToggleDistance -= (float) Math.sqrt(n5 * n5 + n6 * n6)) < 0.0f) {
                MovementClient.crawlingToggleDistance = 0.0f;
            }
        }
    }

    public static void sendMotionModded(final EntityClientPlayerMP entityClientPlayerMP) {
        DayZ.network.sendToServer(DayZ.network.createPacket(25, Movement.isPlayerCrawling(entityClientPlayerMP),
                entityClientPlayerMP.fallDistance));
    }

    @SubscribeEvent
    public void livingUpdate(LivingUpdateEvent event) {
        if (event.entity == Minecraft.getMinecraft().thePlayer) {
            MovementClient.sendMotionModded(Minecraft.getMinecraft().thePlayer);
        }
        if (event.entity instanceof EntityOtherPlayerMP) {
            final EntityOtherPlayerMP entityOtherPlayerMP = (EntityOtherPlayerMP) event.entity;
            if (entityOtherPlayerMP.getDataWatcher().getWatchableObjectInt(24) > 0 != Movement
                    .isPlayerCrawling(entityOtherPlayerMP)) {
                Movement.togglePlayerCrawling(entityOtherPlayerMP, false);
            }
            entityOtherPlayerMP.eyeHeight = entityOtherPlayerMP.getDefaultEyeHeight();
            if (Movement.isPlayerCrawling(entityOtherPlayerMP)) {
                final EntityOtherPlayerMP entityOtherPlayerMP2 = entityOtherPlayerMP;
                entityOtherPlayerMP2.eyeHeight -= 0.9f;
            }
        }
    }
}
