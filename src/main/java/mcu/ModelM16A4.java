// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelM16A4 extends ModelGun {
    int textureX;
    int textureY;

    public ModelM16A4() {
        this.textureX = 64;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[26])[0] = new ModelRendererTurbo(this, 25, 3, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 10, 9, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 10, 9, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 10, 9, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.3f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -3.0f, -0.5f);
        this.gunModel[0].rotateAngleZ = -0.2617994f;
        this.gunModel[1].addBox(0.6f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -3.0f, -0.5f);
        this.gunModel[1].rotateAngleZ = -0.2617994f;
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -4.0f, -0.6f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 2, 0, 1, 0.0f);
        this.gunModel[3].setRotationPoint(0.5f, -1.5f, -0.5f);
        this.gunModel[4].addBox(0.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(2.5f, -1.5f, -0.6f);
        this.gunModel[4].rotateAngleZ = 0.1919862f;
        this.gunModel[5].addBox(1.466667f, -1.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(2.5f, -1.5f, -0.6f);
        this.gunModel[5].rotateAngleZ = 0.1919862f;
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[6].setRotationPoint(4.0f, -4.0f, -0.6f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.gunModel[7].setRotationPoint(0.0f, -4.0f, -0.4f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[8].setRotationPoint(4.0f, -4.0f, -0.4f);
        this.gunModel[9].addBox(0.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(2.5f, -1.5f, -0.4f);
        this.gunModel[9].rotateAngleZ = 0.1919862f;
        this.gunModel[10].addBox(1.5f, -1.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(2.5f, -1.5f, -0.4f);
        this.gunModel[10].rotateAngleZ = 0.1919862f;
        this.gunModel[11].addBox(-1.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(0.0f, -2.0f, -0.5f);
        this.gunModel[11].rotateAngleZ = -0.7853982f;
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(-0.7f, -3.7f, -0.5f);
        this.gunModel[13].addBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(5.0f, -4.3f, -0.5f);
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(5.5f, -4.3f, -1.0f);
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[15].setRotationPoint(5.5f, -4.8f, -0.5f);
        this.gunModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[16].setRotationPoint(13.0f, -5.5f, -0.5f);
        this.gunModel[17].addBox(-1.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[17].setRotationPoint(13.0f, -4.0f, -0.5f);
        this.gunModel[17].rotateAngleZ = 0.7853982f;
        this.gunModel[18].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[18].setRotationPoint(0.0f, -4.8f, -0.5f);
        this.gunModel[19].addBox(0.0f, -1.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[19].setRotationPoint(5.5f, -2.8f, -0.5f);
        this.gunModel[20].addBox(0.0f, 0.0f, -1.0f, 7, 1, 1, 0.0f);
        this.gunModel[20].setRotationPoint(5.5f, -4.3f, 1.0f);
        this.gunModel[21].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[21].setRotationPoint(5.5f, -4.0f, -0.2f);
        this.gunModel[22].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[22].setRotationPoint(5.5f, -4.6f, -0.2f);
        this.gunModel[23].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[23].setRotationPoint(5.5f, -4.6f, -0.8f);
        this.gunModel[24].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[24].setRotationPoint(5.5f, -4.0f, -0.8f);
        this.gunModel[25].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[25].setRotationPoint(-1.0f, -4.5f, -0.5f);
        (this.defaultScopeModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo(this, 0, 0,
                this.textureX, this.textureY);
        this.defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.defaultScopeModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.defaultScopeModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.defaultScopeModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.defaultScopeModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.defaultScopeModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.defaultScopeModel[0].setRotationPoint(0.0f, -5.5f, -0.5f);
        this.defaultScopeModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f,
                0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.defaultScopeModel[1].setRotationPoint(0.0f, -5.2f, -0.5f);
        this.defaultScopeModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.defaultScopeModel[2].setRotationPoint(4.0f, -5.6f, -0.5f);
        this.defaultScopeModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.defaultScopeModel[3].setRotationPoint(0.0f, -6.5f, -0.5f);
        this.defaultScopeModel[3].rotateAngleZ = -0.05235988f;
        this.defaultScopeModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f,
                -0.75f);
        this.defaultScopeModel[4].setRotationPoint(0.0f, -6.5f, -0.5f);
        this.defaultScopeModel[4].rotateAngleZ = -0.05235988f;
        this.defaultScopeModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f,
                -0.75f);
        this.defaultScopeModel[5].setRotationPoint(0.0f, -6.5f, -0.8f);
        (this.defaultStockModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo(this, 10, 6,
                this.textureX, this.textureY);
        this.defaultStockModel[1] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.defaultStockModel[2] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.defaultStockModel[3] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.defaultStockModel[4] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.defaultStockModel[5] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.defaultStockModel[6] = new ModelRendererTurbo(this, 10, 6, this.textureX, this.textureY);
        this.defaultStockModel[7] = new ModelRendererTurbo(this, 25, 3, this.textureX, this.textureY);
        this.defaultStockModel[8] = new ModelRendererTurbo(this, 25, 3, this.textureX, this.textureY);
        this.defaultStockModel[9] = new ModelRendererTurbo(this, 13, 6, this.textureX, this.textureY);
        this.defaultStockModel[10] = new ModelRendererTurbo(this, 12, 6, this.textureX, this.textureY);
        this.defaultStockModel[0].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.defaultStockModel[0].setRotationPoint(-7.0f, -4.5f, -0.5f);
        this.defaultStockModel[1].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.defaultStockModel[1].setRotationPoint(-6.0f, -4.0f, -0.5f);
        this.defaultStockModel[2].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.defaultStockModel[2].setRotationPoint(-6.5f, -4.0f, -0.6f);
        this.defaultStockModel[3].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.defaultStockModel[3].setRotationPoint(-6.5f, -4.5f, -0.6f);
        this.defaultStockModel[4].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.defaultStockModel[4].setRotationPoint(-6.5f, -4.5f, -0.4f);
        this.defaultStockModel[5].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.defaultStockModel[5].setRotationPoint(-6.5f, -4.0f, -0.4f);
        this.defaultStockModel[6].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.defaultStockModel[6].setRotationPoint(-6.5f, -4.6f, -0.5f);
        this.defaultStockModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f);
        this.defaultStockModel[7].setRotationPoint(-7.0f, -4.6f, -0.5f);
        this.defaultStockModel[8].addBox(-1.0f, -5.0f, 0.0f, 1, 5, 1, 0.0f);
        this.defaultStockModel[8].setRotationPoint(-6.0f, -0.6f, -0.5f);
        this.defaultStockModel[8].rotateAngleZ = -1.099557f;
        this.defaultStockModel[9].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.defaultStockModel[9].setRotationPoint(-6.4f, -3.0f, -0.5f);
        this.defaultStockModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.defaultStockModel[10].setRotationPoint(-6.0f, -2.5f, -0.5f);
        (this.ammoModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 0, 6, this.textureX,
                this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 0, 6, this.textureX, this.textureY);
        this.ammoModel[0].addBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(2.8f, -2.0f, -0.5f);
        this.ammoModel[0].rotateAngleZ = 0.1570796f;
        this.ammoModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f);
        this.ammoModel[1].setRotationPoint(3.1f, 0.0f, -0.5f);
        this.ammoModel[1].rotateAngleZ = 0.3141593f;
        this.barrelAttachPoint = new Vector3f(1.0f, 0.2375f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.0625f, 0.3f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.5625f, 0.1875f, 0.0f);
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
    }
}
