package Strategy_Pattern.Behaviour.Quacking;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
