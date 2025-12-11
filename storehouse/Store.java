package mcu.storehouse;

import mcu.DayZ;
import mcu.entity.ExtendedPlayer;
import mcu.items.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;

public class Store {
    public static ArrayList<Store> clientStores = new ArrayList<>();
    public long timer;
    public boolean unlocked;
    public ItemStack[] stacks = new ItemStack[54];

    public static void sync(EntityPlayer player) {
        ExtendedPlayer server = ExtendedPlayer.get(player);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream stream = new DataOutputStream(byteArrayOutputStream);
        try {
            stream.writeInt(server.stores.size());
            for (Store s : server.stores) {
                stream.writeLong(s.timer - player.worldObj.getTotalWorldTime());
                stream.writeBoolean(s.unlocked);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DayZ.network.sendTo(DayZ.network.createPacket(99, byteArrayOutputStream.toByteArray()),
                (EntityPlayerMP) player);
    }

    public static void clientSync(byte[] data) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        DataInputStream stream = new DataInputStream(byteArrayInputStream);
        try {
            clientStores.clear();
            int size = stream.readInt();
            for (int i = 0; i < size; i++) {
                Store store = new Store();
                store.timer = stream.readLong();
                store.unlocked = stream.readBoolean();
                clientStores.add(store);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clientClickStore(int id) {
        DayZ.network.sendToServer(DayZ.network.createPacket(98, id));
    }

    public static void serverClickStore(EntityPlayer player, int id) {
        ExtendedPlayer server = ExtendedPlayer.get(player);
        server.stores.get(id).openChest(player);
    }

    public static void clientBoostStore(int id) {
        DayZ.network.sendToServer(DayZ.network.createPacket(97, id));
    }

    public void openChest(EntityPlayer player) {
        if (unlocked) {
            IInventory inventory = new IInventory() {
                public ItemStack getStackInSlot(int n) {
                    return stacks[n];
                }

                public ItemStack decrStackSize(int index, int count) {
                    if (stacks[index] == null) {
                        return null;
                    } else {
                        ItemStack splitStack;
                        if (stacks[index].stackSize <= count) {
                            splitStack = stacks[index];
                            stacks[index] = null;
                        } else {
                            splitStack = stacks[index].splitStack(count);
                            if (stacks[index].stackSize == 0) {
                                stacks[index] = null;
                            }

                        }
                        markDirty();
                        return splitStack;
                    }
                }

                public ItemStack getStackInSlotOnClosing(final int n) {
                    if (stacks[n] != null) {
                        final ItemStack ItemStack = stacks[n];
                        stacks[n] = null;
                        return ItemStack;
                    }
                    return null;
                }

                public void setInventorySlotContents(int slot, ItemStack item) {
                    stacks[slot] = item;
                    if (item != null && item.stackSize > getInventoryStackLimit()) {
                        item.stackSize = getInventoryStackLimit();
                    }
                    markDirty();
                }

                @Override
                public int getSizeInventory() {
                    return stacks.length;
                }

                @Override
                public String getInventoryName() {
                    return "Склад";
                }

                @Override
                public boolean hasCustomInventoryName() {
                    return true;
                }

                @Override
                public int getInventoryStackLimit() {
                    return 64;
                }

                @Override
                public void markDirty() {

                }

                @Override
                public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
                    return true;
                }

                @Override
                public void openInventory() {

                }

                @Override
                public void closeInventory() {
                }

                @Override
                public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
                    return true;
                }
            };
            player.displayGUIChest(inventory);
        } else {
            if (unlock(player))
                openChest(player);
        }
    }

    public boolean unlock(EntityPlayer player) {
        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            ItemStack stack = player.inventory.getStackInSlot(i);
            if (stack != null) {
                if (stack.getItem() == Items.storageCard) {
                    if (!player.worldObj.isRemote) {
                        player.inventory.setInventorySlotContents(i, null);
                        unlocked = true;
                        timer = player.worldObj.getTotalWorldTime() + (20 * 60 * 60 * 24);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void update(World world) {
        if (unlocked && world.getTotalWorldTime() > timer) {
            unlocked = false;
            stacks = new ItemStack[54];
        }
    }

    public boolean boostTime(EntityPlayer player) {
        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            ItemStack stack = player.inventory.getStackInSlot(i);
            if (stack != null) {
                if (stack.getItem() == Items.itemDiamondCoin) {
                    if (!player.worldObj.isRemote) {
                        if (stack.stackSize != 0) {
                            timer = timer + ((20 * 60 * 60 * 8));
                            stack.stackSize--;
                        }
                        if (stack.stackSize <= 0) {
                            player.inventory.setInventorySlotContents(i, null);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
