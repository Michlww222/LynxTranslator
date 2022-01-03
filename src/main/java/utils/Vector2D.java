package utils;

import java.util.Objects;

public class Vector2D {
    public final static double DELTA = 1e-8;

    public final double x;
    public final double y;

    public Vector2D() {
        x=0;
        y=0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public Vector2D upperRight(Vector2D other) {
        double x = Math.max(this.x, other.x);
        double y = Math.max(this.y, other.y);
        return new Vector2D(x,y);
    }

    public Vector2D lowerLeft(Vector2D other) {
        double x = Math.min(this.x, other.x);
        double y = Math.min(this.y, other.y);
        return new Vector2D(x,y);
    }

    public Vector2D add(Vector2D other) {
        double x = this.x + other.x;
        double y = this.y + other.y;
        return new Vector2D(x,y);
    }

    public Vector2D subtract(Vector2D other) {
        double x = this.x - other.x;
        double y = this.y - other.y;
        return new Vector2D(x,y);
    }

    public Vector2D multiply(double n) {
        return new Vector2D(this.x*n, this.y*n);
    }

    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof Vector2D))
            return false;
        Vector2D that = (Vector2D) other;
        return this.x - that.x < DELTA && this.y - that.y < DELTA;
    }

    public Vector2D opposite() {
        double x = -1 * this.x;
        double y = -1 * this.y;
        return new Vector2D(x,y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

}
