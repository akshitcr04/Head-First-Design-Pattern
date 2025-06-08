package Strategy_Pattern.Ducks;

import Strategy_Pattern.Behaviour.Eating.CannotEat;
import Strategy_Pattern.Behaviour.Eating.EatBehaviour;
import Strategy_Pattern.Behaviour.Flying.FlyBehaviour;
import Strategy_Pattern.Behaviour.Flying.FlyNoWay;
import Strategy_Pattern.Behaviour.Quacking.MuteQuack;
import Strategy_Pattern.Behaviour.Quacking.QuackBehaviour;

public class WoodenDuck extends Duck{

    public WoodenDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, EatBehaviour eatBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.eatBehaviour = eatBehaviour;
    }

    @Override
    public void display() {
        System.out.println("This is a wooden Duck!!");
    }
}
