package com.test;

public class Captcha {

    private final int leftOperand;
    private final int pattern;
    private final int operator;
    private final int rightOperand;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.pattern = pattern;
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public String getLeftOperand() {
        if (pattern == 2) {
            return numberToString(leftOperand);
        }
        return "" + leftOperand;
    }

    public String getOperator() {
        String[] operators = {"+", "-", "/"};
        return operators[operator-1];
    }

    private String numberToString(int number) {
        String[] numbers = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return numbers[number - 1];
    }

    public String getRightOperand() {
        if (pattern == 2) {
            return "" + rightOperand;
        }
        return numberToString(rightOperand);
    }

    public String getCaptcha() {
        return getLeftOperand() + getOperator() + getRightOperand();
    }
}
