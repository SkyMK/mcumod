// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.render;

import api.player.render.RenderPlayerAPI;
import api.player.render.RenderPlayerBase;
import mcu.movement.Movement;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import org.lwjgl.opengl.GL11;

public class MovementRender extends RenderPlayerBase {
    public MovementRender(final RenderPlayerAPI renderPlayerAPI) {
        super(renderPlayerAPI);
    }

    public void renderPlayer(final AbstractClientPlayer abstractClientPlayer, final double n, final double n2,
                             final double n3, final float n4, final float n5) {
        final boolean b = abstractClientPlayer instanceof EntityOtherPlayerMP
                && Movement.isPlayerCrawling(abstractClientPlayer);
        if (b) {
            GL11.glPushMatrix();
            GL11.glTranslatef(-((float) Math.sin(abstractClientPlayer.rotationYaw * 3.141592653589793 / 180.0) * 0.1f),
                    -1.0f, (float) Math.cos(abstractClientPlayer.rotationYaw * 3.141592653589793 / 180.0) * 0.1f);
        }
        this.renderPlayerAPI.localRenderPlayer(abstractClientPlayer, n, n2, n3, n4, n5);
        if (b) {
            GL11.glPopMatrix();
        }
    }
}
