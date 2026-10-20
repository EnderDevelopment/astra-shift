package com.enderdevelopment.gui;

import com.enderdevelopment.EnderMod;
import com.enderdevelopment.util.ColorUtil;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ClickGuiScreen extends Screen {
    public ClickGuiScreen() {
        super(Text.literal("EnderMod ClickGUI"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        // Draw background
        context.fill(0, 0, this.width, this.height, 0x80000000);

        // Draw title
        context.drawTextWithShadow(this.textRenderer, this.title, 10, 10, ColorUtil.getNeonOrange());

        // TODO: Draw modules and their status

        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == 256) { // 256 is the key code for ESC
            this.onClose();
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }
}