package mcu.looting.chest;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import mcu.looting.other.Vector3f;

import java.util.ArrayList;
import java.util.List;

public class ChestsSaveData extends WorldSavedData {
    public static final String NAME = "chestsData";
    public List<BlockChest.ChestOnMap> chests = new ArrayList<>();

    public ChestsSaveData() {
        super(NAME);
    }

    public ChestsSaveData(String name) {
        super(name);
    }

    public static ChestsSaveData getOrCreateData(World world) {
        WorldSavedData data = world.loadItemData(ChestsSaveData.class, NAME);
        if (data == null) {
            data = new ChestsSaveData();
            world.setItemData(NAME, data);
        }
        return (ChestsSaveData) data;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        chests = new ArrayList<>();
        NBTTagList list = (NBTTagList) nbt.getTag("chestsData");
        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound tag = list.getCompoundTagAt(i);
            BlockChest.ChestOnMap chest = new BlockChest.ChestOnMap(new Vector3f(tag.getInteger("x"), tag.getInteger("y"), tag.getInteger("z")), tag.getString("name"), tag.getInteger("meta"));
            chest.timeToSpawn = tag.getInteger("timeToSpawn");
            chests.add(chest);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        NBTTagList list = new NBTTagList();
        for (BlockChest.ChestOnMap chest : chests) {
            NBTTagCompound tag = new NBTTagCompound();
            tag.setInteger("x", (int) chest.pos.x);
            tag.setInteger("y", (int) chest.pos.y);
            tag.setInteger("z", (int) chest.pos.z);
            tag.setString("name", chest.name);
            tag.setInteger("meta", chest.meta);
            tag.setInteger("timeToSpawn", chest.timeToSpawn);
            list.appendTag(tag);
        }
        nbt.setTag("chestsData", list);
    }

    public void addChest(BlockChest.ChestOnMap chest) {
        chests.add(chest);
        markDirty();
    }

    public void removeChest(BlockChest.ChestOnMap chest) {
        chests.remove(chest);
        markDirty();
    }

    public boolean existsName(String name) {
        for (BlockChest.ChestOnMap chest : chests)
            if (chest.name.equals(name))
                return true;
        return false;
    }

    public BlockChest.ChestOnMap getFromCoords(Vector3f coords) {
        for (BlockChest.ChestOnMap chest : chests)
            if (chest.pos.equals(coords))
                return chest;
        return null;
    }
}
