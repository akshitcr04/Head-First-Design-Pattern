package Decorator_Pattern.CondimentDecorator;

import Decorator_Pattern.Beverages.Beverage;

public class SteamedMilk extends Beverage {
    Beverage beverage;

    public void description() {
        System.out.println(beverage.getDescription() + ", Steamed Milk");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
