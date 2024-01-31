package org.alihmzyv.chapter1.simuduck.behaviours.impl;

import org.alihmzyv.chapter1.simuduck.behaviours.FlyBehaviour;

public class FlyRockerPowered implements FlyBehaviour {
    @Override
    public void performFly() {
        System.out.println("Flying with rocket power");
    }
}
