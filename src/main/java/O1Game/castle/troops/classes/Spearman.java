package O1Game.castle.troops.classes;

import O1Game.castle.troops.Troop;

public class Spearman extends Troop {
    @Override
    public Troop copy() {
        return new Spearman();
    }

    @Override
    public void battleShout() {
        System.out.println("I will pierce their heart!");
    }
}
