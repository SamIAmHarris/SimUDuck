package duck;

import behavior.impl.FlyNoWayImpl;
import behavior.impl.QuackImpl;

/**
 * Created by SamMyxer on 6/16/16.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWayImpl();
        quackBehavior = new QuackImpl();
    }

    @Override
    public void display() {

    }
}
