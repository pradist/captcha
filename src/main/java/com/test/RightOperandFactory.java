package com.test;

public class RightOperandFactory {

    public static Operand create(int pattern, int operand) {
        if (pattern == 2) {
            return new IntegerOperand(operand);
        }
        return new StringOperand(operand);
    }
}
