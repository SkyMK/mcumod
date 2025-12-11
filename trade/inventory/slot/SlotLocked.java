package mcu.trade.inventory.slot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotLocked extends Slot{

    private boolean isItemValid, canTakeSlot;

    public SlotLocked(IInventory inv, int id, int x, int y, boolean valid, boolean take){
        super(inv, id, x, y);
        isItemValid = valid;
        canTakeSlot = take;
    }

    public boolean isItemValid(ItemStack itemStack){
        return isItemValid;
    }

    public boolean canTakeStack(EntityPlayer player){
        return canTakeSlot;
    }
}
