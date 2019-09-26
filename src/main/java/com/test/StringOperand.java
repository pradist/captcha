package com.test;

public class StringOperand implements Operand {

    private final int operand;

    public StringOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {
        String[] numbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return numbers[operand - 1];
    }
}
