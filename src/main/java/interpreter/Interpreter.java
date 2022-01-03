package interpreter;

import grammar.LynxLexer;
import grammar.LynxParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import programme.elements.ErrorOutput;

public class Interpreter implements ConsoleListener {

    private final Executor executor;
    private final ErrorOutput error_output;

    public Interpreter(Executor executor, ErrorOutput error_output) {
        this.executor = executor;
        this.error_output = error_output;
    }

    private void parseCommands(String command) {
        LynxParser parser = generateParser(command);
        ErrorListener errorListener = addErrorListenerToParser(parser);
        System.out.println(errorListener.hasErrors());
        ParseTree tree = parser.program();
        walkTheTree(tree);
        checkParserErrors(errorListener);
    }

    public void executeCode(String command) {
        try {
            parseCommands(command);
        } catch (Exception exception) {
            System.out.println("In catch");
            error_output.setText(exception.getMessage());
        }
    }

    private LynxParser generateParser(String command) {
        CharStream charStream = CharStreams.fromString(command);
        LynxLexer lexer = new LynxLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        return new LynxParser(tokenStream);
    }

    private ErrorListener addErrorListenerToParser(LynxParser parser) {
        ErrorListener errorListener = new ErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        return errorListener;
    }

    private void checkParserErrors(ErrorListener errorListener) {
        if (errorListener.hasErrors()) {
            String message = errorListener.getErrors();
            errorListener.clearErrors();
            throw new IllegalArgumentException(message);
        }
    }

    private void walkTheTree(ParseTree tree) {
        LynxExecutorListener listener = new LynxExecutorListener();
        listener.setExecutor(executor);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    public Executor getExecutor() {
        return executor;
    }
}
