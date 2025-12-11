package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.vector.Vector3f;
import org.lwjgl.opengl.GL11;

public class ModelMecha extends ModelDriveable {

    public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftHandModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightHandModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] hipsModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftFootModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightFootModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] barrelModel = new ModelRendererTurbo[0];
    public Vector3f hipsAttachmentPoint = new Vector3f();

    public void render(EntityDriveable driveable, float f1) {
        this.render(0.0625F, (EntityMecha) driveable, f1);
    }

    public void render(DriveableType type) {
        super.render(type);
        MechaType mechaType = (MechaType) type;
        this.renderPart(this.hipsModel);
        this.renderPart(this.leftLegModel);
        this.renderPart(this.rightLegModel);
        this.renderPart(this.leftFootModel);
        this.renderPart(this.rightFootModel);
        this.renderPart(this.barrelModel);
        this.renderPart(this.headModel);
        GL11.glPushMatrix();
        GL11.glTranslatef(mechaType.leftArmOrigin.x / mechaType.modelScale,
                mechaType.leftArmOrigin.y / mechaType.modelScale, mechaType.leftArmOrigin.z / mechaType.modelScale);
        this.renderPart(this.leftArmModel);
        this.renderPart(this.leftHandModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(mechaType.rightArmOrigin.x / mechaType.modelScale,
                mechaType.rightArmOrigin.y / mechaType.modelScale, mechaType.rightArmOrigin.z / mechaType.modelScale);
        this.renderPart(this.rightArmModel);
        this.renderPart(this.rightHandModel);
        GL11.glPopMatrix();
    }

    public void render(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] pitch;
        int var5;
        int var6;
        ModelRendererTurbo model;
        if (mecha.isPartIntact(EnumDriveablePart.core)) {
            pitch = super.bodyModel;
            var5 = pitch.length;

            for (var6 = 0; var6 < var5; ++var6) {
                model = pitch[var6];
                model.render(f5);
            }
        }

        if (mecha.isPartIntact(EnumDriveablePart.head)) {
            pitch = this.headModel;
            var5 = pitch.length;

            for (var6 = 0; var6 < var5; ++var6) {
                model = pitch[var6];
                model.render(f5);
            }
        }

        float var9 = mecha.seats[0] == null ? 0.0F : mecha.seats[0].looking.getPitch();
        if (mecha.isPartIntact(EnumDriveablePart.barrel)) {
            ModelRendererTurbo[] var10 = this.barrelModel;
            var6 = var10.length;

            for (int var11 = 0; var11 < var6; ++var11) {
                ModelRendererTurbo aBarrelModel = var10[var11];
                aBarrelModel.rotateAngleZ = -var9 * 3.1415927F / 180.0F;
                aBarrelModel.render(f5);
            }
        }

    }

    public void renderLeftArm(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] var4 = this.leftArmModel;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo model = var4[var6];
            model.render(f5);
        }

    }

    public void renderLeftHand(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] var4 = this.leftHandModel;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo model = var4[var6];
            model.render(f5);
        }

    }

    public void renderRightArm(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] var4 = this.rightArmModel;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo model = var4[var6];
            model.render(f5);
        }

    }

    public void renderRightHand(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] var4 = this.rightHandModel;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo model = var4[var6];
            model.render(f5);
        }

    }

    public void renderRightFoot(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] var4 = this.rightFootModel;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo model = var4[var6];
            model.render(f5);
        }

    }

    public void renderLeftFoot(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] var4 = this.leftFootModel;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo model = var4[var6];
            model.render(f5);
        }

    }

    public void renderRightLeg(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] var4 = this.rightLegModel;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo model = var4[var6];
            model.render(f5);
        }

    }

    public void renderLeftLeg(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] var4 = this.leftLegModel;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo model = var4[var6];
            model.render(f5);
        }

    }

    public void renderHips(float f5, EntityMecha mecha, float f) {
        ModelRendererTurbo[] var4 = this.hipsModel;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo model = var4[var6];
            model.render(f5);
        }

    }

    public void flipAll() {
        super.flipAll();
        this.flip(this.leftArmModel);
        this.flip(this.rightArmModel);
        this.flip(this.leftHandModel);
        this.flip(this.rightHandModel);
        this.flip(this.hipsModel);
        this.flip(this.leftLegModel);
        this.flip(this.rightLegModel);
        this.flip(this.leftFootModel);
        this.flip(this.rightFootModel);
        this.flip(this.headModel);
        this.flip(this.barrelModel);
    }

    public void translateAll(float x, float y, float z) {
        super.translateAll(x, y, z);
        this.translate(this.leftArmModel, x, y, z);
        this.translate(this.rightArmModel, x, y, z);
        this.translate(this.leftHandModel, x, y, z);
        this.translate(this.rightHandModel, x, y, z);
        this.translate(this.hipsModel, x, y, z);
        this.translate(this.leftLegModel, x, y, z);
        this.translate(this.rightLegModel, x, y, z);
        this.translate(this.leftFootModel, x, y, z);
        this.translate(this.rightFootModel, x, y, z);
        this.translate(this.headModel, x, y, z);
        this.translate(this.barrelModel, x, y, z);
    }
}
