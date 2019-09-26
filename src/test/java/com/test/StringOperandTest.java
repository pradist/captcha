package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOperandTest {

    @Test
    public void stringOperand_whenInputIs1_ItShouldBeOne() {
        StringOperand operand = new StringOperand(1);
        assertEquals("One", operand.toString());
    }

    @Test
    public void stringOperand_whenInputIs5_ItShouldBeFive() {
        StringOperand operand = new StringOperand(5);
        assertEquals("Five", operand.toString());
    }

    @Test
    public void stringOperand_whenInputIs9_ItShouldBeNine() {
        StringOperand operand = new StringOperand(9);
        assertEquals("Nine", operand.toString());
    }


}
