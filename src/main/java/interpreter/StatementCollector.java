package interpreter;

import java.util.LinkedList;

public class StatementCollector {
    LinkedList<LinkedList<Statement>> listOfLists = new LinkedList<>();

    public void addStatement(Statement statement) {
        listOfLists.getFirst().addLast(statement);
    }

    public LinkedList<Statement> endCollecting() {
        return listOfLists.removeFirst();
    }

    public void startCollecting() {
        listOfLists.addFirst(new LinkedList<>());
    }

    public boolean isCollecting() {
        return !listOfLists.isEmpty();
    }
}
