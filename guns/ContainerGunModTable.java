package com.flansmod.common.guns;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerGunModTable extends Container {

    public InventoryPlayer playerInv;
    public World world;
    private final InventoryGunModTable inventory;

    public ContainerGunModTable(InventoryPlayer i, World w) {
        this.playerInv = i;
        this.inventory = new InventoryGunModTable();
        this.world = w;
        SlotGun gunSlot = new SlotGun(this.inventory, 0, 80, 110, null);
        this.addSlotToContainer(gunSlot);
        this.addSlotToContainer(new SlotGun(this.inventory, 1, 54, 110, gunSlot));
        this.addSlotToContainer(new SlotGun(this.inventory, 2, 80, 84, gunSlot));
        this.addSlotToContainer(new SlotGun(this.inventory, 3, 106, 110, gunSlot));
        this.addSlotToContainer(new SlotGun(this.inventory, 4, 80, 136, gunSlot));

        int col;
        int col1;
        for (col = 0; col < 4; ++col) {
            for (col1 = 0; col1 < 2; ++col1) {
                this.addSlotToContainer(
                        new SlotGun(this.inventory, 5 + col * 2 + col1, 10 + col1 * 18, 83 + col * 18, gunSlot));
            }
        }

        for (col = 0; col < 3; ++col) {
            for (col1 = 0; col1 < 9; ++col1) {
                this.addSlotToContainer(new Slot(this.playerInv, col1 + col * 9 + 9, 8 + col1 * 18, 176 + col * 18));
            }
        }

        for (col = 0; col < 9; ++col) {
            this.addSlotToContainer(new Slot(this.playerInv, col, 8 + col * 18, 234));
        }

    }

    public void onContainerClosed(EntityPlayer player) {
        if (this.inventory.getStackInSlot(0) != null) {
            player.dropPlayerItemWithRandomChoice(this.inventory.getStackInSlot(0), false);
        }

    }

    public boolean canInteractWith(EntityPlayer entityplayer) {
        return true;
    }

    public ItemStack transferStackInSlot(EntityPlayer player, int slotID) {
        ItemStack stack = null;
        Slot currentSlot = (Slot) super.inventorySlots.get(slotID);
        if (currentSlot != null && currentSlot.getHasStack()) {
            ItemStack slotStack = currentSlot.getStack();
            stack = slotStack.copy();
            if (slotID >= 13) {
                return null;
            }

            if (!this.mergeItemStack(slotStack, 13, super.inventorySlots.size(), true)) {
                return null;
            }

            if (slotStack.stackSize == 0) {
                currentSlot.putStack(null);
            } else {
                currentSlot.onSlotChanged();
            }

            if (slotStack.stackSize == stack.stackSize) {
                return null;
            }

            currentSlot.onPickupFromSlot(player, slotStack);
        }

        return stack;
    }

    public void pressButton(boolean paint, boolean left) {
    }

    public void clickPaintjob(String name) {
        ItemStack gunStack = this.inventory.getStackInSlot(0);
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            GunType gunType = ((ItemGun) gunStack.getItem()).type;
            this.clickPaintjob(gunType.getPaintjob(name));
        }

    }

    public void clickPaintjob(Paintjob paintjob) {
        ItemStack gunStack = this.inventory.getStackInSlot(0);
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            GunType gunType = ((ItemGun) gunStack.getItem()).type;
            int numDyes = paintjob.dyesNeeded.length;
            if (!this.playerInv.player.capabilities.isCreativeMode) {
                int n;
                int amountNeeded;
                int s;
                ItemStack stack;
                for (n = 0; n < numDyes; ++n) {
                    amountNeeded = paintjob.dyesNeeded[n].stackSize;

                    for (s = 0; s < this.playerInv.getSizeInventory(); ++s) {
                        stack = this.playerInv.getStackInSlot(s);
                        if (stack != null && stack.getItem() == Items.dye
                                && stack.getItemDamage() == paintjob.dyesNeeded[n].getItemDamage()) {
                            amountNeeded -= stack.stackSize;
                        }
                    }

                    if (amountNeeded > 0) {
                        return;
                    }
                }

                for (n = 0; n < numDyes; ++n) {
                    amountNeeded = paintjob.dyesNeeded[n].stackSize;

                    for (s = 0; s < this.playerInv.getSizeInventory(); ++s) {
                        if (amountNeeded > 0) {
                            stack = this.playerInv.getStackInSlot(s);
                            if (stack != null && stack.getItem() == Items.dye
                                    && stack.getItemDamage() == paintjob.dyesNeeded[n].getItemDamage()) {
                                ItemStack consumed = this.playerInv.decrStackSize(s, amountNeeded);
                                amountNeeded -= consumed.stackSize;
                            }
                        }
                    }
                }
            }

            gunStack.stackTagCompound.setString("Paint", paintjob.iconName);
        }

    }
}
