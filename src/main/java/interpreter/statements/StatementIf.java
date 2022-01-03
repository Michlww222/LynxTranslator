package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.math.MathStatement;

import java.util.List;

public class StatementIf implements Statement {
    private final MathStatement mathStatement;
    private final List<Statement> statementList;

    public StatementIf(MathStatement mathStatement, List<Statement> statementList) {
        this.mathStatement = mathStatement;
        this.statementList = statementList;
    }

    @Override
    public void execute(Executor executor) {
        boolean value = mathStatement.evaluate(executor.getEnvironment()).getBooleanValue();
        if (value) {
            for (Statement statement: statementList) {
                statement.execute(executor);
            }
        }
    }
}