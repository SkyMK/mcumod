package mcu.client.gui.menu;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IChatComponent;

public class MenuPlayer extends AbstractClientPlayer {
    public static FakeWorld world = new FakeWorld();

    public MenuPlayer() {
        super(world, Minecraft.getMinecraft().getSession().func_148256_e());
    }

    @Override
    public void addChatMessage(IChatComponent p_145747_1_) {
    }

    @Override
    public boolean canCommandSenderUseCommand(int p_70003_1_, String p_70003_2_) {
        return false;
    }

    @Override
    public ChunkCoordinates getPlayerCoordinates() {
        return null;
    }

}
