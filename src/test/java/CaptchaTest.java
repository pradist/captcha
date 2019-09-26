import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    private static final Integer DUMMY = 1;

    @Test
    public void captcha_whenPatternIs1_leftOperandIs1_operatorIs1_rightOperandIs1_ShouldReturn1PlusOne() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        String expected = "1+One";
        String actual = captcha.getCaptcha();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs1_leftOperandIs1_operatorIs1_rightOperandIs2_ShouldReturn1PlusTwo() {
        Captcha captcha = new Captcha(1, 1, 1, 2);
        String expected = "1+Two";
        String actual = captcha.getCaptcha();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs1_operatorIs1_rightOperandIs1_ShouldReturnOnePlus1() {
        Captcha captcha = new Captcha(2, 1, 1, 1);
        String expected = "One+1";
        String actual = captcha.getCaptcha();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs2_leftOperandIs1_operatorIs2_rightOperandIs1_ShouldReturnOnePlus1() {
        Captcha captcha = new Captcha(2, 1, 2, 1);
        String expected = "One-1";
        String actual = captcha.getCaptcha();
        assertEquals(expected, actual);
    }

    @Test
    public void captcha_whenPatternIs1_leftOperandIs1_operatorIs2_rightOperandIs1_ShouldReturnOnePlus1() {
        Captcha captcha = new Captcha(1, 1, 2, 1);
        String expected = "1-One";
        String actual = captcha.getCaptcha();
        assertEquals(expected, actual);
    }

}
