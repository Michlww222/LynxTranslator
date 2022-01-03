package utils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestRotation {

    @Test
    public void testConstructor(){
        Rotation simpleRotation = new Rotation();
        Rotation rotation = new Rotation(370);
        assertEquals(0, simpleRotation.getRotation());
        assertEquals(10, rotation.getRotation());
    }

    @Test
    public void testChangeRotation() {
        Rotation rotation = new Rotation(50);
        rotation.changeRotation(-60);
        assertEquals(350, rotation.getRotation());
    }

    @Test
    public void testGetUnit2DVectorSimpleAngle() {
        Rotation rotation = new Rotation(90);
        Vector2D unitVector = rotation.getUnitVector2D();
        Vector2D trueResult = new Vector2D(1,0);
        assertEquals(trueResult, unitVector);
    }

    @Test
    public void testGetUnit2DVectorOtherAngle() {
        Rotation rotation = new Rotation(60);
        Vector2D unitVector = rotation.getUnitVector2D();
        double x = Math.sqrt(3.0)/2.0;
        double y = 0.5;
        Vector2D trueResult = new Vector2D(x,y);
        assertEquals(trueResult, unitVector);
    }

    @Test
    public void testRotationOnCanvas() {
        Rotation rotation = new Rotation(0);
        assertEquals(0, rotation.getRotationOnCanvas());

        Rotation rotation2 = new Rotation(180);
        assertEquals(180, rotation2.getRotationOnCanvas());

        Rotation rotation3 = new Rotation(90);
        assertEquals(270, rotation3.getRotationOnCanvas());

        Rotation rotation4 = new Rotation(45);
        assertEquals(360-45, rotation4.getRotationOnCanvas());
    }

    @Test
    public void testEquals() {
        Rotation rotation = new Rotation(40);
        Rotation otherRotation = new Rotation(60);
        Rotation anotherRotation = new Rotation(40);
        Object object = new Object();

        assertEquals(rotation, rotation);
        assertNotEquals(rotation, object);
        assertNotEquals(rotation, otherRotation);
        assertEquals(rotation, anotherRotation);
    }
}
