package mcu.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.tabs.Tabs;
import mcu.utils.SidedProtection;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class Water extends ItemFood {
    public int water;

    public Water(int addedWater, String icon) {
        super(0, 0, false);
        this.setAlwaysEdible();
        this.setCreativeTab(Tabs.mcuniversalhouse);
        this.setUnlocalizedName(icon);
        LanguageRegistry.addName(this, icon);
        this.setTextureName("mcuniversal:" + icon);
        this.setMaxStackSize(4);
        this.water = addedWater;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List list, boolean p_77624_4_) {
    }

    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_) {
        if (!SidedProtection.SERVER)
            return p_77654_1_;
        if (!p_77654_2_.isRemote) {
            p_77654_3_.heal(1);
            p_77654_1_.stackSize--;
        }
        return p_77654_1_;
    }

    public int getMaxItemUseDuration(ItemStack p_77626_1_) {
        return 32;
    }

    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.drink;
    }
}
