// 
// Decompiled by Procyon v0.5.36
// 

package mcu.utils;

import net.minecraft.util.AxisAlignedBB;

public interface MCUInteractable {
    AxisAlignedBB boundingBox();

    void interactWith();

    void render(final float p0);

    String name();
}
