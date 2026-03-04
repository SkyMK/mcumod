package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.*;
import com.flansmod.common.vector.Vector3f;
import org.lwjgl.opengl.GL11;

public class ModelVehicle extends ModelDriveable {

    public ModelRendererTurbo[] turretModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] barrelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[][] ammoModel = new ModelRendererTurbo[0][0];
    public ModelRendererTurbo[] frontWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] backWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftFrontWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightFrontWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftBackWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightBackWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightTrackModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftTrackModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightTrackWheelModels = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftTrackWheelModels = new ModelRendererTurbo[0];
    public ModelRendererTurbo[][] leftAnimTrackModel = new ModelRendererTurbo[0][0];
    public ModelRendererTurbo[][] rightAnimTrackModel = new ModelRendererTurbo[0][0];
    public ModelRendererTurbo[] rightAnimTrackModel1 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftAnimTrackModel1 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightAnimTrackModel2 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftAnimTrackModel2 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightAnimTrackModel3 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftAnimTrackModel3 = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyDoorOpenModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyDoorCloseModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] trailerModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] steeringWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] drillHeadModel = new ModelRendererTurbo[0];
    public Vector3f drillHeadOrigin = new Vector3f();
    public float animFrame = 0.0F;

    public void render(EntityDriveable driveable, float f1) {
        this.render(0.0625F, (EntityVehicle) driveable, f1);
    }

    public void render(DriveableType type) {
        super.render(type);
        this.renderPart(this.leftBackWheelModel);
        this.renderPart(this.rightBackWheelModel);
        this.renderPart(this.leftFrontWheelModel);
        this.renderPart(this.rightFrontWheelModel);
        this.renderPart(this.rightTrackModel);
        this.renderPart(this.leftTrackModel);
        this.renderPart(this.rightTrackWheelModels);
        this.renderPart(this.leftTrackWheelModels);
        this.renderPart(this.bodyDoorCloseModel);
        this.renderPart(this.trailerModel);
        this.renderPart(this.turretModel);
        this.renderPart(this.barrelModel);
        this.renderPart(this.drillHeadModel);
        ModelRendererTurbo[][] var2 = this.ammoModel;
        int var3 = var2.length;

        int var4;
        ModelRendererTurbo[] ratm;
        for (var4 = 0; var4 < var3; ++var4) {
            ratm = var2[var4];
            this.renderPart(ratm);
        }

        var2 = this.leftAnimTrackModel;
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            ratm = var2[var4];
            this.renderPart(ratm);
        }

        var2 = this.rightAnimTrackModel;
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            ratm = var2[var4];
            this.renderPart(ratm);
        }

        this.renderPart(this.rightAnimTrackModel1);
        this.renderPart(this.leftAnimTrackModel1);
        this.renderPart(this.rightAnimTrackModel2);
        this.renderPart(this.leftAnimTrackModel2);
        this.renderPart(this.rightAnimTrackModel3);
        this.renderPart(this.leftAnimTrackModel3);
        this.renderPart(this.steeringWheelModel);
        this.renderPart(this.steeringWheelModel);
    }

    public void render(float f5, EntityVehicle vehicle, float f) {
        boolean rotateWheels = vehicle.getVehicleType().rotateWheels;
        this.animFrame = (float) vehicle.animFrame;
        ModelRendererTurbo[] i;
        int var6;
        int var7;
        ModelRendererTurbo seat;
        if (vehicle.isPartIntact(EnumDriveablePart.core)) {
            i = super.bodyModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.render(f5);
            }

            i = this.bodyDoorOpenModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                if (vehicle.varDoor) {
                    seat.render(f5);
                }
            }

            i = this.bodyDoorCloseModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                if (!vehicle.varDoor) {
                    seat.render(f5);
                }
            }

            i = this.steeringWheelModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.rotateAngleX = vehicle.wheelsYaw * 3.1415927F / 180.0F * 3.0F;
                seat.render(f5);
            }
        }

        if (vehicle.isPartIntact(EnumDriveablePart.backLeftWheel)) {
            i = this.leftBackWheelModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0.0F;
                seat.render(f5);
            }
        }

        if (vehicle.isPartIntact(EnumDriveablePart.backRightWheel)) {
            i = this.rightBackWheelModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0.0F;
                seat.render(f5);
            }
        }

        if (vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel)) {
            i = this.leftFrontWheelModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0.0F;
                seat.rotateAngleY = -vehicle.wheelsYaw * 3.1415927F / 180.0F * 3.0F;
                seat.render(f5);
            }
        }

        if (vehicle.isPartIntact(EnumDriveablePart.frontRightWheel)) {
            i = this.rightFrontWheelModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0.0F;
                seat.rotateAngleY = -vehicle.wheelsYaw * 3.1415927F / 180.0F * 3.0F;
                seat.render(f5);
            }
        }

        if (vehicle.isPartIntact(EnumDriveablePart.frontWheel)) {
            i = this.frontWheelModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0.0F;
                seat.rotateAngleY = -vehicle.wheelsYaw * 3.1415927F / 180.0F * 3.0F;
                seat.render(f5);
            }
        }

        if (vehicle.isPartIntact(EnumDriveablePart.backWheel)) {
            i = this.backWheelModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0.0F;
                seat.render(f5);
            }
        }

        ModelRendererTurbo yaw;
        int var17;
        ModelRendererTurbo[] var18;
        int var20;
        if (vehicle.isPartIntact(EnumDriveablePart.leftTrack)) {
            i = this.leftTrackModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.render(f5);
            }

            i = this.leftTrackWheelModels;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0.0F;
                seat.render(f5);
            }

            if (vehicle.animFrame == 0) {
                i = this.leftAnimTrackModel1;
                var6 = i.length;

                for (var7 = 0; var7 < var6; ++var7) {
                    seat = i[var7];
                    seat.render(f5);
                }
            } else if (vehicle.animFrame == 1) {
                i = this.leftAnimTrackModel2;
                var6 = i.length;

                for (var7 = 0; var7 < var6; ++var7) {
                    seat = i[var7];
                    seat.render(f5);
                }
            } else if (vehicle.animFrame == 2) {
                i = this.leftAnimTrackModel3;
                var6 = i.length;

                for (var7 = 0; var7 < var6; ++var7) {
                    seat = i[var7];
                    seat.render(f5);
                }
            }

            for (var17 = 0; var17 < this.leftAnimTrackModel.length; ++var17) {
                if ((float) var17 == this.animFrame) {
                    var18 = this.leftAnimTrackModel[var17];
                    var7 = var18.length;

                    for (var20 = 0; var20 < var7; ++var20) {
                        yaw = var18[var20];
                        yaw.render(f5);
                    }
                }
            }
        }

        if (vehicle.isPartIntact(EnumDriveablePart.rightTrack)) {
            i = this.rightTrackModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.render(f5);
            }

            i = this.rightTrackWheelModels;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.rotateAngleZ = rotateWheels ? -vehicle.wheelsAngle : 0.0F;
                seat.render(f5);
            }

            if (vehicle.animFrame == 0) {
                i = this.rightAnimTrackModel1;
                var6 = i.length;

                for (var7 = 0; var7 < var6; ++var7) {
                    seat = i[var7];
                    seat.render(f5);
                }
            } else if (vehicle.animFrame == 1) {
                i = this.rightAnimTrackModel2;
                var6 = i.length;

                for (var7 = 0; var7 < var6; ++var7) {
                    seat = i[var7];
                    seat.render(f5);
                }
            } else if (vehicle.animFrame == 2) {
                i = this.rightAnimTrackModel3;
                var6 = i.length;

                for (var7 = 0; var7 < var6; ++var7) {
                    seat = i[var7];
                    seat.render(f5);
                }
            }

            for (var17 = 0; var17 < this.rightAnimTrackModel.length; ++var17) {
                if ((float) var17 == this.animFrame) {
                    var18 = this.rightAnimTrackModel[var17];
                    var7 = var18.length;

                    for (var20 = 0; var20 < var7; ++var20) {
                        yaw = var18[var20];
                        yaw.render(f5);
                    }
                }
            }
        }

        if (vehicle.isPartIntact(EnumDriveablePart.trailer)) {
            i = this.trailerModel;
            var6 = i.length;

            for (var7 = 0; var7 < var6; ++var7) {
                seat = i[var7];
                seat.render(f5);
            }
        }

        EntitySeat[] var21 = vehicle.seats;
        var6 = var21.length;

        for (var7 = 0; var7 < var6; ++var7) {
            EntitySeat var22 = var21[var7];
            if (var22 != null && var22.seatInfo != null && var22.seatInfo.gunName != null
                    && super.gunModels.get(var22.seatInfo.gunName) != null && vehicle.isPartIntact(var22.seatInfo.part)
                    && !vehicle.rotateWithTurret(var22.seatInfo)) {
                float var16 = var22.prevLooking.getYaw() + (var22.looking.getYaw() - var22.prevLooking.getYaw()) * f;
                float pitch = var22.prevLooking.getPitch()
                        + (var22.looking.getPitch() - var22.prevLooking.getPitch()) * f;
                ModelRendererTurbo[][] gunModel = (ModelRendererTurbo[][]) super.gunModels.get(var22.seatInfo.gunName);
                ModelRendererTurbo[] gp = gunModel[0];
                int var13 = gp.length;

                int var14;
                ModelRendererTurbo gunModelPart;
                for (var14 = 0; var14 < var13; ++var14) {
                    gunModelPart = gp[var14];
                    gunModelPart.rotateAngleY = -var16 * 3.1415927F / 180.0F;
                    gunModelPart.render(f5);
                }

                GL11.glPushMatrix();
                if (gunModel[0].length >= 1) {
                    ModelRendererTurbo var19 = gunModel[0][0];
                    GL11.glTranslatef(f5 * var19.rotationPointX, f5 * var19.rotationPointY, f5 * var19.rotationPointZ);
                    GL11.glRotatef(-var16, 0.0F, 1.0F, 0.0F);
                    GL11.glTranslatef(-f5 * var19.rotationPointX, -f5 * var19.rotationPointY,
                            -f5 * var19.rotationPointZ);
                }

                gp = gunModel[1];
                var13 = gp.length;

                for (var14 = 0; var14 < var13; ++var14) {
                    gunModelPart = gp[var14];
                    gunModelPart.rotateAngleY = 0.0F;
                    gunModelPart.rotateAngleZ = -pitch * 3.1415927F / 180.0F;
                    gunModelPart.render(f5);
                }

                gp = gunModel[2];
                var13 = gp.length;

                for (var14 = 0; var14 < var13; ++var14) {
                    gunModelPart = gp[var14];
                    gunModelPart.rotateAngleY = 0.0F;
                    gunModelPart.rotateAngleZ = -pitch * 3.1415927F / 180.0F;
                    gunModelPart.render(f5);
                }

                GL11.glPopMatrix();
            }
        }

    }

    public void renderTurret(float f, float f1, float f2, float f3, float f4, float f5, EntityVehicle vehicle,
                             float dt) {
        VehicleType type = vehicle.getVehicleType();
        float yaw = vehicle.seats[0].looking.getYaw();
        float pitch = vehicle.seats[0].looking.getPitch();
        ModelRendererTurbo[] i = this.turretModel;
        int seat = i.length;

        int driverSeat;
        ModelRendererTurbo driverYaw;
        for (driverSeat = 0; driverSeat < seat; ++driverSeat) {
            driverYaw = i[driverSeat];
            driverYaw.render(f5);
        }

        i = this.barrelModel;
        seat = i.length;

        for (driverSeat = 0; driverSeat < seat; ++driverSeat) {
            driverYaw = i[driverSeat];
            driverYaw.rotateAngleZ = -pitch * 3.1415927F / 180.0F;
            driverYaw.render(f5);
        }

        int var26;
        for (var26 = 0; var26 < this.ammoModel.length; ++var26) {
            if (var26 >= type.numMissileSlots || vehicle.getDriveableData().missiles[var26] != null) {
                for (seat = 0; seat < this.ammoModel[var26].length; ++seat) {
                    this.ammoModel[var26][seat].rotateAngleZ = -pitch * 3.1415927F / 180.0F;
                    this.ammoModel[var26][seat].render(f5);
                }
            }
        }

        EntitySeat[] var24 = vehicle.seats;
        int var25 = var24.length;

        for (var26 = 0; var26 < var25; ++var26) {
            EntitySeat var27 = var24[var26];
            if (var27 != null && var27.seatInfo != null && var27.seatInfo.gunName != null
                    && super.gunModels.get(var27.seatInfo.gunName) != null && vehicle.isPartIntact(var27.seatInfo.part)
                    && vehicle.rotateWithTurret(var27.seatInfo)) {
                EntitySeat var28 = vehicle.seats[0];
                float var29 = var28.prevLooking.getYaw() + (var28.looking.getYaw() - var28.prevLooking.getYaw()) * dt;
                float yaw1 = var27.prevLooking.getYaw() + (var27.looking.getYaw() - var27.prevLooking.getYaw()) * dt;
                float pitch1 = var27.prevLooking.getPitch()
                        + (var27.looking.getPitch() - var27.prevLooking.getPitch()) * dt;
                float effectiveYaw = yaw1 - var29;
                ModelRendererTurbo[][] gunModel = (ModelRendererTurbo[][]) super.gunModels.get(var27.seatInfo.gunName);
                ModelRendererTurbo[] var20 = gunModel[0];
                int var21 = var20.length;

                int var22;
                ModelRendererTurbo gunModelPart;
                for (var22 = 0; var22 < var21; ++var22) {
                    gunModelPart = var20[var22];
                    gunModelPart.rotateAngleY = -effectiveYaw * 3.1415927F / 180.0F;
                    gunModelPart.render(f5);
                }

                var20 = gunModel[1];
                var21 = var20.length;

                for (var22 = 0; var22 < var21; ++var22) {
                    gunModelPart = var20[var22];
                    gunModelPart.rotateAngleY = -effectiveYaw * 3.1415927F / 180.0F;
                    gunModelPart.rotateAngleZ = -pitch1 * 3.1415927F / 180.0F;
                    gunModelPart.render(f5);
                }

                var20 = gunModel[2];
                var21 = var20.length;

                for (var22 = 0; var22 < var21; ++var22) {
                    gunModelPart = var20[var22];
                    gunModelPart.rotateAngleY = -effectiveYaw * 3.1415927F / 180.0F;
                    gunModelPart.rotateAngleZ = -pitch1 * 3.1415927F / 180.0F;
                    gunModelPart.render(f5);
                }
            }
        }

    }

    public void renderDrillBit(EntityVehicle vehicle, float f) {
        if (vehicle.isPartIntact(EnumDriveablePart.harvester)) {
            ModelRendererTurbo[] var3 = this.drillHeadModel;
            int var4 = var3.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                ModelRendererTurbo adrillHeadModel = var3[var5];
                adrillHeadModel.render(0.0625F);
            }
        }

    }

    public void flipAll() {
        super.flipAll();
        this.flip(this.bodyDoorOpenModel);
        this.flip(this.bodyDoorCloseModel);
        this.flip(this.turretModel);
        this.flip(this.barrelModel);
        this.flip(this.leftFrontWheelModel);
        this.flip(this.rightFrontWheelModel);
        this.flip(this.leftBackWheelModel);
        this.flip(this.rightBackWheelModel);
        this.flip(this.rightTrackModel);
        this.flip(this.leftTrackModel);
        this.flip(this.rightTrackWheelModels);
        this.flip(this.leftTrackWheelModels);
        this.flip(this.trailerModel);
        this.flip(this.steeringWheelModel);
        this.flip(this.frontWheelModel);
        this.flip(this.backWheelModel);
        this.flip(this.drillHeadModel);
        this.flip(this.rightAnimTrackModel1);
        this.flip(this.leftAnimTrackModel1);
        this.flip(this.rightAnimTrackModel2);
        this.flip(this.leftAnimTrackModel2);
        this.flip(this.rightAnimTrackModel3);
        this.flip(this.leftAnimTrackModel3);
        ModelRendererTurbo[][] var1 = this.leftAnimTrackModel;
        int var2 = var1.length;

        int var3;
        ModelRendererTurbo[] ratm;
        for (var3 = 0; var3 < var2; ++var3) {
            ratm = var1[var3];
            this.flip(ratm);
        }

        var1 = this.rightAnimTrackModel;
        var2 = var1.length;

        for (var3 = 0; var3 < var2; ++var3) {
            ratm = var1[var3];
            this.flip(ratm);
        }

    }

    public void translateAll(float x, float y, float z) {
        super.translateAll(x, y, z);
        this.translate(this.bodyDoorOpenModel, x, y, z);
        this.translate(this.bodyDoorCloseModel, x, y, z);
        this.translate(this.turretModel, x, y, z);
        this.translate(this.barrelModel, x, y, z);
        this.translate(this.leftFrontWheelModel, x, y, z);
        this.translate(this.rightFrontWheelModel, x, y, z);
        this.translate(this.leftBackWheelModel, x, y, z);
        this.translate(this.rightBackWheelModel, x, y, z);
        this.translate(this.rightTrackModel, x, y, z);
        this.translate(this.leftTrackModel, x, y, z);
        this.translate(this.rightTrackWheelModels, x, y, z);
        this.translate(this.leftTrackWheelModels, x, y, z);
        this.translate(this.trailerModel, x, y, z);
        this.translate(this.steeringWheelModel, x, y, z);
        this.translate(this.frontWheelModel, x, y, z);
        this.translate(this.backWheelModel, x, y, z);
        this.translate(this.drillHeadModel, x, y, z);
        this.translate(this.rightAnimTrackModel1, x, y, z);
        this.translate(this.leftAnimTrackModel1, x, y, z);
        this.translate(this.rightAnimTrackModel2, x, y, z);
        this.translate(this.leftAnimTrackModel2, x, y, z);
        this.translate(this.rightAnimTrackModel3, x, y, z);
        this.translate(this.leftAnimTrackModel3, x, y, z);
        ModelRendererTurbo[][] var4 = this.leftAnimTrackModel;
        int var5 = var4.length;

        int var6;
        ModelRendererTurbo[] ratm;
        for (var6 = 0; var6 < var5; ++var6) {
            ratm = var4[var6];
            this.translate(ratm, x, y, z);
        }

        var4 = this.rightAnimTrackModel;
        var5 = var4.length;

        for (var6 = 0; var6 < var5; ++var6) {
            ratm = var4[var6];
            this.translate(ratm, x, y, z);
        }

    }
}
