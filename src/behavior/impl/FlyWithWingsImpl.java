package behavior.impl;

import behavior.FlyBehavior;

/**
 * Created by SamMyxer on 6/16/16.
 */
public class FlyWithWingsImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
