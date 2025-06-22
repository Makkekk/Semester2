package Opgave2.models;

import java.util.Comparator;
import java.util.List;

public class TwoForOneDiscount extends Discount{

    public TwoForOneDiscount(String description) {
        super(description);
    }

    @Override
    public double applyDiscount(double price,Basket basket) {
        List<Book> items = basket.getItems();


        //Sort books by price acending
        items.sort(Comparator.comparingDouble(Book::getPrice));

        double discount = 0;

        // Every 2 books => 1 free (the cheapest)
        int pairs = items.size() / 2;
        for (int i = 0; i < pairs; i++) {
            discount -= items.get(i).getPrice();
        }

        return discount;
    }

}
