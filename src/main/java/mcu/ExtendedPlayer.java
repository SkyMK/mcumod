package mcu.entity;

import mcu.DayZ;
import mcu.network.PacketHandler;
import mcu.server.commands.MCUCommand;
import mcu.storehouse.Store;
import mcu.utils.Pex;
import mcu.utils.SidedProtection;
import mcu.utils.Utils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.common.util.Constants;

import java.util.ArrayList;

public class ExtendedPlayer implements IExtendedEntityProperties {
    public final static String PROPERTIES_NAME = "MCUPlayer";
    public boolean bleeding;
    public float healing, startHealValue;
    public float healDamageCancel;
    public IInventory chest;
    public ItemStack[] stacks = new ItemStack[54];
    public ArrayList<Store> stores = new ArrayList<Store>();
    private EntityPlayer player;
    private int zombiekills, playerkills, invisible;

    public ExtendedPlayer() {
    }

    public ExtendedPlayer(EntityPlayer player) {
        this.player = player;
        this.playerkills = 0;
        this.zombiekills = 0;
    }

    public static ExtendedPlayer get(EntityPlayer player) {
        return (ExtendedPlayer) player.getExtendedProperties(PROPERTIES_NAME);
    }

    @Override
    public void saveNBTData(NBTTagCompound compound) {
        NBTTagCompound properties = new NBTTagCompound();
        properties.setInteger("zombieskills", this.zombiekills);
        properties.setInteger("playerskills", this.playerkills);
        properties.setInteger("invisible", this.invisible);
        properties.setBoolean("bleeding", bleeding);
        properties.setFloat("healing", this.healing);
        properties.setFloat("healDamageCancel", this.healDamageCancel);
        properties.setFloat("startHealValue", this.startHealValue);
        NBTTagList nbttaglist = new NBTTagList();
        for (int nbtTagCompound = 0; nbtTagCompound < this.stacks.length; ++nbtTagCompound) {
            NBTTagCompound iter = new NBTTagCompound();
            if (this.stacks[nbtTagCompound] != null) {
                this.stacks[nbtTagCompound].writeToNBT(iter);
            }
            nbttaglist.appendTag(iter);
        }
        compound.setTag("chest", nbttaglist);
        NBTTagList list = new NBTTagList();
        for (Store s : stores) {
            NBTTagCompound cmd = new NBTTagCompound();
            cmd.setLong("timer", s.timer);
            cmd.setBoolean("unlocked", s.unlocked);
            NBTTagList items = new NBTTagList();
            for (int i = 0; i < s.stacks.length; i++) {
                NBTTagCompound icmd = new NBTTagCompound();
                if (s.stacks[i] != null) {
                    s.stacks[i].writeToNBT(icmd);
                }
                items.appendTag(icmd);
                cmd.setTag("items", items);
            }
            list.appendTag(cmd);
        }
        compound.setTag("store", list);
        compound.setTag(PROPERTIES_NAME, properties);
    }

    @Override
    public void loadNBTData(NBTTagCompound compound) {
        NBTTagCompound properties = (NBTTagCompound) compound.getTag(PROPERTIES_NAME);
        this.zombiekills = properties.getInteger("zombieskills");
        this.playerkills = properties.getInteger("playerskills");
        this.bleeding = properties.getBoolean("bleeding");
        this.invisible = properties.getInteger("invisible");
        this.healing = properties.getFloat("healing");
        this.healDamageCancel = properties.getFloat("healDamageCancel");
        this.startHealValue = properties.getFloat("startHealValue");
        {
            NBTTagList string;
            int i;
            if (compound.hasKey("chest", 9)) {
                string = compound.getTagList("chest", 10);

                for (i = 0; i < this.stacks.length && i < string.tagCount(); ++i) {
                    this.stacks[i] = ItemStack.loadItemStackFromNBT(string.getCompoundTagAt(i));
                }
            }
        }
        {
            NBTTagList list;
            int i = 0;
            if (compound.hasKey("store", 9)) {
                list = compound.getTagList("store", 10);
                for (i = 0; i < list.tagCount(); i++) {
                    NBTTagCompound cmd = list.getCompoundTagAt(i);
                    Store store = new Store();
                    store.timer = cmd.getLong("timer");
                    store.unlocked = cmd.getBoolean("unlocked");
                    NBTTagList stacks = cmd.getTagList("items", Constants.NBT.TAG_COMPOUND);
                    for (int b = 0; b < stacks.tagCount(); b++) {
                        store.stacks[b] = ItemStack.loadItemStackFromNBT(stacks.getCompoundTagAt(b));
                    }
                    stores.add(store);
                }
            }
        }
        if (stores.size() == 0) {
            for (int i = 0; i < 10; i++) {
                Store store = new Store();
                if (i == 0) {
                    store.timer = player.worldObj.getTotalWorldTime() + (20 * 60 * 60 * 48);
                    store.unlocked = true;
                }
                stores.add(store);
            }
        }
        compound.removeTag("store");
        compound.removeTag("chest");

    }

