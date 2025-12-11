// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.gui.inventory;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.inventory.network.AbstractPacket;
import mcu.inventory.network.NetworkWrapper;
import mcu.inventory.network.packages.TakePacket;
import mcu.inventory.other.ClientEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.ForgeHooks;

import java.util.List;

public class CustomPlayerContainer extends Container {
    private final EntityPlayer thePlayer;
    public InventoryCrafting craftMatrix;
    public IInventory craftResult;
    public boolean flag;
    private int level;

    public CustomPlayerContainer(final EntityPlayer player, final InventoryPlayer inventoryPlayer,
                                 final CustomPlayerInventory inventoryCustom) {
        this.craftMatrix = new InventoryCrafting(this, 2, 2);
        this.craftResult = new InventoryCraftResult();
        this.thePlayer = player;
        this.addSlotToContainer(new SlotCrafting(inventoryPlayer.player, this.craftMatrix,
                this.craftResult, 0, 265, 26));
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                this.addSlotToContainer(new Slot(this.craftMatrix, j + i * 2, 228 + j * 18, 8 + i * 18));
            }
        }
        for (int i = 0; i < 4; ++i) {
            final int k = i;
            this.addSlotToContainer(
                    new Slot(inventoryPlayer, inventoryPlayer.getSizeInventory() - 1 - i, 120, 8 + i * 18) {
                        public int getSlotStackLimit() {
                            return 1;
                        }

                        public boolean isItemValid(final ItemStack stack) {
                            return stack != null && stack.getItem().isValidArmor(stack, k,
                                    CustomPlayerContainer.this.thePlayer);
                        }

                        @SideOnly(Side.CLIENT)
                        public IIcon getBackgroundIconIndex() {
                            return ItemArmor.func_94602_b(k);
                        }
                    });
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(
                        new Slot(inventoryPlayer, j + (i + 1) * 9, 120 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(inventoryPlayer, i, 120 + i * 18, 142));
        }
        this.addSlotToContainer(new Slot(inventoryCustom, 0, 138, 8) {
            public int getSlotStackLimit() {
                return 1;
            }

            public boolean isItemValid(final ItemStack stack) {
                return false;
            }

            @SideOnly(Side.CLIENT)
            public IIcon getBackgroundIconIndex() {
                return ClientEvents.NVDIcon;
            }
        });
        this.addSlotToContainer(new Slot(inventoryCustom, 1, 138, 26) {
            public int getSlotStackLimit() {
                return 1;
            }

            public boolean isItemValid(final ItemStack stack) {
                return false;
            }

            @SideOnly(Side.CLIENT)
            public IIcon getBackgroundIconIndex() {
                return ClientEvents.BackpackIcon;
            }

            public void onSlotChanged() {
                if (inventoryCustom.backpackInventory[1] == null) {
                    int from = -1;
                    if (from != -1) {
                        inventoryCustom.backpackInventory[1] = inventoryPlayer.getStackInSlot(from).copy();
                        inventoryPlayer.setInventorySlotContents(from, null);
                    }
                }
                CustomPlayerContainer.this.changeSlots(0);
                super.onSlotChanged();
            }
        });
        this.addSlotToContainer(new Slot(inventoryCustom, 2, 138, 44) {
            public int getSlotStackLimit() {
                return 1;
            }

            public boolean isItemValid(final ItemStack stack) {
                return false;
            }

            @SideOnly(Side.CLIENT)
            public IIcon getBackgroundIconIndex() {
                return ClientEvents.FlashlightIcon;
            }
        });
        this.addSlotToContainer(new Slot(inventoryCustom, 3, 138, 62) {
            public int getSlotStackLimit() {
                return 1;
            }

            public boolean isItemValid(final ItemStack stack) {
                return false;
            }

            @SideOnly(Side.CLIENT)
            public IIcon getBackgroundIconIndex() {
                return null;
            }
        });
        this.onCraftMatrixChanged(this.craftMatrix);
        this.changeSlots(0);
        for (Slot s : (List<Slot>) this.inventorySlots) {
            s.xDisplayPosition = s.xDisplayPosition - 60;
        }
    }

    public void changeSlots(int level) {
        this.level = 3;
        level = 3;
        final List<Slot> slots = (List<Slot>) this.inventorySlots;
        for (int i = 9; i < 36; ++i) {
            final int index = (i - 9) / 9;
            final int yCoord = (index < level) ? ((i - 9) / 9 * 18 + 84) : 999;
            if (yCoord != slots.get(i).yDisplayPosition && slots.get(i).getHasStack()) {
                ForgeHooks.onPlayerTossEvent(this.thePlayer, slots.get(i).getStack(), false);
                slots.get(i).putStack(null);
            }
            slots.get(i).yDisplayPosition = yCoord;
        }
    }

    public void onCraftMatrixChanged(final IInventory p_75130_1_) {
        this.craftResult.setInventorySlotContents(0,
                CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.thePlayer.worldObj));
    }

    public void onContainerClosed(final EntityPlayer p_75134_1_) {
        super.onContainerClosed(p_75134_1_);
        for (int i = 0; i < 4; ++i) {
            final ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);
            if (itemstack != null) {
                p_75134_1_.dropPlayerItemWithRandomChoice(itemstack, false);
            }
        }
        this.craftResult.setInventorySlotContents(0, null);
    }

    public boolean canInteractWith(final EntityPlayer player) {
        return true;
    }

    public ItemStack transferStackInSlot(final EntityPlayer player, final int index) {
        ItemStack itemstack = null;
        final Slot slot = (Slot) this.inventorySlots.get(index);
        if (slot != null && slot.getHasStack()) {
            final ItemStack itemstack2 = slot.getStack();
            itemstack = itemstack2.copy();
            if (index == 46) {
                return null;
            }
            if (index >= 0 && index < 9) {
                if (!this.mergeItemStack(itemstack2, 9, this.level * 9 + 9, true)) {
                    return null;
                }
            } else if (index < 9 || index >= 45 || !this.mergeItemStack(itemstack2, 45, 49, true)) {
                if (index < 9 || index >= 45 || !this.mergeItemStack(itemstack2, 5, 9, true)) {
                    if (index < 36 || index >= 45 || this.level == 0
                            || !this.mergeItemStack(itemstack2, 9, this.level * 9 + 9, false)) {
                        if (index >= 9 && index < 36) {
                            if (!this.mergeItemStack(itemstack2, 36, 45, true)) {
                                return null;
                            }
                        } else if (index >= 45 && index < 49
                                && !this.mergeItemStack(itemstack2, 9, this.level * 9 + 18, false)) {
                            return null;
                        }
                    }
                }
            }
            if (itemstack2.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }
            if (itemstack2.stackSize == itemstack.stackSize) {
                return null;
            }
            slot.onPickupFromSlot(player, itemstack2);
        }
        return itemstack;
    }

    public boolean func_94530_a(final ItemStack p_94530_1_, final Slot p_94530_2_) {
        return p_94530_2_.inventory != this.craftResult && super.func_94530_a(p_94530_1_, p_94530_2_);
    }

    protected boolean mergeItemStack(final ItemStack p_75135_1_, final int p_75135_2_, final int p_75135_3_,
                                     final boolean p_75135_4_) {
        boolean flag1 = false;
        int k = p_75135_2_;
        if (p_75135_4_) {
            k = p_75135_3_ - 1;
        }
        if (p_75135_1_.isStackable()) {
            while (p_75135_1_.stackSize > 0 && ((!p_75135_4_ && k < p_75135_3_) || (p_75135_4_ && k >= p_75135_2_))) {
                final Slot slot = (Slot) this.inventorySlots.get(k);
                final ItemStack itemstack1 = slot.getStack();
                if (itemstack1 != null && itemstack1.getItem() == p_75135_1_.getItem() && slot.isItemValid(p_75135_1_)
                        && (!p_75135_1_.getHasSubtypes() || p_75135_1_.getItemDamage() == itemstack1.getItemDamage())
                        && ItemStack.areItemStackTagsEqual(p_75135_1_, itemstack1)) {
                    final int l = itemstack1.stackSize + p_75135_1_.stackSize;
                    if (l <= p_75135_1_.getMaxStackSize()) {
                        p_75135_1_.stackSize = 0;
                        itemstack1.stackSize = l;
                        slot.onSlotChanged();
                        flag1 = true;
                    } else if (itemstack1.stackSize < p_75135_1_.getMaxStackSize()) {
                        p_75135_1_.stackSize -= p_75135_1_.getMaxStackSize() - itemstack1.stackSize;
                        itemstack1.stackSize = p_75135_1_.getMaxStackSize();
                        slot.onSlotChanged();
                        flag1 = true;
                    }
                }
                if (p_75135_4_) {
                    --k;
                } else {
                    ++k;
                }
            }
        }
        if (p_75135_1_.stackSize > 0) {
            if (p_75135_4_) {
                k = p_75135_3_ - 1;
            } else {
                k = p_75135_2_;
            }
            while ((!p_75135_4_ && k < p_75135_3_) || (p_75135_4_ && k >= p_75135_2_)) {
                final Slot slot = (Slot) this.inventorySlots.get(k);
                final ItemStack itemstack1 = slot.getStack();
                if (itemstack1 == null && slot.isItemValid(p_75135_1_)) {
                    slot.putStack(p_75135_1_.copy());
                    slot.onSlotChanged();
                    p_75135_1_.stackSize = 0;
                    flag1 = true;
                    break;
                }
                if (p_75135_4_) {
                    --k;
                } else {
                    ++k;
                }
            }
        }
        return flag1;
    }

    public ItemStack slotClick(final int slotId, final int clickedButton, final int mode, final EntityPlayer player) {
        if (!player.worldObj.isRemote) {
            if (this.flag) {
                this.flag = false;
                return null;
            }
            return super.slotClick(slotId, clickedButton, mode, player);
        } else {
            if (slotId != -999 && this.slotClick(slotId)) {
                return null;
            }
            return super.slotClick(slotId, clickedButton, mode, player);
        }
    }

    @SideOnly(Side.CLIENT)
    private boolean slotClick(final int slot) {
        final CustomPlayerGui gui = (CustomPlayerGui) Minecraft.getMinecraft().currentScreen;
        if (gui.stackInHand != null) {
            if (gui.cooldown <= 0) {
                NetworkWrapper.instance.sendToServer(
                        new TakePacket(
                                gui.stackInHand.getEntityId(), slot, false));
            }
            gui.cooldown = 3;
            if (slot > 8 && slot < 45) {
                gui.ignoreItems.put(gui.stackInHand, 50);
            }
            gui.stackInHand = null;
            return true;
        }
        return false;
    }
}
