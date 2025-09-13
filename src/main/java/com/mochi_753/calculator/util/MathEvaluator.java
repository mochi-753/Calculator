package com.mochi_753.calculator.util;

import com.mochi_753.lib.exp4j.Expression;
import com.mochi_753.lib.exp4j.ExpressionBuilder;

import java.math.BigDecimal;

public class MathEvaluator {
    public static String evaluate(String input) {
        try {
            Expression expression = new ExpressionBuilder(input).build();
            double result = expression.evaluate();
            return result == Math.floor(result) ?
                    String.format("%.0f", result) : BigDecimal.valueOf(result).toPlainString();
        } catch (Exception e) {
            return "Error";
        }
    }
}
