package mcu.utils;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class Pex {
    public static int getInventorySize(String playerName) {
        if (!SidedProtection.SERVER)
            return 0;
        try {
            return getModifierByGroup(getGroup(playerName)) * 9;
        } catch (Exception e) {
            return 2 * 9;
        }
    }

    public static String getGroup(String playerName) {
        try {
            File f = new File("plugins/xDonate/config.yml");
            List<String> strings = Files.readAllLines(f.toPath());
            int i = 0;
            for (String s : strings) {
                String readable = s.replace(" ", "");
                if (readable.split(":")[0].equalsIgnoreCase(playerName)) {
                    return strings.get(i + 1).replace(" ", "").split(":")[0];
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user";
    }

    public static int getModifierByGroup(String group) {
        if (!SidedProtection.SERVER)
            return 0;
        switch (group) {
            case "user":
                return 2;
            case "vip":
                return 3;
            case "premium":
                return 4;
            default:
                return 5;
        }
    }

    public static int getTime(String playerName) {
        if (!SidedProtection.SERVER)
            return 0;
        switch (getGroup(playerName)) {
            case "user":
                return 50;
            case "vip":
                return 100;
            case "premium":
                return 150;
            default:
                return 200;
        }
    }
}
