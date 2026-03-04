// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.render;

import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;
import mcu.movement.Movement;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class MovementModel extends ModelPlayerBase {
    public MovementModel(final ModelPlayerAPI modelPlayerAPI) {
        super(modelPlayerAPI);
    }

    public void afterSetRotationAngles(final float n, final float n2, final float n3, final float n4, final float n5,
                                       final float n6, final Entity entity) {
        if (!(entity instanceof EntityOtherPlayerMP) || !Movement.isPlayerCrawling((EntityPlayer) entity)) {
            this.modelPlayer.bipedBody.rotationPointY = 0.0f;
            this.modelPlayer.bipedHead.rotationPointY = 0.0f;
            this.modelPlayer.bipedHeadwear.rotationPointY = 0.0f;
            this.modelPlayer.bipedRightArm.rotationPointY = 2.0f;
            this.modelPlayer.bipedLeftArm.rotationPointY = 2.0f;
            return;
        }
        this.modelPlayer.bipedBody.rotateAngleX = 1.5707964f;
        this.modelPlayer.bipedBody.rotationPointY = 5.0f;
        this.modelPlayer.bipedHead.rotationPointY = 3.0f;
        this.modelPlayer.bipedHeadwear.rotationPointY = 3.0f;
        if (!this.modelPlayer.aimedBow) {
            this.modelPlayer.bipedRightArm.rotationPointY = 5.0f;
            this.modelPlayer.bipedLeftArm.rotationPointY = 5.0f;
            this.modelPlayer.bipedRightArm.rotateAngleY = -this.modelPlayer.bipedRightArm.rotateAngleX * 0.7f;
            this.modelPlayer.bipedLeftArm.rotateAngleY = this.modelPlayer.bipedLeftArm.rotateAngleX * 0.7f;
            final ModelRenderer bipedRightArm = this.modelPlayer.bipedRightArm;
            bipedRightArm.rotateAngleX *= -0.15f;
            final ModelRenderer bipedLeftArm = this.modelPlayer.bipedLeftArm;
            bipedLeftArm.rotateAngleX *= -0.15f;
            final ModelRenderer bipedRightArm2 = this.modelPlayer.bipedRightArm;
            bipedRightArm2.rotateAngleX -= 1.5707964f;
            final ModelRenderer bipedLeftArm2 = this.modelPlayer.bipedLeftArm;
            bipedLeftArm2.rotateAngleX -= 1.5707964f;
        } else {
            this.modelPlayer.bipedRightArm.rotationPointY = 5.0f;
            this.modelPlayer.bipedLeftArm.rotationPointY = 5.0f;
        }
        this.modelPlayer.bipedRightLeg.rotationPointZ = 12.0f;
        this.modelPlayer.bipedLeftLeg.rotationPointZ = 12.0f;
        this.modelPlayer.bipedRightLeg.rotationPointY = 5.0f;
        this.modelPlayer.bipedLeftLeg.rotationPointY = 5.0f;
        this.modelPlayer.bipedRightLeg.rotateAngleY = this.modelPlayer.bipedRightLeg.rotateAngleX * 0.5f;
        this.modelPlayer.bipedLeftLeg.rotateAngleY = -this.modelPlayer.bipedLeftLeg.rotateAngleX * 0.5f;
        final ModelRenderer bipedRightLeg = this.modelPlayer.bipedRightLeg;
        bipedRightLeg.rotateAngleX *= -0.1f;
        final ModelRenderer bipedLeftLeg = this.modelPlayer.bipedLeftLeg;
        bipedLeftLeg.rotateAngleX *= -0.1f;
        final ModelRenderer bipedRightLeg2 = this.modelPlayer.bipedRightLeg;
        bipedRightLeg2.rotateAngleX += 1.5707964f;
        final ModelRenderer bipedLeftLeg2 = this.modelPlayer.bipedLeftLeg;
        bipedLeftLeg2.rotateAngleX += 1.5707964f;
    }
}
