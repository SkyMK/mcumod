package mcu.friend.event;

import com.google.common.collect.Maps;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gnu.trove.iterator.hash.TObjectHashIterator;
import mcu.friend.FriendsMod;
import mcu.friend.entity.FriendsPlayer;
import mcu.friend.entity.FriendsPlayer.MemberRequest;
import mcu.friend.gui.GuiEditFriends;
import mcu.friend.network.FriendsPacketHandler;
import mcu.friend.util.FriendsUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class FriendsEventListener {

    public static final Map<UUID, Set<UUID>> OFFLINE_REMOVED_FRIENDS = Maps.newHashMap();

    @SubscribeEvent
    public void onEntityConstructing(EntityEvent.EntityConstructing e) {
        if (!(e.entity instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer player = (EntityPlayer) e.entity;
        if (player.getExtendedProperties(FriendsMod.MOD_ID) == null) {
            player.registerExtendedProperties(FriendsMod.MOD_ID, new FriendsPlayer(player));
        }
    }

    @SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone e) {
        NBTTagCompound nbt = new NBTTagCompound();
        FriendsPlayer.forPlayer(e.original).pack(nbt);
        FriendsPlayer.forPlayer(e.entityPlayer).unpack(nbt);
    }

    @SubscribeEvent
    public void onEntityJoin(EntityJoinWorldEvent e) {
        if (!(e.entity instanceof EntityPlayerMP)) {
            return;
        }

        EntityPlayer player = (EntityPlayer) e.entity;
        FriendsPlayer lobbyPlayer = FriendsPlayer.forPlayer(player);
        lobbyPlayer.sync();
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void hidePlayerNick(RenderLivingEvent.Specials.Pre e) {
        if (!(e.entity instanceof EntityPlayer) || !(RenderManager.instance.livingPlayer instanceof EntityPlayer)) {
            return;
        }
        e.setCanceled(true);
        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player = (EntityPlayer) RenderManager.instance.livingPlayer;
        FriendsPlayer lobbyPlayer = FriendsPlayer.forPlayer(player);
        {
            String tag = "";
            EntityPlayer pointed = (EntityPlayer) e.entity;
            if (e.entity.getCommandSenderName().equals(pointed.getCommandSenderName())) {
                if (!lobbyPlayer.isInFriends(pointed)) {
                    boolean b = mc.pointedEntity != null && mc.pointedEntity == pointed;
                    tag = "[" + FriendsUtils.getKeyName(FriendsMod.KEY_FRIENDS) + "]" + " в друзья.";
                    FriendsUtils.renderNameTag(e.entity, false, tag, e.x, tag.length() < 2 ? e.y - 0.2F : e.y, e.z, 25,
                            b, false);
                }
            }
        }
        if (lobbyPlayer.isInFriends((EntityPlayer) e.entity)) {
            String tag = EnumChatFormatting.GREEN + e.entity.func_145748_c_().getFormattedText();
            FriendsUtils.renderNameTag(e.entity, true, tag, e.x, e.y - 0.2F, e.z, 128, false, true);
        }
    }

    @SubscribeEvent
    public void onPlayerTick(PlayerTickEvent e) {
        if (e.phase != Phase.END || e.side != Side.SERVER) {
            return;
        }

        FriendsPlayer lobbyPlayer = FriendsPlayer.forPlayer(e.player);
        TObjectHashIterator<MemberRequest> iterator = lobbyPlayer.requests.iterator();
        while (iterator.hasNext()) {
            MemberRequest request = iterator.next();
            request.setTime(request.getTime() - 1);
            if (request.getTime() <= 0) {
                iterator.remove();
            }
        }
    }

    @SubscribeEvent
    public void onPlayerJoin(PlayerLoggedInEvent e) {
        if (OFFLINE_REMOVED_FRIENDS.containsKey(e.player.getUniqueID())) {
            FriendsPlayer lobbyPlayer = FriendsPlayer.forPlayer(e.player);
            Set<UUID> removedIds = OFFLINE_REMOVED_FRIENDS.remove(e.player.getUniqueID());
            removedIds.forEach(lobbyPlayer::removeFriend);
            lobbyPlayer.sync();
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onKeyPressed(KeyInputEvent e) {
        Minecraft mc = Minecraft.getMinecraft();
        if (FriendsMod.KEY_FRIENDS.isPressed()) {
            if (mc.pointedEntity instanceof EntityPlayer) {
                FMLProxyPacket packet = FriendsMod.network.createPacket(FriendsPacketHandler.FRIEND_ADD,
                        mc.pointedEntity.getEntityId());
                FriendsMod.network.sendToServer(packet);
            } else {
                mc.displayGuiScreen(new GuiEditFriends());
            }
        }
    }

    @SubscribeEvent
    public void onLivingAttack(LivingAttackEvent e) {
    }
}