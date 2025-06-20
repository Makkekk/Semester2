package Opgave2.models;

public class Discount {
        private final String description;
        private final int procentDiscount;
        private final int fixedDiscount;
        private final int minimumAmount;
        private final DiscountType discountType;

        public Discount( String description, int procentDiscount, int fixedDiscount, int minimumAmount, DiscountType discountType) {
            this.description = description;
            this.procentDiscount = procentDiscount;
            this.fixedDiscount = fixedDiscount;
            this.minimumAmount = minimumAmount;
            this.discountType = discountType;
        }

        public String getDescription() {
            return description;
        }

        public double applyDiscount(double amount) {
            switch (discountType) {
                case DiscountType.FIXED ->
                {
                    if (amount >= minimumAmount) {
                        return fixedDiscount;
                    } else {
                        return 0;
                    }
                }
                case DiscountType.PROCENT -> {
                    return amount * procentDiscount / 100;
                }
                default -> throw new IllegalArgumentException("Unknown discount type");
            }
        }
    }
