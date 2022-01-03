package utils;

import org.junit.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class TestVector2D {

    @Test
    public void testConstructor() {
        Vector2D vector2D = new Vector2D(2,4);
        assertEquals(2.0, vector2D.x, Vector2D.DELTA);
        assertEquals(4.0, vector2D.y, Vector2D.DELTA);
    }

    @Test
    public void testToString(){
        Vector2D vector2D = new Vector2D(2,4);
        String trueResult = "(2.0,4.0)";
        assertEquals(trueResult, vector2D.toString());
    }

    @Test
    public void testUpperRight() {
        Vector2D first = new Vector2D(2,4);
        Vector2D second = new Vector2D(5,2);
        Vector2D trueResult = new Vector2D(5,4);
        assertEquals(trueResult, first.upperRight(second));
    }

    @Test
    public void testLowerLeft() {
        Vector2D first = new Vector2D(2,4);
        Vector2D second = new Vector2D(5,2);
        Vector2D trueResult = new Vector2D(2,2);
        assertEquals(trueResult, first.lowerLeft(second));
    }

    @Test
    public void testAdd() {
        Vector2D first = new Vector2D(2,4);
        Vector2D second = new Vector2D(5,2);
        Vector2D trueResult = new Vector2D(7,6);
        assertEquals(trueResult, second.add(first));
    }

    @Test
    public void testSubtract() {
        Vector2D first = new Vector2D(2,4);
        Vector2D second = new Vector2D(5,2);
        Vector2D trueResult = new Vector2D(3,-2);
        assertEquals(trueResult, second.subtract(first));
    }

    @Test
    public void testMultiply() {
        Vector2D vector2D = new Vector2D(2,4);
        Vector2D trueResult = new Vector2D(10, 20);
        int n = 5;
        assertEquals(trueResult, vector2D.multiply(n));
    }

    @Test
    public void testOpposite() {
        Vector2D vector2D = new Vector2D(4, -1);
        Vector2D trueResult = new Vector2D(-4, 1);
        assertEquals(trueResult, vector2D.opposite());
    }

    @Test
    public void testEqual() {
        Vector2D vector2D = new Vector2D();
        assertSame(vector2D, vector2D);
        String x = "other type";
        assertNotEquals(vector2D, x);
        assertEquals(vector2D, vector2D);
    }

    @Test
    public void testHashCode() {
        Vector2D vector2D = new Vector2D(2.0,4.0);
        int hash = Objects.hash(2.0, 4.0);
        int hash2 = vector2D.hashCode();
        assertEquals(hash, hash2);
    }

}
