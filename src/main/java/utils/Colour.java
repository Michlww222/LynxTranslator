package utils;

import javafx.scene.paint.Color;

public class Colour {
    private final static int BLACK_CODE = 9;
    private final static int WHITE_CODE = 0;

    public final static Colour BLACK = new Colour(BLACK_CODE);
    public final static Colour WHITE = new Colour(WHITE_CODE);

    private final int colourCode;

    public Colour(int colourCode) {
        this.colourCode = colourCode;
    }

    public Color toJavaFXColour() {
        switch (colourCode) {
            case BLACK_CODE: return Color.BLACK;
            case WHITE_CODE: return Color.WHITE;
            default:
                throw new IllegalStateException("Unexpected value: " + colourCode);
        }
    }
}
