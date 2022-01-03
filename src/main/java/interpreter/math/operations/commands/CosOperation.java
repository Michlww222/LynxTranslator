package interpreter.math.operations.commands;

import interpreter.math.MathValue;
import interpreter.math.operations.doubleOperation.DoubleOperatorOperation;
import interpreter.math.operations.singleOperation.SingleOperatorOperation;

import static java.lang.StrictMath.cos;


public class CosOperation extends SingleOperatorOperation {

    public CosOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int checkVal = element.checkValue();
        if(checkVal == 0){
            double value = element.getIntValue();
            return new MathValue(cos(value));
        }
        else{
            int value = element.getIntValue();
            return new MathValue(cos(value));
        }
    }


}
