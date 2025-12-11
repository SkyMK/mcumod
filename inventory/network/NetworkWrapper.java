// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.network;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.FMLEventChannel;
import cpw.mods.fml.common.network.FMLNetworkEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.PacketBuffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkWrapper {
    public static NetworkWrapper instance;

    static {
        NetworkWrapper.instance = new NetworkWrapper("backpackmodChanel");
    }

    private final List<Class<? extends AbstractPacket>> ID_TO_PACKET;
    private final Map<Class<? extends AbstractPacket>, Short> PACKET_TO_ID;
    private final FMLEventChannel channel;
    private final String name;

    public NetworkWrapper(final String name) {
        this.ID_TO_PACKET = new ArrayList<Class<? extends AbstractPacket>>();
        this.PACKET_TO_ID = new HashMap<Class<? extends AbstractPacket>, Short>();
        this.name = name;
        (this.channel = NetworkRegistry.INSTANCE.newEventDrivenChannel(name)).register(this);
    }

    public void registerPacket(final Class<? extends AbstractPacket> packet) {
        try {
            packet.getDeclaredConstructor(new Class[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!this.PACKET_TO_ID.containsKey(packet)) {
            this.ID_TO_PACKET.add(packet);
            this.PACKET_TO_ID.put(packet, (short) (this.ID_TO_PACKET.size() - 1));
        }
    }

    @SubscribeEvent
    public void onServerPacket(final FMLNetworkEvent.ServerCustomPacketEvent e) {
        if (!e.packet.channel().equals(this.name)) {
            return;
        }
        try {
            final ByteBuf buf = e.packet.payload();
            final AbstractPacket msg = this.ID_TO_PACKET.get(buf.readShort()).newInstance();
            msg.fromBytes(buf);
            msg.serverHandler(((NetHandlerPlayServer) e.handler).playerEntity);
        } catch (Throwable exc) {
            exc.printStackTrace();
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onClientPacket(final FMLNetworkEvent.ClientCustomPacketEvent e) {
        if (!e.packet.channel().equals(this.name)) {
            return;
        }
        try {
            final ByteBuf buf = e.packet.payload();
            final AbstractPacket msg = this.ID_TO_PACKET.get(buf.readShort()).newInstance();
            msg.fromBytes(buf);
            msg.clientHandler(Minecraft.getMinecraft().thePlayer);
        } catch (Throwable exc) {
            exc.printStackTrace();
        }
    }

    private FMLProxyPacket createPacket(final AbstractPacket msg) {
        final Class clazz = msg.getClass();
        if (!this.PACKET_TO_ID.containsKey(clazz)) {
            Minecraft.getMinecraft()
                    .crashed(new CrashReport("Try to send unknow packet", new Throwable("Try to send unknow packet")));
        }
        final ByteBuf buf = msg.getOrCreateByteBuf();
        buf.writeShort((int) this.PACKET_TO_ID.get(clazz));
        msg.toBytes(buf);
        return new FMLProxyPacket(new PacketBuffer(buf), this.name);
    }

    public void sendToServer(final AbstractPacket packet) {
        this.channel.sendToServer(this.createPacket(packet));
    }

    public void sendTo(final AbstractPacket packet, final EntityPlayerMP player) {
        this.channel.sendTo(this.createPacket(packet), player);
    }

    public void sendToAll(final AbstractPacket packet) {
        this.channel.sendToAll(this.createPacket(packet));
    }

    public void sendToAllAround(final AbstractPacket packet, final NetworkRegistry.TargetPoint point) {
        this.channel.sendToAllAround(this.createPacket(packet), point);
    }

    public void sendToDimension(final AbstractPacket packet, final int dimensionId) {
        this.channel.sendToDimension(this.createPacket(packet), dimensionId);
    }
}
