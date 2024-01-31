package org.alihmzyv.chapter1.simuduck.ducks;

import org.alihmzyv.chapter1.simuduck.behaviours.FlyBehaviour;
import org.alihmzyv.chapter1.simuduck.behaviours.QuackBehaviour;
import org.alihmzyv.chapter1.simuduck.behaviours.impl.FlyNoWay;
import org.alihmzyv.chapter1.simuduck.behaviours.impl.MuteQuack;


public abstract class Duck {
    private FlyBehaviour flyBehaviour = new FlyNoWay(); //HAS-A fly behaviour
    private QuackBehaviour quackBehaviour = new MuteQuack();

    protected Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public Duck() {}

    public void swim() {
        System.out.println("Common swimming implementation running");
    }

    public abstract void display();

    public void performFly() {
        if (flyBehaviour != null) {
            flyBehaviour.performFly();
        }
    }

    public void performQuack() {
        if (quackBehaviour != null) {
            quackBehaviour.performQuack();
        }
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
