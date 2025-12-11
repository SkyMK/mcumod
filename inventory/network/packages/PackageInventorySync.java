// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.network.packages;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import mcu.client.gui.inventory.PlayerInventoryProperty;
import mcu.inventory.network.AbstractPacket;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;

public class PackageInventorySync extends AbstractPacket {
    public NBTTagCompound data;

    public PackageInventorySync() {
    }

    public PackageInventorySync(final PlayerInventoryProperty property) {
        property.saveNBTData(this.data = new NBTTagCompound());
    }

    @Override
    public void toBytes(final ByteBuf buf) {
        ByteBufUtils.writeTag(buf, this.data);
    }

    @Override
    public void fromBytes(final ByteBuf buf) {
        this.data = ByteBufUtils.readTag(buf);
    }

    @Override
    public void clientHandler(final EntityPlayer player) {
        PlayerInventoryProperty.get(player).loadNBTData(this.data);
    }

    @Override
    public void serverHandler(final EntityPlayerMP player) {
    }
}
