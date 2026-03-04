/*
 * Decompiled with CFR 0.150.
 */
package com.flansmod.mcu;

import com.flansmod.common.guns.ItemBullet;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class BulletCombiner implements IRecipe {
    public static final BulletCombiner instance = new BulletCombiner();

    private BulletCombiner() {
    }

    @Override
    public boolean matches(InventoryCrafting inventoryCrafting, World world) {
        return this.getCraftingResult(inventoryCrafting) != null;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inventoryCrafting) {
        int n = 0;
        ItemStack itemStack = null;
        ItemStack itemStack2 = null;
        for (int i = 0; i < inventoryCrafting.getSizeInventory(); ++i) {
            ItemStack itemStack3 = inventoryCrafting.getStackInSlot(i);
            if (itemStack3 == null)
                continue;
            if (n == 0) {
                itemStack = itemStack3;
            }
            if (n == 1) {
                itemStack2 = itemStack3;
            }
            ++n;
        }
        if (n == 2 && itemStack.getItem() == itemStack2.getItem() && itemStack.stackSize == 1
                && itemStack2.stackSize == 1 && itemStack.getItem() instanceof ItemBullet) {
            int n2 = itemStack.getMaxDamage() - itemStack.getItemDamage();
            n2 += itemStack2.getMaxDamage() - itemStack2.getItemDamage();
            n2 = Math.min(n2, itemStack.getMaxDamage());
            return new ItemStack(itemStack.getItem(), 1, itemStack.getMaxDamage() - n2);
        }
        return null;
    }

    @Override
    public int getRecipeSize() {
        return 0;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return null;
    }
}
