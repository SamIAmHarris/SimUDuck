package behavior.impl;

import behavior.QuackBehavior;

/**
 * Created by SamMyxer on 6/16/16.
 */
public class SqueakImpl implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
