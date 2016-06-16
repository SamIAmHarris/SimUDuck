/**
 * Created by SamMyxer on 6/16/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new QuackImpl();
        flyBehavior = new FlyWithWingsImpl();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
