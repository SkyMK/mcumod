package mcu.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.tabs.Tabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemMoney extends Item {
    public ItemMoney(String name, String langName) {
        this.setUnlocalizedName(name);
        LanguageRegistry.addName(this, langName);
        this.setTextureName("mcuniversal:" + name);
        this.setCreativeTab(Tabs.mcuniversalhouse);
    }

    public ItemStack onItemRightClick(ItemStack s, World w, EntityPlayer p) {
        return s;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
    }
}
