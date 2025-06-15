package Decorator_Pattern.Beverages;

public class Espresso extends Beverage{
    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
