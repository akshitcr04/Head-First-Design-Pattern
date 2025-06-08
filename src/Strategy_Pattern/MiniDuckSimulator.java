package Strategy_Pattern;

import Strategy_Pattern.Behaviour.Eating.CanEat;
import Strategy_Pattern.Behaviour.Eating.CannotEat;
import Strategy_Pattern.Behaviour.Flying.FlyNoWay;
import Strategy_Pattern.Behaviour.Flying.FlyWithWings;
import Strategy_Pattern.Behaviour.Flying.RocketFuelFly;
import Strategy_Pattern.Behaviour.Quacking.Squeak;
import Strategy_Pattern.Ducks.Duck;
import Strategy_Pattern.Ducks.MallardDuck;
import Strategy_Pattern.Ducks.WoodenDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new Squeak(), new FlyWithWings(), new CanEat());
        mallardDuck.performFly();
        mallardDuck.display();
        mallardDuck.swim();

        System.out.println("--------------------------------------------------------------");

        Duck woodenDuck = new WoodenDuck(new FlyNoWay(), new Squeak(), new CannotEat());
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.performEating();
        woodenDuck.display();

        woodenDuck.setFlyBehaviour(new RocketFuelFly()); //adding setter now i can dynamically change behaviour
        woodenDuck.setQuackBehaviour(new Squeak());
        woodenDuck.performFly();
        woodenDuck.performQuack();


    }
}