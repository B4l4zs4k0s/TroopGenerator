package O1Game.castle;

import O1Game.castle.troops.TroopFactory;

import java.util.ArrayList;
import java.util.List;

public class Castle {
    private final List<Army> troopsOfTheArmy = new ArrayList<>();

    public void addTroopToCastleArmy(int size) {
        troopsOfTheArmy.add(TroopFactory.getInstance().getRandomArmy(size));
    }

    public void printContentsOfArmy() {
        int troopSum = 0;
        int soldiersSum = 0;
        for (int i = 0; i < troopsOfTheArmy.size(); i++) {
            troopSum++;
            soldiersSum += troopsOfTheArmy.get(i).getNumOfSoldiersOfTroops();
        }
        System.out.println("There are " + troopSum + " troops in your army with " + soldiersSum);
    }
}
