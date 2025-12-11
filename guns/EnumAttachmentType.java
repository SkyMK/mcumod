package com.flansmod.common.guns;

public enum EnumAttachmentType {

    barrel("barrel", 0), sights("sights", 1), stock("stock", 2), grip("grip", 3), generic("generic", 4);

    // $FF: synthetic field
    private static final EnumAttachmentType[] $VALUES = new EnumAttachmentType[]{barrel, sights, stock, grip,
            generic};

    EnumAttachmentType(String var1, int var2) {
    }

    public static EnumAttachmentType get(String s) {
        EnumAttachmentType[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            EnumAttachmentType type = var1[var3];
            if (type.toString().equals(s)) {
                return type;
            }
        }

        return generic;
    }

}
