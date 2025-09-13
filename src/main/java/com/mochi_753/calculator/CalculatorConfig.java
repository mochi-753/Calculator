package com.mochi_753.calculator;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CalculatorConfig {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec.BooleanValue SUPPRESS_WARNINGS;
    public static final ModConfigSpec.BooleanValue RESULT_INLINE;

    static {
        SUPPRESS_WARNINGS = BUILDER.comment("Suppress login warnings").define("suppressWarnings", false);
        RESULT_INLINE = BUILDER.comment("Display calculation result inline with input").define("resultInline", false);
    }

    public static final ModConfigSpec SPEC = BUILDER.build();
}
