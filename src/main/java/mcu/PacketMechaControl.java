package com.flansmod.common.network;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.EnumMechaSlotType;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.item.ItemStack;

public class PacketMechaControl extends PacketDriveableControl {

    public float legYaw;
    public float legSwing;
    public ItemStack leftStack;
    public ItemStack rightStack;

    public PacketMechaControl() {
    }

    public PacketMechaControl(EntityDriveable driveable) {
        super(driveable);
        EntityMecha mecha = (EntityMecha) driveable;
        this.legYaw = mecha.legAxes.getYaw();
        this.legSwing = mecha.legSwing;
        this.leftStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.leftTool);
        this.rightStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        super.encodeInto(ctx, data);
        data.writeFloat(this.legYaw);
        data.writeFloat(this.legSwing);
        ByteBufUtils.writeItemStack(data, this.leftStack);
        ByteBufUtils.writeItemStack(data, this.rightStack);
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        super.decodeInto(ctx, data);
        this.legYaw = data.readFloat();
        this.legSwing = data.readFloat();
        this.leftStack = ByteBufUtils.readItemStack(data);
        this.rightStack = ByteBufUtils.readItemStack(data);
    }

    protected void updateDriveable(EntityDriveable driveable, boolean clientSide) {
        super.updateDriveable(driveable, clientSide);
        EntityMecha mecha = (EntityMecha) driveable;
        mecha.legAxes.setAngles(this.legYaw, 0.0F, 0.0F);
        mecha.legSwing = this.legSwing / 2.0F;
        if (clientSide) {
            mecha.inventory.setInventorySlotContents(EnumMechaSlotType.leftTool, this.leftStack);
            mecha.inventory.setInventorySlotContents(EnumMechaSlotType.rightTool, this.rightStack);
        }

    }
}
