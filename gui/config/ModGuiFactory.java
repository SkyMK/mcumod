package com.flansmod.client.gui.config;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;

import java.util.Set;

public class ModGuiFactory implements IModGuiFactory {

    public void initialize(Minecraft minecraftInstance) {
    }

    public Class mainConfigGuiClass() {
        return ModGuiConfig.class;
    }

    public Set runtimeGuiCategories() {
        return null;
    }

    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }
}
