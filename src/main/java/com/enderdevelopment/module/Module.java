package com.enderdevelopment.module;

import com.enderdevelopment.keybind.KeybindManager;

public abstract class Module {
    private final String name;
    private final String description;
    private boolean enabled;
    private int keyCode;

    public Module(String name, String description, int keyCode) {
        this.name = name;
        this.description = description;
        this.keyCode = keyCode;
        KeybindManager.registerKeybind(name, "EnderMod", keyCode);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public void toggle() {
        setEnabled(!enabled);
    }

    public void onEnable() {
        // Override in subclasses
    }

    public void onDisable() {
        // Override in subclasses
    }

    public void onUpdate() {
        // Override in subclasses
    }
}