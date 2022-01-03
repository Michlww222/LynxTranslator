package interpreter;

import interpreter.engine.CanvasEngine;

public class Executor {
    private final CanvasEngine canvasEngine;
    private final Environment environment = new Environment();

    public Executor(CanvasEngine canvasEngine) {
        this.canvasEngine = canvasEngine;
    }

    public CanvasEngine getEngine() {
        return canvasEngine;
    }

    public Environment getEnvironment() { return environment;}
}
