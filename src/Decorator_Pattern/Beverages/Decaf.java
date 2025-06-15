package Decorator_Pattern.Beverages;

public class Decaf extends Beverage{
    @Override
    public String getDescription() {
        return "Decaf coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
