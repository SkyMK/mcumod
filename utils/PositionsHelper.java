package mcu.utils;

import com.google.common.collect.Lists;
import mcu.entity.EntityHouse;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class PositionsHelper {
    public static ArrayList<Place> places = Lists.newArrayList();
    public static ArrayList<Place> big = Lists.newArrayList();
    public static ArrayList<Place> shaxta = Lists.newArrayList();
    public static ArrayList<Place> safezone = Lists.newArrayList();
    public static ArrayList<Place> cherno = Lists.newArrayList();

    public static void init() {
        big.clear();
        safezone.clear();
        shaxta.clear();
        cherno.clear();
        big.add(new Place(-1770, 72, -1672));
        big.add(new Place(-1707, 72, -1604));
        big.add(new Place(-1788, 73, -1511));
        big.add(new Place(-1563, 86, -1798));
        big.add(new Place(-1587, 72, -1885));
        safezone.add(new Place(7, 101, -1));
        safezone.add(new Place(0, 67, -227));
        shaxta.add(new Place(2473, 67, -1084));
        shaxta.add(new Place(2450, 74, -1116));
        shaxta.add(new Place(2434, 61, -1124));
        cherno.add(new Place(-493, 91, 2963));
        cherno.add(new Place(-563, 86, 2942));
        cherno.add(new Place(-547, 109, 2794));
        cherno.add(new Place(-624, 66, 2994));
    }

    public static boolean checkHousePlace(EntityHouse house) {
        boolean canPlace = true;
        for (Place place : places) {
            int x = (int) house.posX;
            int y = (int) house.posY - 1;
            int z = (int) house.posZ;
            World w = house.worldObj;
            if (!(w.getBlock(x, y, z) != Blocks.air && w.getBlock(x - 1, y, z) != Blocks.air
                    && w.getBlock(x - 2, y, z) != Blocks.air && w.getBlock(x, y, z - 1) != Blocks.air
                    && w.getBlock(x, y, z - 2) != Blocks.air && w.getBlock(x - 1, y, z - 1) != Blocks.air
                    && w.getBlock(x - 2, y, z - 1) != Blocks.air && w.getBlock(x - 1, y, z - 2) != Blocks.air
                    && w.getBlock(x - 2, y, z - 2) != Blocks.air)) {
                canPlace = false;
            }
            if (w.getEntitiesWithinAABB(Entity.class, house.getBoundingBox()).stream()
                    .filter(entity -> !(entity instanceof EntityItem)).count() > 0) {
                canPlace = false;
            }
            if (Math.abs(x - place.x) < 200 && Math.abs(z - place.z) < 200) {
                canPlace = false;
            }
        }
        return canPlace;
    }

    public static <T> T getRandom(ArrayList<T> arrays) {
        return arrays.get(new Random().nextInt(arrays.size()));
    }

    public static class Place {
        public int x;
        public int y;
        public int z;

        public Place(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
            places.add(this);
        }
    }
}
