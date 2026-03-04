// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.gui.inventory;

import mcu.inventory.network.NetworkWrapper;
import mcu.inventory.network.packages.PackageInventorySync;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerInventoryProperty implements IExtendedEntityProperties {
    public static final String NAME = "PlayerInventoryProperty";
    public final CustomPlayerInventory inventory;

    public PlayerInventoryProperty(final EntityPlayer player) {
        this.inventory = new CustomPlayerInventory(player);
    }

    public static PlayerInventoryProperty get(final Entity player) {
        return (PlayerInventoryProperty) player.getExtendedProperties("PlayerInventoryProperty");
    }

    public void init(final Entity entity, final World world) {
    }

    public final void saveNBTData(final NBTTagCompound compound) {
        final NBTTagCompound properties = new NBTTagCompound();
        this.inventory.writeToNBT(properties);
        compound.setTag("PlayerInventoryProperty", properties);
    }

    public final void loadNBTData(final NBTTagCompound compound) {
        final NBTTagCompound properties = (NBTTagCompound) compound.getTag("PlayerInventoryProperty");
        this.inventory.readFromNBT(properties);
    }

    public void markDirty(final EntityPlayerMP player) {
        if (!player.worldObj.isRemote) {
            NetworkWrapper.instance.sendTo(new PackageInventorySync(this), player);
        }
    }
}
