package opgave01.models.beverages;


public class DarkRoast extends Beverage {
    public DarkRoast() {
        description ="Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}