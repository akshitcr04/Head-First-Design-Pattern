package Strategy_Pattern.Behaviour.Quacking;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeaking sound!!");
    }
}
