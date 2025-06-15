package Decorator_Pattern;

import Decorator_Pattern.Beverages.Beverage;
import Decorator_Pattern.Beverages.DarkRoast;
import Decorator_Pattern.Beverages.Espresso;
import Decorator_Pattern.CondimentDecorator.Mocha;
import Decorator_Pattern.CondimentDecorator.Soy;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
    }
}
