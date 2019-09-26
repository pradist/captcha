import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOperatorTest {

    @Test
    public void operator_whenInputIs1_ItShouldBePlus() {
        StringOperator operator = new StringOperator(1);
        assertEquals("+", operator.toString());
    }

    @Test
    public void operator_whenInputIs2_ItShouldBeMinus() {
        StringOperator operator = new StringOperator(2);
        assertEquals("-", operator.toString());
    }

    @Test
    public void operator_whenInputIs3_ItShouldBeDivide() {
        StringOperator operator = new StringOperator(3);
        assertEquals("/", operator.toString());
    }
}