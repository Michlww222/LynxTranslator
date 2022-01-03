package programme.controllers;

import interpreter.Interpreter;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import programme.elements.Console;
import programme.elements.ErrorOutput;
import programme.elements.LynxCanvas;
import programme.elements.VariablesDisplayer;

import java.io.*;

public class Controller {

    @FXML private LynxCanvas lynxCanvas;
    @FXML private Console console;
    @FXML private ErrorOutput error_reporter;
    @FXML private TextArea programmeContent;
    @FXML private VBox programmeVBox;
    @FXML private VariablesDisplayer environment;

    public Interpreter interpreter;

    public LynxCanvas getLynxCanvas() {
        return lynxCanvas;
    }

    @FXML
    private void loadConsole() {
        console.setVisible(true);
        programmeVBox.setVisible(false);
        environment.setVisible(false);
    }

    @FXML
    private void loadProcedures() {
        console.setVisible(false);
        programmeVBox.setVisible(true);
        environment.setVisible(false);
        System.out.println("Loading procedures");
    }

    @FXML
    private void loadEnvironment() {
        console.setVisible(false);
        programmeVBox.setVisible(false);
        environment.setVisible(true);
    }

    @FXML
    private void loadFile() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("."));
        fileChooser.setTitle("Choose a file");
        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            openFile(file);
        }
    }

    @FXML
    private void clean() {
        interpreter.getExecutor().getEnvironment().clean();
    }

    @FXML
    private void executeProgramme() {
        String programme = programmeContent.getText();
        interpreter.executeCode(programme);
        environment.displayEnvironment();
    }

    private void openFile(File file) throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder builder = new StringBuilder();
        String line;
        line = bufferedReader.readLine();
        while (line != null) {
            builder.append(line).append("\n");
            line = bufferedReader.readLine();
        }
        programmeContent.setText(builder.toString());
    }

    public ErrorOutput getErrorLabel() {
        return error_reporter;
    }

    public void setInterpreter(Interpreter interpreter) {
        this.interpreter = interpreter;
        this.console.addListener(interpreter);
        this.environment.setEnvironment(interpreter.getExecutor().getEnvironment());
        this.console.addListener(this.environment);
    }
}
