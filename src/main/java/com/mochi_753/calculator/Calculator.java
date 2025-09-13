package com.mochi_753.calculator;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Calculator.MOD_ID)
public class Calculator {
    public static final String MOD_ID = "calculator";

    public Calculator(FMLJavaModLoadingContext context) {
        context.registerConfig(ModConfig.Type.CLIENT, CalculatorConfig.CLIENT_SPEC);
    }
}
