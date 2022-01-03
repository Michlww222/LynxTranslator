package programme.elements;

import interpreter.ConsoleListener;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class Console extends VBox {
    @FXML private final TextArea prevCommands = new TextArea();
    @FXML private final TextArea currentCommand = new TextArea();

    private final static String prefix = ">>>";

    private final List<ConsoleListener> listeners = new ArrayList<>();

    public Console() {
        this.setPrefSize(440, 600);
        prevCommands.setPrefSize(440, 560);
        currentCommand.setPrefSize(440, 20);
        this.getChildren().addAll(prevCommands, currentCommand);
        this.setFillWidth(true);
        newCommand();

        currentCommand.addEventHandler(KeyEvent.KEY_RELEASED, keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                enterPressed();
            }
        });
    }

    private void enterPressed() {
        String commandText = currentCommand.getText();
        notifyObservers(commandText.substring(prefix.length(), commandText.length()-1));
        String textToPreviousCommands = prevCommands.getText() + commandText;
        prevCommands.setText(textToPreviousCommands);
        newCommand();
    }

    private void newCommand() {
        currentCommand.clear();
        currentCommand.setText(prefix);
        currentCommand.positionCaret(prefix.length());
    }

    public void addListener(ConsoleListener listener) {
        listeners.add(listener);
    }

    private void notifyObservers(String command) {
        listeners.forEach( (ConsoleListener listener) -> listener.executeCode(command));
    }
}
