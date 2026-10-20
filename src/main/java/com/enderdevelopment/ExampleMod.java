package com.enderdevelopment;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;

public class ExampleMod implements ModInitializer {
    public static final String MODID = "examplemod";
    public static KeyMapping openClickGUI;

    @Override
    public void onInitialize() {
        openClickGUI = new KeyMapping("key.examplemod.opengui", KeyConflictContext.IN_GAME, KeyModifier.SHIFT, GLFW.GLFW_KEY_RIGHT_SHIFT, "key.category.examplemod");
    }
}