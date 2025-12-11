package mcu.client.gui.house;

import mcu.entity.EntityHouse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ContainerHouse extends Container {

    private final EntityHouse entity;
    private int numRows;

    public ContainerHouse(EntityPlayer player, EntityHouse entity, NBTTagCompound nbt) {
        this.entity = entity;
        if (entity.inventoryHouse == null)
            return;
        entity.inventoryHouse.openInventory();

        numRows = entity.inventoryHouse.getSizeInventory() / 9;
        int i = (numRows - 4) * 18;
        int j;
        int k;

        for (int id = 0; id < entity.inventoryHouse.getSizeInventory(); ++id) {
            addSlotToContainer(new Slot(entity.inventoryHouse, id, 8 + (id % 9) * 18, (id / 9) * 18 + 18));
        }

        for (j = 0; j < 3; ++j) {
            for (k = 0; k < 9; ++k) {
                addSlotToContainer(new Slot(player.inventory, k + j * 9 + 9, 8 + k * 18, 139 + j * 18));
            }
        }

        for (j = 0; j < 9; ++j) {
            addSlotToContainer(new Slot(player.inventory, j, 8 + j * 18, 197));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        if (entity == null)
            return false;
        if (entity.inventoryHouse == null)
            return false;
        if (entity.isDead)
            return false;
        if (player.getDistanceSqToEntity(entity) > 64)
            return false;
        return entity.inventoryHouse.isUseableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot_i) {
        ItemStack is = null;
        Slot slot = (Slot) inventorySlots.get(slot_i);

        if (slot != null && slot.getHasStack()) {
            ItemStack is1 = slot.getStack();
            is = is1.copy();

            if (slot_i < entity.inventoryHouse.getSizeInventory()) {
                if (!mergeItemStack(is1, entity.inventoryHouse.getSizeInventory(), inventorySlots.size(), true))
                    return null;
            } else if (!mergeItemStack(is1, 0, entity.inventoryHouse.getSizeInventory(), false))
                return null;

            if (is1.stackSize == 0)
                slot.putStack(null);
            else
                slot.onSlotChanged();
        }

        return is;
    }

    @Override
    public void onContainerClosed(EntityPlayer player) {
        super.onContainerClosed(player);
        if (entity.inventoryHouse == null)
            return;
        entity.inventoryHouse.closeInventory();
    }

}
