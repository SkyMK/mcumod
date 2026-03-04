package mcu.items;

import mcu.entity.ExtendedPlayer;
import mcu.tabs.Tabs;
import mcu.utils.SidedProtection;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BloodBag extends Item {
    public boolean asshole;
    public float healing;
    public int healDamageCancel;

    public BloodBag(boolean asshole,float healing,int healDamageCancel) {
        this.asshole = asshole;
        this.setCreativeTab(Tabs.mcuniversalhouse);
        this.setUnlocalizedName("BloodBag");
        this.setMaxStackSize(1);
        this.healDamageCancel = healDamageCancel;
        this.healing = healing;
        this.setTextureName("mcuniversal:BloodBag");
    }

    public ItemStack onItemRightClick(final ItemStack is, final World world, final EntityPlayer player) {
        if (!SidedProtection.SERVER)
            return is;
        --is.stackSize;
        if (!world.isRemote) {
            if (is.getItem() == Items.firstAidKit_b)
                ExtendedPlayer.get(player).setBleeding(false);
            ExtendedPlayer.get(player).startHeal(healing, healDamageCancel);
        }
        return is;
    }

    public boolean hasEffect(final ItemStack stack) {
        return this.asshole;
    }
}
