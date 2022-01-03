package utils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestPen {

    @Test
    public void testPen() {
        Pen pen = new Pen(Colour.BLACK, 10);
        assertEquals(10, pen.getSize());
        assertEquals(Colour.BLACK, pen.getColour());
    }

    @Test
    public void assertionTest() {
        AssertionError thrown = assertThrows(AssertionError.class, () ->new Pen(Colour.WHITE, 0));

        assertEquals(Pen.ASSERTION_MESSAGE, thrown.getMessage());
    }
}
