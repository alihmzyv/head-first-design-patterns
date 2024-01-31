package org.alihmzyv.chapter1.simuduck.behaviours.impl;

import org.alihmzyv.chapter1.simuduck.behaviours.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void performQuack() {
        System.out.println("Warning: not quacking (mute)");
    }
}
