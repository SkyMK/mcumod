// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelPSG1 extends ModelGun {
    int textureX;
    int textureY;

    public ModelPSG1() {
        this.textureX = 64;
        this.textureY = 64;
        (this.gunModel = new ModelRendererTurbo[23])[0] = new ModelRendererTurbo(this, 25, 6, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 7, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 40, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 40, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 40, 0, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 40, 0, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 7, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[0].setRotationPoint(1.0f, -2.0f, -0.5f);
        this.gunModel[0].rotateAngleZ = -0.1570796f;
        this.gunModel[1].addBox(0.2f, 0.0f, -0.3f, 2, 1, 1, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[1].rotateAngleZ = -0.08726646f;
        this.gunModel[2].addBox(0.2f, 0.0f, -0.7f, 2, 1, 1, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[2].rotateAngleZ = -0.08726646f;
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[3].setRotationPoint(0.5f, -2.0f, -0.5f);
        this.gunModel[3].rotateAngleZ = 0.6108652f;
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.gunModel[4].setRotationPoint(1.3f, -3.6f, -0.6f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.gunModel[5].setRotationPoint(1.3f, -3.6f, -0.4f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[6].setRotationPoint(-2.0f, -3.2f, -0.3f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[7].setRotationPoint(-2.0f, -3.2f, -0.7f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 15, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(-1.0f, -3.8f, -0.4f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 15, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(-1.0f, -3.8f, -0.6f);
        this.gunModel[10].addBox(0.0f, -1.0f, -1.0f, 8, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(6.0f, -2.0f, 0.9f);
        this.gunModel[10].rotateAngleX = 0.2094395f;
        this.gunModel[11].addBox(0.0f, -1.5f, -1.0f, 8, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(6.0f, -2.0f, 0.9f);
        this.gunModel[11].rotateAngleX = 0.1919862f;
        this.gunModel[12].addBox(0.0f, -1.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(6.0f, -2.0f, -0.9f);
        this.gunModel[12].rotateAngleX = -0.1919862f;
        this.gunModel[13].addBox(0.0f, -1.5f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(6.0f, -2.0f, -0.9f);
        this.gunModel[13].rotateAngleX = -0.1919862f;
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(13.0f, -3.2f, -0.5f);
        this.gunModel[15].addBox(-1.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[15].setRotationPoint(-1.0f, -3.8f, -0.4f);
        this.gunModel[15].rotateAngleZ = 0.6283185f;
        this.gunModel[16].addBox(-1.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[16].setRotationPoint(-1.0f, -3.8f, -0.6f);
        this.gunModel[16].rotateAngleZ = 0.6283185f;
        this.gunModel[17].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[17].setRotationPoint(-7.0f, -3.2f, -0.3f);
        this.gunModel[18].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[18].setRotationPoint(-7.0f, -3.2f, -0.7f);
        this.gunModel[19].addBox(0.0f, 0.0f, 0.0f, 4, 3, 1, 0.0f);
        this.gunModel[19].setRotationPoint(-7.0f, -3.2f, -0.7f);
        this.gunModel[20].addBox(0.0f, 0.0f, 0.0f, 4, 3, 1, 0.0f);
        this.gunModel[20].setRotationPoint(-7.0f, -3.2f, -0.3f);
        this.gunModel[21].addBox(-2.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[21].setRotationPoint(-1.5f, -2.2f, -0.3f);
        this.gunModel[21].rotateAngleZ = 0.6632251f;
        this.gunModel[22].addBox(-2.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[22].setRotationPoint(-1.5f, -2.2f, -0.7f);
        this.gunModel[22].rotateAngleZ = 0.6632251f;
        (this.defaultScopeModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 0, 0,
                this.textureX, this.textureY);
        this.defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.defaultScopeModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.defaultScopeModel[0].setRotationPoint(0.0f, -4.4f, -0.5f);
        this.defaultScopeModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.defaultScopeModel[1].setRotationPoint(11.0f, -4.4f, -0.5f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY))
                .addBox(-2.0f, 0.0f, 0.0f, 2, 3, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(5.5f, -3.0f, -0.5f);
        this.ammoModel[0].rotateAngleZ = 0.1047198f;
        this.barrelAttachPoint = new Vector3f(1.1875f, 0.16875f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.125f, 0.2375f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.625f, 0.11875f, 0.0f);
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
    }
}
