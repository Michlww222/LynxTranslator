package interpreter;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;

public class ErrorListener extends BaseErrorListener {

    private final ArrayList<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        errors.add(msg + line + ":" + charPositionInLine);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public String getErrors() {
        StringBuilder builder = new StringBuilder();
        for (String error: errors) {
            builder.append(error).append("\n");
        }
        return builder.toString();
    }

    public void clearErrors() {
        errors.clear();
    }
}
