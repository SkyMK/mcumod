// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.network.packages;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import mcu.client.gui.inventory.CustomPlayerContainer;
import mcu.client.gui.inventory.PlayerInventoryProperty;
import mcu.inventory.network.AbstractPacket;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class NotifySlotPacket extends AbstractPacket {
    private int slot;
    private ItemStack stack;

    public NotifySlotPacket() {
    }

    public NotifySlotPacket(final int slot, final ItemStack stack) {
        this.slot = slot;
        this.stack = stack;
    }

    @Override
    public void toBytes(final ByteBuf buf) {
        buf.writeInt(this.slot);
        ByteBufUtils.writeItemStack(buf, this.stack);
    }

    @Override
    public void fromBytes(final ByteBuf buf) {
        this.slot = buf.readInt();
        this.stack = ByteBufUtils.readItemStack(buf);
    }

    @Override
    public void clientHandler(final EntityPlayer player) {
        if (player.openContainer != null && player.openContainer instanceof CustomPlayerContainer) {
            if (this.slot == -1) {
                final PlayerInventoryProperty property = PlayerInventoryProperty.get(player);
                property.inventory.backpackInventory[1] = this.stack;
                ((Slot) player.openContainer.inventorySlots.get(46)).onSlotChanged();
            } else {
                player.openContainer.getSlot(this.slot).putStack(this.stack);
            }
        }
    }

    @Override
    public void serverHandler(final EntityPlayerMP player) {
    }
}