    @Override
    public void init(Entity entity, World world) {
    }

    public void playerKill() {
        this.playerkills++;
        sync();
    }

    public void zombieKill() {
        this.zombiekills++;
        sync();
    }

    public void openChest(EntityPlayer to) {
        if (!SidedProtection.SERVER)
            return;
        if (MCUCommand.offChest) {
            player.addChatComponentMessage(
                    new ChatComponentText("Сундуки выключены в данный момент.Лут в сундуках не удален."));
            return;
        }
        if (!Utils.inSafezone(player)) {
            int timer = Pex.getTime(player.getCommandSenderName());
            if (player.attackTime > timer) {
                player.addChatComponentMessage(new ChatComponentText("Вы не можете открыть хранилище ещё "
                        + (int) ((float) (player.attackTime - timer) / 20) + " сек"));
                return;
            }
        }
        if (chest == null) {
            chest = new IInventory() {

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
                            markDirty();
                            return splitStack;
                        } else {
                            splitStack = stacks[index].splitStack(count);
                            if (stacks[index].stackSize == 0) {
                                stacks[index] = null;
                            }

                            markDirty();
                            return splitStack;
                        }
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
                    return Pex.getInventorySize(player.getCommandSenderName());
                }

                @Override
                public String getInventoryName() {
                    return "Хранилище";
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
        }
        if (to == null)
            player.displayGUIChest(chest);
        else
            to.displayGUIChest(chest);
    }

    public void setBleeding(boolean bleeding) {
        this.bleeding = bleeding;
        sync();
    }

    public void startHeal(float healDamageCancel) {
        this.startHeal(20, healDamageCancel);
    }

    public void onUpdate(long ticks) {
        if (ticks % 5 == 0) {
            if (healing > 0) {
                player.heal(1.5F);
                healing = healing - 1.5F;
                sync();
            }
        }
    }

    public void hurt(float value) {
        if (value > healDamageCancel && healing > 0) {
            healing = 0;
            sync();
        }
    }

    public void startHeal(float healing, float healDamageCancel) {
        this.startHealValue = healing;
        this.healing = healing;
        this.healDamageCancel = healDamageCancel;
        sync();
    }

    public void copyNBT(ExtendedPlayer props) {
        this.playerkills = props.playerkills;
        this.zombiekills = props.zombiekills;
        this.bleeding = props.bleeding;
        this.invisible = props.invisible;
        this.healDamageCancel = props.healDamageCancel;
        this.healing = props.healing;
        this.startHealValue = props.startHealValue;
        this.stacks = props.stacks;
        this.stores = props.stores;
    }

    public int getZombiesKills() {
        return zombiekills;
    }

    public int getPlayersKills() {
        return playerkills;
    }

    public int getInvisible() {
        return invisible;
    }

    public void setInvisible(int time) {
        this.invisible = time;
        sync();
    }

    public void updateInvisible() {
        if (Utils.inSafezone(player))
            invisible = 5;
        else {
            if (invisible > 0)
                invisible--;
        }
        sync();
    }

    public void sync() {
        NBTTagCompound shit = new NBTTagCompound();
        NBTTagCompound properties = new NBTTagCompound();
        properties.setInteger("zombieskills", this.zombiekills);
        properties.setInteger("playerskills", this.playerkills);
        properties.setBoolean("bleeding", this.bleeding);
        properties.setInteger("invisible", invisible);
        properties.setFloat("healing", this.healing);
        properties.setFloat("startHealValue", this.startHealValue);
        shit.setTag(PROPERTIES_NAME, properties);
        DayZ.network.sendTo(DayZ.network.createPacket(PacketHandler.SYNC_NBT, shit), (EntityPlayerMP) player);
    }
}
