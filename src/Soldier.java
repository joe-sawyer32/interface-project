/**
 * Created by Joe on 7/24/17.
 */
abstract class Soldier {
    protected String name;
    protected String rank;
    protected int serialNumber;



    void sleep() {
        System.out.println("zzzzz");
    }

    void eat() {
        System.out.println("nom nom nom");
    }

    void walk() {
        System.out.println("left, right, left");
    }

    abstract void speak();
}
