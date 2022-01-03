package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;

public class StatementLeft implements Statement {
    private final MathStatement mathStatement;

    public StatementLeft(MathStatement mathStatement) {
        this.mathStatement = mathStatement;
    }

    @Override
    public void execute(Executor executor) {
        MathValue value = mathStatement.evaluate(executor.getEnvironment());
        executor.getEngine().left(value.getIntValue());
    }
}
