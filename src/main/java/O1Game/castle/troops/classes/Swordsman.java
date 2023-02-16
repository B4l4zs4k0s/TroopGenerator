package O1Game.castle.troops.classes;

import O1Game.castle.troops.Troop;

public class Swordsman extends Troop {

    @Override
    public Troop copy() {
        return new Swordsman();
    }

    @Override
    public void battleShout() {
        System.out.println("My sword shall purge their souls.");
    }
}

