package mcu.server.commands;

import mcu.DayZ;
import mcu.entity.ExtendedPlayer;
import mcu.network.PacketHandler;
import mcu.utils.SidedProtection;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MCUCommand extends CommandBase {
    public static ArrayList<ItemStack> stacks = new ArrayList<ItemStack>();
    public static boolean offChat, offChest;

    public static void giveAway(EntityPlayer target) {
        int curr = 0;
        for (int i = 0; i < target.inventory.mainInventory.length; i++) {
            if (stacks.size() == 0 || curr > stacks.size())
                break;
            if (target.inventory.mainInventory[i] == null) {
                target.inventory.setInventorySlotContents(i, ItemStack.copyItemStack(stacks.get(curr++)));
            }
        }
    }

    @Override
    public String getCommandName() {
        return "mcu";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        if (!DayZ.isOP((EntityPlayerMP) sender))
            return "пошел нахуй сочник";
        return "привет админ епта";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        if (!SidedProtection.SERVER)
            return;
        if (args.length == 1 && args[0].equals("banwave") && DayZ.isOP((EntityPlayerMP) sender)) {
            DayZ.log("mcuac command exec by " + sender.getCommandSenderName());
            boolean banned = false;
            ArrayList<String> bannedPlayers = new ArrayList<String>();
            if (banned)
                new File(DayZ.dir, "AntiCheat.txt").renameTo(new File(DayZ.dir,
                        "AntiCheatBannedPlayers[" + sender.getEntityWorld().getTotalWorldTime() + "]"));
        }
        if (args.length == 1 && args[0].equals("startanticheat") && DayZ.isOP((EntityPlayerMP) sender)) {
            PacketHandler.antiCheatEnabled = true;
            sender.addChatMessage(new ChatComponentText("античит запущен"));
        }
        if (args.length == 1 && args[0].equals("offchests") && DayZ.isOP((EntityPlayerMP) sender)) {
            offChest = !offChest;
            sender.addChatMessage(new ChatComponentText("Сундуки " + (offChest ? "включены" : "выключены")));
        }
        if (args.length == 1 && args[0].equals("offchat") && DayZ.isOP((EntityPlayerMP) sender)) {
            sender.addChatMessage(new ChatComponentText(offChat ? "Чат включен" : "Чат выключен"));
            offChat = !offChat;
        }
        if (args.length == 1 && args[0].equals("writeallplayers") && DayZ.isOP((EntityPlayerMP) sender)) {
            for (EntityPlayer player : (ArrayList<EntityPlayer>) MinecraftServer.getServer()
                    .getEntityWorld().playerEntities) {
                DayZ.log("Players " + MinecraftServer.getServer().getEntityWorld().getTotalWorldTime(),
                        player.getCommandSenderName());
            }
        }
        if (args.length == 2 && args[0].equals("openchest") && DayZ.isOP((EntityPlayerMP) sender)) {
            for (EntityPlayer player : (ArrayList<EntityPlayer>) MinecraftServer.getServer()
                    .getEntityWorld().playerEntities) {
                if (player.getCommandSenderName().equals(args[1])) {
                    ExtendedPlayer.get(player).openChest((EntityPlayer) sender);
                }
            }
        }
        if (args.length == 1 && args[0].equals("giveaway") && DayZ.isOP((EntityPlayerMP) sender)) {
            ArrayList<String> giveAwayPlayers = new ArrayList<String>();
            for (EntityPlayer player : (ArrayList<EntityPlayer>) MinecraftServer.getServer()
                    .getEntityWorld().playerEntities) {
                EntityPlayerMP creator = (EntityPlayerMP) sender;
                player.setPositionAndUpdate(creator.posX, creator.posY, creator.posZ);
                DayZ.sendHint(player,
                        "Итак,вы побывали на нашей раздаче.\nНе пишите в чат сообщения о том какая она была,умоляю.",
                        500);
                giveAway(player);
                giveAwayPlayers.add(player.getCommandSenderName());
            }
            for (String s : giveAwayPlayers) {
                DayZ.log("GiveAway " + ((EntityPlayerMP) sender).worldObj.getTotalWorldTime(), s);
            }
            ((EntityPlayerMP) sender).addChatComponentMessage(new ChatComponentText("раздача проведена"));
            stacks.clear();
        }
        if (args.length == 1 && args[0].equals("giveawayset") && DayZ.isOP((EntityPlayerMP) sender)) {
            stacks.clear();
            ((EntityPlayerMP) sender).addChatComponentMessage(new ChatComponentText("инвентарь установлен бичара"));
            for (ItemStack s : ((EntityPlayerMP) sender).inventory.mainInventory) {
                stacks.add(ItemStack.copyItemStack(s));
            }
        }
    }

    public List addTabCompletionOptions(ICommandSender sender, String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        if (args.length < 2 && DayZ.isOP((EntityPlayerMP) sender)) {
            strings.add("banwave");
            strings.add("startanticheat");
            strings.add("clearanticheat");
            strings.add("writeallplayers");
            strings.add("giveaway");
            strings.add("giveawayset");
            strings.add("offchat");
            strings.add("offchests");
            strings.add("openchest");
            return strings;
        }
        return gucciFlipFlops(args);
    }

    public ArrayList<String> gucciFlipFlops(String[] args) {
        return (ArrayList<String>) getListOfStringsMatchingLastWord(args,
                MinecraftServer.getServer().getAllUsernames());
    }

}
