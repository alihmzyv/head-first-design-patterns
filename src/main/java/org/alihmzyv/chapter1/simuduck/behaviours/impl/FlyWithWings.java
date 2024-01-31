package org.alihmzyv.chapter1.simuduck.behaviours.impl;

import org.alihmzyv.chapter1.simuduck.behaviours.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void performFly() {
        System.out.println("I'm flying with wings");
    }
}
