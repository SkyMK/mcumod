// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelL85A2 extends ModelGun {
    int textureX;
    int textureY;

    public ModelL85A2() {
        this.textureX = 128;
        this.textureY = 64;
        (this.gunModel = new ModelRendererTurbo[26])[0] = new ModelRendererTurbo(this, 1, 25, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 36, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 51, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 16, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 21, 30, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 23, 46, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 24, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 24, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 23, 46, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 1, 16, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 1, 36, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 1, 51, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 23, 46, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 23, 46, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 2, 41, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f);
        this.gunModel[0].setRotationPoint(-7.0f, -4.1f, -0.7f);
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.gunModel[1].setRotationPoint(-1.0f, -4.1f, -0.7f);
        this.gunModel[2].addBox(0.0f, -1.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[2].setRotationPoint(3.0f, -2.8f, -0.8f);
        this.gunModel[2].rotateAngleX = -0.2094395f;
        this.gunModel[3].addBox(0.0f, -1.4f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[3].setRotationPoint(3.0f, -2.8f, -0.8f);
        this.gunModel[3].rotateAngleX = -0.2094395f;
        this.gunModel[4].addBox(0.0f, -1.0f, 0.0f, 10, 2, 1, 0.0f);
        this.gunModel[4].setRotationPoint(-7.0f, -2.0f, -0.7f);
        this.gunModel[4].rotateAngleZ = 0.08726646f;
        this.gunModel[5].addBox(2.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[5].setRotationPoint(-0.5f, -3.5f, -0.5f);
        this.gunModel[5].rotateAngleZ = -0.2443461f;
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[6].setRotationPoint(-2.9f, -2.0f, -0.6f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[7].setRotationPoint(2.0f, -1.3f, -0.5f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[8].setRotationPoint(3.0f, -1.3f, -0.5f);
        this.gunModel[8].rotateAngleZ = 1.37881f;
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(-2.9f, -2.0f, -0.4f);
        this.gunModel[10].addBox(0.0f, -1.0f, 0.0f, 10, 2, 1, 0.0f);
        this.gunModel[10].setRotationPoint(-7.0f, -2.0f, -0.3f);
        this.gunModel[10].rotateAngleZ = 0.08726646f;
        this.gunModel[11].addBox(-1.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f);
        this.gunModel[11].setRotationPoint(-6.0f, -4.1f, -0.3f);
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.gunModel[12].setRotationPoint(-1.0f, -4.1f, -0.3f);
        this.gunModel[13].addBox(0.0f, -1.4f, -1.0f, 3, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(3.0f, -2.8f, 0.8f);
        this.gunModel[13].rotateAngleX = 0.2094395f;
        this.gunModel[14].addBox(0.0f, -1.0f, -1.0f, 5, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(3.0f, -2.8f, 0.8f);
        this.gunModel[14].rotateAngleX = 0.2094395f;
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[15].setRotationPoint(3.0f, -2.8f, -0.8f);
        this.gunModel[16].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[16].setRotationPoint(3.0f, -2.8f, -0.2f);
        this.gunModel[17].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[17].setRotationPoint(3.0f, -4.2f, -0.5f);
        this.gunModel[18].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[18].setRotationPoint(-3.1f, -2.0f, -0.6f);
        this.gunModel[19].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[19].setRotationPoint(-3.1f, -2.0f, -0.4f);
        this.gunModel[20].addBox(0.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[20].setRotationPoint(-6.5f, -0.6f, -0.6f);
        this.gunModel[20].rotateAngleZ = 0.4712389f;
        this.gunModel[21].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[21].setRotationPoint(-6.0f, -4.2f, -0.8f);
        this.gunModel[22].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[22].setRotationPoint(-6.0f, -4.2f, -0.2f);
        this.gunModel[23].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[23].setRotationPoint(-6.0f, -3.6f, -0.8f);
        this.gunModel[24].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[24].setRotationPoint(-6.0f, -3.6f, -0.2f);
        this.gunModel[25].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[25].setRotationPoint(6.0f, -3.8f, -0.5f);
        this.defaultBarrelModel = new ModelRendererTurbo[1];
        (this.defaultBarrelModel[0] = new ModelRendererTurbo(this, 21, 35, this.textureX, this.textureY))
                .addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.defaultBarrelModel[0].setRotationPoint(8.0f, -3.6f, -0.5f);
        (this.defaultScopeModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 48, 30,
                this.textureX, this.textureY);
        this.defaultScopeModel[1] = new ModelRendererTurbo(this, 48, 30, this.textureX, this.textureY);
        this.defaultScopeModel[2] = new ModelRendererTurbo(this, 48, 30, this.textureX, this.textureY);
        this.defaultScopeModel[3] = new ModelRendererTurbo(this, 3, 15, this.textureX, this.textureY);
        this.defaultScopeModel[4] = new ModelRendererTurbo(this, 3, 15, this.textureX, this.textureY);
        this.defaultScopeModel[5] = new ModelRendererTurbo(this, 3, 15, this.textureX, this.textureY);
        this.defaultScopeModel[6] = new ModelRendererTurbo(this, 3, 15, this.textureX, this.textureY);
        this.defaultScopeModel[7] = new ModelRendererTurbo(this, 3, 15, this.textureX, this.textureY);
        this.defaultScopeModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f,
                0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.defaultScopeModel[0].setRotationPoint(6.0f, -4.5f, -0.5f);
        this.defaultScopeModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f,
                -0.75f);
        this.defaultScopeModel[1].setRotationPoint(6.0f, -5.5f, -0.5f);
        this.defaultScopeModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.defaultScopeModel[2].setRotationPoint(6.0f, -5.5f, -0.5f);
        this.defaultScopeModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.625f, 0.0f, 0.0f,
                -0.625f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.625f, 0.0f, 0.0f, -0.625f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.defaultScopeModel[3].setRotationPoint(-2.0f, -5.0f, -0.5f);
        this.defaultScopeModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, -0.5f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.75f,
                0.0f, -0.5f, -0.75f);
        this.defaultScopeModel[4].setRotationPoint(-2.0f, -5.75f, -0.5f);
        this.defaultScopeModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, -0.5f, -0.75f,
                0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.75f, 0.0f, -0.5f, -0.75f, 0.0f, -0.5f, 0.0f, 0.0f,
                -0.5f, 0.0f);
        this.defaultScopeModel[5].setRotationPoint(-2.0f, -5.75f, -0.5f);
        this.defaultScopeModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f,
                0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.defaultScopeModel[6].setRotationPoint(-2.0f, -6.0f, -0.5f);
        this.defaultScopeModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f,
                0.0f, 0.0f);
        this.defaultScopeModel[7].setRotationPoint(1.0f, -5.0f, -0.5f);
        (this.ammoModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 21, 39,
                this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 21, 39, this.textureX, this.textureY);
        this.ammoModel[0].addBox(0.0f, 0.0f, 0.0f, 2, 3, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(-3.0f, -3.0f, -0.5f);
        this.ammoModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f);
        this.ammoModel[1].setRotationPoint(-3.0f, -0.1f, -0.5f);
        this.ammoModel[1].rotateAngleZ = 0.1570796f;
        this.barrelAttachPoint = new Vector3f(0.5f, 0.19375f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.03125f, 0.2625f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.3125f, 0.09375f, 0.0f);
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
    }
}
