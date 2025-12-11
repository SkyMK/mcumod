package com.flansmod.common.driveables;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.client.model.ModelVehicle;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.TypeFile;

import java.util.ArrayList;
import java.util.Iterator;

public class VehicleType extends DriveableType {

    public static ArrayList types = new ArrayList();
    public float turnLeftModifier = 1.0F;
    public float turnRightModifier = 1.0F;
    public boolean squashMobs = false;
    public boolean fourWheelDrive = false;
    public boolean rotateWheels = false;
    public boolean tank = false;
    public int vehicleShootDelay;
    public int vehicleShellDelay;
    public boolean hasDoor = false;
    public boolean setPlayerInvisible = false;

    public VehicleType(TypeFile file) {
        super(file);
        types.add(this);
    }

    public static VehicleType getVehicle(String find) {
        Iterator var1 = types.iterator();

        VehicleType type;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            type = (VehicleType) var1.next();
        } while (!type.shortName.equals(find));

        return type;
    }

    public void preRead(TypeFile file) {
        super.preRead(file);
        super.wheelPositions = new DriveablePosition[4];
    }

    protected void postRead(TypeFile file) {
        super.postRead(file);
    }

    protected void read(String[] split, TypeFile file) {
        super.read(split, file);

        try {
            if (split[0].equals("TurnLeftSpeed")) {
                this.turnLeftModifier = Float.parseFloat(split[1]);
            }

            if (split[0].equals("TurnRightSpeed")) {
                this.turnRightModifier = Float.parseFloat(split[1]);
            }

            if (split[0].equals("SquashMobs")) {
                this.squashMobs = Boolean.parseBoolean(split[1].toLowerCase());
            }

            if (split[0].equals("FourWheelDrive")) {
                this.fourWheelDrive = Boolean.parseBoolean(split[1].toLowerCase());
            }

            if (split[0].equals("Tank") || split[0].equals("TankMode")) {
                this.tank = Boolean.parseBoolean(split[1].toLowerCase());
            }

            if (split[0].equals("HasDoor")) {
                this.hasDoor = Boolean.parseBoolean(split[1].toLowerCase());
            }

            if (split[0].equals("RotateWheels")) {
                this.rotateWheels = Boolean.parseBoolean(split[1].toLowerCase());
            }

            if (split[0].equals("SetPlayerInvisible")) {
                this.setPlayerInvisible = Boolean.parseBoolean(split[1].toLowerCase());
            }

            if (split[0].equals("ShootDelay")) {
                this.vehicleShootDelay = Integer.parseInt(split[1]);
            }

            if (split[0].equals("ShellDelay")) {
                this.vehicleShellDelay = Integer.parseInt(split[1]);
            }

            if (split[0].equals("ShootSound")) {
                super.shootSoundPrimary = split[1];
                FlansMod.proxy.loadSound(super.contentPack, "driveables", split[1]);
            }

            if (split[0].equals("ShellSound")) {
                super.shootSoundSecondary = split[1];
                FlansMod.proxy.loadSound(super.contentPack, "driveables", split[1]);
            }
        } catch (Exception var4) {
        }

    }

    public void reloadModel() {
        super.model = (ModelDriveable) FlansMod.proxy.loadModel(super.modelString, super.shortName, ModelVehicle.class);
    }

}
