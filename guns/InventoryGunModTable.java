package com.flansmod.common.guns;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class InventoryGunModTable extends InventoryBasic {

    public ItemStack lastGunStack;
    public GunType gunType;
    public int genericScroll = 0;
    private boolean busy = false;

    public InventoryGunModTable() {
        super("Gun Modification Table", true, 13);
    }

    public void markDirty() {
        if (!this.busy) {
            ItemStack gunStack = this.getStackInSlot(0);
            if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
                this.gunType = ((ItemGun) gunStack.getItem()).type;
                NBTTagCompound gunTags;
                if (gunStack != this.lastGunStack) {
                    this.busy = true;
                    gunTags = gunStack.stackTagCompound.getCompoundTag("attachments");
                    this.setInventorySlotContents(1, ItemStack.loadItemStackFromNBT(gunTags.getCompoundTag("barrel")));
                    this.setInventorySlotContents(2, ItemStack.loadItemStackFromNBT(gunTags.getCompoundTag("scope")));
                    this.setInventorySlotContents(3, ItemStack.loadItemStackFromNBT(gunTags.getCompoundTag("stock")));
                    this.setInventorySlotContents(4, ItemStack.loadItemStackFromNBT(gunTags.getCompoundTag("grip")));
                    this.genericScroll = 0;

                    for (int attachmentTags = 0; attachmentTags < Math.min(this.gunType.numGenericAttachmentSlots,
                            8); ++attachmentTags) {
                        this.setInventorySlotContents(5 + attachmentTags,
                                ItemStack.loadItemStackFromNBT(gunTags.getCompoundTag("generic_" + attachmentTags)));
                    }

                    this.busy = false;
                } else {
                    gunTags = new NBTTagCompound();
                    gunTags.setTag("ammo", this.getStackInSlot(0).stackTagCompound.getTag("ammo"));
                    if (this.getStackInSlot(0).stackTagCompound.getTag("Paint") != null) {
                        gunTags.setTag("Paint", this.getStackInSlot(0).stackTagCompound.getTag("Paint"));
                    }

                    NBTTagCompound var5 = new NBTTagCompound();
                    this.writeAttachmentTags(var5, this.getStackInSlot(1), "barrel");
                    this.writeAttachmentTags(var5, this.getStackInSlot(2), "scope");
                    this.writeAttachmentTags(var5, this.getStackInSlot(3), "stock");
                    this.writeAttachmentTags(var5, this.getStackInSlot(4), "grip");

                    for (int i = 0; i < this.gunType.numGenericAttachmentSlots; ++i) {
                        if (i >= this.genericScroll * 4 && i < this.genericScroll * 4 + 8) {
                            this.writeAttachmentTags(var5, this.getStackInSlot(i - this.genericScroll * 4 + 5),
                                    "generic_" + i);
                        } else {
                            var5.setTag("generic_" + i, this.getStackInSlot(0).stackTagCompound.getTag("generic_" + i));
                        }
                    }

                    gunTags.setTag("attachments", var5);
                    gunStack.stackTagCompound = gunTags;
                }

                this.lastGunStack = gunStack;
            }
        }
    }

    public void writeAttachmentTags(NBTTagCompound attachmentTags, ItemStack attachmentStack, String attachmentName) {
        NBTTagCompound tags = new NBTTagCompound();
        if (attachmentStack != null) {
            attachmentStack.writeToNBT(tags);
        }

        attachmentTags.setTag(attachmentName, tags);
    }

    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return false;
    }
}
