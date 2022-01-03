package interpreter.math.operations.commands;

import interpreter.math.MathValue;
import interpreter.math.operations.singleOperation.SingleOperatorOperation;

public class AbsOperation extends SingleOperatorOperation {

    public AbsOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int checkVal = element.checkValue();
        if(checkVal == 0){
            double value = element.getDoubleValue();
            if(value < 0){
                return new MathValue(-value);
            }
            else{
                return new MathValue(value);
            }
        }
        else{
            int value = element.getIntValue();
            if(value < 0){
                return new MathValue(-value);
            }
            else{
                return new MathValue(value);
            }
        }
    }
}
