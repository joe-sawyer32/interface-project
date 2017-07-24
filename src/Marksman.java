/**
 * Created by Joe on 7/24/17.
 */
public class Marksman extends Soldier implements FirearmsCombat {
    @Override
    public void kill() {
        System.out.println("*headshot");
    }

    @Override
    public void bodyShot() {
        System.out.println("*flesh wound");
    }

    @Override
    public void strike() {
        System.out.println("*stabs");
    }

    @Override
    void speak() {
        System.out.println("Show me the target");
    }
}
