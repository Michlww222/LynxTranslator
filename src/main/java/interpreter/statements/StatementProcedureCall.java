package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.VariableValue;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;

import java.util.List;

public class StatementProcedureCall implements Statement {

    private final String name;
    private final List<MathStatement> mathStatements;

    public StatementProcedureCall(String name, List<MathStatement> mathStatements) {
        this.name = name;
        this.mathStatements = mathStatements;
    }

    @Override
    public void execute(Executor executor) {
        Procedure procedure = executor.getEnvironment().getProcedure(name);
        System.out.println("Print:" + procedure.variableNamesList.toString());
        assert procedure.variableNamesList.size() == mathStatements.size():
                "Number of procedure arguments is different than passed arguments";
        executor.getEnvironment().enterBlock();
        for (int i = 0; i< mathStatements.size(); i++) {
            System.out.println("Adding variable");
            MathValue value = mathStatements.get(i).evaluate(executor.getEnvironment());
            System.out.println("Value: " + value);
            System.out.println("Variable name:" + procedure.variableNamesList.get(i));
            executor.getEnvironment().addVariable(procedure.variableNamesList.get(i),
                    new VariableValue(value.toString()));
        }
        procedure.execute(executor);

        executor.getEnvironment().exitBlock();
    }
}