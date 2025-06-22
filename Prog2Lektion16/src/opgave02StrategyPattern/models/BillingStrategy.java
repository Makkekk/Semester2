package opgave02StrategyPattern.models;

public interface BillingStrategy {
    int calculatePrice(Order order);
}

