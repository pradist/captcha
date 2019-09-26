import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class CaptchaFactoryTest {

    @Test
    public void whenCreateCaptchaItShouldRandom4times() {
        SpyRandom random = new SpyRandom();
        Captcha captcha = new CaptchaFactory(random).create();
        assertEquals(4, random.calledNextIntCount);

        List<Integer> expectedBounds = Arrays.asList(3, 10, 4, 10);
        assertEquals(expectedBounds, random.bounds);
    }

    private class SpyRandom extends Random {

        public int calledNextIntCount = 0;
        public List<Integer> bounds = new ArrayList<>();

        @Override
        public int nextInt(int bound) {
            calledNextIntCount++;
            bounds.add(bound);
            return bound;
        }
    }
}
