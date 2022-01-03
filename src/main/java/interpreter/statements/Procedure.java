package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;

import java.util.List;

public class Procedure implements Statement {

    public final String name;
    public final List<Statement> statementList;
    public final List<String> variableNamesList;

    public Procedure(String name, List<Statement> statementList, List<String> variableNamesList) {
        this.name = name;
        this.statementList = statementList;
        this.variableNamesList = variableNamesList;
    }

    @Override
    public void execute(Executor executor) {
        for (Statement statement: statementList) {
            statement.execute(executor);
        }
    }
}
