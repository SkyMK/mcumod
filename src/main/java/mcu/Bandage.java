package mcu.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import mcu.entity.ExtendedPlayer;
import mcu.tabs.Tabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Bandage extends ItemFood {

    public Bandage() {
        super(0, 0, false);
        this.setAlwaysEdible();
        this.setCreativeTab(Tabs.mcuniversalhouse);
        String string = "Bandage";
        this.setUnlocalizedName(string);
        LanguageRegistry.addName(this, string);
        this.setTextureName("mcuniversal:bandage");
        this.setMaxStackSize(4);
    }

    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p) {
        p_77654_1_.stackSize--;
        if (!p.worldObj.isRemote) {
            ExtendedPlayer.get(p).bleeding = false;
            ExtendedPlayer.get(p).sync();
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
