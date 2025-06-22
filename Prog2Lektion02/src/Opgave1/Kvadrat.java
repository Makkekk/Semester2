package Opgave1;

public class Kvadrat extends Figur {
    private double side;

    public Kvadrat(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("Kvadrat [side=%.2f, %s, area=%.2f]", side, super.toString(), area());
    }

}
