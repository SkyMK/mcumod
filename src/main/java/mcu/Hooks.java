package mcu.hooks;

import com.flansmod.common.guns.ItemGun;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.FMLRelaunchLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gloomyfolken.hooklib.asm.Hook;
import gloomyfolken.hooklib.asm.ReturnCondition;
import mcu.client.ClientEventHandler;
import mcu.movement.MovementClient;
import mcu.movement.MovementUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldServer;
import org.apache.commons.lang3.ArrayUtils;
import org.lwjgl.opengl.GL11;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Hooks {

    public static boolean bigPacketWarning = true;
    public static boolean unpackNbtLimit = false;

    @Hook(returnCondition = ReturnCondition.ON_TRUE)
    public static boolean moveEntityWithHeading(EntityPlayer entityPlayer, final float n, final float n2) {
        if (!FMLCommonHandler.instance().getEffectiveSide().isClient() || !(entityPlayer instanceof EntityClientPlayerMP)) {
            return false;
        }
        entityPlayer.motionX = MovementUtils.getInstance().modMotionX;
        entityPlayer.motionY = MovementUtils.getInstance().modMotionY;
        entityPlayer.motionZ = MovementUtils.getInstance().modMotionZ;
        MovementClient.movePlayer((EntityClientPlayerMP) entityPlayer, n, n2, entityPlayer.rotationYaw);
        MovementUtils.getInstance().modMotionX = entityPlayer.motionX;
        MovementUtils.getInstance().modMotionY = entityPlayer.motionY;
        MovementUtils.getInstance().modMotionZ = entityPlayer.motionZ;
        return true;
    }

    @Hook(returnCondition = ReturnCondition.ALWAYS)
    @SideOnly(Side.CLIENT)
    public static void getMouseOver(EntityRenderer renderer, float ticks) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.renderViewEntity != null) {
            if (mc.theWorld != null) {
                mc.pointedEntity = null;
                double d0 = mc.playerController.getBlockReachDistance();
                mc.objectMouseOver = rayTrace(d0, ticks);
                double d1 = d0;
                Vec3 vec3 = mc.renderViewEntity.getPosition(ticks);

                if (mc.playerController.extendedReach()) {
                    d0 = 6.0D;
                    d1 = 6.0D;
                } else {
                    if (d0 > 3.0D) {
                        d1 = 3.0D;
                    }

                    d0 = d1;
                }

                if (mc.objectMouseOver != null) {
                    d1 = mc.objectMouseOver.hitVec.distanceTo(vec3);
                }

                Vec3 vec31 = mc.renderViewEntity.getLook(ticks);
                Vec3 vec32 = vec3.addVector(vec31.xCoord * d0, vec31.yCoord * d0, vec31.zCoord * d0);
                Entity pointedEntity = null;
                Vec3 vec33 = null;
                float f1 = 1.0F;
                List list = mc.theWorld.loadedEntityList;

                double d2 = d1;

                for (int i = 0; i < list.size(); ++i) {
                    Entity entity = (Entity) list.get(i);
                    if (entity == mc.renderViewEntity) {
                        continue;
                    }

                    if (entity.canBeCollidedWith()) {
                        float f2 = entity.getCollisionBorderSize();
                        AxisAlignedBB axisalignedbb = entity.boundingBox.expand(f2, f2, f2);
                        MovingObjectPosition movingobjectposition = axisalignedbb.calculateIntercept(vec3, vec32);

                        if (axisalignedbb.isVecInside(vec3)) {
                            if (0.0D < d2 || d2 == 0.0D) {
                                pointedEntity = entity;
                                vec33 = movingobjectposition == null ? vec3 : movingobjectposition.hitVec;
                                d2 = 0.0D;
                            }
                        } else if (movingobjectposition != null) {
                            double d3 = vec3.distanceTo(movingobjectposition.hitVec);

                            if (d3 < d2 || d2 == 0.0D) {
                                if (entity == mc.renderViewEntity.ridingEntity && !entity.canRiderInteract()) {
                                    if (d2 == 0.0D) {
                                        pointedEntity = entity;
                                        vec33 = movingobjectposition.hitVec;
                                    }
                                } else {
                                    pointedEntity = entity;
                                    vec33 = movingobjectposition.hitVec;
                                    d2 = d3;
                                }
                            }
                        }
                    }
                }

                if (pointedEntity != null && (d2 < d1 || mc.objectMouseOver == null)) {
                    mc.objectMouseOver = new MovingObjectPosition(pointedEntity, vec33);

                    if (pointedEntity instanceof EntityLivingBase || pointedEntity instanceof EntityItemFrame) {
                        mc.pointedEntity = pointedEntity;
                    }
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public static MovingObjectPosition rayTrace(double p_70614_1_, float p_70614_3_) {
        Vec3 vec3 = Minecraft.getMinecraft().thePlayer.getPosition(p_70614_3_);
        Vec3 vec31 = Minecraft.getMinecraft().thePlayer.getLook(p_70614_3_);
        Vec3 vec32 = vec3.addVector(vec31.xCoord * p_70614_1_, vec31.yCoord * p_70614_1_, vec31.zCoord * p_70614_1_);
        return Minecraft.getMinecraft().theWorld.func_147447_a(vec3, vec32, true, true, true);
    }

    @Hook(returnCondition = ReturnCondition.ON_TRUE)
    @SideOnly(Side.CLIENT)
    public static boolean swingItem(EntityClientPlayerMP in) {
        if (!FMLCommonHandler.instance().getEffectiveSide().isClient() || !(in instanceof EntityClientPlayerMP)) {
            return false;
        }
        if (ClientEventHandler.swingTimer == 0) {
            superImpl:
            {
                ItemStack stack = in.getHeldItem();

                if (stack != null && stack.getItem() != null) {
                    Item item = stack.getItem();
                    if (item.onEntitySwing(in, stack)) {
                        break superImpl;
                    }
                }

                if (!in.isSwingInProgress || in.swingProgressInt >= getArmSwingAnimationEnd(in) / 2
                        || in.swingProgressInt < 0) {
                    in.swingProgressInt = -1;
                    in.isSwingInProgress = true;

                    if (in.worldObj instanceof WorldServer) {
                        ((WorldServer) in.worldObj).getEntityTracker().func_151247_a(in, new S0BPacketAnimation(in, 0));
                    }
                }
            }
            Minecraft.getMinecraft().getNetHandler().addToSendQueue(new C0APacketAnimation(in, 1));
            ClientEventHandler.swingTimer = 6;
            if (!(Minecraft.getMinecraft().thePlayer.getHeldItem() != null
                    && Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() instanceof ItemGun))
                Minecraft.getMinecraft().thePlayer.playSound("flansmod:5", 1, 1);
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    private static int getArmSwingAnimationEnd(EntityClientPlayerMP in) {
        return in.isPotionActive(Potion.digSpeed)
                ? 6 - (1 + in.getActivePotionEffect(Potion.digSpeed).getAmplifier()) * 1
                : (in.isPotionActive(Potion.digSlowdown)
                ? 6 + (1 + in.getActivePotionEffect(Potion.digSlowdown).getAmplifier()) * 2
                : 6);
    }

    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static void writeNBTTagCompoundToBuffer(PacketBuffer buf, NBTTagCompound nbt) throws IOException {
        if (nbt == null)
            buf.writeShort(-1);
        else {
            byte[] arr;
            arr = CompressedStreamTools.compress(nbt);
            if (arr.length < Short.MAX_VALUE) {
                buf.writeShort(arr.length);
                buf.writeBytes(arr);
            } else {
                byte[] arr1 = Arrays.copyOfRange(arr, 0, Short.MAX_VALUE);
                buf.writeShort(arr1.length);
                buf.writeBytes(arr1);
                byte[] arr2 = arr.length == Short.MAX_VALUE ? new byte[0]
                        : Arrays.copyOfRange(arr, Short.MAX_VALUE, arr.length);
                buf.writeInt(arr2.length);
                buf.writeBytes(arr2);
                if (bigPacketWarning)
                    FMLRelaunchLog.warning("[PacketUnlimiter] Sending packet with size " + arr.length + " bytes.");
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static void drawChat(GuiNewChat clazz, int p_146230_1_) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.gameSettings.chatVisibility != EntityPlayer.EnumChatVisibility.HIDDEN) {
            int j = clazz.func_146232_i();
            boolean flag = false;
            int k = 0;
            int l = clazz.field_146253_i.size();
            float f = mc.gameSettings.chatOpacity * 0.9F + 0.1F;

            if (l > 0) {
                if (clazz.getChatOpen()) {
                    flag = true;
                }

                float f1 = clazz.func_146244_h();
                int i1 = MathHelper.ceiling_float_int((float) clazz.func_146228_f() / f1);
                GL11.glPushMatrix();
                GL11.glTranslatef(2.0F, 20.0F, 0.0F);
                GL11.glScalef(f1, f1, 1.0F);
                int j1;
                int k1;
                int i2;

                for (j1 = 0; j1 + clazz.field_146250_j < clazz.field_146253_i.size() && j1 < j; ++j1) {
                    ChatLine chatline = (ChatLine) clazz.field_146253_i.get(j1 + clazz.field_146250_j);

                    if (chatline != null) {
                        k1 = p_146230_1_ - chatline.getUpdatedCounter();

                        if (k1 < 200 || flag) {
                            double d0 = (double) k1 / 200.0D;
                            d0 = 1.0D - d0;
                            d0 *= 10.0D;

                            if (d0 < 0.0D) {
                                d0 = 0.0D;
                            }

                            if (d0 > 1.0D) {
                                d0 = 1.0D;
                            }

                            d0 *= d0;
                            i2 = (int) (255.0D * d0);

                            if (flag) {
                                i2 = 255;
                            }

                            i2 = (int) ((float) i2 * f);
                            ++k;

                            if (i2 > 3) {
                                byte b0 = 0;
                                int j2 = -j1 * 9;
                                String s = chatline.func_151461_a().getFormattedText();
                                Gui.drawRect(b0, j2 - 9,
                                        b0 + mc.fontRenderer.getStringWidth(chatline.func_151461_a().getFormattedText())
                                                + 4,
                                        j2, i2 / 2 << 24);
                                GL11.glEnable(GL11.GL_BLEND);

                                mc.fontRenderer.drawStringWithShadow(s, b0, j2 - 8, 16777215 + (i2 << 24));
                                GL11.glDisable(GL11.GL_ALPHA_TEST);
                            }
                        }
                    }
                }

                if (flag) {
                    j1 = mc.fontRenderer.FONT_HEIGHT;
                    GL11.glTranslatef(-3.0F, 0.0F, 0.0F);
                    int k2 = l * j1 + l;
                    k1 = k * j1 + k;
                    int l2 = clazz.field_146250_j * k1 / l;
                    int l1 = k1 * k1 / k2;

                    if (k2 != k1) {
                        i2 = l2 > 0 ? 170 : 96;
                        int i3 = clazz.field_146251_k ? 13382451 : 3355562;
                        Gui.drawRect(0, -l2, 2, -l2 - l1, i3 + (i2 << 24));
                        Gui.drawRect(2, -l2, 1, -l2 - l1, 13421772 + (i2 << 24));
                    }
                }

                GL11.glPopMatrix();
            }
        }
    }

    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static NBTTagCompound readNBTTagCompoundFromBuffer(PacketBuffer buf) throws IOException {
        short length = buf.readShort();
        if (length < 0)
            return null;
        else {
            byte[] arr = new byte[length];
            buf.readBytes(arr);

            if (length == Short.MAX_VALUE) {
                int length1 = buf.readInt();
                byte[] arr1 = new byte[length1];
                buf.readBytes(arr1);
                arr = ArrayUtils.addAll(arr, arr1);
            }

            return CompressedStreamTools.func_152457_a(arr, new NBTSizeTracker(unpackNbtLimit ? 2097152 : Long.MAX_VALUE));
        }
    }
}
