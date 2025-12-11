// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.network.packages;

import io.netty.buffer.ByteBuf;
import mcu.inventory.BackpackMod;
import mcu.inventory.network.AbstractPacket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PackageOpenGui extends AbstractPacket {
    private int id;

    public PackageOpenGui() {
    }

    public PackageOpenGui(final int id) {
        this.id = id;
    }

    @Override
    public void toBytes(final ByteBuf buf) {
        buf.writeInt(this.id);
    }

    @Override
    public void fromBytes(final ByteBuf buf) {
        this.id = buf.readInt();
    }

    @Override
    public void clientHandler(final EntityPlayer player) {
    }

    @Override
    public void serverHandler(final EntityPlayerMP player) {
        player.openGui(BackpackMod.instance, this.id, player.worldObj, (int) player.posX, (int) player.posY,
                (int) player.posZ);
    }
}
