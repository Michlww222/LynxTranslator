package interpreter.math;

import java.util.LinkedList;

public class MathStatementCollector {
    LinkedList<String> statementElements;
    LinkedList<MathStatement> statements = new LinkedList<>();

    public void startCollecting() {
        statementElements = new LinkedList<>();
    }

    public void endCollecting() {
        statements.addLast(new MathStatement(statementElements));
    }

    public void collect(String value) {
        statementElements.addLast(value);
    }

    public MathStatement getMathStatement() {
        return statements.removeLast();
    }
}
