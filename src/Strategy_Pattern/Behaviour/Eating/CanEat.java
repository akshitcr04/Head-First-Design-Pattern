package Strategy_Pattern.Behaviour.Eating;

public class CanEat implements EatBehaviour{

    @Override
    public void eat() {
        System.out.println("I can eat real food!!");
    }
}
