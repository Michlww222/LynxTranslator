package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.math.MathStatement;

import java.util.List;

public class StatementRepeat implements Statement {
    private final MathStatement timesStatement;
    private final List<Statement> statementList;

    public StatementRepeat(MathStatement timesStatement, List<Statement> statementList) {
        this.timesStatement = timesStatement;
        this.statementList = statementList;
    }

    @Override
    public void execute(Executor executor) {
        int times = timesStatement.evaluate(executor.getEnvironment()).getIntValue();
        for (int i=0; i<times; i++) {
            for(Statement statement: statementList) {
                statement.execute(executor);
            }
        }
    }
}
