package programme;

import interpreter.Turtle;
import org.junit.Test;
import utils.Colour;
import utils.Rotation;
import utils.Vector2D;

import static org.junit.jupiter.api.Assertions.*;

public class TestTurtle {

    @Test
    public void testPenPuttingDown() {
        Turtle turtle = new Turtle(new Vector2D(100, 200));
        assertTrue(turtle.isDown());

        turtle.setUp();
        assertFalse(turtle.isDown());

        turtle.setDown();
        assertTrue(turtle.isDown());
    }

    @Test
    public void testErasing() {
        Turtle turtle = new Turtle(new Vector2D(100, 200));
        assertFalse(turtle.isErasing());

        turtle.setErasing();
        assertTrue(turtle.isErasing());

        turtle.setNotErasing();
        assertFalse(turtle.isErasing());
    }

    @Test
    public void testForward() {
        Turtle turtle = new Turtle(new Vector2D(100, 200));
        turtle.forward(100);
        double resultX = turtle.getX();
        double resultY = turtle.getY();

        assertEquals(100, resultX, Vector2D.DELTA);
        assertEquals(300, resultY, Vector2D.DELTA);
    }

    @Test
    public void testBackward() {
        Turtle turtle = new Turtle(new Vector2D(100, 200));
        turtle.left(90);
        turtle.backward(100);
        Vector2D result = turtle.getPosition();

        assertEquals(new Vector2D(200, 200), result);
    }

    @Test
    public void testRight() {
        Turtle turtle = new Turtle(new Vector2D(0, 0));
        turtle.left(90);
        Rotation expectedRotation = new Rotation(270);

        assertEquals(expectedRotation, turtle.getRotation());
    }

    @Test
    public void testPen() {
        Turtle turtle = new Turtle(new Vector2D(0, 0));
        turtle.setPenSize(10);
        turtle.setPenColour(Colour.WHITE);

        assertEquals(10, turtle.getPenSize());
        assertEquals(Colour.WHITE, turtle.getPenColour());
    }

    @Test
    public void testTurtleColour() {
        Turtle turtle = new Turtle(new Vector2D(0, 0));
        turtle.setTurtleColour(Colour.BLACK);
        assertEquals(Colour.BLACK, turtle.getTurtleColour());
    }

    @Test
    public void testSettingPosition() {
        Turtle turtle = new Turtle(new Vector2D(0, 0));
        Turtle anotherTurtle = new Turtle(new Vector2D(1, 1));
        turtle.setX(100);
        turtle.setY(150);
        anotherTurtle.setPosition(100, 150);

        assertEquals(turtle.getPosition(), anotherTurtle.getPosition());
    }

    @Test
    public void testSettingRotation() {
        Turtle turtle = new Turtle(new Vector2D(0, 0));
        turtle.setRotation(new Rotation(444));

        assertEquals(new Rotation(444), turtle.getRotation());
    }


}
