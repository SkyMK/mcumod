package mcu.spawnsystem;

import mcu.DayZ;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpawnSystem {
    public static ArrayList<Spot> spots = new ArrayList<Spot>();

    public static void serverInit() {
        File dir = new File("SpawnPoints/");
        for (File f : dir.listFiles()) {
            spots.add(parseSpot(f));
        }
    }

    public static void sync(EntityPlayerMP player) {
        if (player instanceof EntityPlayerMP)
            DayZ.network.sendTo(DayZ.network.createPacket(30, spots), player);
    }

    public static void spawnPlayer(EntityPlayer player, String str) {
        Spot s = null;
        for (Spot spot : spots) {
            if (spot.name.equals(str)) {
                s = spot;
            }
        }
        if (str.equals("null")) {
            s = getRandom(spots);
        }
        SpotCord cord = getRandom((ArrayList<SpotCord>) s.spots);
        player.setPositionAndUpdate(cord.x, cord.y, cord.z);
    }

    public static <T> T getRandom(ArrayList<T> array) {
        return array.get(new Random().nextInt(array.size()));
    }

    public static Spot parseSpot(File f) {
        try {
            Spot s = new Spot();
            List<String> list = Files.readAllLines(f.toPath());
            s.name = f.getName().replace(".txt", "");
            s.x = Integer.valueOf(list.get(0).split(" ")[0]);
            s.z = Integer.valueOf(list.get(0).split(" ")[1]);
            for (int i = 1; i < list.size(); i++) {
                String readed = list.get(i);
                String[] split = readed.split(" ");
                if (split.length > 1) {
                    int x = Integer.valueOf(split[0]);
                    int y = Integer.valueOf(split[1]);
                    int z = Integer.valueOf(split[2]);
                    SpotCord cord = new SpotCord(x, y, z);
                    s.spots.add(cord);
                }
            }
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static class Spot {
        public String name;
        public int x, z;
        public List<SpotCord> spots = new ArrayList<SpotCord>();

        public Spot() {

        }

        public Spot(int x, int z, String name, List<SpotCord> spots) {
            this.x = x;
            this.z = z;
            this.name = name;
            this.spots = spots;
        }
    }

    public static class SpotCord {
        public int x, y, z;

        public SpotCord(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
