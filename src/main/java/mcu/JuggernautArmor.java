package mcu.items.armors;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.client.models.ArmorRender;
import mcu.client.models.ModelJugger;
import mcu.items.Items;
import mcu.tabs.Tabs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class JuggernautArmor {

    public JuggernautArmor() {
    }

    public static boolean checkArmorOwner(World world, EntityPlayer player, ItemStack itemStack) {

        NBTTagCompound nbt = getTagCompound(itemStack);
        if (!nbt.hasKey("owner")) {
            nbt.setString("owner", player.getCommandSenderName());
        }

        if (nbt.getString("owner").equals(player.getCommandSenderName())) {
            return true;
        } else {
            if (itemStack.getItemDamage() < itemStack.getMaxDamage()) {
                if (world.getTotalWorldTime() % 100 == 0) {
                    itemStack.setItemDamage(itemStack.getItemDamage() + 20);
                }
            } else {
                for (int i = 0; i < player.inventory.armorInventory.length; ++i) {
                    if (ItemStack.areItemStacksEqual(player.getCurrentArmor(i), itemStack)) {
                        player.setCurrentItemOrArmor(1 + i, null);
                    }
                }
            }

            return false;
        }
    }

    public static void onTickShield(World world, EntityPlayer player, ItemStack itemStack) {

        if (!checkArmorOwner(world, player, itemStack)) {
            return;
        }

        NBTTagCompound nbt = getTagCompound(itemStack);

        if (!isFullSet(player)) {
            nbt.setInteger("cooldown", 0);
            nbt.setInteger("shield", 0);
            nbt.setBoolean("damaged", false);
            return;
        }

        int cooldown = nbt.getInteger("cooldown");
        if (cooldown <= 600) {
            nbt.setInteger("cooldown", cooldown + 1);
        } else if (nbt.getBoolean("damaged")) {
            int shield = nbt.getInteger("shield");
            if (shield <= 20) {
                nbt.setInteger("shield", shield + 1);
            } else {
                nbt.setInteger("cooldown", 0);
                nbt.setInteger("shield", 0);
                nbt.setBoolean("damaged", false);
            }
        }
    }

    public static boolean isFullSet(EntityPlayer player) {
        return player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem() == Items.juggernautBoots
                && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem() == Items.juggernautPants
                && player.getCurrentArmor(2) != null
                && player.getCurrentArmor(2).getItem() == Items.juggernautChestplate
                && player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == Items.juggernautHelmet;
    }

    public static NBTTagCompound getTagCompound(ItemStack itemStack) {
        if (itemStack == null) {
            return null;
        } else {
            NBTTagCompound nbt = itemStack.getTagCompound();
            if (!itemStack.hasTagCompound()) {
                itemStack.setTagCompound(nbt = new NBTTagCompound());
            }

            return nbt;
        }
    }

    public interface IItemPersonal {
    }

    public static class Helmet extends ItemArmor implements JuggernautArmor.IItemPersonal {
        public static ResourceLocation loc = new ResourceLocation("mcuniversal:obj/jag.png");
        static ModelJugger jugger = new ModelJugger();

        public Helmet(ItemArmor.ArmorMaterial armorMaterial, int par3, int par4) {

            super(armorMaterial, par3, par4);
            setCreativeTab(Tabs.mcuniversalhouse);
            setUnlocalizedName("juggernautHelmet");
            setTextureName("mcuniversal:j0");
            setNoRepair();
        }

        @SideOnly(Side.CLIENT)
        public static void render(RenderPlayer renderModel) {
            GL11.glColor4f(1, 1, 1, 1);
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(loc);
            renderModel.modelBipedMain.bipedHead.postRender(0.0625F);
            jugger.render(ArmorRender.ModelPart.HEAD);
            jugger.render(ArmorRender.ModelPart.JAGVOROT);
            GL11.glPopMatrix();
        }

        public void addInformation(ItemStack stack, EntityPlayer playerIn, List lines, boolean advanced) {
            lines.add("§aРадар");
            lines.add("§aПНВ+");
        }

        @SideOnly(Side.CLIENT)
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            return "mcuniversal:textures/items/null.png";
        }

        public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
            player.addPotionEffect(new net.minecraft.potion.PotionEffect(16, 1, 1));
            JuggernautArmor.onTickShield(world, player, itemStack);
        }
    }

    public static class Body extends ItemArmor implements JuggernautArmor.IItemPersonal {
        public Body(ItemArmor.ArmorMaterial armorMaterial, int par3, int par4) {
            super(armorMaterial, par3, par4);
            setCreativeTab(Tabs.mcuniversalhouse);
            setUnlocalizedName("juggernautBody");
            setTextureName("mcuniversal:j1");
            setNoRepair();
        }

        @SideOnly(Side.CLIENT)
        public static void render(RenderPlayer renderModel) {
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(Helmet.loc);
            renderModel.modelBipedMain.bipedBody.postRender(0.0625F);
            Helmet.jugger.render(ArmorRender.ModelPart.BODY);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(Helmet.loc);
            renderModel.modelBipedMain.bipedRightArm.postRender(0.0625F);
            Helmet.jugger.render(ArmorRender.ModelPart.RARM);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(Helmet.loc);
            renderModel.modelBipedMain.bipedLeftArm.postRender(0.0625F);
            Helmet.jugger.render(ArmorRender.ModelPart.LARM);
            GL11.glPopMatrix();
        }

        public void addInformation(ItemStack stack, EntityPlayer playerIn, List lines, boolean advanced) {

            lines.add("§aДжаггернаут Щит");
            lines.add("§aРегенерация Хп");
        }

        @SideOnly(Side.CLIENT)
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            return "mcuniversal:textures/items/null.png";
        }

        public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
            if (isFullSet(player) && player.ticksExisted % 20 == 0) {
                player.heal(0.05F);
            }
            JuggernautArmor.checkArmorOwner(world, player, itemStack);
        }
    }

    public static class Pants extends ItemArmor implements JuggernautArmor.IItemPersonal {
        public Pants(ItemArmor.ArmorMaterial armorMaterial, int par3, int par4) {
            super(armorMaterial, par3, par4);
            setCreativeTab(Tabs.mcuniversalhouse);
            setUnlocalizedName("juggernautPants");
            setTextureName("mcuniversal:j2");
            setNoRepair();
        }

        @SideOnly(Side.CLIENT)
        public static void render(RenderPlayer renderModel) {
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(Helmet.loc);
            renderModel.modelBipedMain.bipedLeftLeg.postRender(0.0625F);
            Helmet.jugger.render(ArmorRender.ModelPart.LLEG);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(Helmet.loc);
            renderModel.modelBipedMain.bipedRightLeg.postRender(0.0625F);
            Helmet.jugger.render(ArmorRender.ModelPart.RLEG);
            GL11.glPopMatrix();
        }

        public void addInformation(ItemStack stack, EntityPlayer playerIn, List lines, boolean advanced) {
            lines.add("§aЛучшая броня в игре");
        }

        @SideOnly(Side.CLIENT)
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            return "mcuniversal:textures/items/null.png";
        }

        public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

            JuggernautArmor.checkArmorOwner(world, player, itemStack);
        }
    }

    public static class Boots extends ItemArmor implements JuggernautArmor.IItemPersonal {
        public Boots(ItemArmor.ArmorMaterial armorMaterial, int par3, int par4) {
            super(armorMaterial, par3, par4);
            setCreativeTab(Tabs.mcuniversalhouse);
            setUnlocalizedName("juggernautBoots");
            setTextureName("mcuniversal:j3");
            setNoRepair();
        }

        @SideOnly(Side.CLIENT)
        public static void render(RenderPlayer renderModel) {
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(Helmet.loc);
            renderModel.modelBipedMain.bipedLeftLeg.postRender(0.0625F);
            Helmet.jugger.render(ArmorRender.ModelPart.LBOOT);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(Helmet.loc);
            renderModel.modelBipedMain.bipedRightLeg.postRender(0.0625F);
            Helmet.jugger.render(ArmorRender.ModelPart.RBOOT);
            GL11.glPopMatrix();
        }

        public void addInformation(ItemStack stack, EntityPlayer playerIn, List lines, boolean advanced) {

            lines.add("§aНет урона от падений");
        }

        @SideOnly(Side.CLIENT)
        public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
            return "mcuniversal:textures/items/null.png";
        }

        public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

            JuggernautArmor.checkArmorOwner(world, player, itemStack);
        }
    }
}