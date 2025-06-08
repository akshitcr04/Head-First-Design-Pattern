package Strategy_Pattern.Behaviour.Flying;

public class RocketFuelFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Now with this even non flying duck is flying!");
    }
}
