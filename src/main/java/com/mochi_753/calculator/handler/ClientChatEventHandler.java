package com.mochi_753.calculator.handler;

import com.mochi_753.calculator.Calculator;
import com.mochi_753.calculator.CalculatorConfig;
import com.mochi_753.calculator.util.MathEvaluator;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Calculator.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientChatEventHandler {
    @SubscribeEvent
    public static void onChat(ClientChatEvent event) {
        if (Minecraft.getInstance().player != null) {
            String msg = event.getMessage();
            if (msg.startsWith("@")) {
                String input = msg.length() > 1 ? msg.substring(1) : "";
                String result = MathEvaluator.evaluate(input);
                event.setCanceled(true);
                if (CalculatorConfig.CLIENT.resultInline.get()) {
                    Minecraft.getInstance().player.displayClientMessage(Component.literal("= " + result + " (" + input + ")"), false);
                } else {
                    Minecraft.getInstance().player.displayClientMessage(Component.literal(input), false);
                    Minecraft.getInstance().player.displayClientMessage(Component.literal("= " + result), false);
                }
            }
        }
    }
}
