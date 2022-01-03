package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.math.MathStatement;

import java.util.List;

public class StatementIfElse implements Statement {
    private final MathStatement mathStatement;
    private final List<Statement> trueStatementList;
    private final List<Statement> falseStatementList;

    public StatementIfElse(MathStatement mathStatement, List<Statement> trueStatementList, List<Statement> falseStatementList) {
        this.mathStatement = mathStatement;
        this.trueStatementList = trueStatementList;
        this.falseStatementList = falseStatementList;
    }

    @Override
    public void execute(Executor executor) {
        boolean value = mathStatement.evaluate(executor.getEnvironment()).getBooleanValue();
        if (value) {
            for (Statement statement : trueStatementList) {
                statement.execute(executor);
            }
        }
        else {
            for (Statement statement: falseStatementList) {
                statement.execute(executor);
            }
        }
    }
}