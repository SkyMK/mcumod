package mcu.trade.inventory;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.trade.TradeMod;
import mcu.trade.entity.TradePlayer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import mcu.trade.network.TradePacketHandler;

import java.awt.*;

@SideOnly(Side.CLIENT)
public class GuiTrade extends GuiContainer{

    private static final ResourceLocation TEXTURE = new ResourceLocation(TradeMod.MOD_ID, "textures/gui/trade.png");
    private static final ResourceLocation DEFAULT_AVATAR = new ResourceLocation(TradeMod.MOD_ID, "textures/gui/default_avatar.png");

    private TradePlayer tradePlayer;
    private TradePlayer otherPlayer;

    private boolean isReady;
    private int readyTime;
    private int playerMoney, otherMoney;
    private final boolean isCreator;

    private GuiButton buttonReady, buttonCancel, buttonSetMoney;
    private GuiTextField textFieldMoney;

    public GuiTrade(EntityPlayer player, int tradePlayerMoney, int otherPlayerMoney, boolean creator){
        super(new ContainerTrade(player));
        tradePlayer = TradePlayer.forPlayer(player);
        otherPlayer = TradePlayer.forPlayer(tradePlayer.other);
        playerMoney = tradePlayerMoney;
        otherMoney = otherPlayerMoney;
        isCreator = creator;
        xSize = 242;
        ySize = 219;
    }

    public void initGui(){
        super.initGui();

        buttonList.add(buttonReady = new GuiButton(0, guiLeft + xSize - 68, guiTop + ySize - 29, 60, 10, I18n.format("gui.trade.button.ready")));
        buttonList.add(buttonCancel = new GuiButton(1, guiLeft + xSize - 68, guiTop + ySize - 17, 60, 10, I18n.format("gui.trade.button.cancel")));
        buttonList.add(buttonSetMoney = new GuiButton(2, guiLeft + xSize - 68, guiTop + ySize - 41, 60, 10, I18n.format("gui.trade.button.setMoney")));

        textFieldMoney = new GuiTextField(fontRendererObj, guiLeft + xSize - 68, guiTop + ySize - 56, 60, 10);
        textFieldMoney.setMaxStringLength(8);
    }

    public void actionPerformed(GuiButton button){
        if(button == buttonReady){
            isReady = !isReady;
            button.displayString = isReady ? I18n.format("gui.trade.button.notReady") : I18n.format("gui.trade.button.ready");
            FMLProxyPacket packet = TradeMod.network.createPacket(TradePacketHandler.I_AM_READY, isReady);
            TradeMod.network.sendToServer(packet);
        }else if(button == buttonCancel){
            mc.thePlayer.closeScreen();
        }else if(button == buttonSetMoney){
            int money = MathHelper.parseIntWithDefault(textFieldMoney.getText(), 0);
            if(money >= 1 && money < 10){
                money += 1;
            }else{
                money += MathHelper.floor_float(money * 0.1F);
            }
            if(money > playerMoney){
                money = playerMoney;
                textFieldMoney.setText(String.valueOf(MathHelper.floor_float(money - money * 0.1F)));
            }

            if(money >= 0){
                FMLProxyPacket packet = TradeMod.network.createPacket(TradePacketHandler.GIVE_MONEY, money);
                TradeMod.network.sendToServer(packet);
            }
        }
    }

    @Override
    protected void keyTyped(char c, int i){
        super.keyTyped(c, i);
        textFieldMoney.textboxKeyTyped(c, i);
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int button){
        super.mouseClicked(mouseX, mouseY, button);
        textFieldMoney.mouseClicked(mouseX, mouseY, button);
    }

    public void updateScreen(){
        super.updateScreen();
        if(tradePlayer.isReady && otherPlayer.isReady){
            if(readyTime-- == 0 && isCreator){
                FMLProxyPacket packet = TradeMod.network.createPacket(TradePacketHandler.SUCCESSFULLY_TRADE);
                TradeMod.network.sendToServer(packet);
            }
        }else{
            readyTime = TradeMod.TRADE_READY_TIME;
        }

        textFieldMoney.updateCursorCounter();

        int money = MathHelper.parseIntWithDefault(textFieldMoney.getText(), 0);
        if(money >= 1 && money < 10){
            money += 1;
        }else{
            money += MathHelper.floor_float(money * 0.1F);
        }
        boolean hasMoney = money >= 0 && playerMoney >= money;
        buttonSetMoney.enabled = (!tradePlayer.isReady || !otherPlayer.isReady) && hasMoney;
        textFieldMoney.setEnabled(!tradePlayer.isReady || !otherPlayer.isReady);
    }

    public void onGuiClosed(){
        if(readyTime > 0){
            super.onGuiClosed();
        }
    }

