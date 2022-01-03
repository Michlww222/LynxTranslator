package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

public class StatementPenDown implements Statement {

    @Override
    public void execute(Executor executor) {
        executor.getEngine().setDown();
    }
}
