package mcu.looting.network;

import mcu.looting.network.packages.PacketSyncChests;

public class PacketRegister {
    public static final Class[] packets = new Class[]{
            PacketSyncChests.class
    };

    public static void register() {
        for (Class packet : packets)
            NetworkWrapper.instance.registerPacket(packet);
    }
}
