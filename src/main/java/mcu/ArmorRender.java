package mcu.client.models;

import api.player.render.RenderPlayerAPI;
import api.player.render.RenderPlayerBase;
import net.minecraft.client.entity.AbstractClientPlayer;

public class ArmorRender extends RenderPlayerBase {

    public ArmorRender(RenderPlayerAPI arg0) {
        super(arg0);
    }

    public void renderSpecials(final AbstractClientPlayer abstractClientPlayer, final float n) {
        super.renderSpecials(abstractClientPlayer, n);
    }

    public enum ModelPart {
        BODY, HEAD, LARM, RARM, LLEG, RLEG, LBOOT, RBOOT, JAGVOROT
    }

}
