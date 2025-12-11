package mcu.friend.gui;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import mcu.friend.FriendsMod;
import mcu.friend.entity.FriendsPlayer;
import mcu.friend.entity.FriendsPlayer.Member;
import mcu.friend.network.FriendsPacketHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;

public class GuiEditFriends extends GuiScreen {

    public GuiScrollingList<Member> listFriends;
    public GuiButton buttonDone;

    public void initGui() {
        listFriends = new GuiScrollingList<Member>(this, width / 2 - 100, height / 2 - 75, 200, 150, 14) {
            public void onEntryClicked(int index, int mouseX, int mouseY, int button, boolean doubleClicked) {
                if (!doubleClicked) {
                    return;
                }

                Member member = getElement(index);
                FMLProxyPacket packet = FriendsMod.network.createPacket(FriendsPacketHandler.FRIEND_REMOVED,
                        member.getId());
                FriendsMod.network.sendToServer(packet);
                removeElement(index);
            }
        };
        FriendsPlayer player = FriendsPlayer.forPlayer(mc.thePlayer);
        listFriends.addElements(player.friends);

        buttonList.add(buttonDone = new GuiButton(0, width / 2 - 100, height - 24, 200, 20, I18n.format("gui.done")));
    }

    public void drawScreen(int x, int y, float ticks) {
        drawDefaultBackground();
        super.drawScreen(x, y, ticks);
        listFriends.drawScreen(x, y, ticks);
        drawCenteredString(mc.fontRenderer, "Двойной клик по нику для удаления", width / 2 - 1, 12, -1);
    }

    public void updateScreen() {
        listFriends.updateScreen();
    }

    public void mouseClicked(int x, int y, int button) {
        super.mouseClicked(x, y, button);
        listFriends.mouseClicked(x, y, button);
    }

    public void handleMouseInput() {
        super.handleMouseInput();
        listFriends.handleMouseInput();
    }

    public void actionPerformed(GuiButton button) {
        if (button == buttonDone) {
            mc.setIngameFocus();
        }
    }

    public boolean doesGuiPauseGame() {
        return false;
    }
}