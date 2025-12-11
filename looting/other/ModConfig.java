package mcu.looting.other;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ModConfig {
    public static Configuration config;
    public static String[] chestsData;
    public static List<Chest> chests = new ArrayList<>();

    public static void register(FMLPreInitializationEvent e) throws Exception {
        config = new Configuration(e.getSuggestedConfigurationFile());
        config.load();
        chestsData = config.getStringList("chests", "general", new String[0], "Chest types");
        config.save();
    }

    public static void loadChests() {
        Chest current = null;
        boolean foreachPack = false;
        for (String str : chestsData) {
            if (str.equals("") || str.equals(" "))
                continue;

            if (str.equals("pack")) {
                current.packs.add(new ChestPack());
                foreachPack = true;
                continue;
            } else if (foreachPack) {
                try {
                    current.packs.get(current.packs.size() - 1).chance = Integer.parseInt(str);
                    foreachPack = false;
                    continue;
                } catch (NumberFormatException e) {
                    String[] params = str.split(",");
                    current.packs.get(current.packs.size() - 1).items.add(new ChestItem(getItemID(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2])));
                    continue;
                }
            }

            if (current == null)
                current = new Chest(str, 0);
            else {
                if (str.contains(",")) {
                    String[] params = str.split(",");
                    current.packs.add(new ChestPack(new ChestItem(getItemID(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2])), Integer.parseInt(params[3])));
                } else {
                    current.respawnTime = Integer.parseInt(str);
                    chests.add(current);
                    current = null;
                }
            }
        }
    }

    private static int getItemID(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String[] splitted = str.split(":");
            boolean isBlock = GameRegistry.findBlock(splitted[0], splitted[1]) != null;
            if (isBlock) {
                Block bl = GameRegistry.findBlock(splitted[0], splitted[1]);
                int id = Block.getIdFromBlock(bl);
                return id;
            } else {
                Item bl = GameRegistry.findItem(splitted[0], splitted[1]);
                int id = Item.getIdFromItem(bl);
                return id;
            }
        }
    }

    public static Chest getChestFromName(String name) {
        for (Chest chest : chests)
            if (chest.name.equals(name))
                return chest;
        return null;
    }

    public static class Chest {
        public String name;
        public List<ChestPack> packs = new ArrayList<>();
        public int respawnTime;

        public Chest(String name, int respawnTime) {
            this.name = name;
            this.respawnTime = respawnTime;
        }
    }

    public static class ChestPack {
        public List<ChestItem> items = new ArrayList<>();
        public int chance;

        public ChestPack() {
            this(null, 0);
        }

        public ChestPack(ChestItem item, int chance) {
            if (item != null)
                this.items.add(item);
            this.chance = chance;
        }
    }

    public static class ChestItem {
        public int id;
        public int meta;
        public int count;

        public ChestItem(int id, int meta, int count) {
            this.id = id;
            this.meta = meta;
            this.count = count;
        }
    }
}
