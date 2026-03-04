package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.boxes.GunBoxType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketBuyWeapon extends PacketBase {

    public String boxShortName;
    public int purchaseType;
    public int weaponID;

    public PacketBuyWeapon() {
    }

    public PacketBuyWeapon(GunBoxType box, int type, int wepID) {
        this.boxShortName = box.shortName;
        this.purchaseType = type;
        this.weaponID = wepID;
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.writeUTF(data, this.boxShortName);
        data.writeInt(this.purchaseType);
        data.writeInt(this.weaponID);
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.boxShortName = this.readUTF(data);
        this.purchaseType = data.readInt();
        this.weaponID = data.readInt();
    }

    public void handleServerSide(EntityPlayerMP playerEntity) {
        GunBoxType box = GunBoxType.getBox(this.boxShortName);
        box.block.purchaseItem(this.purchaseType, this.weaponID, playerEntity.inventory, box);
    }

    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.log("Received gun box purchase packet on client. Skipping.");
    }
}
