package com.flansmod.common.guns;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;

public class ItemBullet extends ItemShootable implements IFlanItem {
    public BulletType type;

    public ItemBullet(BulletType infoType) {
        super(infoType);
        this.type = infoType;
        this.setMaxStackSize(this.type.maxStackSize);
        this.setHasSubtypes(true);
        this.type.item = this;
        switch (this.type.weaponType) {
            case SHELL:
            case BOMB:
            case MINE:
            case MISSILE:
                this.setCreativeTab(FlansMod.tabFlanDriveables);
                break;
            default:
                this.setCreativeTab(FlansMod.tabFlanGuns);
        }

    }

    public boolean isRepairable() {
        return this.canRepair;
    }

    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        return this.type.colour;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        this.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b) {
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }

    }

    public InfoType getInfoType() {
        return this.type;
    }

    @Override
    public EntityShootable getEntity(World var1, Vec3 var2, float var3, float var4, double var5, double var7,
                                     double var9, EntityLivingBase var11, float var12, int var13, InfoType var14) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EntityShootable getEntity(World var1, Vector3f var2, Vector3f var3, EntityLivingBase var4, float var5,
                                     float var6, float var7, int var8, InfoType var9) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EntityShootable getEntity(World var1, Vec3 var2, float var3, float var4, EntityLivingBase var5, float var6,
                                     float var7, int var8, InfoType var9) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EntityShootable getEntity(World var1, EntityLivingBase var2, float var3, float var4, float var5,
                                     boolean var6, int var7, InfoType var8) {
        // TODO Auto-generated method stub
        return null;
    }
}
