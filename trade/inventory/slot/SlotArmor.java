package mcu.trade.inventory.slot;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class SlotArmor extends Slot{

    private byte armorSlot;

    public SlotArmor(InventoryPlayer inv, int id, int slot, int x, int y){
        super(inv, id, x, y);
        armorSlot = (byte)slot;
    }

    public int getSlotStackLimit(){
        return 1;
    }

    public boolean isItemValid(ItemStack itemStack){
        if(itemStack == null){
            return false;
        }

        return itemStack.getItem().isValidArmor(itemStack, armorSlot, ((InventoryPlayer)inventory).player);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getBackgroundIconIndex(){
        return ItemArmor.func_94602_b(armorSlot);
    }
}