    public void drawGuiContainerForegroundLayer(int x, int y){
        drawCenteredString(fontRendererObj, tradePlayer.getEntityPlayer().getCommandSenderName(), 61, 6, -1);
        drawCenteredString(fontRendererObj, I18n.format("gui.trade.label.balance", playerMoney), 61, 16, -1);
        drawCenteredString(fontRendererObj, I18n.format("gui.trade.label.give", tradePlayer.giveMoney), 61, 26, -1);

        drawCenteredString(fontRendererObj, otherPlayer.getEntityPlayer().getCommandSenderName(), 181, 6, -1);
        drawCenteredString(fontRendererObj, I18n.format("gui.trade.label.balance", otherMoney), 181, 16, -1);
        int get = MathHelper.floor_float((100 * otherPlayer.giveMoney) / 110.0F);
//		if(get > 1 && get < 10){
//			get -= 1;
//		}else{
//			get -= MathHelper.floor_float(get * 0.1F);
//		}
        drawCenteredString(fontRendererObj, I18n.format("gui.trade.label.get", get), 181, 26, -1);

        drawCenteredString(fontRendererObj, I18n.format("container.inventory"), 87, ySize - 89, -1);

        drawCenteredString(fontRendererObj, I18n.format("gui.trade.label.commission.part1"), 204, 132, -1);
        drawCenteredString(fontRendererObj, I18n.format("gui.trade.label.commission.part2"), 205, 141, -1);
        drawCenteredString(fontRendererObj, I18n.format("gui.trade.label.commission.part3"), 205, 150, -1);
    }

    public void drawGuiContainerBackgroundLayer(float partialTicks, int x, int y){
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(TEXTURE);

        func_146110_a(guiLeft, guiTop, 0, 0, xSize, ySize, 256, 256);

        if(tradePlayer.isReady && otherPlayer.isReady){
            drawRect(guiLeft + 8, guiTop + 38, guiLeft + 115, guiTop + 128, new Color(255, 0, 0, 100).getRGB());
            drawRect(guiLeft + 127, guiTop + 38, guiLeft + 235, guiTop + 128, new Color(255, 0, 0, 100).getRGB());

            if(readyTime >= 0){
                GL11.glPushMatrix();
                GL11.glScalef(5.0F, 5.0F, 1.0F);
                GL11.glTranslatef(0.0F, 0.0F, 1000.0F);
                String time = String.valueOf(readyTime / 20 + 1);
                fontRendererObj.drawString(time, (guiLeft + 125) / 5 - fontRendererObj.getStringWidth(time) / 2, (guiTop + 65) / 5, 0xFF0000);
                GL11.glPopMatrix();
            }
        }else{
            if(tradePlayer.isReady){
                drawRect(guiLeft + 8, guiTop + 38, guiLeft + 115, guiTop + 128, new Color(0, 255, 0, 100).getRGB());
            }

            if(otherPlayer.isReady){
                drawRect(guiLeft + 127, guiTop + 38, guiLeft + 235, guiTop + 128, new Color(0, 255, 0, 100).getRGB());
            }
        }

        textFieldMoney.drawTextBox();
    }
}


