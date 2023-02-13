package castle.troops;

import castle.troops.classes.Archer;
import castle.troops.classes.Spearman;
import castle.troops.classes.Swordsman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SoldierFactory {
    private static SoldierFactory INSTANCE;
    List<Soldier> listOfSoldiers;


    private SoldierFactory() {
        listOfSoldiers = new ArrayList<>();
        listOfSoldiers.add(new Archer());
        listOfSoldiers.add(new Swordsman());
        listOfSoldiers.add(new Spearman());
    }

    public static SoldierFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SoldierFactory();
        }
        return INSTANCE;
    }

    public Soldier getRandomSoldier() {
        Random random = new Random();
        Soldier soldier = listOfSoldiers.get(random.nextInt(listOfSoldiers.size()));
        return soldier.copy();
    }

    public List<Soldier> getTroopOfRandomSoldiers(int troopSize) {
        List<Soldier> troop = new ArrayList<>();

        //if the troop size is less than class of soldiers available.
        int temp = Math.min(listOfSoldiers.size(), troopSize);
        //shuffles the list, so it won't always be the first two elements of the list.
        Collections.shuffle(listOfSoldiers);

        for (int i = 0; i < temp; i++) {
            troop.add(listOfSoldiers.get(i).copy());
        }
        for (int i = 0; i < troopSize - listOfSoldiers.size(); i++) {
            troop.add(getRandomSoldier());
        }
        return troop;
    }

    public List<Soldier> returnListOfSoldiers() {
        return listOfSoldiers;
    }
}
