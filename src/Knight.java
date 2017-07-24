/**
 * Created by Joe on 7/24/17.
 */
public class Knight extends Soldier implements HandToHandCombat {
    @Override
    public void punch() {
        System.out.println("*takes off glove, slaps in face");
    }

    @Override
    public void block() {
        System.out.println("*shields up");
    }

    @Override
    public void specialMove() {
        System.out.println("*off with your head");
    }

    @Override
    void speak() {
        System.out.println("For king and county");
    }
}
