package opgave02StrategyPattern;

import opgave02StrategyPattern.models.BillingStrategy;
import opgave02StrategyPattern.models.Order;
import opgave02StrategyPattern.models.products.Beer;

public class StudentBillingStrategy implements BillingStrategy {
    @Override
    public int calculatePrice(Order order) {
        if (order.getProduct() instanceof Beer) {
            return order.getTotalPrice() - order.getCount() * 5;
        }
        return order.getTotalPrice();
    }
}
