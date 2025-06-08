package Strategy_Pattern.Ducks;

import Strategy_Pattern.Behaviour.Eating.EatBehaviour;
import Strategy_Pattern.Behaviour.Flying.FlyBehaviour;
import Strategy_Pattern.Behaviour.Quacking.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    EatBehaviour eatBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performEating() { eatBehaviour.eat(); }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setEatBehaviour(EatBehaviour eatBehaviour) { this.eatBehaviour = eatBehaviour; }

    public void swim() {
        System.out.println("All ducks float real or fake!!");
    }
}
