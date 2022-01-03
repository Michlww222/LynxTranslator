package interpreter.math.operations.doubleOperation;

import interpreter.math.MathValue;
import interpreter.math.Operators;
import interpreter.math.operations.commands.*;

public class DoubleOperatorFactory {

    public static DoubleOperatorOperation factorOperation(Operators operator, MathValue firstValue, MathValue secondValue) {
        return switch(operator) {
            case PLUS -> new AddOperation(firstValue, secondValue);
            case MINUS -> new MinusDoubleOperation(firstValue, secondValue);
            case COMP -> new CompereOperation(firstValue, secondValue);
            case AND -> new AndOperation(firstValue, secondValue);
            case OR -> new OrOperation(firstValue, secondValue);
            case REMAINDER -> new RemainderOperation(firstValue, secondValue);
            case DIVIDE -> new DivideOperation(firstValue, secondValue);
            case POW -> new PowerOperation(firstValue, secondValue);
            case LOG -> new LogOperation(firstValue, secondValue);
            default -> throw new IllegalStateException("Unsupported operator");
        };
    }

}
