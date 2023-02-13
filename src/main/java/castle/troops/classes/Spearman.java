package castle.troops.classes;

import castle.troops.Soldier;

public class Spearman extends Soldier {
    @Override
    public Soldier copy() {
        return new Spearman();
    }

    @Override
    public void battleShout() {
        System.out.println("I will pierce their heart!");
    }
}
