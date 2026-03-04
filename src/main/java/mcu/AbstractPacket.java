// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public abstract class AbstractPacket implements IMessage {
    public abstract void toBytes(final ByteBuf p0);

    public abstract void fromBytes(final ByteBuf p0);

    public abstract void clientHandler(final EntityPlayer p0);

    public abstract void serverHandler(final EntityPlayerMP p0);

    public ByteBuf getOrCreateByteBuf() {
        return Unpooled.buffer();
    }
}
