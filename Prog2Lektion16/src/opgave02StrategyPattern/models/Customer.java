package opgave02StrategyPattern.models;

public class Customer {
    private BarTab tab;
    private BillingStrategy billingStrategy;

    public Customer(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
        this.tab = new BarTab();
    }

    public void placeOrder(Order order) {
        int adjustedPrice = billingStrategy.calculatePrice(order);
        tab.addItem(new BarTabItem(order, adjustedPrice));
    }

    public BarTab getBarTab() {
        return tab;
    }
}