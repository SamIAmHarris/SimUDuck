package behavior.impl;

import behavior.FlyBehavior;

/**
 * Created by SamMyxer on 6/16/16.
 */
public class FlyNoWayImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
