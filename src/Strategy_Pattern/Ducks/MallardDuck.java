package Strategy_Pattern.Ducks;

import Strategy_Pattern.Behaviour.Eating.EatBehaviour;
import Strategy_Pattern.Behaviour.Flying.FlyBehaviour;
import Strategy_Pattern.Behaviour.Quacking.QuackBehaviour;

public class MallardDuck extends Duck{

    public MallardDuck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour, EatBehaviour eatBehaviour){
        setQuackBehaviour(quackBehaviour);
        setFlyBehaviour(flyBehaviour);
        setEatBehaviour(eatBehaviour);
    }



    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck!!");
    }
}
