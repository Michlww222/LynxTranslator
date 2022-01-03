package interpreter.math.operations.commands;

import interpreter.math.MathValue;
import interpreter.math.operations.doubleOperation.DoubleOperatorOperation;


public class AndOperation extends DoubleOperatorOperation {

    public AndOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        boolean first = firstElement.getBooleanValue();
        boolean second = secondElement.getBooleanValue();
        return new MathValue(first && second);

    }


}