package Opgave2.models;

public class ProcentDiscount extends Discount {
    private final double procent;


    public ProcentDiscount(String description, double procent) {
        super(description);
        this.procent = procent;
    }

    @Override
    public double applyDiscount(double price, Basket basket) {
        return -price * (procent / 100.00);
    }
}