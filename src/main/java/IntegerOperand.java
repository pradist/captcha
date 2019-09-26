public class IntegerOperand implements Operand {

    private final int operand;

    public IntegerOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {
        return "" + operand;
    }
}
