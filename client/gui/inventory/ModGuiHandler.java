// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.gui.inventory;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ModGuiHandler implements IGuiHandler {
    public static final int CUSTOM_INV = 0;

    public Object getServerGuiElement(final int guiId, final EntityPlayer player, final World world, final int x,
                                      final int y, final int z) {
        if (guiId == 0) {
            return new CustomPlayerContainer(player, player.inventory,
                    PlayerInventoryProperty.get(player).inventory);
        }
        return null;
    }

    public Object getClientGuiElement(final int guiId, final EntityPlayer player, final World world, final int x,
                                      final int y, final int z) {
        if (guiId == 0) {
            return new CustomPlayerGui(player, player.inventory,
                    PlayerInventoryProperty.get(player).inventory);
        }
        return null;
    }
}
