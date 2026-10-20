package com.enderdevelopment;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;

public class EnderMod implements ModInitializer {
    public static final String MOD_ID = "endermod";
    public static final String MOD_NAME = "EnderMod";
    public static final String MOD_VERSION = "1.0.0";

    public static KeyMapping openClickGuiKey;

    @Override
    public void onInitialize() {
        // Initialize keybinds
        openClickGuiKey = new KeyMapping("key.endermod.open_click_gui", KeyConflictContext.IN_GAME, KeyModifier.NONE, GLFW.GLFW_KEY_RIGHT_SHIFT, MOD_NAME);

        // Register modules
        // TODO: Register modules here
    }

    public static void openClickGui(Screen screen) {
        // TODO: Implement ClickGUI opening logic
    }
}