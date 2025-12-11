package com.flansmod.common.guns;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Collections;
import java.util.List;

public class ItemAttachment extends Item implements IFlanItem {

    public AttachmentType type;

    public ItemAttachment(AttachmentType t) {
        this.type = t;
        this.type.item = this;
        super.maxStackSize = t.maxStackSize;
        this.setCreativeTab(FlansMod.tabFlanGuns);
        GameRegistry.registerItem(this, this.type.shortName, "flansmod");
    }

    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        return this.type.colour;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        super.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b) {
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }

    }

    public InfoType getInfoType() {
        return this.type;
    }
}
