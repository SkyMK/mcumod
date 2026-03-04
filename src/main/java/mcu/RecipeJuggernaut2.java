package mcu.juggernaut;

import mcu.items.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RecipeJuggernaut2 implements IRecipe {

    @Override
    public boolean matches(InventoryCrafting inv, World p_77569_2_) {
        boolean detected_iron = false;
        for (int j = 0; j < inv.getSizeInventory(); j++) {
            if (inv.getStackInSlot(j) != null && inv.getStackInSlot(j).getItem() != null
                    && inv.getStackInSlot(j).getItem() == Items.itemCharging) {
                detected_iron = true;
            }
        }
        for (int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack stack = null;
            if ((stack = inv.getStackInSlot(i)) != null && detected_iron) {
                Item item = stack.getItem();
                for (int $ = 0; $ < Items.PROTOTYPE.length; $++) {
                    if (item == Items.PROTOTYPE[$]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        for (int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack stack = null;
            if ((stack = inv.getStackInSlot(i)) != null) {
                int currentJag = 0;
                for (int c = 0; c < Items.PROTOTYPE.length; c++) {
                    if (stack.getItem() == Items.PROTOTYPE[c]) {
                        return new ItemStack(Items.JAG[c]);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public int getRecipeSize() {
        return 9;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return null;
    }
}
