// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.other;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import mcu.client.gui.inventory.PlayerInventoryProperty;
import mcu.inventory.network.NetworkWrapper;
import mcu.inventory.network.packages.PackageInventorySync;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import java.util.HashMap;

public class CommonEvents {
    public static HashMap<String, Vec3> lightBlocks;

    static {
        CommonEvents.lightBlocks = new HashMap<String, Vec3>();
    }

    @SubscribeEvent
    public void entityConstruct(final EntityEvent.EntityConstructing e) {
        if (e.entity instanceof EntityPlayer && e.entity.getExtendedProperties("PlayerInventoryProperty") == null) {
            e.entity.registerExtendedProperties("PlayerInventoryProperty",
                    new PlayerInventoryProperty((EntityPlayer) e.entity));
        }
    }

    @SubscribeEvent
    public void entityJoinWorld(final EntityJoinWorldEvent e) {
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT || !(e.entity instanceof EntityPlayer)) {
            return;
        }
        final EntityPlayer player = (EntityPlayer) e.entity;
        final PlayerInventoryProperty data = PlayerInventoryProperty.get(player);
        if (data != null) {
            NetworkWrapper.instance.sendTo(new PackageInventorySync(PlayerInventoryProperty.get(player)),
                    (EntityPlayerMP) player);
        }
    }

    @SubscribeEvent
    public void playerStartedTracking(final PlayerEvent.StartTracking e) {
        final PlayerInventoryProperty data = PlayerInventoryProperty.get(e.target);
        if (data != null) {
            NetworkWrapper.instance.sendTo(
                    new PackageInventorySync(PlayerInventoryProperty.get(e.entityPlayer)),
                    (EntityPlayerMP) e.entityPlayer);
        }
    }

    @SubscribeEvent
    public void onClonePlayer(final PlayerEvent.Clone e) {
        if (e.wasDeath) {
            final NBTTagCompound compound = new NBTTagCompound();
            PlayerInventoryProperty.get(e.original).saveNBTData(compound);
            PlayerInventoryProperty.get(e.entityPlayer).loadNBTData(compound);
            PlayerInventoryProperty.get(e.entityPlayer).markDirty((EntityPlayerMP) e.entityPlayer);
        }
    }

    @SubscribeEvent
    public void tickServer(final TickEvent.ServerTickEvent e) {
    }

    private void deleteLight(final String name, final World world) {
    }

    private boolean handleFlashlight(final ItemStack stack) {

        return true;
    }
}
