package com.flansmod.common.guns;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.IChatComponent;

public class EntityDamageSourceGun extends EntityDamageSourceIndirect {

    public InfoType weapon;
    public EntityPlayer shooter;
    public boolean headshot;

    public EntityDamageSourceGun(String s, Entity entity, EntityPlayer player, InfoType wep, boolean head) {
        super(s, entity, player);
        this.weapon = wep;
        this.shooter = player;
        this.headshot = head;
    }

    public Entity getDamageSourceEntity() {
        return super.damageSourceEntity;
    }

    public IChatComponent func_151519_b(EntityLivingBase living) {
        if (living instanceof EntityPlayer && this.shooter != null
                && PlayerHandler.getPlayerData(this.shooter) != null) {
            EntityPlayer player = (EntityPlayer) living;
            FlansMod.getPacketHandler()
                    .sendToDimension(
                            new PacketKillMessage(this.headshot, this.weapon,
                                    player.getCommandSenderName(), this.shooter.getCommandSenderName()),
                            living.dimension);
            return new ChatComponentText("");
        } else {
            return new ChatComponentText("");
        }
    }
}
