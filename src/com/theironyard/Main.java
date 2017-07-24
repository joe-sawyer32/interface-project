package com.theironyard;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("KNIGHT ACTIONS:");
        Knight knight = new Knight("Arthur", "king", 4);
        knight.eat();
        knight.sleep();
        knight.speak();
        knight.walk();
        knight.punch();
        knight.block();
        knight.specialMove();

        System.out.println("----------------------");
        System.out.println("MARINE ACTIONS:");
        Marine marine = new Marine("Dean", "sergeant", 0000001);
        marine.eat();
        marine.sleep();
        marine.speak();
        marine.walk();
        marine.punch();
        marine.block();
        marine.specialMove();
        marine.kill();
        marine.bodyShot();
        marine.strike();

        System.out.println("----------------------");
        System.out.println("MARKSMAN ACTIONS:");
        Marksman marksman = new Marksman("Hawkeye", "lieutenant", 12345);
        marksman.eat();
        marksman.sleep();
        marksman.speak();
        marksman.walk();
        marksman.kill();
        marksman.bodyShot();
        marksman.strike();
        marksman.shoot();

        System.out.println("----------------------");
        System.out.println("GRENADIER ACTIONS:");
        Grenadier grenadier = new Grenadier("Charley", "colonel", 84);
        grenadier.eat();
        grenadier.sleep();
        grenadier.speak();
        grenadier.walk();
        grenadier.punch();
        grenadier.block();
        grenadier.specialMove();
    }
}
