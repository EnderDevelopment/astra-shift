package com.enderdevelopment.client;

import com.enderdevelopment.ExampleMod;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID)
public class KeybindHandler {
    @SubscribeEvent
    public static void onKeyInput(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.level == null) return;
            if (ExampleMod.openClickGUI.consumeClick()) {
                mc.setScreen(new ClickGUI());
            }
        }
    }

    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(ExampleMod.openClickGUI);
    }
}