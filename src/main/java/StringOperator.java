public class StringOperator {

    private final int operator;

    public StringOperator(int operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        String[] operators = {"+", "-", "/"};
        return operators[operator - 1].toString();
    }
}
