// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.network;

import mcu.inventory.network.packages.*;

public class PacketRegister {
    private static final Class[] packets;

    static {
        packets = new Class[]{PackageInventorySync.class, PackageOpenGui.class, PackageDropItem.class,
                TakePacket.class, NotifySlotPacket.class};
    }

    public static void register() {
        for (final Class packet : PacketRegister.packets) {
            NetworkWrapper.instance.registerPacket(packet);
        }
    }
}
