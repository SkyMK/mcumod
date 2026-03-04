package mcu.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import mcu.tabs.Tabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class Morphine extends ItemFood {

    public Morphine() {
        super(0, 0, false);
        this.setAlwaysEdible();
        this.setUnlocalizedName("Morphine");
        LanguageRegistry.addName(this, "Morphine");
        this.setCreativeTab(Tabs.mcuniversalhouse);
        this.setTextureName("mcuniversal:morphine");
        this.setMaxStackSize(4);
    }

    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_) {
        if (p_77654_3_.isPotionActive(Potion.moveSlowdown.id)) {
            p_77654_3_.removePotionEffect(Potion.moveSlowdown.id);
        }
        p_77654_1_.stackSize--;
        return p_77654_1_;
    }

    public int getMaxItemUseDuration(ItemStack p_77626_1_) {
        return 32;
    }

    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.drink;
    }
}
