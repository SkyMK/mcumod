package mcu.friend.entity;

import com.google.common.base.Objects;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import gnu.trove.set.hash.TLinkedHashSet;
import mcu.friend.FriendsMod;
import mcu.friend.network.FriendsPacketHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.common.util.Constants.NBT;

import java.util.Optional;
import java.util.UUID;

public class FriendsPlayer implements IExtendedEntityProperties {

    private final EntityPlayer player;

    public TLinkedHashSet<Member> friends;
    public TLinkedHashSet<MemberRequest> requests;

    public FriendsPlayer(EntityPlayer plr) {
        player = plr;
        friends = new TLinkedHashSet<>();
        requests = new TLinkedHashSet<>();
    }

    public static FriendsPlayer forPlayer(EntityPlayer player) {
        return (FriendsPlayer) player.getExtendedProperties(FriendsMod.MOD_ID);
    }

    public final void saveNBTData(NBTTagCompound compound) {
        NBTTagCompound nbt = new NBTTagCompound();
        pack(nbt);
        compound.setTag(FriendsMod.MOD_ID, nbt);
    }

    public final void loadNBTData(NBTTagCompound compound) {
        NBTTagCompound nbt = compound.getCompoundTag(FriendsMod.MOD_ID);
        unpack(nbt);
    }

    public void pack(NBTTagCompound nbt) {
        NBTTagList listFriends = new NBTTagList();
        for (Member friend : friends) {
            NBTTagCompound tag = new NBTTagCompound();
            friend.save(tag);
            listFriends.appendTag(tag);
        }
        nbt.setTag("friends", listFriends);

        NBTTagList listRequests = new NBTTagList();
        for (MemberRequest request : requests) {
            NBTTagCompound tag = new NBTTagCompound();
            request.save(tag);
            listRequests.appendTag(tag);
        }
        nbt.setTag("requests", listRequests);
    }

    public void unpack(NBTTagCompound nbt) {
        friends.clear();
        NBTTagList listFriends = nbt.getTagList("friends", NBT.TAG_COMPOUND);
        for (int i = 0; i < listFriends.tagCount(); i++) {
            NBTTagCompound tag = listFriends.getCompoundTagAt(i);
            friends.add(Member.load(tag));
        }

        requests.clear();
        NBTTagList listRequests = nbt.getTagList("requests", NBT.TAG_COMPOUND);
        for (int i = 0; i < listRequests.tagCount(); i++) {
            NBTTagCompound tag = listRequests.getCompoundTagAt(i);
            requests.add(MemberRequest.load(tag));
        }
    }

    public void addFriend(EntityPlayer target) {
        friends.add(new Member(target.getCommandSenderName(), target.getUniqueID()));
    }

    public boolean isInFriend(String name) {
        boolean bl = false;
        for (Member m : friends) {
            if (m.name.contains(name)) {
                return true;
            }
        }
        return bl;
    }

    public void addFriend(String name, UUID id) {
        friends.add(new Member(name, id));
    }

    public void removeFriend(EntityPlayer target) {
        friends.removeIf(f -> f.getId().equals(target.getUniqueID()));
    }

    public void removeFriend(UUID id) {
        friends.removeIf(f -> f.getId().equals(id));
    }

    public void removeFriend(String name) {
        friends.removeIf(f -> f.getName().equals(name));
    }

    public boolean isInFriends(EntityPlayer target) {
        return friends.stream().anyMatch(f -> f.getId().equals(target.getUniqueID()));
    }

    public void addRequest(EntityPlayer target) {
        requests.add(new MemberRequest(target.getCommandSenderName(), target.getUniqueID()));
    }

    public void addRequest(String name, UUID id) {
        requests.add(new MemberRequest(name, id));
    }

    public void removeRequest(EntityPlayer target) {
        requests.removeIf(f -> f.getId().equals(target.getUniqueID()));
    }

    public void removeRequest(UUID id) {
        requests.removeIf(f -> f.getId().equals(id));
    }

