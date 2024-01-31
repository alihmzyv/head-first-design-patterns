package org.alihmzyv.chapter1.simuduck.ducks;

import org.alihmzyv.chapter1.simuduck.behaviours.FlyBehaviour;
import org.alihmzyv.chapter1.simuduck.behaviours.QuackBehaviour;

public class MallardDuck extends Duck { //IS-A Duck
    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
