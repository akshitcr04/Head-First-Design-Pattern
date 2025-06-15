package Decorator_Pattern.CondimentDecorator;

import Decorator_Pattern.Beverages.Beverage;

public class Soy extends Decorator{
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Soy Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
