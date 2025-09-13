package com.mochi_753.calculator.handler;

import com.mochi_753.calculator.Calculator;
import com.mochi_753.calculator.CalculatorConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;

@EventBusSubscriber(modid = Calculator.MOD_ID, value = Dist.CLIENT)
public class LoginEventHandler {
    @SubscribeEvent
    public static void onLogin(ClientPlayerNetworkEvent.LoggingIn event) {
        if (!CalculatorConfig.SUPPRESS_WARNINGS.get()) {
            if (Minecraft.getInstance().player != null) {
                Minecraft.getInstance().player.displayClientMessage(Component.translatable("message.calculator.login"), false);
            }
        }
    }
}
