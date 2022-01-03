package utils;

public class Pen {
    private Colour colour;
    private int size;

    public Pen(Colour colour, int size) {
        setColour(colour);
        setSize(size);
    }

    public final static String ASSERTION_MESSAGE = "Pen size need to be positive";
    private void penAssertion() {
        assert size > 0: ASSERTION_MESSAGE;
    }

    public Colour getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setSize(int size) {
        this.size = size;
        penAssertion();
    }
}
