package mcu.entity;

import com.google.common.collect.Lists;
import mcu.DayZ;
import mcu.items.ItemHouse;
import mcu.utils.SidedProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants.NBT;

import java.util.ArrayList;
import java.util.List;

public class EntityHouse extends Entity {
    public static boolean freezeHouses;
    public InventoryBasic inventoryHouse = new InventoryBasic("House", false, 54);
    public long time, fuel;
    public String owner;
    public boolean stove, client;
    public NBTTagList houseEntities = new NBTTagList();

    public EntityHouse(final World World) {
        super(World);
        this.setSize(3f, 2.4f);
    }

    public EntityHouse(final World World, String owner, long timer, boolean client) {
        super(World);
        this.setSize(3f, 2.4f);
        this.time = timer;
        this.owner = owner;
        this.client = client;
    }

    public static ItemStack applyItemDamage(ItemStack itemstack) {
        return itemstack;
    }

    public void addEntity(Entity entity) {
        if (!SidedProtection.SERVER)
            return;
        NBTTagCompound root = new NBTTagCompound();
        if (entity != null) {
            entity.writeToNBT(root);
            root.setString("id", EntityList.getEntityString(entity));
            this.houseEntities.appendTag(root);
        }
        updateRNVehNames();
        entity.setDead();
    }

    public void getEntity(int i) {
        if (!SidedProtection.SERVER)
            return;
        Entity en = EntityList.createEntityFromNBT(houseEntities.getCompoundTagAt(i), worldObj);
        if (en != null) {
            en.readFromNBT(houseEntities.getCompoundTagAt(i));
            worldObj.spawnEntityInWorld(en);
            houseEntities.removeTag(i);
            updateRNVehNames();
        }
    }

