package mcu.client.gui.menu;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;

import java.io.File;
import java.io.IOException;

public class EventHandler {
    public static AbstractClientPlayer menuPlayer;

    public static EntityLivingBase menuPlayer() {
        if (menuPlayer == null) {
            menuPlayer = new MenuPlayer();
        }
        return menuPlayer;
    }

    public static NBTTagCompound savePlayer(EntityPlayer entityPlayer) {
        File file = new File(Minecraft.getMinecraft().mcDataDir, "/saves/player.dat");
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        entityPlayer.writeEntityToNBT(nBTTagCompound);
        nBTTagCompound.setBoolean("Sleeping", false);
        try {
            CompressedStreamTools.write(nBTTagCompound, file);
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return nBTTagCompound;
    }

    public static void loadPlayer() {
        try {
            File file = new File(Minecraft.getMinecraft().mcDataDir, "/saves/player.dat");
            NBTTagCompound nBTTagCompound = CompressedStreamTools.read(file);
            if (nBTTagCompound == null) {
                return;
            }
            nBTTagCompound.setBoolean("Sleeping", false);
            nBTTagCompound.setShort("SleepTimer", (short) 0);
            menuPlayer = new MenuPlayer();
            menuPlayer.readEntityFromNBT(nBTTagCompound);
        } catch (Throwable throwable) {
        }
    }
}
