package interpreter.math.operations.doubleOperation;

import interpreter.math.MathValue;
import interpreter.math.operations.operationInterface.Operation;


public abstract class DoubleOperatorOperation implements Operation {

    protected final MathValue firstElement;
    protected final MathValue secondElement;

    public DoubleOperatorOperation(MathValue firstElement, MathValue secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public abstract MathValue evaluate();
}