//package ua.agravaine.trade.inventory;
//
//import java.awt.Color;
//import java.io.File;
//
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.entity.AbstractClientPlayer;
//import net.minecraft.client.gui.GuiButton;
//import net.minecraft.client.gui.inventory.GuiContainer;
//import net.minecraft.client.renderer.ImageBufferDownload;
//import net.minecraft.client.renderer.ThreadDownloadImageData;
//import net.minecraft.client.renderer.texture.ITextureObject;
//import net.minecraft.client.renderer.texture.TextureManager;
//import net.minecraft.client.resources.I18n;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.StringUtils;
//
//import org.lwjgl.opengl.GL11;
//
//import TradeMod;
//import TradePlayer;
//import TradePacketHandler;
//import cpw.mods.fml.common.network.internal.FMLProxyPacket;
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//
//@SideOnly(Side.CLIENT)
//public class GuiTrade extends GuiContainer{
//
//	private static final ResourceLocation TEXTURE = new ResourceLocation(TradeMod.MOD_ID, "textures/gui/trade.png");
//	private static final ResourceLocation DEFAULT_AVATAR = new ResourceLocation(TradeMod.MOD_ID, "textures/gui/default_avatar.png");
//
//	private TradePlayer tradePlayer;
//	private TradePlayer otherPlayer;
//	
//	private boolean isReady;
//	private int readyTime;
//	
//	public GuiTrade(EntityPlayer player){
//		super(new ContainerTrade(player));
//		tradePlayer = TradePlayer.forPlayer(player);
//		otherPlayer = TradePlayer.forPlayer(tradePlayer.other);
//		xSize = 264;
//		ySize = 207;
//	}
//
//	public void initGui(){
//		super.initGui();
//		buttonList.add(new GuiButton(0, guiLeft + 101, guiTop + ySize - 43 + 10, 70, 20, I18n.format("gui.trade.button.ready")));
//		buttonList.add(new GuiButton(1, guiLeft + xSize - 84, guiTop + ySize - 43 + 10, 70, 20, I18n.format("gui.trade.button.cancel")));
//	}
//	
//	public void actionPerformed(GuiButton button){
//		if(button.id == 0){
//			isReady = !isReady;
//			button.displayString = isReady ? I18n.format("gui.trade.button.notReady") : I18n.format("gui.trade.button.ready");
//			FMLProxyPacket packet = TradeMod.network.createPacket(TradePacketHandler.I_AM_READY, isReady);
//			TradeMod.network.sendToServer(packet);
//		}
//	}
//	
//	public void updateScreen(){
//		super.updateScreen();
//		if(tradePlayer.isReady && otherPlayer.isReady){
//			if(readyTime-- <= 0){
//				FMLProxyPacket packet = TradeMod.network.createPacket(TradePacketHandler.SUCCESSFULLY_TRADE);
//				TradeMod.network.sendToServer(packet);
//			}
//		}else{
//			readyTime = TradeMod.TRADE_READY_TIME;
//		}
//	}
//	
//	public void onGuiClosed(){
//		if(readyTime > 0){
//			super.onGuiClosed();
//		}
//	}
//	
//	public void drawGuiContainerForegroundLayer(int x, int y){
////		if(tradePlayer.getEntityPlayer() == null || otherPlayer.getEntityPlayer() == null){
////			return;
////		}
//		String s = tradePlayer.getEntityPlayer().getCommandSenderName() + ", Баланс: 100, Отдаю: 40";
//		String s1 = otherPlayer.getEntityPlayer().getCommandSenderName() + ", Баланс: 1400, Отдаю: 0";
//		String s2 = tradePlayer.getEntityPlayer().getCommandSenderName();
//		fontRendererObj.drawString(s, 110, 8, -1);
//		fontRendererObj.drawString(s1, 110, 91, -1);
//		fontRendererObj.drawString(s2, 30, 17, -1);
//		
//		fontRendererObj.drawString("Перевод монет(лк) комиссия 10%", 30, 7, -1);
////		if(readyTime != TradeMod.TRADE_READY_TIME && readyTime > 0){
////			String s2 = I18n.format("gui.readyTime", (readyTime + 1) / 20);//"Обмен состоится через " + String.valueOf(readyTime / 20) + " секунд.";
////			fontRendererObj.drawString(s2, xSize - 87 - fontRendererObj.getStringWidth(s2) / 2, -12, new Color(255, 0, 0, 100).getRGB());
////		}
//	}
//
//	public void drawGuiContainerBackgroundLayer(float partialTicks, int x, int y){
//		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//		mc.getTextureManager().bindTexture(TEXTURE);
//		
//		// My container texture
//		func_146110_a(width / 2 - xSize / 2, height / 2 - 207 / 2, 0, 0, 86, 207, 512, 512);
//		// My trade texture
//		func_146110_a(width / 2 - xSize / 2 + 88, height / 2 - 207 / 2, 87, 0, 176, 81, 512, 512);
//		// Other trade texture
//		func_146110_a(width / 2 - xSize / 2 + 88, height / 2 - 207 / 2 + 83, 87, 0, 176, 81, 512, 512);
//		
//		drawPlayerHead(guiLeft + 7, guiTop + 6, 20, tradePlayer.getEntityPlayer().getCommandSenderName());
//		drawPlayerHead(guiLeft + 95, guiTop + 6, 12, tradePlayer.getEntityPlayer().getCommandSenderName());
//		drawPlayerHead(guiLeft + 95, guiTop + 89, 12, otherPlayer.getEntityPlayer().getCommandSenderName());
//		
//		if(tradePlayer.isReady){
//			drawRect(guiLeft + 95, guiTop + 20, guiLeft + 257, guiTop + 74, new Color(0, 255, 0, 100).getRGB());
//		}
//		
//		if(otherPlayer.isReady){
//			drawRect(guiLeft + 95, guiTop + 103, guiLeft + 257, guiTop + 157, new Color(0, 255, 0, 100).getRGB());
//		}
//	}
//	
//	private void drawPlayerHead(int x, int y, int size, String nick){
//		ResourceLocation skin = new ResourceLocation("textures/players/avatars/" + nick + ".png");
//		ITextureObject skinTexture = mc.getTextureManager().getTexture(skin);
//		if(skinTexture == null){
//			skinTexture = new ThreadDownloadImageData(null, String.format(TradeMod.PLAYERS_AVATARS_URL, 64, nick), DEFAULT_AVATAR, null);
//			mc.getTextureManager().loadTexture(skin, skinTexture);
//		}
//		mc.getTextureManager().bindTexture(skin);
//		func_146110_a(x, y, 0, 0, size, size, size, size);
//	}
//}
