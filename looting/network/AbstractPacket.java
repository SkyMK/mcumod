package mcu.looting.network;


import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public abstract class AbstractPacket implements IMessage {
    @Override
    public abstract void toBytes(ByteBuf buf);

    @Override
    public abstract void fromBytes(ByteBuf buf);

    public abstract void clientHandler(EntityPlayer player);

    public abstract void serverHandler(EntityPlayerMP player);

    public ByteBuf getOrCreateByteBuf() {
        return Unpooled.buffer();
    }
}
