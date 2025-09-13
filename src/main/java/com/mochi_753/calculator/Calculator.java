package com.mochi_753.calculator;

import com.mochi_753.calculator.handler.ChatEventHandler;
import com.mochi_753.calculator.handler.LoginEventHandler;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;

@Mod(value = Calculator.MOD_ID, dist = Dist.CLIENT)
public class Calculator {
    public static final String MOD_ID = "calculator";

    public Calculator(ModContainer container) {
        container.registerConfig(ModConfig.Type.COMMON, CalculatorConfig.SPEC);
    }
}
