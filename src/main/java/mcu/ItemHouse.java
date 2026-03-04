package mcu.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.DayZ;
import mcu.entity.EntityHouse;
import mcu.tabs.Tabs;
import mcu.utils.PositionsHelper;
import mcu.utils.SidedProtection;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;

import java.util.List;

public class ItemHouse extends Item {
    public long timer;

    public ItemHouse(long timer) {
        this.setMaxStackSize(1);
        this.timer = timer;
        this.setCreativeTab(Tabs.mcuniversalhouse);
        this.setTextureName("mcuniversal:house");
        this.setUnlocalizedName("House");
        LanguageRegistry.addName(this, "House");
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List list, boolean p_77624_4_) {
        if ((timer / 20 / 60 / 60 / 24) == 2 || (timer / 20 / 60 / 60 / 24) == 3) {
            list.add(EnumChatFormatting.GREEN + "Дом на " + (timer / 20 / 60 / 60 / 24) + " дня");
        } else {
            list.add(EnumChatFormatting.RED + "Дом на " + (timer / 20 / 60 / 60 / 24) + " дней");
        }
    }

    public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer player) {
        if (!SidedProtection.SERVER)
            return itemStack;
        if (!world.isRemote) {
            final float f = 1.0f;
            final float f2 = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * 1.0f;
            final float f3 = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * 1.0f;
            final double d0 = player.prevPosX + (player.posX - player.prevPosX) * 1.0;
            final double d2 = player.prevPosY + (player.posY - player.prevPosY) * 1.0 + 1.62 - player.yOffset;
            final double d3 = player.prevPosZ + (player.posZ - player.prevPosZ) * 1.0;
            final Vec3 vec3 = Vec3.createVectorHelper(d0, d2, d3);
            final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
            final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
            final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
            final float f7 = MathHelper.sin(-f2 * 0.017453292f);
            final float f8 = f5 * f6;
            final float f9 = f4 * f6;
            final double d4 = 5.0;
            final Vec3 vec4 = vec3.addVector(f8 * 5.0, f7 * 5.0, f9 * 5.0);
            final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
            if (movingobjectposition == null) {
                return itemStack;
            }
            final Vec3 vec5 = player.getLook(1.0f);
            if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
                final int i = movingobjectposition.blockX;
                int j = movingobjectposition.blockY;
                final int k = movingobjectposition.blockZ;
                if (world.getBlock(i, j, k) == Blocks.snow_layer
                        || world.getBlock(i, j, k).getMaterial() == Material.vine) {
                    --j;
                }
                final EntityHouse house = new EntityHouse(world, player.getCommandSenderName(),
                        world.getTotalWorldTime() + timer, false);
                house.setPositionAndRotation(i, j + 1, k, 0.0f, 0.0f);
                if (PositionsHelper.checkHousePlace(house)) {
                    DayZ.log(player.getCommandSenderName() + " place house on " + i + " " + j + " " + k + " timer "
                            + world.getTotalWorldTime() + timer);
                    world.spawnEntityInWorld(house);
                    itemStack.stackSize = 0;
                } else {
                    player.addChatComponentMessage(
                            new ChatComponentText(EnumChatFormatting.RED + "Вы не можете установить тут дом."));
                }
            }
        }
        return itemStack;
    }
}
