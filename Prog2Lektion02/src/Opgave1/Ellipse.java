package Opgave1;

public class Ellipse extends Figur{
    private double r1;
    private double r2;


    public Ellipse(double x, double y, double r1, double r2) {
        super(x, y);
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double area() {
        return Math.PI * r1 * r2;
    }

    @Override
    public String toString() {
        return String.format("Ellipse [r1=%.2f, r2=%.2f, %s, area=%.2f]", r1, r2, super.toString(), area());
    }
}

