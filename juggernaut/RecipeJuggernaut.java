package mcu.juggernaut;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RecipeJuggernaut implements IRecipe {

    @Override
    public boolean matches(InventoryCrafting inv, World p_77569_2_) {
        boolean detected_iron = false;
        for (int j = 0; j < inv.getSizeInventory(); j++) {
            if (inv.getStackInSlot(j) != null && inv.getStackInSlot(j).getItem() != null
                    && inv.getStackInSlot(j).getItem() == net.minecraft.init.Items.iron_ingot) {
                detected_iron = true;
            }
        }
        for (int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack juggernaut = inv.getStackInSlot(i);
            if (juggernaut != null && juggernaut.getItem() != null && juggernaut.getItem() instanceof ItemArmor
                    && detected_iron && juggernaut.getItem() != net.minecraft.init.Items.iron_boots
                    && juggernaut.getItem() != net.minecraft.init.Items.iron_leggings
                    && juggernaut.getItem() != net.minecraft.init.Items.iron_chestplate
                    && juggernaut.getItem() != net.minecraft.init.Items.iron_helmet) {
                return juggernaut.stackSize <= 1;
            }
        }
        return false;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        for (int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack juggernaut = inv.getStackInSlot(i);
            if (juggernaut != null && juggernaut.getItem() != null && juggernaut.getItem() instanceof ItemArmor
                    && juggernaut.getItemDamage() > 1) {
                ItemStack toReturn = juggernaut.copy();
                toReturn.setItemDamage(juggernaut.getItemDamage() - 250);
                return toReturn;
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
