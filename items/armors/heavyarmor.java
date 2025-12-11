package mcu.items.armors;


import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.tabs.Tabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class heavyarmor extends ItemArmor {

   private String texturePath = "mcuniversal:textures/model/armor/";
   public String icon;

   public heavyarmor(ArmorMaterial  material, int id, int armorType,String name,String name2) {
      super(material, id, armorType);
      this.setCreativeTab(Tabs.mcuniversalhouse);
      this.setMaxStackSize(1);
      this.setTextureName();
      this.icon = name2;
      this.setUnlocalizedName(name2);
      LanguageRegistry.addName(this, name);
   }

   public void setTextureName() {
      if(super.armorType != 0 && super.armorType != 1 && super.armorType != 3) {
         this.texturePath = this.texturePath + "heavy_2.png";
      } else {
         this.texturePath = this.texturePath + "heavy_1.png";
      }

   }
   public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
      if(super.armorType == 0) {
         player.addPotionEffect(new net.minecraft.potion.PotionEffect(16, 1, 1));
      }
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(final IIconRegister mqnk2) {
      this.itemIcon = mqnk2.registerIcon("mcuniversal:" + this.icon);
   }

   public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
      return this.texturePath;
   }
}
