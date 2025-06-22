package Opgave2.models;

public abstract class Discount {
        private final String description;


        public Discount( String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    /**
     * Apply discount based on the total price and/or basket contents.
     * Return the discount amount (as a negative number or zero).
     */
        public abstract double applyDiscount(double price, Basket basket);
        }

