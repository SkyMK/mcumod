package mcu.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tabs {
    public static final CreativeTabs mcuniversalhouse = new CreativeTabs("MCUTab") {
        public Item getTabIconItem() {
            return mcu.items.Items.juggernautHelmet;
        }

        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel() {
            return "MCU";
        }

    };
}
