import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    @Test
    public void captcha_whenPatternIs1_leftOperandIs1_leftOperandShouldReturn1() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        String expected = "1";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs1_leftOperandIs2_leftOperandShouldReturn2() {
        Captcha captcha = new Captcha(1, 2, 1, 1);
        String expected = "2";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs1_leftOperandShouldReturnOne() {
        Captcha captcha = new Captcha(2, 1, 1, 1);
        String expected = "One";
        String actual = captcha.getLeftOperand();
        assertEquals(expected, actual);
    }
}

