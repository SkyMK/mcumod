// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.gui.utils;

public class CustomFont {
    public static CustomFont gui = new CustomFont("gui", 15);
    public static CustomFont guiSmall = new CustomFont("gui", 12);
    public static CustomFont title = new CustomFont("title", 25);
    public static CustomFont icons = new CustomFont("icons", 50);
    public final String font;
    public final int size;

    public CustomFont(final String font, final int size) {
        this.font = font;
        this.size = size;
    }
}
