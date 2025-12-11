package mcu;

import cpw.mods.fml.common.FMLCommonHandler;
import mcu.client.gui.house.ContainerHouse;
import mcu.entity.EntityHouse;
import mcu.items.Items;
import mcu.network.PacketHandler;
import mcu.server.ServerEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
    public CommonProxy() {
    }

    private static Container getContainer(final int id, final EntityPlayer player, final Entity entity,
                                          NBTTagCompound nbt) {
        switch (id) {
            case 0:
                if (!(entity instanceof EntityHouse))
                    return null;
                return new ContainerHouse(player, (EntityHouse) entity, nbt);
            default:
                return null;
        }
    }

    public void preInit() {
    }

    public void init() {
        Items.registerItems();
        ServerEvent handler = new ServerEvent();

        MinecraftForge.EVENT_BUS.register(handler);
        FMLCommonHandler.instance().bus().register(handler);

    }

    public void postInit() {
    }

    public void openGuiHouse(byte id, EntityPlayer player, Entity entity, NBTTagCompound nbt) {
        if (player instanceof EntityPlayerMP) {
            EntityPlayerMP playerMP = (EntityPlayerMP) player;
            Container container = getContainer(id, player, entity, nbt);
            if (container == null)
                return;
            playerMP.closeContainer();
            playerMP.getNextWindowId();
            int windowId = playerMP.currentWindowId;

            NBTTagCompound tag = new NBTTagCompound();
            tag.setInteger("windowID", windowId);
            tag.setByte("id", id);
            tag.setInteger("entityID", entity.getEntityId());
            tag.setString("HouseTime", nbt.getString("HouseTime"));
            DayZ.network.sendTo(DayZ.network.createPacket(PacketHandler.OPEN_GUI_HOUSE, tag),
                    (EntityPlayerMP) player);

            player.openContainer = container;
            playerMP.openContainer.windowId = windowId;
            playerMP.openContainer.addCraftingToCrafters(playerMP);
        }
    }
}
