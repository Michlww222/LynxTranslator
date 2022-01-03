package utils;


/*
Class to represent logic connected with turning a turtle
 */
public class Rotation {
    public static final int BASIC_ROTATION = 0;
    private static final int MAX_DEGREES = 360;

    private int currentRotation = BASIC_ROTATION;

    public Rotation() {
        setDegrees(BASIC_ROTATION);
    }

    public Rotation(int startingRotation) {
        setDegrees(startingRotation);
    }

    /*
    Change the rotation, degreesToChange should be larger than MAX_DEGREES
     */
    public void changeRotation(int degreesToChange) {
        currentRotation = (currentRotation + degreesToChange + MAX_DEGREES) % MAX_DEGREES;
    }

    public Vector2D getUnitVector2D() {
        double x = Math.sin(currentRotation*2*Math.PI/MAX_DEGREES);
        double y = Math.cos(currentRotation*2*Math.PI/MAX_DEGREES);
        return new Vector2D(x,y);
    }

    public int getRotation() {
        return currentRotation;
    }

    public int getRotationOnCanvas() {return (-currentRotation + MAX_DEGREES) % MAX_DEGREES;}

    public void setDegrees(int degrees) {
        currentRotation = degrees % MAX_DEGREES;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        else if (!(other instanceof Rotation)) {
            return false;
        }
        else return ((Rotation) other).currentRotation == currentRotation;
    }
}
