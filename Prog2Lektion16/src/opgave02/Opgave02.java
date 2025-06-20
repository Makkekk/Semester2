package opgave02;

import opgave02.models.Billing;
import opgave02.models.Customer;
import opgave02.models.Order;
import opgave02.models.products.Beer;
import opgave02.models.products.PepsiMax;

public class Opgave02 {
    public static void main(String[] args) {
        Customer customer = new Customer(Billing.STUDENT);
        customer.placeOrder(new Order(2, new Beer()));
        customer.placeOrder(new Order(1, new PepsiMax()));
        customer.placeOrder(new Order(3, new Beer()));
        customer.getBarTab().Print();
    }
}