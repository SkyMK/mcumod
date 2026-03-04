// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.network.packages;

import io.netty.buffer.ByteBuf;
import mcu.inventory.network.AbstractPacket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class TakePacket extends AbstractPacket {

    public TakePacket() {
    }

    public TakePacket(final int entityID, final int slot, final boolean shift) {
    }

    @Override
    public void toBytes(final ByteBuf buf) {
    }

    @Override
    public void fromBytes(final ByteBuf buf) {
    }

    @Override
    public void clientHandler(final EntityPlayer player) {
    }

    @Override
    public void serverHandler(final EntityPlayerMP player) {
    }

}
