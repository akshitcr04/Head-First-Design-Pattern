package Decorator_Pattern.CondimentDecorator;

import Decorator_Pattern.Beverages.Beverage;

public class Mocha extends Decorator{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha is add on";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.99;
    }
}
