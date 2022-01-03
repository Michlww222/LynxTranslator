package interpreter.engine;

import interpreter.Turtle;
import utils.Colour;
import utils.Rotation;
import utils.Vector2D;

// TODO write all methods and add getters about data
public class MockEngine implements Engine{
    @Override
    public void changeTurtle(String newTurtleName) {

    }

    @Override
    public void addTurtle(String newTurtleName, Turtle newTurtle) {

    }

    @Override
    public void removeTurtle(String toRemoveTurtleName) {

    }

    @Override
    public boolean isDown() {
        return false;
    }

    @Override
    public void setUp() {

    }

    @Override
    public void setDown() {

    }

    @Override
    public boolean isErasing() {
        return false;
    }

    @Override
    public void setErasing() {

    }

    @Override
    public void setNotErasing() {

    }

    @Override
    public void forward(double n) {

    }

    @Override
    public void backward(double n) {

    }

    @Override
    public void right(int degrees) {

    }

    @Override
    public void left(int degrees) {

    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public Vector2D getPosition() {
        return null;
    }

    @Override
    public void setX(double newX) {

    }

    @Override
    public void setY(double newY) {

    }

    @Override
    public void setPosition(double newX, double newY) {

    }

    @Override
    public Rotation getRotation() {
        return null;
    }

    @Override
    public void setRotation(Rotation rotation) {

    }

    @Override
    public Colour getPenColour() {
        return null;
    }

    @Override
    public void setPenColour(Colour newPenColour) {

    }

    @Override
    public int getPenSize() {
        return 0;
    }

    @Override
    public void setPenSize(int size) {

    }

    @Override
    public Colour getTurtleColour() {
        return null;
    }

    @Override
    public void setTurtleColour(Colour turtleColor) {

    }
}
