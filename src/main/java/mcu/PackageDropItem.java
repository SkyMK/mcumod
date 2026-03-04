// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.network.packages;

import io.netty.buffer.ByteBuf;
import mcu.inventory.network.AbstractPacket;
import mcu.inventory.network.NetworkWrapper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeHooks;

public class PackageDropItem extends AbstractPacket {
    @Override
    public void toBytes(final ByteBuf buf) {
    }

    @Override
    public void fromBytes(final ByteBuf buf) {
    }

    @Override
    public void clientHandler(final EntityPlayer player) {
        if (player.inventory.getItemStack() != null) {
            ForgeHooks.onPlayerTossEvent(player, player.inventory.getItemStack().copy(), false);
            player.inventory.setItemStack(null);
        }
    }

    @Override
    public void serverHandler(final EntityPlayerMP player) {
        if (player.inventory.getItemStack() != null) {
            ForgeHooks.onPlayerTossEvent(player, player.inventory.getItemStack().copy(), false);
            player.inventory.setItemStack(null);
            NetworkWrapper.instance.sendTo(new PackageDropItem(), player);
        }
    }
}
