import java.util.Random;

public class CaptchaFactory {


    private final Random randomizer;

    public CaptchaFactory(Random randomizer) {
        this.randomizer = randomizer;
    }

    public Captcha create() {
        return new Captcha(
                randomizer.nextInt(3),
                randomizer.nextInt(10),
                randomizer.nextInt(4),
                randomizer.nextInt(10));
    }
}
