package com.enderdevelopment.client;

import com.enderdevelopment.EnderMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;

public class EnderModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register keybinds
        KeyBindingHelper.registerKeyBinding(EnderMod.openClickGuiKey);

        // Register client-side events
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (EnderMod.openClickGuiKey.consumeClick()) {
                Minecraft.getInstance().setScreen(new ClickGuiScreen());
            }
        });
    }

    public static class ClickGuiScreen extends Screen {
        protected ClickGuiScreen() {
            super(null);
        }

        @Override
        public void render(DrawContext context, int mouseX, int mouseY, float delta) {
            // TODO: Implement ClickGUI rendering logic
        }

        @Override
        public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
            if (keyCode == 256 && this.shouldCloseOnEsc()) { // 256 is the key code for ESC
                this.onClose();
                return true;
            }
            return super.keyPressed(keyCode, scanCode, modifiers);
        }
    }
}