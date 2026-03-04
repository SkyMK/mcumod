package mcu.client.hud;

public class RadarEntry {
    public byte posX, posZ;
    public byte id;
    public RadarEntry(byte x, byte z, byte id) {
        this.posX = x;
        this.posZ = z;
        this.id = id;
    }
}