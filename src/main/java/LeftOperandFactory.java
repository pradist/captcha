public class LeftOperandFactory {

    public static Operand create(int pattern, int operand) {
        if(pattern == 2){
            return  new StringOperand(operand);
        }
        return new IntegerOperand(operand);
    }
}
