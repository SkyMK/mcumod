package com.flansmod.common.driveables.mechas;

import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.HashMap;

public class MechaInventory implements IInventory {

    public EntityMecha mecha;
    public HashMap stacks;

    public MechaInventory(EntityMecha m) {
        this.mecha = m;
        this.stacks = new HashMap();
        EnumMechaSlotType[] var2 = EnumMechaSlotType.values();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            EnumMechaSlotType type = var2[var4];
            this.stacks.put(type, null);
        }

    }

    public MechaInventory(EntityMecha m, NBTTagCompound tags) {
        this(m);
        this.readFromNBT(tags);
    }

    public void readFromNBT(NBTTagCompound tags) {
        if (tags != null) {
            EnumMechaSlotType[] var2 = EnumMechaSlotType.values();
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                EnumMechaSlotType type = var2[var4];
                this.stacks.put(type, ItemStack.loadItemStackFromNBT(tags.getCompoundTag(type.toString())));
            }

        }
    }

    public NBTTagCompound writeToNBT(NBTTagCompound tags) {
        if (tags == null) {
            return null;
        } else {
            EnumMechaSlotType[] var2 = EnumMechaSlotType.values();
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                EnumMechaSlotType type = var2[var4];
                if (this.stacks.get(type) != null) {
                    tags.setTag(type.toString(), ((ItemStack) this.stacks.get(type)).writeToNBT(new NBTTagCompound()));
                }
            }

            return tags;
        }
    }

    public int getSizeInventory() {
        return EnumMechaSlotType.values().length;
    }

    public ItemStack getStackInSlot(int i) {
        return (ItemStack) this.stacks.get(EnumMechaSlotType.values()[i]);
    }

    public ItemStack getStackInSlot(EnumMechaSlotType e) {
        return (ItemStack) this.stacks.get(e);
    }

    public ItemStack decrStackSize(int i, int j) {
        this.markDirty();
        ItemStack slot = this.getStackInSlot(i);
        if (slot == null) {
            return null;
        } else {
            int numToTake = Math.min(j, slot.stackSize);
            ItemStack returnStack = slot.copy();
            returnStack.stackSize = numToTake;
            slot.stackSize -= numToTake;
            if (slot.stackSize <= 0) {
                slot = null;
            }

            this.setInventorySlotContents(i, slot);
            return returnStack;
        }
    }

    public ItemStack getStackInSlotOnClosing(int i) {
        return this.getStackInSlot(i);
    }

    public void setInventorySlotContents(int i, ItemStack itemstack) {
        this.setInventorySlotContents(EnumMechaSlotType.values()[i], itemstack);
    }

    public void setInventorySlotContents(EnumMechaSlotType e, ItemStack itemstack) {
        this.markDirty();
        this.stacks.put(e, itemstack);
    }

    public String getInventoryName() {
        return "Mecha";
    }

    public boolean hasCustomInventoryName() {
        return true;
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public void markDirty() {
        if (this.mecha != null) {
            this.mecha.couldNotFindFuel = false;
        }

    }

    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return this.mecha != null && (double) entityplayer.getDistanceToEntity(this.mecha) <= 10.0D;
    }

    public void openInventory() {
    }

    public void closeInventory() {
    }

    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        Item item = itemstack.getItem();
        if (item == null) {
            return true;
        } else {
            switch (EnumMechaSlotType.values()[i]) {
                case leftTool:
                case rightTool:
                    return item instanceof ItemGun || item instanceof ItemMechaAddon;
                case leftArm:
                case rightArm:
                    return item instanceof ItemBullet;
                default:
                    return false;
            }
        }
    }
}
