package com.flansmod.common.driveables.slots;

import com.flansmod.common.parts.ItemPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotFuel extends Slot {

    public SlotFuel(IInventory p_i1824_1_, int p_i1824_2_, int p_i1824_3_, int p_i1824_4_) {
        super(p_i1824_1_, p_i1824_2_, p_i1824_3_, p_i1824_4_);
    }

    public boolean isItemValid(ItemStack is) {
        return is != null && is.getItem() instanceof ItemPart && ((ItemPart) is.getItem()).type.category == 9;
    }

    public boolean canTakeStack(EntityPlayer player) {
        return !this.getHasStack() || !(this.getStack().getItem() instanceof ItemPart)
                || ((ItemPart) this.getStack().getItem()).type.fuel - this.getStack().getItemDamage() <= 0;
    }

    public int getSlotStackLimit() {
        return 1;
    }
}
