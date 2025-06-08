package Strategy_Pattern.Behaviour.Quacking;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Strategy_Pattern.Behaviour.Quack!!");
    }
}
