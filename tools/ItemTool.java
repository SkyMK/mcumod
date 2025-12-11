package com.flansmod.common.tools;

import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ItemTool extends ItemFood {

    public ToolType type;

    public ItemTool(ToolType t) {
        super(t.foodness, false);
        super.maxStackSize = 1;
        this.type = t;
        this.type.item = this;
        this.setMaxDamage(this.type.toolLife);
        if (this.type.foodness == 0) {
            this.setCreativeTab(FlansMod.tabFlanParts);
            if (this.type.remote) {
                this.setCreativeTab(FlansMod.tabFlanGuns);
            }

            if (this.type.healDriveables) {
                this.setCreativeTab(FlansMod.tabFlanDriveables);
            }
        }

        GameRegistry.registerItem(this, this.type.shortName, "flansmod");
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b) {
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }

    }

    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        return this.type.colour;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        super.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
        if (this.type.foodness > 0) {
            super.onItemRightClick(itemstack, world, entityplayer);
        } else {
            if (this.type.parachute) {
                if (EntityParachute.canUseParachute(entityplayer)) {
                    if (!world.isRemote) {
                        EntityParachute var19 = new EntityParachute(world, this.type, entityplayer);
                        if (!var19.isDead) {
                            world.spawnEntityInWorld(var19);
                            entityplayer.mountEntity(var19);
                        }
                    }

                    if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                        itemstack.setItemDamage(itemstack.getItemDamage() + 1);
                    }

                    if (this.type.toolLife > 0 && this.type.destroyOnEmpty
                            && itemstack.getItemDamage() == itemstack.getMaxDamage()) {
                        --itemstack.stackSize;
                    }
                }

                return itemstack;
            }

            if (this.type.remote) {
                PlayerData cosYaw = PlayerHandler.getPlayerData(entityplayer,
                        world.isRemote ? Side.CLIENT : Side.SERVER);
                Iterator sinYaw = cosYaw.remoteExplosives.iterator();

                while (sinYaw.hasNext()) {
                    EntityGrenade cosPitch = (EntityGrenade) sinYaw.next();
                    if (cosPitch.isDead) {
                        sinYaw.remove();
                    }
                }

                if (cosYaw.remoteExplosives.size() > 0) {
                    ((EntityGrenade) cosYaw.remoteExplosives.get(0)).detonate();
                    if (((EntityGrenade) cosYaw.remoteExplosives.get(0)).detonated) {
                        cosYaw.remoteExplosives.remove(0);
                    }

                    if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                        itemstack.setItemDamage(itemstack.getItemDamage() + 1);
                    }

                    if (this.type.toolLife > 0 && this.type.destroyOnEmpty
                            && itemstack.getItemDamage() == itemstack.getMaxDamage()) {
                        --itemstack.stackSize;
                    }

                    return itemstack;
                }
            } else {
                float var18 = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F);
                float var20 = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F);
                float var21 = -MathHelper.cos(entityplayer.rotationPitch * 0.01745329F);
                float sinPitch = MathHelper.sin(entityplayer.rotationPitch * 0.01745329F);
                double length = -5.0D;
                Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX,
                        entityplayer.posY + 1.62D - (double) entityplayer.yOffset, entityplayer.posZ);
                Vec3 lookVec = posVec.addVector((double) (var20 * var21) * length, (double) sinPitch * length,
                        (double) (var18 * var21) * length);
                if (world.isRemote && FlansMod.DEBUG) {
                    world.spawnEntityInWorld(new EntityDebugVector(world, new Vector3f(posVec),
                            new Vector3f(posVec.subtract(lookVec)), 100));
                }

                if (this.type.healDriveables) {
                    for (int hitLiving = 0; hitLiving < world.loadedEntityList.size(); ++hitLiving) {
                        Object list = world.loadedEntityList.get(hitLiving);
                        if (list instanceof EntityDriveable) {
                            EntityDriveable driveable = (EntityDriveable) list;
                            DriveablePart aList = driveable.raytraceParts(new Vector3f(posVec),
                                    Vector3f.sub(new Vector3f(lookVec), new Vector3f(posVec), null));
                            if (aList != null && aList.maxHealth > 0 && aList.health < aList.maxHealth
                                    && (this.type.toolLife == 0
                                    || itemstack.getItemDamage() < itemstack.getMaxDamage())) {
                                aList.health += this.type.healAmount;
                                if (aList.health > aList.maxHealth) {
                                    aList.health = aList.maxHealth;
                                }

                                if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                                    itemstack.setItemDamage(itemstack.getItemDamage() + 1);
                                }

                                if (this.type.toolLife > 0 && this.type.destroyOnEmpty
                                        && itemstack.getItemDamage() == itemstack.getMaxDamage()) {
                                    --itemstack.stackSize;
                                }

                                return itemstack;
                            }
                        }
                    }
                }

                if (!world.isRemote && this.type.healPlayers) {
                    Object var22 = entityplayer;
                    List var23 = world.getEntitiesWithinAABB(EntityLivingBase.class,
                            AxisAlignedBB.getBoundingBox(Math.min(posVec.xCoord, lookVec.xCoord),
                                    Math.min(posVec.yCoord, lookVec.yCoord), Math.min(posVec.zCoord, lookVec.zCoord),
                                    Math.max(posVec.xCoord, lookVec.xCoord), Math.max(posVec.yCoord, lookVec.yCoord),
                                    Math.max(posVec.zCoord, lookVec.zCoord)));
                    Iterator var24 = var23.iterator();

                    while (var24.hasNext()) {
                        Object var25 = var24.next();
                        if (var25 instanceof EntityLivingBase) {
                            EntityLivingBase checkEntity = (EntityLivingBase) var25;
                            if (checkEntity != entityplayer) {
                                MovingObjectPosition hit = checkEntity.boundingBox.calculateIntercept(posVec, lookVec);
                                if (hit != null) {
                                    var22 = checkEntity;
                                }
                            }
                        }
                    }

                    if (var22 != null) {
                        if (itemstack.getItemDamage() >= itemstack.getMaxDamage() && this.type.toolLife > 0) {
                            return itemstack;
                        }

                        ((EntityLivingBase) var22).heal((float) this.type.healAmount);
                        FlansMod.getPacketHandler().sendToAllAround(
                                new PacketFlak(((Entity) var22).posX, ((Entity) var22).posY,
                                        ((Entity) var22).posZ, 5, "heart"),
                                new TargetPoint(((Entity) var22).dimension, ((Entity) var22).posX,
                                        ((Entity) var22).posY, ((Entity) var22).posZ, 50.0D));
                        if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                            itemstack.setItemDamage(itemstack.getItemDamage() + 1);
                        }

                        if (this.type.toolLife > 0 && this.type.destroyOnEmpty
                                && itemstack.getItemDamage() >= itemstack.getMaxDamage()) {
                            --itemstack.stackSize;
                        }
                    }
                }
            }
        }

        return itemstack;
    }

    public String toString() {
        return this.type == null ? this.getUnlocalizedName() : this.type.name;
    }
}
