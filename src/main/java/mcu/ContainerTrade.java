package mcu.trade.inventory;

import mcu.trade.TradeMod;
import mcu.trade.entity.TradePlayer;
import mcu.trade.inventory.slot.SlotLocked;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S2EPacketCloseWindow;

public class ContainerTrade extends Container{

    public EntityPlayer owner;

    public ContainerTrade(EntityPlayer thePlayer){
        owner = thePlayer;

        TradePlayer tradePlayer = TradePlayer.forPlayer(owner);
        TradePlayer otherTrader = TradePlayer.forPlayer(tradePlayer.other);

        /* My trade slots */
        for(byte i = 0; i < 5; i++){
            for(byte j = 0; j < 6; j++){
                addSlotToContainer(new Slot(tradePlayer.inventoryTrade, j + i * 6, 8 + j * 18, 39 + i * 18){
                    public boolean isItemValid(ItemStack itemStack){
                        return !isLocked();
                    }

                    public boolean canTakeStack(EntityPlayer player){
                        return !isLocked();
                    }
                });
            }
        }

        /* Other trade slots */
        for(byte i = 0; i < 5; i++){
            for(byte j = 0; j < 6; j++){
                addSlotToContainer(new SlotLocked(otherTrader.inventoryTrade, j + i * 6, 128 + j * 18, 39 + i * 18, false, false));
            }
        }
//		
//		/* Armor slots */
//		for(byte i = 0; i < 4; i++){
//			addSlotToContainer(new SlotArmor(owner.inventory, owner.inventory.getSizeInventory() - 1 - i, i, 7, 121 + i * 18));
//		}
//		
//		/* Default player slots */
        addPlayerInventory(owner.inventory);
    }

    private void addPlayerInventory(InventoryPlayer inventory){
        for(byte i = 0; i < 3; i++){
            for(byte j = 0; j < 9; j++){
                addSlotToContainer(new Slot(inventory, j + (i + 1) * 9, 8 + j * 18, 141 + i * 18));
            }
        }

        for(byte i = 0; i < 9; i++){
            addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 195));
        }
    }

    public void onContainerClosed(EntityPlayer player){
        super.onContainerClosed(player);

        TradePlayer tradePlayer = TradePlayer.forPlayer(owner);
        if(tradePlayer.other != null && tradePlayer.other.openContainer instanceof ContainerTrade){
            EntityPlayer other = (EntityPlayer)tradePlayer.other;
            if(TradeMod.COMPILATION_SERVER && other instanceof EntityPlayerMP){
                ((EntityPlayerMP)other).playerNetServerHandler.sendPacket(new S2EPacketCloseWindow(other.openContainer.windowId));
            }
            other.openContainer = other.inventoryContainer;

            TradePlayer otherTrader = TradePlayer.forPlayer(other);
            returnPlayerItems(otherTrader);

            otherTrader.cleanUp();
        }

        returnPlayerItems(tradePlayer);
        tradePlayer.cleanUp();
    }

    public void returnPlayerItems(TradePlayer trader){
        if(trader.inventoryTrade == null){
            return;
        }

        for(int i = 0; i < trader.inventoryTrade.getSizeInventory(); i++){
            ItemStack slot = trader.inventoryTrade.getStackInSlot(i);
            trader.getEntityPlayer().inventory.addItemStackToInventory(slot);
        }
    }

    public boolean isLocked(){
        TradePlayer tradePlayer = TradePlayer.forPlayer(owner);
        return tradePlayer.isReady && TradePlayer.forPlayer(tradePlayer.other).isReady;
    }

    public ItemStack transferStackInSlot(EntityPlayer player, int slotId){
        Slot slot = (Slot)inventorySlots.get(slotId);

        if(slot != null && slot.getHasStack()){
            ItemStack itemStack = slot.getStack();
            ItemStack copyStack = itemStack.copy();

            int tradeSlotsCount = 5 * 6;
            if(slotId >= 0 && slotId < tradeSlotsCount){
                if(!mergeItemStack(itemStack, tradeSlotsCount * 2, tradeSlotsCount * 2 + 36, false)){
                    return null;
                }
            }else if(slotId >= tradeSlotsCount * 2 && slotId < tradeSlotsCount * 2 + 36){
                if((isLocked() || !mergeItemStack(itemStack, 0, tradeSlotsCount, false))){
                    return null;
                }
            }
//			else if(slotId >= 63 && slotId < 72){
//				if((isLocked() || !mergeItemStack(itemStack, 0, 16, false)) && !mergeItemStack(itemStack, 36, 63, false)){
//					return null;
//				}
//			}

            if(itemStack.stackSize == 0){
                slot.putStack(null);
            }else{
                slot.onSlotChanged();
            }

            if(itemStack.stackSize == copyStack.stackSize){
                return null;
            }

            slot.onPickupFromSlot(player, itemStack);
            return copyStack;
        }

        return null;
    }

    public boolean canInteractWith(EntityPlayer player){
        return true;
    }
}
