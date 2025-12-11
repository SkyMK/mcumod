package mcu.juggernaut;

import com.flansmod.common.guns.ItemBullet;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

import java.util.ArrayList;

public class RecipeBullet implements IRecipe {

    @Override
    public boolean matches(InventoryCrafting inv, World p_77569_2_) {
        int bullets = 0;
        for (int i = 0; i < inv.getInventoryStackLimit(); i++) {
            ItemStack stack = inv.getStackInSlot(i);
            if (stack != null && stack.getItem() instanceof ItemBullet && stack.stackSize == 1) {
                bullets++;
            }
        }
        return bullets == 2;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        ArrayList<ItemStack> stacks = new ArrayList<ItemStack>();
        for (int i = 0; i < inv.getInventoryStackLimit(); i++) {
            ItemStack stack = inv.getStackInSlot(i);
            if (stack != null && stack.getItem() instanceof ItemBullet) {
                stacks.add(stack);
            }
        }
        int newDur = 0;
        for (ItemStack s : stacks) {
            newDur += (s.getMaxDamage() - s.getItemDamage());
        }
        ItemStack toReturn = ItemStack.copyItemStack(stacks.get(0));
        newDur = toReturn.getMaxDamage() - newDur;
        if (newDur > toReturn.getMaxDamage())
            newDur = toReturn.getMaxDamage();
        toReturn.setItemDamage(newDur);
        return stacks.get(0).getUnlocalizedName().equals(stacks.get(1).getUnlocalizedName()) ? toReturn : null;
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
