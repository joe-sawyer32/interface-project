package com.theironyard;

/**
 * Created by Joe on 7/24/17.
 */
public interface FirearmsCombat {
    void kill();

    void bodyShot();

    void strike();

    default void shoot() {
        System.out.println("*bang bang bang");
    }
}
