package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelProtoTitan extends ModelMecha {

    public ModelProtoTitan() {
        short textureX = 256;
        short textureY = 256;
        super.hipsAttachmentPoint = new Vector3f(-0.75625F, 2.25F, 0.0F);
        super.bodyModel = new ModelRendererTurbo[8];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addBox(-12.0F, 29.0F, -12.0F, 16, 19, 24);
        super.bodyModel[1] = new ModelRendererTurbo(this, 88, 0, textureX, textureY);
        super.bodyModel[1].addShape3D(0.0F, 21.0F, 12.0F,
                new Shape2D(new Coord2D[]{new Coord2D(4.0D, 8.0D, 0, 0), new Coord2D(12.0D, 8.0D, 8, 0),
                        new Coord2D(12.0D, 18.0D, 8, 10), new Coord2D(4.0D, 27.0D, 0, 19)}),
                24.0F, 8, 19, 49, 24, 1, new float[]{19.0F, 12.0F, 10.0F, 8.0F});
        super.bodyModel[2] = new ModelRendererTurbo(this, 139, 0, textureX, textureY);
        super.bodyModel[2].addShape3D(0.0F, 21.0F, 12.0F,
                new Shape2D(new Coord2D[]{new Coord2D(-12.0D, 0.0D, 0, 0), new Coord2D(8.0D, 0.0D, 20, 0),
                        new Coord2D(12.0D, 8.0D, 24, 8), new Coord2D(-12.0D, 8.0D, 0, 8)}),
                24.0F, 24, 8, 61, 24, 1, new float[]{8.0F, 24.0F, 9.0F, 20.0F});
        super.bodyModel[3] = new ModelRendererTurbo(this, 118, 34, textureX, textureY);
        super.bodyModel[3].flip = true;
        super.bodyModel[3].addBox(-12.0F, 29.0F, -11.5F, 16, 19, 23);
        super.bodyModel[4] = new ModelRendererTurbo(this, 203, 0, textureX, textureY);
        super.bodyModel[4].addShape3D(0.0F, 21.0F, 11.5F,
                new Shape2D(new Coord2D[]{new Coord2D(4.0D, 8.0D, 0, 0), new Coord2D(4.0D, 27.0D, 0, 19),
                        new Coord2D(12.0D, 18.0D, 8, 10), new Coord2D(12.0D, 8.0D, 8, 0)}),
                23.0F, 8, 19, 49, 24, 1, new float[]{8.0F, 10.0F, 12.0F, 19.0F});
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 52, textureX, textureY);
        super.bodyModel[5].addShape3D(0.0F, 21.0F, 11.5F,
                new Shape2D(new Coord2D[]{new Coord2D(-12.0D, 2.0D, 0, 0), new Coord2D(-12.0D, 8.0D, 0, 6),
                        new Coord2D(12.0D, 8.0D, 24, 6), new Coord2D(9.0D, 2.0D, 21, 0)}),
                23.0F, 24, 6, 61, 24, 1, new float[]{20.0F, 9.0F, 24.0F, 8.0F});
        super.bodyModel[6] = new ModelRendererTurbo(this, 85, 82, textureX, textureY);
        super.bodyModel[6].addBox(6.0F, 21.0F, -5.0F, 2, 8, 2);
        super.bodyModel[7] = new ModelRendererTurbo(this, 85, 82, textureX, textureY);
        super.bodyModel[7].addBox(6.0F, 21.0F, 3.0F, 2, 8, 2);
        super.leftArmModel = new ModelRendererTurbo[6];
        super.leftArmModel[0] = new ModelRendererTurbo(this, 63, 50, textureX, textureY);
        super.leftArmModel[0].addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
        super.leftArmModel[0].setPosition(0.0F, 0.0F, 0.0F);
        super.leftArmModel[1] = new ModelRendererTurbo(this, 85, 50, textureX, textureY);
        super.leftArmModel[1].addBox(-3.0F, -9.0F, -3.0F, 6, 9, 6);
        super.leftArmModel[1].setPosition(0.25F, 0.0F, 0.0F);
        super.leftArmModel[1].rotateAngleZ = -0.34906587F;
        super.leftArmModel[2] = new ModelRendererTurbo(this, 63, 60, textureX, textureY);
        super.leftArmModel[2].addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
        super.leftArmModel[2].setPosition(-2.8F, -10.0F, 0.0F);
        super.leftArmModel[3] = new ModelRendererTurbo(this, 85, 65, textureX, textureY);
        super.leftArmModel[3].addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
        super.leftArmModel[3].setPosition(0.25F, -19.0F, 0.0F);
        super.leftArmModel[3].rotateAngleZ = 0.34906587F;
        super.leftArmModel[4] = new ModelRendererTurbo(this, 63, 70, textureX, textureY);
        super.leftArmModel[4].addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
        super.leftArmModel[4].setPosition(0.0F, -20.0F, 0.0F);
        super.leftArmModel[5] = new ModelRendererTurbo(this, 63, 82, textureX, textureY);
        super.leftArmModel[5].addBox(-1.5F, -1.5F, 2.0F, 3, 3, 2);
        super.leftArmModel[5].setPosition(0.0F, 0.0F, 0.0F);
        super.rightArmModel = super.leftArmModel.clone();
        super.rightArmModel[5] = new ModelRendererTurbo(this, 63, 82, textureX, textureY);
        super.rightArmModel[5].addBox(-1.5F, -1.5F, -4.0F, 3, 3, 2);
        super.rightArmModel[5].setPosition(0.0F, 0.0F, 0.0F);
        super.hipsModel = new ModelRendererTurbo[1];
        super.hipsModel[0] = new ModelRendererTurbo(this, 0, 84, textureX, textureY);
        super.hipsModel[0].addBox(-10.0F, 15.0F, -10.0F, 20, 6, 20);
        super.leftLegModel = new ModelRendererTurbo[1];
        super.leftLegModel[0] = new ModelRendererTurbo(this, 0, 112, textureX, textureY);
        super.leftLegModel[0].addBox(-4.0F, -16.0F, -4.0F, 8, 20, 8);
        super.leftLegModel[0].setPosition(0.0F, 16.0F, -5.0F);
        super.rightLegModel = new ModelRendererTurbo[1];
        super.rightLegModel[0] = new ModelRendererTurbo(this, 32, 112, textureX, textureY);
        super.rightLegModel[0].addBox(-4.0F, -16.0F, -4.0F, 8, 20, 8);
        super.rightLegModel[0].setPosition(0.0F, 16.0F, 5.0F);
    }
}
