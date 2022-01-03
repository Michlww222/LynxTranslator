package interpreter.math.operations.singleOperation;

import interpreter.math.MathValue;
import interpreter.math.operations.operationInterface.Operation;


public abstract class SingleOperatorOperation implements Operation {

    protected final MathValue element;

    public SingleOperatorOperation(MathValue element) {
        this.element = element;
    }

    public abstract MathValue evaluate();
}
