package Opgave1;

import java.io.FileWriter;

public abstract class Figur {
    protected double x;
    protected double y;

    public Figur(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public abstract double area();


    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return String.format("Position: (%.2f, %.2f)", x, y);
    }
}

