package programme;

import interpreter.engine.CanvasEngine;
import interpreter.Executor;
import interpreter.Interpreter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import programme.controllers.Controller;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        CanvasEngine canvasEngine = new CanvasEngine(controller.getLynxCanvas());
        Executor executor = new Executor(canvasEngine);
        Interpreter interpreter = new Interpreter(executor, controller.getErrorLabel());
        controller.setInterpreter(interpreter);

        stage.setTitle("Lynx translator");
        Scene scene = new Scene(root, 1300, 720);
        scene.getStylesheets().add(getClass().getResource("lynxStyle.css").toString());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
