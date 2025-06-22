package opgave02StrategyPattern;

import opgave02StrategyPattern.models.BillingStrategy;
import opgave02StrategyPattern.models.Order;

public class NormalBillingStrategy implements BillingStrategy {
    @Override
    public int calculatePrice(Order order) {
        return order.getTotalPrice();
    }
}
