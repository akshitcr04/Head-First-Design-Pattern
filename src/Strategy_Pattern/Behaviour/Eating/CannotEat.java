package Strategy_Pattern.Behaviour.Eating;

public class CannotEat implements EatBehaviour{
    @Override
    public void eat() {
        System.out.println("I cannot eat as I am not real!!");
    }
}
