package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

public class StatementProcedureCreation implements Statement {

    private final String name;
    private final Procedure procedure;

    public StatementProcedureCreation(String name, Procedure procedure) {
        this.name = name;
        this.procedure = procedure;
    }

    @Override
    public void execute(Executor executor) {
        executor.getEnvironment().addProcedure(name, procedure);
    }
}
