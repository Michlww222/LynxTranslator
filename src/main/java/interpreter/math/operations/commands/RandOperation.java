package interpreter.math.operations.commands;

import interpreter.math.MathValue;
import interpreter.math.operations.doubleOperation.DoubleOperatorOperation;
import interpreter.math.operations.singleOperation.SingleOperatorOperation;

import java.util.Random;

import static java.lang.StrictMath.cos;


public class RandOperation extends SingleOperatorOperation {

    public RandOperation(MathValue element) {
        super(element);
    }

    @Override
    public MathValue evaluate() {
        int value = element.getIntValue();
        Random r = new Random();
        return new MathValue(r.nextInt(value));
    }


}