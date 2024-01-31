package org.alihmzyv.chapter1.simuduck.ducks;

import org.alihmzyv.chapter1.simuduck.behaviours.FlyBehaviour;
import org.alihmzyv.chapter1.simuduck.behaviours.QuackBehaviour;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Head duck");
    }
}
