package com.theironyard;

/**
 * Created by Joe on 7/24/17.
 */
public class Grenadier extends Soldier implements DemolitionCombat {

    public Grenadier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    @Override
    public void punch() {
        System.out.println("*uppercut");
    }

    @Override
    public void block() {
        System.out.println("*block");
    }

    @Override
    public void specialMove() {
        blowUp();
    }

    @Override
    public void blowUp() {
        Bomb bomb = new Bomb();
        System.out.println(bomb);
    }

    @Override
    void speak() {
        System.out.println("A little C4, knocking at your door");
    }
}
