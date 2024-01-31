package org.alihmzyv.chapter1.simuduck;

import org.alihmzyv.chapter1.simuduck.behaviours.impl.FlyWithWings;
import org.alihmzyv.chapter1.simuduck.behaviours.impl.Squeak;
import org.alihmzyv.chapter1.simuduck.ducks.Duck;
import org.alihmzyv.chapter1.simuduck.ducks.RedHeadDuck;

public class Demo {
    public static void main(String[] args) {
        Duck redHeadDuck = new RedHeadDuck(new FlyWithWings(), new Squeak());
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
    }
}
