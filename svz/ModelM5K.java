// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelM5K extends ModelGun {
    int textureX;
    int textureY;

    public ModelM5K() {
        this.textureX = 64;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[21])[0] = new ModelRendererTurbo(this, 25, 3, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 18, 4, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 6, 6, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 20, 15, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 15, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 0, 15, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 20, 15, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 20, 15, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 20, 15, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 0, 15, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 0, 15, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.3f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -3.0f, -0.5f);
        this.gunModel[0].rotateAngleZ = -0.2617994f;
        this.gunModel[1].addBox(0.6f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -3.0f, -0.5f);
        this.gunModel[1].rotateAngleZ = -0.2617994f;
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -4.0f, -0.6f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[3].setRotationPoint(1.0f, -1.5f, -0.5f);
        this.gunModel[4].addBox(0.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(2.5f, -1.5f, -0.6f);
        this.gunModel[4].rotateAngleZ = 0.1919862f;
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[5].setRotationPoint(3.5f, -4.0f, -0.6f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.gunModel[6].setRotationPoint(0.0f, -4.0f, -0.4f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[7].setRotationPoint(3.5f, -4.0f, -0.4f);
        this.gunModel[8].addBox(0.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(2.5f, -1.5f, -0.4f);
        this.gunModel[8].rotateAngleZ = 0.1919862f;
        this.gunModel[9].addBox(-1.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(0.0f, -2.0f, -0.5f);
        this.gunModel[9].rotateAngleZ = -0.7853982f;
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f,
                -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[10].setRotationPoint(-0.7f, -3.7f, -0.5f);
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(-0.7f, -4.8f, -0.5f);
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[12].setRotationPoint(2.0f, -1.5f, -0.5f);
        this.gunModel[12].rotateAngleZ = 1.325624f;
        this.gunModel[13].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(4.0f, -4.0f, -0.5f);
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(5.0f, -3.9f, -0.7f);
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[15].setRotationPoint(5.0f, -3.9f, -0.3f);
        this.gunModel[16].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[16].setRotationPoint(4.3f, -4.0f, -0.5f);
        this.gunModel[17].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[17].setRotationPoint(6.0f, -5.5f, -0.5f);
        this.gunModel[18].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[18].setRotationPoint(0.0f, -5.5f, -0.5f);
        this.gunModel[18].rotateAngleZ = -0.2617994f;
        this.gunModel[19].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[19].setRotationPoint(7.3f, -3.9f, -0.3f);
        this.gunModel[20].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[20].setRotationPoint(7.3f, -3.9f, -0.7f);
        this.defaultStockModel = new ModelRendererTurbo[1];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 20, 15, this.textureX, this.textureY))
                .addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.defaultStockModel[0].setRotationPoint(-0.7f, -4.4f, -0.5f);
        (this.defaultGripModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 0, 15,
                this.textureX, this.textureY);
        this.defaultGripModel[1] = new ModelRendererTurbo(this, 0, 14, this.textureX, this.textureY);
        this.defaultGripModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.defaultGripModel[0].setRotationPoint(6.8f, -3.0f, -0.5f);
        this.defaultGripModel[0].rotateAngleZ = 0.7853982f;
        this.defaultGripModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.defaultGripModel[1].setRotationPoint(5.5f, -3.0f, -0.5f);
        (this.ammoModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 0, 6, this.textureX,
                this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 0, 6, this.textureX, this.textureY);
        this.ammoModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(3.0f, -2.0f, -0.5f);
        this.ammoModel[0].rotateAngleZ = 0.1570796f;
        this.ammoModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.ammoModel[1].setRotationPoint(3.3f, 0.0f, -0.5f);
        this.ammoModel[1].rotateAngleZ = 0.3141593f;
        this.barrelAttachPoint = new Vector3f(0.51875f, 0.21875f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.1125f, 0.3f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.013125f, 0.24375f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.40625f, 0.15625f, 0.0f);
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
    }
}
