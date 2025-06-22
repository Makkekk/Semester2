package opgave02StrategyPattern.models;


import opgave02StrategyPattern.models.products.Product;

public class Order {
    private int count;
    private Product product;

    public Order(int count, Product product) {
        this.count = count;
        this.product = product;
    }

    public int getTotalPrice() {
        return count * product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}