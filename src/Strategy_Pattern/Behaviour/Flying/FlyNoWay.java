package Strategy_Pattern.Behaviour.Flying;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("We can't fly!!");
    }
}
