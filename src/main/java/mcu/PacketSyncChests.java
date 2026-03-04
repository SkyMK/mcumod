package mcu.looting.network.packages;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import mcu.looting.LootingChestsMod;
import mcu.looting.network.AbstractPacket;
import mcu.looting.other.ModConfig;
import mcu.looting.other.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayList;
import java.util.List;

public class PacketSyncChests extends AbstractPacket {
    public List<String> names;

    public PacketSyncChests() {
        if (LootingChestsMod.COMPILATION_SERVER) {
            names = new ArrayList<>();
            for (ModConfig.Chest chest : ModConfig.chests)
                names.add(chest.name);
        }
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(names.size());
        for (String str : names)
            ByteBufUtils.writeUTF8String(buf, str);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        int count = buf.readInt();
        names = new ArrayList<>();
        for (int i = 0; i < count; i++)
            names.add(ByteBufUtils.readUTF8String(buf));
    }

    @Override
    public void clientHandler(EntityPlayer player) {
        if (LootingChestsMod.stacksToTab == null || LootingChestsMod.stacksToTab.size() != names.size()) {
            LootingChestsMod.stacksToTab = new ArrayList<>();
            for (String name : names) {
                ItemStack stack = new ItemStack(ModItems.chestBlock);
                NBTTagCompound tag = new NBTTagCompound();
                tag.setString("Name", name);
                stack.setTagCompound(new NBTTagCompound());
                stack.getTagCompound().setTag("display", tag);
                LootingChestsMod.stacksToTab.add(stack);
            }
        }
    }

    @Override
    public void serverHandler(EntityPlayerMP player) {

    }
}
