package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;

public class StatementBack implements Statement {
    private final MathStatement mathStatement;

    public StatementBack(MathStatement mathStatement) {
        this.mathStatement = mathStatement;
    }

    @Override
    public void execute(Executor executor) {
        MathValue value = mathStatement.evaluate(executor.getEnvironment());
        executor.getEngine().backward(value.getDoubleValue());
    }
}
