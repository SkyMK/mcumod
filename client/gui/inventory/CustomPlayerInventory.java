// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.gui.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class CustomPlayerInventory extends InventoryPlayer {
    private final String name = "Inventory";
    private final String tagName = "CustomInvTag";
    public ItemStack[] backpackInventory;

    public CustomPlayerInventory(final EntityPlayer p_i1750_1_) {
        super(p_i1750_1_);
        this.backpackInventory = new ItemStack[4];
    }

    public int getSizeInventory() {
        return this.backpackInventory.length;
    }

    public ItemStack getStackInSlot(final int slot) {
        return this.backpackInventory[slot];
    }

    public ItemStack decrStackSize(final int slot, final int amount) {
        ItemStack stack = this.getStackInSlot(slot);
        if (stack != null) {
            if (stack.stackSize > amount) {
                stack = stack.splitStack(amount);
                this.markDirty();
            } else {
                this.setInventorySlotContents(slot, null);
            }
        }
        return stack;
    }

    public ItemStack getStackInSlotOnClosing(final int slot) {
        final ItemStack stack = this.getStackInSlot(slot);
        this.setInventorySlotContents(slot, null);
        return stack;
    }

    public void setInventorySlotContents(final int slot, final ItemStack stack) {
        this.backpackInventory[slot] = stack;
        if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
            stack.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }

    public String getInventoryName() {
        return "Inventory";
    }

    public boolean isCustomInventoryName() {
        return "Inventory".length() > 0;
    }

    public int getInventoryStackLimit() {
        return 1;
    }

    public void markDirty() {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i) != null && this.getStackInSlot(i).stackSize == 0) {
                this.backpackInventory[i] = null;
            }
        }
    }

    public boolean isUseableByPlayer(final EntityPlayer player) {
        return true;
    }

    public void openChest() {
    }

    public void closeChest() {
    }

    public boolean isItemValidForSlot(final int slot, final ItemStack stack) {
        return false;
    }

    public void writeToNBT(final NBTTagCompound compound) {
        final NBTTagList items = new NBTTagList();
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i) != null) {
                final NBTTagCompound item = new NBTTagCompound();
                item.setByte("Slot", (byte) i);
                this.getStackInSlot(i).writeToNBT(item);
                items.appendTag(item);
            }
        }
        compound.setTag("CustomInvTag", items);
    }

    public void readFromNBT(NBTTagCompound compound) {
        if (compound == null) {
            compound = new NBTTagCompound();
        }
        final NBTTagList items = compound.getTagList("CustomInvTag", compound.getId());
        for (int i = 0; i < items.tagCount(); ++i) {
            final NBTTagCompound item = items.getCompoundTagAt(i);
            final byte slot = item.getByte("Slot");
            if (slot >= 0 && slot < this.getSizeInventory()) {
                this.backpackInventory[slot] = ItemStack.loadItemStackFromNBT(item);
            }
        }
    }
}
