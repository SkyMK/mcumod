package mcu.trade.entity;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import mcu.trade.TradeMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S2EPacketCloseWindow;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import mcu.trade.inventory.ContainerTrade;
import mcu.trade.network.TradePacketHandler;

public class TradePlayer implements IExtendedEntityProperties{

    private final EntityPlayer thePlayer;

    public InventoryBasic inventoryTrade;
    public EntityPlayer other;
    public boolean isReady;
    public int giveMoney;

    public EntityPlayer requestPlayer;
    public int requestTime;

    public TradePlayer(EntityPlayer plr){
        thePlayer = plr;
        inventoryTrade = new InventoryBasic(null, false, 6 * 5);
    }

    public static TradePlayer forPlayer(EntityPlayer player){
        return (TradePlayer)player.getExtendedProperties(TradeMod.MOD_ID);
    }

    public void onUpdate(){
        if(requestPlayer != null && --requestTime < 0){
            requestPlayer = null;
        }
    }

    public void createTrade(EntityPlayer target){
        cleanUp();

        other = target;
        //inventoryTrade = new InventoryBasic(thePlayer.getCommandSenderName(), false, 16);

        TradePlayer otherTrader = TradePlayer.forPlayer(target);
        otherTrader.other = thePlayer;
        //otherTrader.inventoryTrade = new InventoryBasic(target.getCommandSenderName(), false, 16);

        if(thePlayer instanceof EntityPlayerMP && target instanceof EntityPlayerMP){
            sendCreateTradePacket(thePlayer, target);
            sendCreateTradePacket(target, thePlayer);
            int playerMoney = 0;
            int targetMoney = 0;
            target.openGui(TradeMod.instance, 0, target.worldObj, targetMoney, playerMoney, 0);
            thePlayer.openGui(TradeMod.instance, 0, thePlayer.worldObj, playerMoney, targetMoney, 1);
        }else{
            target.openGui(TradeMod.instance, 0, target.worldObj, 0, 0, 0);
            thePlayer.openGui(TradeMod.instance, 0, thePlayer.worldObj, 0, 0, 1);
        }

        requestTime = 0;
        requestPlayer = null;

        otherTrader.requestTime = 0;
        otherTrader.requestPlayer = null;
    }

    public void successfullyTrade(){
        if(!TradeMod.COMPILATION_SERVER){
            return;
        }

        if(other == null || inventoryTrade == null){
            return;
        }

        TradePlayer otherTrader = TradePlayer.forPlayer(other);

        if(otherTrader.other == null || otherTrader.inventoryTrade == null){
            return;
        }

        if(inventoryTrade.getSizeInventory() != otherTrader.inventoryTrade.getSizeInventory()){
            return;
        }

        final int playerGiveMoney = giveMoney;
        final int otherGiveMoney = otherTrader.giveMoney;
        int playerMoney = 0;
        int otherMoney = 0;

        int playerGettingMoney = MathHelper.floor_float(100.0F * otherGiveMoney / 110.0F);//otherGiveMoney - MathHelper.floor_float(otherGiveMoney * 0.1F);
        int otherGettingMoney = MathHelper.floor_float(100.0F * playerGiveMoney / 110.0F);//playerGiveMoney - MathHelper.floor_float(playerGiveMoney * 0.1F);

        playerMoney -= playerGiveMoney - playerGettingMoney;
        otherMoney -= otherGiveMoney - otherGettingMoney;

        if(playerMoney >= 0 && otherMoney >= 0){
            for(byte i = 0; i < inventoryTrade.getSizeInventory(); i++){
                ItemStack myStack = inventoryTrade.getStackInSlot(i);
                ItemStack otherStack = otherTrader.inventoryTrade.getStackInSlot(i);
                thePlayer.inventory.addItemStackToInventory(otherStack);
                otherTrader.getEntityPlayer().inventory.addItemStackToInventory(myStack);
            }
        }else{
            if(thePlayer.openContainer instanceof ContainerTrade && other.openContainer instanceof ContainerTrade){
                ((ContainerTrade)thePlayer.openContainer).returnPlayerItems(this);
                thePlayer.openContainer.detectAndSendChanges();
                ((ContainerTrade)other.openContainer).returnPlayerItems(otherTrader);
                other.openContainer.detectAndSendChanges();
            }
        }

        closeScreen(thePlayer);
        closeScreen(other);

        cleanUp();
        otherTrader.cleanUp();
    }

    public void cleanUp(){
        for(byte i = 0; i < inventoryTrade.getSizeInventory(); i++){
            inventoryTrade.setInventorySlotContents(i, null);
        }
        isReady = false;
        giveMoney = 0;
        if(thePlayer instanceof EntityPlayerMP){
            sendCleanUpPacket(thePlayer);
        }
    }

    public static void closeScreen(EntityPlayer player){
        if(!TradeMod.COMPILATION_SERVER){
            return;
        }

        if(!(player instanceof EntityPlayerMP)){
            return;
        }

        ((EntityPlayerMP)player).playerNetServerHandler.sendPacket(new S2EPacketCloseWindow(player.openContainer.windowId));
        player.openContainer = player.inventoryContainer;
    }

    public static void sendCreateTradePacket(EntityPlayer player, EntityPlayer target){
        if(!TradeMod.COMPILATION_SERVER){
            return;
        }

        FMLProxyPacket packet = TradeMod.network.createPacket(TradePacketHandler.CREATE_TRADE, target.getEntityId(), player.getEntityId());
        TradeMod.network.sendTo(packet, (EntityPlayerMP)player);
    }

    public void sendSyncPacket(){
        if(!TradeMod.COMPILATION_SERVER){
            return;
        }

        FMLProxyPacket packet = TradeMod.network.createPacket(TradePacketHandler.SYNC, thePlayer.getEntityId(), isReady, giveMoney);
        TradeMod.network.sendTo(packet, (EntityPlayerMP)thePlayer);
        if(other != null){
            TradeMod.network.sendTo(packet, (EntityPlayerMP)other);
        }
    }

    public static void sendCleanUpPacket(EntityPlayer player){
        if(!TradeMod.COMPILATION_SERVER){
            return;
        }

        FMLProxyPacket packet = TradeMod.network.createPacket(TradePacketHandler.CLEAN_UP, player.getEntityId());
        TradeMod.network.sendTo(packet, (EntityPlayerMP)player);
    }

    public EntityPlayer getEntityPlayer(){
        return thePlayer;
    }

    public void saveNBTData(NBTTagCompound compound){
    }

    public void loadNBTData(NBTTagCompound compound){
    }

    public void init(Entity entity, World world){
    }
}
