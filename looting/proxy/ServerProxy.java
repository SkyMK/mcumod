package mcu.looting.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mcu.looting.LootingChestsMod;
import mcu.looting.other.ModConfig;
import mcu.looting.other.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayList;

public class ServerProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        LootingChestsMod.stacksToTab = new ArrayList<>();
        for (ModConfig.Chest chest : ModConfig.chests) {
            ItemStack stack = new ItemStack(ModItems.chestBlock);
            NBTTagCompound tag = new NBTTagCompound();
            tag.setString("Name", chest.name);
            stack.setTagCompound(new NBTTagCompound());
            stack.getTagCompound().setTag("display", tag);
            LootingChestsMod.stacksToTab.add(stack);
        }
    }
}
