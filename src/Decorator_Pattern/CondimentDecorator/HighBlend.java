package Decorator_Pattern.CondimentDecorator;

import Decorator_Pattern.Beverages.Beverage;
import Decorator_Pattern.Beverages.Size;

public class HighBlend extends Decorator {
    Beverage beverage;

    public HighBlend(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", High Blend";
    }

    @Override
    public double cost() {
        double cost = beverage.cost() + 0.50;
        if (beverage.getSize() == Size.GRANDE) {
            cost += 0.10;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.20;
        } else {
            cost += 0.05;
        }
        return cost;
    }

    public Size getSize() {
        return beverage.getSize();
    }
}
