package mcu.friend.network;

import com.google.common.collect.Sets;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.friend.FriendsMod;
import mcu.friend.entity.FriendsPlayer;
import mcu.friend.event.FriendsEventListener;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class FriendsPacketHandler implements IPacketHandler {

    public static final byte SYNC_PLAYER_DATA = 0;
    public static final byte SYNC_PLAYER_DATA_FOR = 1;
    public static final byte SYNC_PLAYER_DATA_ALL = 2;
    public static final byte FRIEND_ADD = 4;
    public static final byte FRIEND_REMOVED = 5;

    public static EntityPlayer getPlayerByUUID(UUID id) {
        List<EntityPlayer> players = MinecraftServer.getServer().getConfigurationManager().playerEntityList;
        for (EntityPlayer player : players) {
            if (player.getUniqueID().equals(id) && player instanceof EntityPlayerMP) {
                return player;
            }
        }
        return null;
    }

    @SideOnly(Side.CLIENT)
    public void handleClientSide(PacketBuffer buf, byte id, Minecraft mc, WorldClient world,
                                 EntityClientPlayerMP player) {
        FriendsPlayer lobbyPlayer = FriendsPlayer.forPlayer(player);

        if (id == SYNC_PLAYER_DATA) {
            NBTTagCompound propsTag = ByteBufUtils.readTag(buf);
            lobbyPlayer.unpack(propsTag);
        } else if (id == SYNC_PLAYER_DATA_FOR || id == SYNC_PLAYER_DATA_ALL) {
            EntityPlayer plr = (EntityPlayer) world.getEntityByID(buf.readInt());
            NBTTagCompound propsTag = ByteBufUtils.readTag(buf);
            if (plr != null) {
                FriendsPlayer lobbyPlr = FriendsPlayer.forPlayer(plr);
                lobbyPlr.unpack(propsTag);
            }
        }
    }

    public void handleServerSide(PacketBuffer buf, byte id, WorldServer world, EntityPlayerMP player) {
        FriendsPlayer lobbyPlayer = FriendsPlayer.forPlayer(player);

        if (id == FRIEND_ADD) {
            EntityPlayerMP target = (EntityPlayerMP) world.getEntityByID(buf.readInt());
            FriendsPlayer lobbyTarget = FriendsPlayer.forPlayer(target);

            if (!lobbyPlayer.isInFriends(target)) {
                lobbyPlayer.addRequest(target);

                lobbyPlayer.getRequest(target).ifPresent(request -> {
                    if (lobbyPlayer.isInRequests(target) && lobbyTarget.isInRequests(player)) {

                        lobbyPlayer.addFriend(target);
                        lobbyTarget.addFriend(player);

                        lobbyPlayer.removeRequest(target);
                        lobbyTarget.removeRequest(player);
                    } else {
                        if (!request.isRequested()) {
                            request.setRequested(true);
                        }
                    }

                    lobbyPlayer.sync();
                    lobbyTarget.sync();
                });
            }
        } else if (id == FRIEND_REMOVED) {
            UUID targetId = new UUID(buf.readLong(), buf.readLong());
            EntityPlayer target = getPlayerByUUID(targetId);
            if (target != null) {
                FriendsPlayer lobbyTarget = FriendsPlayer.forPlayer(target);
                lobbyTarget.removeFriend(player);
                lobbyTarget.sync();
            } else {
                Set<UUID> removedIds = FriendsEventListener.OFFLINE_REMOVED_FRIENDS.get(targetId);
                if (removedIds == null) {
                    removedIds = Sets.newHashSet();
                    FriendsEventListener.OFFLINE_REMOVED_FRIENDS.put(targetId, removedIds);
                }
                removedIds.add(player.getUniqueID());
            }

            lobbyPlayer.removeFriend(targetId);
            lobbyPlayer.sync();
        }
    }

    public String getChannel() {
        return FriendsMod.MOD_ID;
    }
}
