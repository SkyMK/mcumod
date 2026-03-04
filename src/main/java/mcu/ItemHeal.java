package mcu.items;

import cpw.mods.fml.relauncher.FMLLaunchHandler;
import cpw.mods.fml.relauncher.Side;
import mcu.client.models.RenderHealObj;
import mcu.entity.ExtendedPlayer;
import mcu.tabs.Tabs;
import mcu.utils.SidedProtection;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemHeal extends Item {
    public static final Map<String, ResourceLocation> textures = new HashMap<String, ResourceLocation>();
    public String name;
    public String texture;
    public float healing;
    public int healDamageCancel;

    public ItemHeal(final int n, final float healing, final int n2, final int healDamageCancel, final String name, final String texture) {
        this.setMaxStackSize(1);
        this.setMaxDamage(n2);
        this.setCreativeTab(Tabs.mcuniversalhouse);
        this.healing = healing;
        this.name = name;
        this.texture = texture;
        this.healDamageCancel = healDamageCancel;
        this.setFull3D();
        this.setUnlocalizedName("mcuniversal:" + name);
        this.setTextureName("mcuniversal:" + name + "_icon");
        if (FMLLaunchHandler.side() == Side.CLIENT && name != null && !name.equals("")
                && !ItemHeal.textures.containsKey(name)) {
            ItemHeal.textures.put(name, new ResourceLocation("mcuniversal", "obj/" + texture + ".png"));
        }
        if (FMLLaunchHandler.side() == Side.CLIENT) {
            MinecraftForgeClient.registerItemRenderer(this, RenderHealObj.instance);
        }
    }

    public void addInformation(final ItemStack aobm, final EntityPlayer entityPlayer, final List list,
                               final boolean b) {
        if (null != Items.pills && aobm.getItem() == Items.pills) {
            list.add("\u041b\u0435\u0447\u0430\u0442 3000 \u043a\u0440\u043e\u0432\u0438");
            list.add("Закидываются под правую губу");
            list.add("250 мг");
            list.add("Не убейтесь, пока будете закидывать этот снюс!");
        } else if (null != Items.firstAidKit && aobm.getItem() == Items.firstAidKit) {
            list.add("\u041b\u0435\u0447\u0438\u0442 12000 \u043a\u0440\u043e\u0432\u0438");
            list.add("1 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435");
        } else if (null != Items.firstAidKit_b && aobm.getItem() == Items.firstAidKit_b) {
            list.add("\u041b\u0435\u0447\u0438\u0442 12000 \u043a\u0440\u043e\u0432\u0438");
            list.add("1 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435");
            list.add(
                    "\u041e\u0441\u0442\u0430\u043d\u0430\u0432\u0438\u043b\u0432\u0430\u0435\u0442 \u043a\u0440\u043e\u0432\u043e\u0442\u0435\u0447\u0435\u043d\u0438\u0435");
        } else if (null != Items.small_firstAidKit && aobm.getItem() == Items.small_firstAidKit) {
            list.add("\u041b\u0435\u0447\u0438\u0442 12000 \u043a\u0440\u043e\u0432\u0438");
            list.add("1 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435");
        }
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
}
