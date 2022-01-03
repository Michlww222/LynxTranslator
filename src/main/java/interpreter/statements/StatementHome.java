package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

public class StatementHome implements Statement {

    @Override
    public void execute(Executor executor) {
        executor.getEngine().setPosition(0,0);
    }
}
