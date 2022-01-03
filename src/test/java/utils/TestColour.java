package utils;

import javafx.scene.paint.Color;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestColour {

    @Test
    public void testToJavaFXColour() {
        Colour black = Colour.BLACK;
        assertEquals(Color.BLACK, black.toJavaFXColour());
        Colour white = Colour.WHITE;
        assertEquals(Color.WHITE, white.toJavaFXColour());
    }

    @Test
    public void illegalColour() {
        Colour illegalColour = new Colour(-1);
        IllegalStateException thrown = assertThrows(IllegalStateException.class, illegalColour::toJavaFXColour);
        assertEquals("Unexpected value: -1" , thrown.getMessage());
    }
}
