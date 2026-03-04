package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

import java.util.Random;

public class PacketFlak extends PacketBase {

    public static Random rand = new Random();
    public double x;
    public double y;
    public double z;
    public int numParticles;
    public String particleType;

    public PacketFlak() {
    }

    public PacketFlak(double x1, double y1, double z1, int n, String s) {
        this.x = x1;
        this.y = y1;
        this.z = z1;
        this.numParticles = n;
        this.particleType = s;
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeDouble(this.x);
        data.writeDouble(this.y);
        data.writeDouble(this.z);
        data.writeInt(this.numParticles);
        this.writeUTF(data, this.particleType);
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.x = data.readDouble();
        this.y = data.readDouble();
        this.z = data.readDouble();
        this.numParticles = data.readInt();
        this.particleType = this.readUTF(data);
    }

    public void handleServerSide(EntityPlayerMP playerEntity) {
        FlansMod.log("Received flak packet on server. Disregarding.");
    }

    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        World world = clientPlayer.worldObj;

        for (int i = 0; i < this.numParticles; ++i) {
            EntityFX obj = FlansModClient.getParticle(this.particleType, world, this.x + rand.nextGaussian(),
                    this.y + rand.nextGaussian(), this.z + rand.nextGaussian());
            if (obj != null) {
                obj.motionX = rand.nextGaussian() / 20.0D;
                obj.motionY = rand.nextGaussian() / 20.0D;
                obj.motionZ = rand.nextGaussian() / 20.0D;
                obj.renderDistanceWeight = 250.0D;
                FMLClientHandler.instance().getClient().effectRenderer.addEffect(obj);
            }
        }

    }

}
