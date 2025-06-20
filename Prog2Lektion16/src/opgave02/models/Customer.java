package opgave02.models;

import opgave02.models.products.Beer;

public class Customer {
    private BarTab tab;
    private Billing billing;

    public Customer(Billing billing) {
        this.billing = billing;
        this.tab = new BarTab();
    }

    public void placeOrder(Order order) {
        int ajustedPrice = 0;
        switch (billing) {
            case Billing.NORMAL:
                ajustedPrice = CalculateNormalPrice(order);
                break;
            case Billing.STUDENT:
                ajustedPrice = CalculateStudentPrice(order);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + billing);
        }
        tab.addItem(new BarTabItem(order, ajustedPrice));
    }

    private int CalculateStudentPrice(Order order) {
        if (order.getProduct() instanceof Beer beer) {
            return order.getTotalPrice() - order.getCount() * 5;
        }
        return order.getTotalPrice();
    }

    private int CalculateNormalPrice(Order order) {
        return order.getTotalPrice();
    }

    public BarTab getBarTab() {
        return tab;
    }
}