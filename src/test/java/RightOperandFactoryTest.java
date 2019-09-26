import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RightOperandFactoryTest {

    @Test
    public void rightOperandFactoryWhenPatternIs1_operandShouldBeStringOperand() {
        Operand operand = RightOperandFactory.create(1, 1);
        assertTrue(operand instanceof StringOperand);
    }

    @Test
    public void rightOperandFactoryWhenPatternIs2_operandShouldBeIntegerOperand() {
        Operand operand = RightOperandFactory.create(2, 1);
        assertTrue(operand instanceof IntegerOperand);
    }
}