    public void removeRequest(String name) {
        requests.removeIf(f -> f.getName().equals(name));
    }

    public boolean isInRequests(EntityPlayer target) {
        return requests.stream().anyMatch(f -> f.getId().equals(target.getUniqueID()));
    }

    public Optional<MemberRequest> getRequest(EntityPlayer target) {
        return requests.stream().filter(f -> f.getId().equals(target.getUniqueID())).findFirst();
    }

    public void sync() {
        if (player.worldObj.isRemote || !(player instanceof EntityPlayerMP)) {
            return;
        }

        NBTTagCompound nbt = new NBTTagCompound();
        pack(nbt);
        FMLProxyPacket packet = FriendsMod.network.createPacket(FriendsPacketHandler.SYNC_PLAYER_DATA, nbt);
        FriendsMod.network.sendTo(packet, (EntityPlayerMP) player);
    }

    public void syncFor(EntityPlayer to) {
        if (player.worldObj.isRemote || !(player instanceof EntityPlayerMP)) {
            return;
        }

        NBTTagCompound nbt = new NBTTagCompound();
        pack(nbt);
        FMLProxyPacket packet = FriendsMod.network.createPacket(FriendsPacketHandler.SYNC_PLAYER_DATA_FOR,
                player.getEntityId(), nbt);
        FriendsMod.network.sendTo(packet, (EntityPlayerMP) to);
    }

    public void syncAll() {
        if (player.worldObj.isRemote || !(player instanceof EntityPlayerMP)) {
            return;
        }

        NBTTagCompound nbt = new NBTTagCompound();
        pack(nbt);
        FMLProxyPacket packet = FriendsMod.network.createPacket(FriendsPacketHandler.SYNC_PLAYER_DATA_ALL,
                player.getEntityId(), nbt);
        FriendsMod.network.sendToAll(packet);
    }

    public void init(Entity entity, World world) {
    }

    public static class MemberRequest extends Member {

        private int time;
        private boolean requested;

        public MemberRequest(String title, UUID uuid) {
            this(title, uuid, FriendsMod.REQUEST_TIME);
        }

        public MemberRequest(String title, UUID uuid, int ticks) {
            super(title, uuid);
            time = ticks;
        }

        public static MemberRequest load(NBTTagCompound nbt) {
            UUID uuid = new UUID(nbt.getLong("mostId"), nbt.getLong("leastId"));
            String title = nbt.getString("name");
            int time = nbt.getInteger("time");
            boolean requested = nbt.getBoolean("requested");
            MemberRequest request = new MemberRequest(title, uuid, time);
            request.setRequested(requested);
            return request;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int requestTime) {
            time = requestTime;
        }

        public boolean isRequested() {
            return requested;
        }

        public void setRequested(boolean isRequested) {
            requested = isRequested;
        }

        public void save(NBTTagCompound nbt) {
            super.save(nbt);
            nbt.setInteger("time", time);
            nbt.setBoolean("requested", requested);
        }
    }

    public static class Member {

        private final String name;
        private final UUID id;

        public Member(String title, UUID uuid) {
            name = title;
            id = uuid;
        }

        public static Member load(NBTTagCompound nbt) {
            UUID uuid = new UUID(nbt.getLong("mostId"), nbt.getLong("leastId"));
            String title = nbt.getString("name");
            return new Member(title, uuid);
        }

        public String getName() {
            return name;
        }

        public UUID getId() {
            return id;
        }

        public void save(NBTTagCompound nbt) {
            nbt.setLong("mostId", id.getMostSignificantBits());
            nbt.setLong("leastId", id.getLeastSignificantBits());
            nbt.setString("name", name);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Member)) {
                return false;
            }

            Member o = (Member) obj;

            return getId().equals(o.getId());
        }

        public int hashCode() {
            return Objects.hashCode(id);
        }

        public String toString() {
            return name;
        }
    }
}