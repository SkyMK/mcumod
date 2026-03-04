package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.ItemGun;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketGunMode extends PacketBase {

    public EnumFireMode mode;

    public PacketGunMode() {
        this.mode = EnumFireMode.SEMIAUTO;
    }

    public PacketGunMode(EnumFireMode md) {
        this.mode = EnumFireMode.SEMIAUTO;
        this.mode = md;
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeByte(this.mode.ordinal());
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        byte i = data.readByte();
        if (i < EnumFireMode.values().length) {
            this.mode = EnumFireMode.values()[i];
        }

    }

    public void handleServerSide(EntityPlayerMP playerEntity) {
        ItemStack itemStack = playerEntity.inventory.getCurrentItem();
        if (itemStack != null && itemStack.getItem() instanceof ItemGun) {
            ItemGun gun = (ItemGun) itemStack.getItem();
            EnumFireMode currentMode = gun.type.getFireMode(itemStack);
            EnumFireMode nextMode = currentMode;
            EnumFireMode[] submode = gun.type.submode;

            for (int i = 0; i < submode.length; ++i) {
                if (currentMode == submode[i]) {
                    nextMode = submode[(i + 1) % submode.length];
                    break;
                }
            }

            if (currentMode != nextMode) {
                gun.type.setFireMode(itemStack, nextMode.ordinal());
                FlansMod.getPacketHandler().sendTo(new PacketGunMode(nextMode), playerEntity);
            }
        }

    }

    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        ItemStack itemStack = clientPlayer.inventory.getCurrentItem();
        if (itemStack != null && itemStack.getItem() instanceof ItemGun) {
            ((ItemGun) itemStack.getItem()).type.setFireMode(itemStack, this.mode.ordinal());
        }

    }
}
