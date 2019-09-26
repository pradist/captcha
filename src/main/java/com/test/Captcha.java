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
        return LeftOperandFactory.create(pattern, leftOperand).toString();
    }

    public String getOperator() {
        String[] operators = {"+", "-", "/"};
        return operators[operator - 1];
    }

    public String getRightOperand() {
        return RightOperandFactory.create(pattern, rightOperand).toString();
    }

    public String getCaptcha() {
        return getLeftOperand() + getOperator() + getRightOperand();
    }
}
