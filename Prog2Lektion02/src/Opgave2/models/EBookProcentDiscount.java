package Opgave2.models;

import Opgave1.Ellipse;

import java.util.List;

public class EBookProcentDiscount extends Discount {
    private final double procent;

    public EBookProcentDiscount(String name, double procent) {
        super(name);
        this.procent = procent;
    }

    @Override
    public double applyDiscount(double price, Basket basket) {

        List<Book> items = basket.getItems();
        double eBookTotal = 0;
        for (Book book : items) {
            if (book instanceof EBook) {
                eBookTotal += book.getPrice();

            }
        }
        return -eBookTotal * (procent / 100);
    }
}
