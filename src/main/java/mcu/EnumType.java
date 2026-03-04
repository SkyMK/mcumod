package com.flansmod.common.types;

import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.guns.*;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.tools.ToolType;

public enum EnumType {
    part("parts"), bullet("bullets"), attachment("attachments"), grenade("grenades"), gun("guns"), aa("aaguns"),
    vehicle("vehicles"), plane("planes"), mechaItem("mechaItems"), mecha("mechas"), tool("tools"), armour("armorFiles"),
    armourBox("armorBoxes"), box("boxes"), playerClass("classes"), team("teams");

    public String folderName;

    EnumType(String s) {
        this.folderName = s;
    }

    public static EnumType get(String s) {
        EnumType[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            EnumType e = var1[var3];
            if (e.folderName.equals(s)) {
                return e;
            }
        }

        return null;
    }

    public static EnumType getFromObject(Object o) {
        if (!(o instanceof EntityMecha) && !(o instanceof MechaType)) {
            if (!(o instanceof EntityPlane) && !(o instanceof PlaneType)) {
                return !(o instanceof EntityVehicle) && !(o instanceof VehicleType) ? null : vehicle;
            } else {
                return plane;
            }
        } else {
            return mecha;
        }
    }

    public Class<? extends InfoType> getTypeClass() {
        switch (this) {
            case bullet:
                return BulletType.class;
            case aa:
                return AAGunType.class;
            case vehicle:
                return VehicleType.class;
            case plane:
                return PlaneType.class;
            case mechaItem:
                return MechaItemType.class;
            case mecha:
                return MechaType.class;
            case attachment:
                return AttachmentType.class;
            case gun:
                return GunType.class;
            case grenade:
                return GrenadeType.class;
            case tool:
                return ToolType.class;
            case armour:
                return ArmourType.class;
            case armourBox:
                return ArmourBoxType.class;
            case playerClass:
                return PlayerClass.class;
            case team:
                return Team.class;
            case box:
                return GunBoxType.class;
            case part:
                return PartType.class;
            default:
                return InfoType.class;
        }
    }
}
