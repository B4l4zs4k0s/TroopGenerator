package OnGame.castle.troops.classes;

import OnGame.castle.troops.Soldier;

public class Archer extends Soldier {


    @Override
    public Soldier copy() {
        return new Archer();
    }

    @Override
    public void battleShout() {
        System.out.println("The gods will guide my arrows.");
    }
}
