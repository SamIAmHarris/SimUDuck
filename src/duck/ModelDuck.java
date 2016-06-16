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
        System.out.println(
                "For I am just a model duck, leave me to my model ways");
    }
}
