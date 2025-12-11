/*
 * Decompiled with CFR 0.150.
 */
package mcu.cunches;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public interface IVehicle {
    String vehName();

    void setDriver(EntityPlayer var1);

    boolean hasDriver();

    Entity entity();
}
