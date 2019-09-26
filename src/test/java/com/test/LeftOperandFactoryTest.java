package com.test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LeftOperandFactoryTest {

    @Test
    public void leftOperandFactoryWhenPatternIs1_operandShouldBeIntegerOperand() {
        Operand operand = LeftOperandFactory.create(1, 1);
        assertTrue(operand instanceof IntegerOperand);
    }

    @Test
    public void leftOperandFactoryWhenPatternIs2_operandShouldBeStringOperand() {
        Operand operand = LeftOperandFactory.create(2, 1);
        assertTrue(operand instanceof StringOperand);
    }
}
