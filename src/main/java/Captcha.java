public class Captcha {

    private final Operand leftOperand;
    private final int operator;
    private final Operand rightOperand;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.leftOperand = LeftOperandFactory.create(pattern, leftOperand);
        this.operator = operator;
        this.rightOperand = RightOperandFactory.create(pattern, rightOperand);
    }

    public String getLeftOperand() {
        return leftOperand.toString();
    }

    public String getRightOperand() {
        return rightOperand.toString();
    }

    public String getOperator() {
        String[] operators = {"+", "-", "/"};
        return operators[operator - 1];
    }

    public String getCaptcha() {
        return getLeftOperand() + getOperator() + getRightOperand();
    }
}
