import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerOperandTest {

    @Test
    public void whenIntegerOperandIs1_itShouldBe1() {
        IntegerOperand operand = new IntegerOperand(1);
        assertEquals("1", operand.toString());
    }

    @Test
    public void whenIntegerOperandIs5_itShouldBe5() {
        IntegerOperand operand = new IntegerOperand(5);
        assertEquals("5", operand.toString());
    }

    @Test
    public void whenIntegerOperandIs9_itShouldBe9() {
        IntegerOperand operand = new IntegerOperand(9);
        assertEquals("9", operand.toString());
    }

}
