package Decorator_Pattern.Beverages;

public class DarkRoast extends Beverage{
    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
