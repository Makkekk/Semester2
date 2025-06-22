package opgave02StrategyPattern;

import opgave02StrategyPattern.models.Customer;
import opgave02StrategyPattern.models.Order;
import opgave02StrategyPattern.models.products.Beer;
import opgave02StrategyPattern.models.products.PepsiMax;

public class Opgave02 {
    public static void main(String[] args) {
        Customer studentCustomer = new Customer(new StudentBillingStrategy());
        studentCustomer.placeOrder(new Order(2, new Beer()));
        studentCustomer.placeOrder(new Order(1, new PepsiMax()));
        studentCustomer.placeOrder(new Order(3, new Beer()));
        studentCustomer.getBarTab().Print();

        Customer employeeCustomer = new Customer(new EmployeeBillingStrategy());
        employeeCustomer.placeOrder(new Order(1, new Beer()));
        employeeCustomer.placeOrder(new Order(1, new PepsiMax()));
        employeeCustomer.getBarTab().Print();
    }
}