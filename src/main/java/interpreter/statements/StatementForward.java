package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.VariableValue;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;

public class StatementForward implements Statement {
    private final MathStatement mathStatement;

    public StatementForward(MathStatement mathStatement) {
        this.mathStatement = mathStatement;
    }

    @Override
    public void execute(Executor executor) {
        MathValue value = mathStatement.evaluate(executor.getEnvironment());
        executor.getEngine().forward(value.getDoubleValue());
    }
}