    public void updateRNVehNames() {
        if (!SidedProtection.SERVER)
            return;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.houseEntities.tagCount(); i++) {
            Entity en = EntityList.createEntityFromNBT(houseEntities.getCompoundTagAt(i), worldObj);
            en.readFromNBT(houseEntities.getCompoundTagAt(i));
            if (en != null) {
                // builder.append(Vehicle.getName(en));
                builder.append("\n");
            }
        }
        getDataWatcher().updateObject(30, builder.toString());
    }

    protected void entityInit() {
        this.dataWatcher.addObject(30, "");
        registerBoolean(29);
        this.dataWatcher.addObject(28, "");
    }

    public void openHouse(EntityPlayer player) {
        if (!SidedProtection.SERVER)
            return;
        NBTTagCompound tagh = new NBTTagCompound();
        tagh.setString("HouseTime", String.valueOf(time - worldObj.getTotalWorldTime()));
        tagh.setInteger("entityId", this.getEntityId());
        DayZ.proxy.openGuiHouse((byte) 0, player, this, tagh);
        if (player.capabilities.isCreativeMode)
            DayZ.sendHint(player, "Таймер епта " + (time - worldObj.getTotalWorldTime()), 200);
    }

    @Override
    public boolean interactFirst(EntityPlayer e) {
        if (!SidedProtection.SERVER)
            return true;
        if (e.getHeldItem() != null && e.getHeldItem().getItem() == mcu.items.Items.houseremover
                && !worldObj.isRemote) {
            if (e.capabilities.isCreativeMode) {
                if (e.isSneaking()) {
                    DayZ.log(e.getCommandSenderName() + " открыл дом " + owner + " " + posX + " " + posY + " " + posZ);
                    openHouse(e);
                } else {
                    DayZ.log(e.getCommandSenderName() + " снес дом " + owner + " " + posX + " " + posY + " " + posZ);
                    this.time = 0;
                }
            }
        }
        if (!this.worldObj.isRemote) {
            if (e.getHeldItem() != null) {
                if (e.getHeldItem().getItem() instanceof ItemHouse && e.isSneaking()) {
                    ItemHouse ih = (ItemHouse) e.getHeldItem().getItem();
                    e.getHeldItem().stackSize = 0;
                    e.swingItem();
                    this.time = this.time + ih.timer;
                    e.addChatComponentMessage(
                            new ChatComponentText(EnumChatFormatting.YELLOW + "Дом был успешно продлен."));
                }
            }
            if (e.getCommandSenderName().equals(this.owner)) {
                if (e.ridingEntity != null) {
                    openHouse(e);
                }
                if (e.isSneaking()) {
                    openHouse(e);
                } else {
                    if (e.attackTime > 0) {
                        e.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED
                                + "Вы не можете сесть в дом ещё " + e.attackTime / 20 + " секунд."));
                        return true;
                    }
                    e.mountEntity(this);
                }
            }
        }
        return true;
    }

    public boolean canPickUpLoot() {
        return false;
    }

    public double getMountedYOffset() {
        return 0.6D;
    }

    public boolean isStoveEnabled() {
        return getBoolean(29);
    }

    public String getOwnerName() {
        return client ? "Place House" : this.getDataWatcher().getWatchableObjectString(28);
    }

    public List<String> listVehicles() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < java.util.Arrays.asList(this.getDataWatcher().getWatchableObjectString(30).split("\n"))
                .size(); i++) {
            if (!java.util.Arrays.asList(this.getDataWatcher().getWatchableObjectString(30).split("\n")).get(i)
                    .equals("")) {
                arrayList.add(
                        java.util.Arrays.asList(this.getDataWatcher().getWatchableObjectString(30).split("\n")).get(i));
            }
        }
        return arrayList;
    }

    public void onUpdateServer() {
        if (!SidedProtection.SERVER)
            return;
        StringBuilder builder = new StringBuilder();
        if (riddenByEntity != null) {
            EntityPlayer player = (EntityPlayer) riddenByEntity;
            if (player.worldObj.getTotalWorldTime() % 5 == 0) {
                player.heal(0.1F);
            }
        }
        updateBoolean(29, stove);
        this.dataWatcher.updateObject(28, this.owner);
        if (freezeHouses)
            time++;
        this.isDead = this.time <= worldObj.getTotalWorldTime();
        if (this.time <= worldObj.getTotalWorldTime()) {
            this.setDead();
        }
    }

    public void onUpdateClient() {
        if (!SidedProtection.CLIENT)
            return;
        if (this.worldObj.isRemote && this.ticksExisted % 2 == 0) {
            this.worldObj.spawnParticle("explode", this.posX + 0.7, this.posY + 2.8,
                    this.posZ + -Math.sin(Math.toRadians(this.rotationYaw - 300.0f)) * 1.2 - 0.3, 0.0, 0.05, 0.0);
        }
    }

    public void onUpdate() {
        if (worldObj.isRemote)
            onUpdateClient();
        else
            onUpdateServer();
        this.motionX = 0;
        this.motionY = 0;
        this.motionZ = 0;
    }

    public void setDead() {
        if (this.time <= worldObj.getTotalWorldTime()) {
            DayZ.log(owner + " погиб " + posX + " " + posY + " " + posZ + " из-за окончания времени " + time + " "
                    + this.worldObj.getTotalWorldTime());
            super.setDead();
        }
    }

    public boolean hitByEntity(final Entity entity) {
        return false;
    }

    public boolean canBeCollidedWith() {
        return !this.isDead;
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbt) {
        if (!SidedProtection.SERVER)
            return;
        if (this.inventoryHouse == null)
            return;
        NBTTagList list2 = new NBTTagList();
        for (int i = 0; i < this.inventoryHouse.getSizeInventory(); ++i) {
            if (this.inventoryHouse.getStackInSlot(i) == null)
                continue;
            NBTTagCompound slot_nbt = new NBTTagCompound();
            this.inventoryHouse.getStackInSlot(i).writeToNBT(slot_nbt);
            slot_nbt.setByte("Slot", (byte) i);
            list2.appendTag(slot_nbt);
        }
        nbt.setTag("Inventory", list2);
        nbt.setLong("time", this.time);
        nbt.setString("owner", this.owner);
        nbt.setBoolean("stove", this.stove);
        nbt.setLong("fuel", this.fuel);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbt) {
        if (!SidedProtection.SERVER)
            return;
        this.inventoryHouse = new InventoryBasic("House", false, 54);
        if (nbt.hasKey("Inventory", NBT.TAG_LIST)) {
            NBTTagList list = nbt.getTagList("Inventory", NBT.TAG_COMPOUND);
            for (int i = 0; i < list.tagCount(); ++i) {
                NBTTagCompound slot_nbt = list.getCompoundTagAt(i);
                this.inventoryHouse.setInventorySlotContents((slot_nbt.getByte("Slot") & 255),
                        ItemStack.loadItemStackFromNBT(slot_nbt));
            }
        }
        this.time = nbt.getLong("time");
        this.owner = nbt.getString("owner");
        this.stove = nbt.getBoolean("stove");
        this.fuel = nbt.getLong("fuel");
    }

    @Override
    public AxisAlignedBB getCollisionBox(Entity entity) {
        return null;
    }

    @Override
    public AxisAlignedBB getBoundingBox() {
        return boundingBox;
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public void markDirty() {
    }

    public boolean isUseableByPlayer(final EntityPlayer entityPlayer) {
        return !this.isDead && entityPlayer.getDistanceSqToEntity(this) <= 64.0;
    }

    public boolean isItemValidForSlot(final int n, final ItemStack ItemStack) {
        return false;
    }

    @Override
    public boolean canBePushed() {
        return false;
    }

    public void onEntityUpdate() {
        super.onEntityUpdate();
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
    }

    public void updateBoolean(int id, boolean value) {
        this.getDataWatcher().updateObject(id, value ? 1 : 0);
    }

    public boolean getBoolean(int id) {
        return this.getDataWatcher().getWatchableObjectInt(id) == 1;
    }

    public void registerBoolean(int id) {
        this.getDataWatcher().addObject(id, 0);
    }

    public void applyEntityCollision(final Entity entity) {
    }
}