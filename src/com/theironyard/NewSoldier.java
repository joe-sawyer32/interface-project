package com.theironyard;

/**
 * Created by Joe on 7/24/17.
 */
public class NewSoldier extends Soldier implements NewInterface1, NewInterface2{
    @Override
    public void identical() {
        System.out.println("This works");
    }

    @Override
    void speak() {
        System.out.println("Sir Yes Sir");
    }
}
