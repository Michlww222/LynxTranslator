package interpreter.math.operations.commands;

import interpreter.math.MathValue;
import interpreter.math.operations.doubleOperation.DoubleOperatorOperation;
import interpreter.math.operations.singleOperation.SingleOperatorOperation;



public class IntOperation extends SingleOperatorOperation {

    public IntOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int value = element.getIntValue();
        return new MathValue(value);
    }


}