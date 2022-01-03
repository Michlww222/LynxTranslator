package interpreter.engine;

import interpreter.Turtle;
import utils.Colour;
import utils.Rotation;
import utils.Vector2D;

public interface Engine {

    void changeTurtle(String newTurtleName);

    void addTurtle(String newTurtleName, Turtle newTurtle) ;

    void removeTurtle(String toRemoveTurtleName);

    boolean isDown();

    void setUp();

    void setDown();

    boolean isErasing();

    void setErasing();

    void setNotErasing();

    void forward(double n) ;

    void backward(double n);

    void right(int degrees);

    void left(int degrees);

    double getX();

    double getY();

    Vector2D getPosition();

    void setX(double newX);

    void setY(double newY);

    void setPosition(double newX, double newY);

    Rotation getRotation();

    void setRotation(Rotation rotation);

    Colour getPenColour();

    void setPenColour(Colour newPenColour);

    int getPenSize();

    void setPenSize(int size);

    Colour getTurtleColour();

    void setTurtleColour(Colour turtleColor);
}
