package mcu.utils;

import mcu.entity.EntityHouse;
import net.minecraft.block.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;

public enum MCUInteract {
    DOOR("\u0414\u0432\u0435\u0440\u044c", MovingObjectType.BLOCK),
    CRATE("\u042f\u0449\u0438\u043a", MovingObjectType.BLOCK),
    LEVER("\u0420\u044b\u0447\u0430\u0433", MovingObjectType.BLOCK),
    TRAPDOOR("\u041b\u044e\u043a", MovingObjectType.BLOCK),
    BUTTON("\u041a\u043d\u043e\u043f\u043a\u0430", MovingObjectType.BLOCK),
    BOTTLE("\u0421\u0435\u0441\u0442\u044c", MovingObjectType.ENTITY),
    VEHblockYRAFT("\u041a\u0440\u0430\u0444\u0442 \u043c\u0430\u0448\u0438\u043d", MovingObjectType.BLOCK),
    PILOT("\u0421\u0435\u0441\u0442\u044c \u043f\u0438\u043b\u043e\u0442\u043e\u043c", MovingObjectType.ENTITY),
    DRIVER("\u0421\u0435\u0441\u0442\u044c \u0432\u043e\u0434\u0438\u0442\u0435\u043b\u0435\u043c",
            MovingObjectType.ENTITY),
    HOUSE("\u0414\u043e\u043c", MovingObjectType.ENTITY),
    PALATKE("\u041f\u0430\u043b\u0430\u0442\u043a\u0430", MovingObjectType.ENTITY),
    OPEN_INVENTORY("\u041e\u0442\u043a\u0440\u044b\u0442\u044c \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u044c",
            MovingObjectType.ENTITY),
    WORKBENCH("\u041e\u0442\u043a\u0440\u044b\u0442\u044c \u0432\u0435\u0440\u0441\u0442\u0430\u043a",
            MovingObjectType.BLOCK),
    CAMP_FIRE("\u041a\u043e\u0441\u0442\u0435\u0440", MovingObjectType.ENTITY);

    public static boolean $;
    public static int blockX;
    public static int blockY;
    public static int blockZ;
    public static int blockF;
    public static int entityId;
    public final String name;
    public final MovingObjectType type;

    MCUInteract(final String name, final MovingObjectType type) {
        this.name = name;
        this.type = type;
    }

    public static Object findInteractable(MovingObjectPosition MovingObjectPosition, final Object o,
                                          final MovingObjectPosition MovingObjectPosition2) {
        if (o instanceof EntityHouse) {
            return $((Entity) o, MCUInteract.HOUSE);
        }
        if (o != null) {
            return o;
        }
        if (MovingObjectPosition != null) {
            final Block Block = Minecraft.getMinecraft().theWorld.getBlock(MovingObjectPosition.blockX,
                    MovingObjectPosition.blockY, MovingObjectPosition.blockZ);
            if (Block instanceof BlockDoor) {
                return $(MovingObjectPosition, MCUInteract.DOOR);
            }
            if (Block instanceof mcu.looting.chest.BlockChest) {
                return $(MovingObjectPosition, MCUInteract.CRATE);
            }
            if (Block instanceof BlockTrapDoor) {
                return $(MovingObjectPosition, MCUInteract.TRAPDOOR);
            }
            if (Block instanceof BlockWorkbench) {
                return $(MovingObjectPosition, MCUInteract.WORKBENCH);
            }
            if (Block instanceof BlockEnderChest)
                return $(MovingObjectPosition, MCUInteract.CRATE);
        }
        return null;
    }

    public static Object $(final Entity entity, final Object o) {
        MCUInteract.entityId = entity.getEntityId();
        return o;
    }

    public static Object $(final MovingObjectPosition MovingObjectPosition, final Object o) {
        MCUInteract.blockX = MovingObjectPosition.blockX;
        MCUInteract.blockY = MovingObjectPosition.blockY;
        MCUInteract.blockZ = MovingObjectPosition.blockZ;
        MCUInteract.blockF = MovingObjectPosition.sideHit;
        return o;
    }

    public static boolean $(final Block Block) {
        return Block instanceof BlockDoor || Block instanceof BlockTrapDoor || Block instanceof BlockWorkbench
                || Block instanceof BlockChest || Block instanceof BlockEnderChest;
    }

    public static boolean $(final Entity entity) {
        return (entity instanceof EntityHouse) && entity.isEntityAlive();
    }
}
