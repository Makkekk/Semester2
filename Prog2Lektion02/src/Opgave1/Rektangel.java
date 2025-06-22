package Opgave1;

public class Rektangel extends Figur {
    private double s1;
    private double s2;

    public Rektangel(double x,double y, double s1, double s2) {
        super(x, y);
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public double area() {
        return s1 * s2;
    }

    @Override
    public String toString() {
        return String.format("Rektangel [s1=%.2f, s2=%.2f, %s, area=%.2f]", s1, s2, super.toString(), area());
    }
}

