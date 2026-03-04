package mcu.teleport;

import mcu.DayZ;
import mcu.client.gui.mcumenu.TeleportMenu;
import mcu.utils.Utils;
import net.minecraft.entity.player.EntityPlayerMP;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Random;

public class Teleport {
    public static ArrayList<Location> locations = new ArrayList<>();

    public static void readAllLocations() {
        locations.add(new Location("Черно", "cherno"));
        locations.add(new Location("Биг-аеро", "big"));
        locations.add(new Location("Шахта", "shaxta"));
        locations.add(new Location("Палатки", "palatki"));
        locations.add(new Location("Павлово", "pavlovo"));
        locations.add(new Location("Бункер", "bunker"));
        locations.add(new Location("Тюрьма", "turma"));
        locations.add(new Location("Карьер", "karier"));
    }

    public static void clientTeleport(int locId) {
        DayZ.network.sendToServer(DayZ.network.createPacket(96, locId, TeleportMenu.type));
    }

    public static void serverTeleport(EntityPlayerMP player, int locId, int type) {
        locations.get(locId).teleport(player, type);
    }

    public static class Location {
        public ArrayList<Spot> spots = new ArrayList<Spot>();
        public String name, pngName;

        public Location(String name, String pngName) {
            this.name = name;
            this.pngName = pngName;
            File path = new File("locations/" + name + ".txt");
            ArrayList<String> strings = new ArrayList<>();
            try {
                strings.addAll(Files.readAllLines(path.toPath()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (String s : strings) {
                String[] split = s.split(" ");
                System.out.println("s + \" \"  + name = " + s + " " + name);
                Spot spot = new Spot(Double.valueOf(split[0]), Double.valueOf(split[1]), Double.valueOf(split[2]));
                spots.add(spot);
            }
        }

        public static <T> T getRandom(int skip, ArrayList<T> arrays) {
            return arrays.get(skip + new Random().nextInt(arrays.size() - skip));
        }

        public void teleport(EntityPlayerMP player, int target) {
            if (target < 2) {
                Utils.teleportEntity(player, spots.get(target).x, spots.get(target).y, spots.get(target).z);
                return;
            }
            Spot spot = getRandom(1, spots);
            Utils.teleportEntity(player, spot.x, spot.y, spot.z);
        }
    }

    public static class Spot {
        public double x, y, z;

        public Spot(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
