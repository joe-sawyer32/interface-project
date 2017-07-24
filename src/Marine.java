/**
 * Created by Joe on 7/24/17.
 */
public class Marine extends Soldier implements HandToHandCombat, FirearmsCombat {

    public Marine(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    @Override
    public void kill() {
        System.out.println("*two in the chest, one in the head");
    }

    @Override
    public void bodyShot() {
        System.out.println("*flesh wound");
    }

    @Override
    public void strike() {
        System.out.println("*PISTOLWHIP!");
    }

    @Override
    public void punch() {
        System.out.println("*karate chop");
    }

    @Override
    public void block() {
        System.out.println("*deflects attack");
    }

    @Override
    public void specialMove() {
        System.out.println("*chokes out");
    }

    @Override
    void speak() {
        System.out.println("Oohrah!");
    }
}
