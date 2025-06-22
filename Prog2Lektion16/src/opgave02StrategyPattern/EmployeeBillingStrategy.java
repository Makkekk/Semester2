package opgave02StrategyPattern;

import opgave02StrategyPattern.models.BillingStrategy;
import opgave02StrategyPattern.models.Order;

public class EmployeeBillingStrategy implements BillingStrategy {
    @Override
    public int calculatePrice(Order order) {
        // 10% rabat på alt
        return (int) (order.getTotalPrice() * 0.9);
    }
}