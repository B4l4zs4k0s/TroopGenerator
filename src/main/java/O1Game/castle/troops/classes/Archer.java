package O1Game.castle.troops.classes;

import O1Game.castle.troops.Troop;

public class Archer extends Troop {


    @Override
    public Troop copy() {
        return new Archer();
    }

    @Override
    public void battleShout() {
        System.out.println("The gods will guide my arrows.");
    }
}
