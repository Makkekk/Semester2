package Opgave2.models;

public class FixedDiscount extends Discount {
    private final int discountAmount;
    private final int minAmount;

    public FixedDiscount(String description, int discount, int minAmount) {
        super(description);
        this.discountAmount = discount;
        this.minAmount = minAmount;
    }

    @Override
    public double applyDiscount(double price,Basket basket) {
        if (price >= minAmount) {
            return  -discountAmount;
        }
        return 0;
    }


}
