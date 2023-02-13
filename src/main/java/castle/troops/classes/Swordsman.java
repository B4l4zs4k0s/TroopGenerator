package castle.troops.classes;

import castle.troops.Soldier;

public class Swordsman extends Soldier {

    @Override
    public Soldier copy() {
        return new Swordsman();
    }

    @Override
    public void battleShout() {
        System.out.println("My sword shall purge their souls.");
    }
}

