// 
// Decompiled by Procyon v0.5.34
// 

package mcu.items;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.client.models.EWjURWOUrw;
import mcu.client.models.IArmorModel;
import mcu.tabs.Tabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Boots extends ItemArmor implements IArmorModel {
    public String icon;
    public String texture;
    @SideOnly(Side.CLIENT)
    public EWjURWOUrw model;
    @SideOnly(Side.CLIENT)
    public ResourceLocation loc;

    public Boots(final int n, final ItemArmor.ArmorMaterial anxb2, final String string, final String string2,
                 final String texture, EWjURWOUrw model) {
        super(anxb2, 0, 3);
        this.setCreativeTab(Tabs.mcuniversalhouse);
        this.setUnlocalizedName(string2);
        this.icon = string2;
        LanguageRegistry.addName(this, string);
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            this.model = model;
            loc = new ResourceLocation("mcuniversal:obj/" + texture + ".png");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EWjURWOUrw getRenderer() {
        return model;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ResourceLocation getTexture() {
        return loc;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister mqnk2) {
        this.itemIcon = mqnk2.registerIcon("mcuniversal:" + this.icon);
    }

    public void onArmorTick(final World twca2, final EntityPlayer entityPlayer, final ItemStack cucj2) {
    }

    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        return "mcuniversal:textures/items/null.png";
    }
}
