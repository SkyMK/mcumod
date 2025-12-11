package mcu.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.tabs.Tabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class HouseRemover extends Item {
    public long timer;

    public HouseRemover(long timer) {
        this.setMaxStackSize(1);
        this.setCreativeTab(Tabs.mcuniversalhouse);
        this.setTextureName("mcuniversal:stick");
        String string = "House remover";
        this.setUnlocalizedName(string);
        LanguageRegistry.addName(this, string);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List list, boolean p_77624_4_) {
        list.add(EnumChatFormatting.GREEN + "штука опасная но");
        list.add(EnumChatFormatting.RED + "за нее несете ответственность только вы");
        list.add(EnumChatFormatting.AQUA + "каждый снос дома логгируется.");
        list.add(EnumChatFormatting.DARK_GREEN + "ах да, для того что бы снести нажмите SHIFT");
        list.add(EnumChatFormatting.LIGHT_PURPLE + "для чека просто тыкните по дому.");
    }
}
