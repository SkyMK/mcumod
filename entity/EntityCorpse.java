// 
// Decompiled by Procyon v0.5.36
// 

package mcu.entity;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EntityCorpse extends Entity implements IInventory {
    public ItemStack[] mainItemsStored;
    public String corpsePlayerName;
    public long removeTime;
    private int opened;

    public EntityCorpse(World World) {
        super(World);
        this.mainItemsStored = new ItemStack[45];
        this.corpsePlayerName = "";
        this.opened = 0;
        this.setSize(0.5f, 0.5f);
        this.ignoreFrustumCheck = true;
    }

    public EntityCorpse(EntityPlayer entityPlayer, List<ItemStack> list$) {
        this(entityPlayer.worldObj);
        this.rotationYaw = entityPlayer.rotationYaw + 90.0f;
        ArrayList<ItemStack> list = new ArrayList<>();
        list.addAll(list$);
        list.addAll(Arrays.asList(entityPlayer.inventory.armorInventory));
        list.removeIf(w -> w == null);
        this.setUsernameKilled(this.corpsePlayerName = entityPlayer.getCommandSenderName());
        this.setPosition(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        this.mainItemsStored = new ItemStack[Math.max(45, ((list.size() - 1) / 9 + 1) * 9)];
        for (int i = 0; i < list.size(); ++i) {
            this.setInventorySlotContents(i, list.get(i));
        }
        if (!list.isEmpty()) {
            this.removeTime = System.currentTimeMillis() + 180000L;
            return;
        }
        this.removeTime = System.currentTimeMillis() + 1000L;
    }

    protected void entityInit() {
        this.dataWatcher.addObject(20, "");
        this.dataWatcher.addObject(21, 0);
    }

    public void onUpdate() {
        if (!this.worldObj.isRemote) {
            this.removeTime -= 150L;
            while (this.removeTime < System.currentTimeMillis()) {
                this.setLifeStage(this.getLifeStage() + 1);
                boolean b = true;
                ItemStack[] mainItemsStored;
                for (int length = (mainItemsStored = this.mainItemsStored).length, i = 0; i < length; ++i) {
                    if (mainItemsStored[i] != null) {
                        this.removeTime += 180000L;
                        b = false;
                        break;
                    }
                }
                if (b) {
                    this.removeTime += 1000L;
                }
            }
            if (this.getLifeStage() > 14) {
                this.setDead();
                return;
            }
        }
        if (hurtResistantTime > 0)
            hurtResistantTime--;
    }

    public void setDead() {
        for (int i = 0; i < this.mainItemsStored.length; ++i) {
            if (this.opened > 0 && this.mainItemsStored[i] != null) {
                this.entityDropItem(this.mainItemsStored[i], 1.0f);
            }
            this.mainItemsStored[i] = null;
        }
        super.setDead();
    }

    public boolean hitByEntity(Entity entity) {
        if (!this.worldObj.isRemote) {
            if (hurtResistantTime == 0) {
                this.hurtResistantTime = 8;
                this.setLifeStage(this.getLifeStage() + 3);
            }
        }
        return false;
    }

    public boolean canBeCollidedWith() {
        return !this.isDead;
    }

    protected void readEntityFromNBT(NBTTagCompound root) {
        this.setUsernameKilled(this.corpsePlayerName = root.getString("texture"));
        this.removeTime = root.getLong("removeTime");
        NBTTagList string;
        int i;
        if (root.hasKey("Equipment", 9)) {
            string = root.getTagList("Equipment", 10);

            for (i = 0; i < this.mainItemsStored.length && i < string.tagCount(); ++i) {
                this.mainItemsStored[i] = ItemStack.loadItemStackFromNBT(string.getCompoundTagAt(i));
            }
        }
        root.removeTag("Equipment");
    }

    protected void writeEntityToNBT(NBTTagCompound NBTTagCompound) {
        NBTTagCompound.setString("texture", this.corpsePlayerName);
        NBTTagCompound.setLong("removeTime", this.removeTime);
        NBTTagList nbttaglist = new NBTTagList();
        for (int nbtTagCompound = 0; nbtTagCompound < this.mainItemsStored.length; ++nbtTagCompound) {
            NBTTagCompound iter = new NBTTagCompound();
            if (this.mainItemsStored[nbtTagCompound] != null) {
                this.mainItemsStored[nbtTagCompound].writeToNBT(iter);
            }
            nbttaglist.appendTag(iter);
        }
        NBTTagCompound.setTag("Equipment", nbttaglist);
    }

    public String getUsernameKilled() {
        return this.dataWatcher.getWatchableObjectString(20);
    }

    public void setUsernameKilled(String s) {
        this.dataWatcher.updateObject(20, s);
    }

    public int getLifeStage() {
        return this.dataWatcher.getWatchableObjectInt(21);
    }

    public void setLifeStage(int n) {
        this.dataWatcher.updateObject(21, n);
    }

    public int getSizeInventory() {
        return this.mainItemsStored.length;
    }

    public ItemStack getStackInSlot(int n) {
        return this.mainItemsStored[n];
    }

    public ItemStack decrStackSize(int index, int count) {
        if (this.mainItemsStored[index] == null) {
            return null;
        } else {
            ItemStack splitStack;
            if (this.mainItemsStored[index].stackSize <= count) {
                splitStack = this.mainItemsStored[index];
                this.mainItemsStored[index] = null;
                this.markDirty();
                return splitStack;
            } else {
                splitStack = this.mainItemsStored[index].splitStack(count);
                if (this.mainItemsStored[index].stackSize == 0) {
                    this.mainItemsStored[index] = null;
                }

                this.markDirty();
                return splitStack;
            }
        }
    }

    public ItemStack getStackInSlotOnClosing(final int n) {
        if (this.mainItemsStored[n] != null) {
            final ItemStack ItemStack = this.mainItemsStored[n];
            this.mainItemsStored[n] = null;
            return ItemStack;
        }
        return null;
    }

    public void setInventorySlotContents(int slot, ItemStack item) {
        this.mainItemsStored[slot] = item;
        if (item != null && item.stackSize > this.getInventoryStackLimit()) {
            item.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public void markDirty() {
    }

    public boolean isUseableByPlayer(EntityPlayer entityPlayer) {
        return !this.isDead && entityPlayer.getDistanceSqToEntity(this) <= 64.0;
    }

    public void openChest() {
        ++this.opened;
    }

    public void closeChest() {
        --this.opened;
    }

    public boolean isItemValidForSlot(int n, ItemStack ItemStack) {
        return false;
    }

    @Override
    public String getInventoryName() {
        return this.getUsernameKilled() + "'s Corpse";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public void openInventory() {
        openChest();
    }

    @Override
    public void closeInventory() {
        closeChest();
    }

    public boolean interactFirst(EntityPlayer pisya) {
        if (pisya instanceof EntityPlayerMP) {
            if (ExtendedPlayer.get(pisya).getInvisible() > 0 && !Utils.inSafezone(pisya)) {
                pisya.addChatComponentMessage(new ChatComponentText("У вас неуязвимость"));
                return false;
            }
        }
        pisya.displayGUIChest(this);
        return true;
    }

}
