package mcu.looting.other;

import cpw.mods.fml.common.registry.GameRegistry;
import mcu.looting.chest.BlockChest;
import net.minecraft.block.Block;

public class ModItems {
    public static Block chestBlock;

    public static void register() {
        chestBlock = new BlockChest();
        block(chestBlock);
    }

    private static void block(Object obj) {
        GameRegistry.registerBlock((Block) obj, ((Block) obj).getUnlocalizedName());
    }
}
