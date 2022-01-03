package interpreter;

import grammar.LynxParser;
import interpreter.math.MathStatement;
import interpreter.statements.*;

import java.util.LinkedList;

public class LynxExecutorListener extends LynxMathListener {
    private Statement statement;
    private Executor executor;
    private final StatementCollector statementCollector = new StatementCollector();


    @Override
    public void exitForward(LynxParser.ForwardContext ctx) {
        statement = new StatementForward(mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitBack(LynxParser.BackContext ctx) {
        statement = new StatementBack(mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitRight(LynxParser.RightContext ctx) {
        statement = new StatementRight(mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitLeft(LynxParser.LeftContext ctx) {
        statement = new StatementLeft(mathCollector.getMathStatement());
        exit();
    }

    @Override
    public void exitHome(LynxParser.HomeContext ctx) {
        statement = new StatementHome();
        exit();
    }

    @Override
    public void enterRepeat(LynxParser.RepeatContext ctx) {
        statementCollector.startCollecting();
    }

    @Override
    public void exitRepeat(LynxParser.RepeatContext ctx) {
        MathStatement statementMath = mathCollector.getMathStatement();
        System.out.println(statementMath.toString());
        statement = new StatementRepeat(statementMath, statementCollector.endCollecting());
        exit();
    }

    @Override
    public void enterProcedure(LynxParser.ProcedureContext ctx) {
        statementCollector.startCollecting();
    }

    @Override
    public void exitProcedure(LynxParser.ProcedureContext ctx) {
        String name = ctx.stringArg().getText();
        LinkedList<String> variableNames = new LinkedList<>();
        for (LynxParser.VariableNameContext variableNameContext: ctx.variableName()) {
            variableNames.addLast(variableNameContext.getText());
        }
        Procedure procedure = new Procedure(name, statementCollector.endCollecting(), variableNames);
        statement = new StatementProcedureCreation(name, procedure);
        exit();
    }

    @Override
    public void exitLet(LynxParser.LetContext ctx) {
        String name = ctx.variableName().getText();
        MathStatement mathStatement = mathCollector.getMathStatement();
        statement = new StatementLet(name, mathStatement);
        exit();
    }


    @Override
    public void exitProcedureCall(LynxParser.ProcedureCallContext ctx) {
        String name = ctx.stringArg().getText();
        ctx.mathStatement();
        LinkedList<MathStatement> mathStatementList = new LinkedList<>();
        for (int i=0; i<ctx.mathStatement().size(); i++) {
            mathStatementList.addLast(mathCollector.getMathStatement());
        }
        statement = new StatementProcedureCall(name, mathStatementList);
        exit();
    }

    @Override
    public void exitPd(LynxParser.PdContext ctx) {
        statement = new StatementPenDown();
        exit();
    }

    @Override
    public void exitPu(LynxParser.PuContext ctx) {
        statement = new StatementPenUp();
        exit();
    }

    private void exit() {
        if (!statementCollector.isCollecting()) {
            statement.execute(executor);
        }
        else {
            statementCollector.addStatement(statement);
        }
        statement = null;
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }
}