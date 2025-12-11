package mcu.friend.gui;

import com.google.common.collect.Lists;
import mcu.friend.util.FriendsUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GuiScrollingList<T> extends Gui {

    public static final float DEFAULT_SCROLL_SPEED = 10.0F;

    protected final GuiScreen parent;
    protected final int x;
    protected final int y;
    protected final int width;
    protected final int height;
    protected final int entryHeight;
    private final Minecraft mc;
    protected int scrollOffset;
    protected float scrollSpeed;
    protected int selected;
    protected int mouseX, mouseY;
    protected int hoverColor, selectedColor, textColor, selectedTextColor, hoverTextColor;
    protected boolean drawHoverColor, drawSelectedColor;
    protected List<T> elementData;
    private int hoverIndex;
    private long lastEntryClicked;

    public GuiScrollingList(GuiScreen screen, int posX, int posY, int listWidth, int listHeight, int listEntryHeight) {
        parent = screen;
        mc = parent.mc;
        width = listWidth;
        height = listHeight;
        x = posX;
        y = posY;
        entryHeight = listEntryHeight;
        scrollSpeed = DEFAULT_SCROLL_SPEED;
        hoverIndex = -1;
        selected = -1;
        hoverColor = 839518730;
        selectedColor = -1778384896;
        textColor = selectedTextColor = hoverTextColor = -1;
        drawHoverColor = true;
        drawSelectedColor = true;
        elementData = Lists.newLinkedList();
    }

    public void onEntryClicked(int index, int mouseX, int mouseY, int button, boolean isDoubleClicked) {
    }

    public void drawEntry(int index, int x, int y, boolean hovered) {
        T element = getElement(index);
        if (element != null) {
            drawCenteredString(mc.fontRenderer, element.toString(), x + width / 2,
                    y + entryHeight / 2 - mc.fontRenderer.FONT_HEIGHT / 2,
                    isSelected(index) ? selectedTextColor : hovered ? hoverTextColor : textColor);
        }
    }

    public int getSize() {
        return elementData.size();
    }

    public int getContentSize() {
        return getSize() * entryHeight;
    }

    public boolean isSelected(int index) {
        return index == selected;
    }

    public boolean isSelected() {
        return selected >= 0;
    }

    public void mouseClicked(int mouseX, int mouseY, int button) {
        if (hoverIndex != -1) {
            selected = hoverIndex;
            boolean doubleClicked = System.currentTimeMillis() - lastEntryClicked < 250;
            onEntryClicked(hoverIndex, mouseX, mouseY, button, doubleClicked);
            lastEntryClicked = System.currentTimeMillis();
        } else {
            selected = -1;
        }
    }

    public void handleMouseInput() {
        if (isMouseOver()) {
            int delta = Mouse.getDWheel();
            if (delta != 0) {
                if (delta > 0) {
                    delta = -1;
                } else if (delta < 0) {
                    delta = 1;
                }
                int maxScrollOffset = Math.max(0, getSize() * entryHeight - height);
                scrollOffset = (int) Math.max(Math.min(scrollOffset + (delta * scrollSpeed), maxScrollOffset), 0);
            }
        }
    }

    public void updateScreen() {
        if (isMouseOver()) {
            hoverIndex = (mouseY - y + scrollOffset) / entryHeight;
            if (hoverIndex >= getSize() || hoverIndex < 0) {
                hoverIndex = -1;
            }
        } else {
            hoverIndex = -1;
        }
    }

    public void drawScreen(int mX, int mY, float ticks) {
        mouseX = mX;
        mouseY = mY;

        GL11.glEnable(GL11.GL_SCISSOR_TEST);
        FriendsUtils.glScissor(x, y, width, height);

        int currentY = y - scrollOffset;
        for (int l = 0; l < getSize(); l++) {
            if (currentY >= y - entryHeight && currentY <= y + height) {
                boolean isHover = hoverIndex == l;
                if (isSelected(l) && drawSelectedColor) {
                    drawRect(x, currentY, x + width, currentY + entryHeight, selectedColor);
                }
                if (isHover && drawHoverColor) {
                    drawRect(x, currentY, x + width, currentY + entryHeight, hoverColor);
                }
                drawEntry(l, x, currentY, isHover);
            }
            currentY += entryHeight;
        }

        GL11.glDisable(GL11.GL_SCISSOR_TEST);

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glDisable(GL11.GL_ALPHA_TEST);

        int start = getContentSize() - height;

        if (start > 0) {
            int length = height * height / getContentSize();// height * height / (getSize() * entryHeight);

            if (length < 8) {
                length = 8;
            }

            if (length > height - 8) {
                length = height - 8;
            }

            int end = scrollOffset * (height - length) / start + y;

            if (end < y) {
                end = y;
            }

            int scrollBarXStart = x + width + 2;
            int scrollBarXEnd = x + width + 5;

            GL11.glColor4d(1, 1, 1, 1);
            drawRect(scrollBarXStart, end + length, scrollBarXEnd, end, new Color(0, 0, 0, 125).getRGB());
        }

        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_BLEND);
    }

    public boolean isMouseOver() {
        return mouseX >= x && mouseX < x + width && mouseY >= y && mouseY < y + height;
    }

    public List<T> getElements() {
        return elementData;
    }

    public void clear() {
        elementData.clear();
    }

    public T removeFirstElement() {
        return elementData.size() > 0 ? elementData.remove(0) : null;
    }

    public T removeLastElement() {
        return elementData.size() > 0 ? elementData.remove(elementData.size() - 1) : null;
    }

    public T removeSelectedElement() {
        return isSelected() ? elementData.remove(getSelectedIndex()) : null;
    }

    public boolean removeElement(T element) {
        return elementData.remove(element);
    }

    public T removeElement(int index) {
        return elementData.remove(index);
    }

    public boolean addElement(T element) {
        return elementData.add(element);
    }

    public boolean addElements(T... elements) {
        return elementData.addAll(Arrays.asList(elements));
    }

    public boolean addElements(Collection<? extends T> elements) {
        return elementData.addAll(elements);
    }

    public T getElement(int index) {
        return index >= 0 && index < elementData.size() ? elementData.get(index) : null;
    }

    public T getSelectedElement() {
        return getElement(selected);
    }

    public float getScrollSpeed() {
        return scrollSpeed;
    }

    public GuiScrollingList setScrollSpeed(float speed) {
        scrollSpeed = speed;
        return this;
    }

    public int getHoverColor() {
        return hoverColor;
    }

    public GuiScrollingList setHoverColor(int color) {
        hoverColor = color;
        return this;
    }

    public int getSelectedColor() {
        return selectedColor;
    }

    public GuiScrollingList setSelectedColor(int color) {
        selectedColor = color;
        return this;
    }

    public boolean isDrawHoverColor() {
        return drawHoverColor;
    }

    public GuiScrollingList setDrawHoverColor(boolean draw) {
        drawHoverColor = draw;
        return this;
    }

    public boolean isDrawSelectedColor() {
        return drawSelectedColor;
    }

    public GuiScrollingList setDrawSelectedColor(boolean draw) {
        drawSelectedColor = draw;
        return this;
    }

    public int getTextColor() {
        return textColor;
    }

    public GuiScrollingList setTextColor(int color) {
        textColor = color;
        return this;
    }

    public int getHoverTextColor() {
        return hoverTextColor;
    }

    public GuiScrollingList setHoverTextColor(int color) {
        hoverTextColor = color;
        return this;
    }

    public int getSelectedTextColor() {
        return selectedTextColor;
    }

    public GuiScrollingList setSelectedTextColor(int color) {
        selectedTextColor = color;
        return this;
    }

    public int getScrollOffset() {
        return scrollOffset;
    }

    public void setScrollOffset(int offset) {
        scrollOffset = offset;
    }

    public int getSelectedIndex() {
        return selected;
    }

    public void setSelectedIndex(int index) {
        selected = index;
    }

    public GuiScreen getParent() {
        return parent;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getEntryHeight() {
        return entryHeight;
    }

    public int getHoverIndex() {
        return hoverIndex;
    }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }
}