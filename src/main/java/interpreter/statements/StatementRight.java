package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;

public class StatementRight implements Statement {
    private final MathStatement mathStatement;

    public StatementRight(MathStatement mathStatement) {
        this.mathStatement = mathStatement;
    }

    @Override
    public void execute(Executor executor) {
        MathValue value = mathStatement.evaluate(executor.getEnvironment());
        executor.getEngine().right(value.getIntValue());
    }
}
