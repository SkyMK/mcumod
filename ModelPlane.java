package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.*;
import com.flansmod.common.vector.Vector3f;

import java.util.Iterator;

public class ModelPlane extends ModelDriveable {

    public ModelRendererTurbo[] noseModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] topWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bayModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] tailModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[][] propellerModels = new ModelRendererTurbo[0][0];
    public ModelRendererTurbo[] yawFlapModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pitchFlapLeftModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pitchFlapRightModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pitchFlapLeftWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pitchFlapRightWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[][] heliMainRotorModels = new ModelRendererTurbo[0][0];
    public Vector3f[] heliMainRotorOrigins = new Vector3f[0];
    public float[] heliRotorSpeeds = new float[0];
    public ModelRendererTurbo[][] heliTailRotorModels = new ModelRendererTurbo[0][0];
    public Vector3f[] heliTailRotorOrigins = new Vector3f[0];
    public ModelRendererTurbo[] skidsModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] helicopterModeParts = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] planeModeParts = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] tailWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftWingWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightWingWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] tailDoorOpenModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] tailDoorCloseModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightWingPos1Model = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightWingPos2Model = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftWingPos1Model = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftWingPos2Model = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] hudModel = new ModelRendererTurbo[0];

    public void render(EntityDriveable driveable, float f1) {
        this.render(0.0625F, (EntityPlane) driveable, f1);
    }

    public void render(DriveableType type) {
        super.render(type);
        this.renderPart(this.noseModel);
        this.renderPart(this.leftWingModel);
        this.renderPart(this.rightWingModel);
        this.renderPart(this.topWingModel);
        this.renderPart(this.bayModel);
        this.renderPart(this.tailModel);
        ModelRendererTurbo[][] var2 = this.propellerModels;
        int var3 = var2.length;

        int var4;
        ModelRendererTurbo[] heliTailRotorModel;
        for (var4 = 0; var4 < var3; ++var4) {
            heliTailRotorModel = var2[var4];

            for (int j = 0; j < heliTailRotorModel.length; ++j) {
                heliTailRotorModel[j].rotateAngleX = (float) j * 2.0F * 3.1415927F / (float) heliTailRotorModel.length;
                heliTailRotorModel[j].render(0.0625F);
            }
        }

        var2 = this.heliMainRotorModels;
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            heliTailRotorModel = var2[var4];
            this.renderPart(heliTailRotorModel);
        }

        var2 = this.heliTailRotorModels;
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            heliTailRotorModel = var2[var4];
            this.renderPart(heliTailRotorModel);
        }

        this.renderPart(this.helicopterModeParts);
        this.renderPart(this.skidsModel);
        this.renderPart(this.yawFlapModel);
        this.renderPart(this.pitchFlapLeftModel);
        this.renderPart(this.pitchFlapRightModel);
        this.renderPart(this.pitchFlapLeftWingModel);
        this.renderPart(this.pitchFlapRightWingModel);
        this.renderPart(this.bodyWheelModel);
        this.renderPart(this.tailWheelModel);
        this.renderPart(this.leftWingWheelModel);
        this.renderPart(this.rightWingWheelModel);
        this.renderPart(this.tailDoorCloseModel);
        this.renderPart(this.rightWingPos1Model);
        this.renderPart(this.leftWingPos1Model);
        this.renderPart(this.hudModel);
    }

    public void render(float f5, EntityPlane plane, float f) {
        PlaneType type = plane.getPlaneType();
        float angle = plane.propAngle;
        Iterator var6 = plane.getPlaneType().propellers.iterator();

        int numParts;
        while (var6.hasNext()) {
            Propeller propeller = (Propeller) var6.next();
            if (plane.isPartIntact(propeller.planePart) && this.propellerModels.length > propeller.ID) {
                numParts = this.propellerModels[propeller.ID].length;

                for (int seat = 0; seat < numParts; ++seat) {
                    this.propellerModels[propeller.ID][seat].rotateAngleX = angle
                            + (float) seat * 2.0F * 3.1415927F / (float) numParts;
                    this.propellerModels[propeller.ID][seat].render(f5);
                }
            }
        }

        ModelRendererTurbo[] var18;
        int var19;
        ModelRendererTurbo var20;
        if (plane.isPartIntact(EnumDriveablePart.nose)) {
            var18 = this.noseModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.render(f5);
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.bay)) {
            var18 = this.bayModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.render(f5);
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.tail)) {
            var18 = this.tailModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.render(f5);
            }

            var18 = this.tailDoorOpenModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (plane.varDoor) {
                    var20.render(f5);
                }
            }

            var18 = this.tailDoorCloseModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (!plane.varDoor) {
                    var20.render(f5);
                }
            }

            var18 = this.yawFlapModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.rotateAngleY = plane.flapsYaw * 3.1415927F / 180.0F;
                var20.render(f5);
            }

            var18 = this.pitchFlapLeftModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.rotateAngleZ = plane.flapsPitchLeft * 3.1415927F / 180.0F;
                var20.render(f5);
            }

            var18 = this.pitchFlapRightModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.rotateAngleZ = plane.flapsPitchRight * 3.1415927F / 180.0F;
                var20.render(f5);
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.skids)) {
            var18 = this.skidsModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (plane.varGear) {
                    var20.render(f5);
                }
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.tailWheel)) {
            var18 = this.tailWheelModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (plane.varGear) {
                    var20.render(f5);
                }
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.leftWing)) {
            var18 = this.leftWingModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.render(f5);
            }

            var18 = this.leftWingPos1Model;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (plane.varWing) {
                    var20.render(f5);
                }
            }

            var18 = this.leftWingPos2Model;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (!plane.varWing) {
                    var20.render(f5);
                }
            }

            var18 = this.pitchFlapLeftWingModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.rotateAngleZ = plane.flapsPitchLeft * 3.1415927F / 180.0F;
                var20.render(f5);
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.rightWing)) {
            var18 = this.rightWingModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.render(f5);
            }

            var18 = this.rightWingPos1Model;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (plane.varWing) {
                    var20.render(f5);
                }
            }

            var18 = this.rightWingPos2Model;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (!plane.varWing) {
                    var20.render(f5);
                }
            }

            var18 = this.pitchFlapRightWingModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.rotateAngleZ = plane.flapsPitchRight * 3.1415927F / 180.0F;
                var20.render(f5);
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.leftWingWheel)) {
            var18 = this.leftWingWheelModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (plane.varGear) {
                    var20.render(f5);
                }
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.rightWingWheel)) {
            var18 = this.rightWingWheelModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (plane.varGear) {
                    var20.render(f5);
                }
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.core)) {
            var18 = super.bodyModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.render(f5);
            }

            var18 = super.bodyDoorOpenModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (plane.varDoor) {
                    var20.render(f5);
                }
            }

            var18 = super.bodyDoorCloseModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (!plane.varDoor) {
                    var20.render(f5);
                }
            }

            var18 = this.hudModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.rotateAngleX = -(plane.axes.getRoll() * 3.1415927F / 180.0F);
                var20.render(f5);
            }

            if (plane.mode == EnumPlaneMode.HELI) {
                this.renderPart(this.helicopterModeParts);
            } else {
                this.renderPart(this.planeModeParts);
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.coreWheel)) {
            var18 = this.bodyWheelModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                if (plane.varGear) {
                    var20.render(f5);
                }
            }
        }

        if (plane.isPartIntact(EnumDriveablePart.topWing)) {
            var18 = this.topWingModel;
            var19 = var18.length;

            for (numParts = 0; numParts < var19; ++numParts) {
                var20 = var18[numParts];
                var20.render(f5);
            }
        }

        EntitySeat[] var22 = plane.seats;
        var19 = var22.length;

        for (numParts = 0; numParts < var19; ++numParts) {
            EntitySeat var25 = var22[numParts];
            if (var25 != null && var25.seatInfo != null && var25.seatInfo.gunName != null
                    && super.gunModels.get(var25.seatInfo.gunName) != null && plane.isPartIntact(var25.seatInfo.part)) {
                float yaw = var25.prevLooking.getYaw() + (var25.looking.getYaw() - var25.prevLooking.getYaw()) * f;
                float pitch = var25.prevLooking.getPitch()
                        + (var25.looking.getPitch() - var25.prevLooking.getPitch()) * f;
                ModelRendererTurbo[][] gunModel = (ModelRendererTurbo[][]) super.gunModels.get(var25.seatInfo.gunName);
                ModelRendererTurbo[] minigunSpeed = gunModel[0];
                int var14 = minigunSpeed.length;

                int var15;
                ModelRendererTurbo gunModelPart;
                for (var15 = 0; var15 < var14; ++var15) {
                    gunModelPart = minigunSpeed[var15];
                    gunModelPart.rotateAngleY = (180.0F - yaw) * 3.1415927F / 180.0F;
                    gunModelPart.render(f5);
                }

                minigunSpeed = gunModel[1];
                var14 = minigunSpeed.length;

                for (var15 = 0; var15 < var14; ++var15) {
                    gunModelPart = minigunSpeed[var15];
                    gunModelPart.rotateAngleY = (180.0F - yaw) * 3.1415927F / 180.0F;
                    gunModelPart.rotateAngleZ = -pitch * 3.1415927F / 180.0F;
                    gunModelPart.render(f5);
                }

                minigunSpeed = gunModel[2];
                var14 = minigunSpeed.length;

                for (var15 = 0; var15 < var14; ++var15) {
                    gunModelPart = minigunSpeed[var15];
                    gunModelPart.rotateAngleY = (180.0F - yaw) * 3.1415927F / 180.0F;
                    gunModelPart.rotateAngleZ = -pitch * 3.1415927F / 180.0F;
                    gunModelPart.render(f5);
                }

                if (gunModel.length > 3) {
                    float var21 = var25.getMinigunSpeed();
                    ModelRendererTurbo[] var23 = gunModel[3];
                    var15 = var23.length;

                    for (int var24 = 0; var24 < var15; ++var24) {
                        ModelRendererTurbo gunModelPart1 = var23[var24];
                        gunModelPart1.rotateAngleY = (180.0F - yaw) * 3.1415927F / 180.0F;
                        gunModelPart1.rotateAngleZ = -pitch * 3.1415927F / 180.0F;
                        gunModelPart1.rotateAngleX = var25.minigunAngle * 0.5F;
                        gunModelPart1.render(f5);
                    }
                }
            }
        }

    }

    public void renderRotor(EntityPlane plane, float f5, int i) {
        PlaneType type = plane.getPlaneType();
        if (i >= type.heliPropellers.size() || plane.isPartIntact(((Propeller) type.heliPropellers.get(i)).planePart)) {
            for (int j = 0; j < this.heliMainRotorModels[i].length; ++j) {
                this.heliMainRotorModels[i][j].render(f5);
            }
        }

    }

    public void renderTailRotor(EntityPlane plane, float f5, int i) {
        PlaneType type = plane.getPlaneType();
        if (i >= type.heliTailPropellers.size()
                || plane.isPartIntact(((Propeller) type.heliTailPropellers.get(i)).planePart)) {
            for (int j = 0; j < this.heliTailRotorModels[i].length; ++j) {
                this.heliTailRotorModels[i][j].render(f5);
            }
        }

    }

    public void flipAll() {
        super.flipAll();
        this.flip(this.noseModel);
        this.flip(this.leftWingModel);
        this.flip(this.rightWingModel);
        this.flip(this.topWingModel);
        this.flip(this.bayModel);
        this.flip(this.tailModel);
        this.flip(this.yawFlapModel);
        this.flip(this.skidsModel);
        this.flip(this.helicopterModeParts);
        this.flip(this.planeModeParts);
        this.flip(this.pitchFlapLeftModel);
        this.flip(this.pitchFlapRightModel);
        this.flip(this.pitchFlapLeftWingModel);
        this.flip(this.pitchFlapRightWingModel);
        this.flip(this.bodyWheelModel);
        this.flip(this.tailWheelModel);
        this.flip(this.leftWingWheelModel);
        this.flip(this.rightWingWheelModel);
        this.flip(this.tailDoorOpenModel);
        this.flip(this.tailDoorCloseModel);
        this.flip(this.rightWingPos1Model);
        this.flip(this.rightWingPos2Model);
        this.flip(this.leftWingPos1Model);
        this.flip(this.leftWingPos2Model);
        this.flip(this.hudModel);
        ModelRendererTurbo[][] var1 = this.propellerModels;
        int var2 = var1.length;

        int var3;
        ModelRendererTurbo[] propellerModel;
        for (var3 = 0; var3 < var2; ++var3) {
            propellerModel = var1[var3];
            this.flip(propellerModel);
        }

        var1 = this.heliMainRotorModels;
        var2 = var1.length;

        for (var3 = 0; var3 < var2; ++var3) {
            propellerModel = var1[var3];
            this.flip(propellerModel);
        }

        var1 = this.heliTailRotorModels;
        var2 = var1.length;

        for (var3 = 0; var3 < var2; ++var3) {
            propellerModel = var1[var3];
            this.flip(propellerModel);
        }

    }

    public void translateAll(float x, float y, float z) {
        super.translateAll(x, y, z);
        this.translate(this.noseModel, x, y, z);
        this.translate(this.leftWingModel, x, y, z);
        this.translate(this.rightWingModel, x, y, z);
        this.translate(this.topWingModel, x, y, z);
        this.translate(this.bayModel, x, y, z);
        this.translate(this.tailModel, x, y, z);
        this.translate(this.yawFlapModel, x, y, z);
        this.translate(this.skidsModel, x, y, z);
        this.translate(this.helicopterModeParts, x, y, z);
        this.translate(this.planeModeParts, x, y, z);
        this.translate(this.pitchFlapLeftModel, x, y, z);
        this.translate(this.pitchFlapRightModel, x, y, z);
        this.translate(this.pitchFlapLeftWingModel, x, y, z);
        this.translate(this.pitchFlapRightWingModel, x, y, z);
        this.translate(this.bodyWheelModel, x, y, z);
        this.translate(this.tailWheelModel, x, y, z);
        this.translate(this.leftWingWheelModel, x, y, z);
        this.translate(this.rightWingWheelModel, x, y, z);
        this.translate(this.tailDoorOpenModel, x, y, z);
        this.translate(this.tailDoorCloseModel, x, y, z);
        this.translate(this.rightWingPos1Model, x, y, z);
        this.translate(this.rightWingPos2Model, x, y, z);
        this.translate(this.leftWingPos1Model, x, y, z);
        this.translate(this.leftWingPos2Model, x, y, z);
        this.translate(this.hudModel, x, y, z);
        ModelRendererTurbo[][] var4 = this.propellerModels;
        int var5 = var4.length;

        int var6;
        ModelRendererTurbo[] o;
        for (var6 = 0; var6 < var5; ++var6) {
            o = var4[var6];
            this.translate(o, x, y, z);
        }

        var4 = this.heliMainRotorModels;
        var5 = var4.length;

        for (var6 = 0; var6 < var5; ++var6) {
            o = var4[var6];
            this.translate(o, x, y, z);
        }

        var4 = this.heliTailRotorModels;
        var5 = var4.length;

        for (var6 = 0; var6 < var5; ++var6) {
            o = var4[var6];
            this.translate(o, x, y, z);
        }

        Vector3f[] var8 = this.heliMainRotorOrigins;
        var5 = var8.length;

        Vector3f var9;
        for (var6 = 0; var6 < var5; ++var6) {
            var9 = var8[var6];
            Vector3f.add(var9, new Vector3f(x / 16.0F, y / 16.0F, z / 16.0F), var9);
        }

        var8 = this.heliTailRotorOrigins;
        var5 = var8.length;

        for (var6 = 0; var6 < var5; ++var6) {
            var9 = var8[var6];
            Vector3f.add(var9, new Vector3f(x / 16.0F, y / 16.0F, z / 16.0F), var9);
        }

    }
}
