package com.mochi_753.calculator;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class CalculatorConfig {
    public static final ForgeConfigSpec CLIENT_SPEC;
    public static final Client CLIENT;

    static {
        final Pair<Client, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Client::new);
        CLIENT_SPEC = specPair.getRight();
        CLIENT = specPair.getLeft();
    }

    public static class Client {
        public final ForgeConfigSpec.BooleanValue suppressWarning;
        public final ForgeConfigSpec.BooleanValue resultInline;

        public Client(ForgeConfigSpec.Builder builder) {
            builder.comment("Calculator config settings").push("general");

            suppressWarning = builder
                    .comment("Suppress a warning on login about possible rounding errors.")
                    .define("suppressWarning", false);

            resultInline = builder
                    .comment("Display calculation results in the same line as input.")
                    .define("resultInline", false);
        }
    }
}