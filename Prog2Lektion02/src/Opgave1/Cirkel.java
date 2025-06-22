package Opgave1;

public class Cirkel extends Figur {
    private double radius;

    public Cirkel(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Cirkel [radius=%.2f, %s, area=%.2f]", radius, super.toString(), area());
    }
}
