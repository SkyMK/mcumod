package com.flansmod.common.driveables.mechas;

import net.minecraft.block.material.Material;

public enum EnumMechaToolType {
    pickaxe, axe, shovel, shears, sword;

    EnumMechaToolType() {
    }

    public static EnumMechaToolType getToolType(String s) {
        EnumMechaToolType[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            EnumMechaToolType type = var1[var3];
            if (type.toString().equals(s)) {
                return type;
            }
        }

        return sword;
    }

    public boolean effectiveAgainst(Material material) {
        switch (this) {
            case pickaxe:
                return material == Material.iron || material == Material.anvil || material == Material.rock
                        || material == Material.ice;
            case axe:
                return material == Material.wood || material == Material.plants || material == Material.vine;
            case shovel:
                return material == Material.grass || material == Material.ground || material == Material.sponge
                        || material == Material.sand || material == Material.snow || material == Material.craftedSnow
                        || material == Material.clay;
            case shears:
                return material == Material.leaves || material == Material.vine || material == Material.cloth
                        || material == Material.carpet;
            case sword:
                return material == Material.web;
            default:
                return false;
        }
    }
}
