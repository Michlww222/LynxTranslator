package interpreter.math.operations.commands;

import interpreter.math.MathValue;
import interpreter.math.operations.doubleOperation.DoubleOperatorOperation;
import interpreter.math.operations.singleOperation.SingleOperatorOperation;

import static java.lang.StrictMath.cos;


public class NotOperation extends SingleOperatorOperation {

    public NotOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        boolean value = element.getBooleanValue();
        return new MathValue(!value);
    }


}
