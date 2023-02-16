package O1Game.castle;

import O1Game.castle.troops.Troop;

import java.util.List;

public class Army {
    private List<Troop> troops;

    public Army(List<Troop> troops) {
        this.troops = troops;
    }

    public int getNumOfSoldiersOfTroops() {
        int numberOfSoldiers = 0;
        for (int i = 0; i < troops.size(); i++) {
            numberOfSoldiers += troops.get(i).getTroopSize();
        }
        return numberOfSoldiers;
    }
}
