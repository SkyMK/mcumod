package com.flansmod.common.driveables;

public enum EnumPlaneMode {

    PLANE("PLANE", 0), VTOL("VTOL", 1), HELI("HELI", 2);

    // $FF: synthetic field
    private static final EnumPlaneMode[] $VALUES = new EnumPlaneMode[]{PLANE, VTOL, HELI};

    EnumPlaneMode(String var1, int var2) {
    }

    public static EnumPlaneMode getMode(String s) {
        return s.equalsIgnoreCase("vtol") ? VTOL : (s.equalsIgnoreCase("heli") ? HELI : PLANE);
    }

}
