package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    private static final Integer DUMMY = 1;

    @Test
    public void captcha_whenPatternIs1_leftOperandIs1_leftOperandShouldReturn1() {
        Captcha captcha = new Captcha(1, 1, DUMMY, DUMMY);
        String expected = "1";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs1_leftOperandIs2_leftOperandShouldReturn2() {
        Captcha captcha = new Captcha(1, 2, DUMMY, DUMMY);
        String expected = "2";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs1_leftOperandShouldReturnOne() {
        Captcha captcha = new Captcha(2, 1, DUMMY, DUMMY);
        String expected = "One";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs2_leftOperandShouldReturnTwo() {
        Captcha captcha = new Captcha(2, 2, DUMMY, DUMMY);
        String expected = "Two";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs3_leftOperandShouldReturnThree() {
        Captcha captcha = new Captcha(2, 3, DUMMY, DUMMY);
        String expected = "Three";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs4_leftOperandShouldReturnFour() {
        Captcha captcha = new Captcha(2, 4, DUMMY, DUMMY);
        String expected = "Four";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs5_leftOperandShouldReturnFive() {
        Captcha captcha = new Captcha(2, 5, DUMMY, DUMMY);
        String expected = "Five";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs6_leftOperandShouldReturnSix() {
        Captcha captcha = new Captcha(2, 6, DUMMY, DUMMY);
        String expected = "Six";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs7_leftOperandShouldReturnSeven() {
        Captcha captcha = new Captcha(2, 7, DUMMY, DUMMY);
        String expected = "Seven";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs8_leftOperandShouldReturnEight() {
        Captcha captcha = new Captcha(2, 8, DUMMY, DUMMY);
        String expected = "Eight";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs9_leftOperandShouldReturnNine() {
        Captcha captcha = new Captcha(2, 9, DUMMY, DUMMY);
        String expected = "Nine";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenOperatorIs1_OperatorShouldReturnPlus() {
        Captcha captcha = new Captcha(DUMMY, DUMMY, 1, DUMMY);
        String expected = "+";
        String actual = captcha.getOperator();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenOperatorIs2_OperatorShouldReturnMinus() {
        Captcha captcha = new Captcha(DUMMY, DUMMY, 2, DUMMY);
        String expected = "-";
        String actual = captcha.getOperator();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenOperatorIs3_OperatorShouldReturnDivide() {
        Captcha captcha = new Captcha(DUMMY, DUMMY, 3, DUMMY);
        String expected = "/";
        String actual = captcha.getOperator();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs1_RightOperandIs1_RightOperandShouldReturnOne() {
        Captcha captcha = new Captcha(1, DUMMY, DUMMY, 1);
        String expected = "One";
        String actual = captcha.getRightOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs1_RightOperandIs2_RightOperandShouldReturnTwo() {
        Captcha captcha = new Captcha(1, DUMMY, DUMMY, 2);
        String expected = "Two";
        String actual = captcha.getRightOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_RightOperandIs1_RightOperandShouldReturn1() {
        Captcha captcha = new Captcha(2, DUMMY, DUMMY, 1);
        String expected = "1";
        String actual = captcha.getRightOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_RightOperandIs2_RightOperandShouldReturn2() {
        Captcha captcha = new Captcha(2, DUMMY, DUMMY, 2);
        String expected = "2";
        String actual = captcha.getRightOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_RightOperandIs3_RightOperandShouldReturn3() {
        Captcha captcha = new Captcha(2, DUMMY, DUMMY, 3);
        String expected = "3";
        String actual = captcha.getRightOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs1_leftOperandIs1_operatorIs1_rightOperandIs1_ShouldReturn1PlusOne() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        String expected = "1+One";
        String actual = captcha.getCaptcha();
        assertEquals(expected, actual);
    }

}
