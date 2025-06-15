package Decorator_Pattern.CondimentDecorator;

import Decorator_Pattern.Beverages.Beverage;

public abstract class Decorator extends Beverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();
}
