package org.alihmzyv.chapter1.simuduck.behaviours.impl;

import org.alihmzyv.chapter1.simuduck.behaviours.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void performQuack() {
        System.out.println("Quacking");
    }
}
