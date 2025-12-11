package mcu.looting.chest;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.looting.LootingChestsMod;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import mcu.looting.other.ModConfig;
import mcu.looting.other.Vector3f;

public class BlockChest extends Block implements ITileEntityProvider {
    public static boolean flag = false;

    public BlockChest() {
        super(Material.wood);
        setBlockName("chestBlock");
        setBlockUnbreakable();
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.blockIcon = p_149651_1_.registerIcon("planks_oak");
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
        int facing = MathHelper.floor_double((double) (player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, facing, 2);
        if (LootingChestsMod.COMPILATION_SERVER) {
            if (!world.isRemote) {
                ChestsSaveData data = ChestsSaveData.getOrCreateData(world);
                String name = ((NBTTagCompound) stack.getTagCompound().getTag("display")).getString("Name");
                if (data.getFromCoords(new Vector3f(x, y, z)) == null)
                    data.addChest(new ChestOnMap(new Vector3f(x, y, z), name, facing));
                else {
                    if (player instanceof EntityPlayer)
                        ((EntityPlayer) player).addChatMessage(new ChatComponentText("Тут уже стоит другой сундук"));
                    flag = true;
                    world.setBlockToAir(x, y, z);
                }
            }
        }
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int p_149749_6_) {
        if (LootingChestsMod.COMPILATION_SERVER) {
            if (!world.isRemote) {
                if (flag) {
                    flag = false;
                    return;
                }
                ChestsSaveData data = ChestsSaveData.getOrCreateData(world);
                ChestOnMap chest = data.getFromCoords(new Vector3f(x, y, z));
                if (chest != null)
                    data.removeChest(chest);
                world.removeTileEntity(x, y, z);
            }
        }
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        if (LootingChestsMod.COMPILATION_SERVER) {
            if (!world.isRemote) {
                ChestsSaveData data = ChestsSaveData.getOrCreateData(world);
                ChestOnMap chestOnMap = data.getFromCoords(new Vector3f(x, y, z));
                if (chestOnMap != null) {
                    ModConfig.Chest chest = ModConfig.getChestFromName(chestOnMap.name);
                    if (chest != null) {
                        chestOnMap.timeToSpawn = chest.respawnTime;
                        data.markDirty();
                        flag = true;
                        world.setBlockToAir(x, y, z);
                        int max = 0;
                        for (ModConfig.ChestPack pack : chest.packs)
                            max += pack.chance;
                        int random = LootingChestsMod.rnd.nextInt(max);
                        for (ModConfig.ChestPack pack : chest.packs) {
                            if (random < pack.chance) {
                                for (ModConfig.ChestItem item : pack.items) {
                                    if (Item.getItemById(item.id) == null)
                                        world.spawnEntityInWorld(new EntityItem(world, x + 0.5f, y + 1f, z + 0.5f, new ItemStack(Block.getBlockById(item.id), item.count, item.meta)));
                                    else
                                        world.spawnEntityInWorld(new EntityItem(world, x + 0.5f, y + 1f, z + 0.5f, new ItemStack(Item.getItemById(item.id), item.count, item.meta)));
                                    flag = true;
                                }
                                break;
                            } else
                                random -= pack.chance;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public int getRenderType() {
        return RenderChest.renderID;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityChest();
    }

    public static class ChestOnMap {
        public Vector3f pos;
        public int meta;
        public String name;
        public int timeToSpawn; // Пока сундук есть = 0

        public ChestOnMap(Vector3f pos, String name, int meta) {
            this.pos = pos;
            this.name = name;
            this.meta = meta;
            timeToSpawn = 0;
        }
    }
}
