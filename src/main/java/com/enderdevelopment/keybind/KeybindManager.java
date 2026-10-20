package com.enderdevelopment.keybind;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

import java.util.HashMap;
import java.util.Map;

public class KeybindManager {
    private static final Map<String, KeyBinding> keybinds = new HashMap<>();

    public static void registerKeybind(String name, String category, int keyCode) {
        KeyBinding keyBinding = new KeyBinding(
                "key.endermod." + name,
                KeyConflictContext.IN_GAME,
                KeyModifier.NONE,
                keyCode,
                category
        );
        KeyBindingHelper.registerKeyBinding(keyBinding);
        keybinds.put(name, keyBinding);
    }

    public static boolean isKeyPressed(String name) {
        KeyBinding keyBinding = keybinds.get(name);
        return keyBinding != null && keyBinding.isPressed();
    }

    public static boolean wasKeyJustPressed(String name) {
        KeyBinding keyBinding = keybinds.get(name);
        return keyBinding != null && keyBinding.wasPressed();
    }
}