package O1Game.castle.troops;

import O1Game.castle.Army;
import O1Game.castle.troops.classes.Archer;
import O1Game.castle.troops.classes.Spearman;
import O1Game.castle.troops.classes.Swordsman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TroopFactory {
    private static TroopFactory INSTANCE;
    List<Troop> troopSamples;

    private TroopFactory() {
        troopSamples = new ArrayList<>();
        troopSamples.add(new Archer());
        troopSamples.add(new Swordsman());
        troopSamples.add(new Spearman());
    }

    public static TroopFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TroopFactory();
        }
        return INSTANCE;
    }

    public Army getRandomArmy(int armySize) {
        List<Troop> troops = new ArrayList<>();

        for (Troop troop : troopSamples) {
            troops.add(troop.copy());
        }

        List<Integer> troopSizes = divideIntIntoNRandomIntegers(armySize);

        for (int i = 0; i < troops.size(); i++) {
            troops.get(i).setTroopSize(troopSizes.get(i));
        }

        return new Army(troops);
    }

    public List<Integer> divideIntIntoNRandomIntegers(int number) {
        Random random = new Random();
        List<Integer> divisions = new ArrayList<>();


        for (int i = 0; i < troopSamples.size() - 1; i++) {
            int countBack = troopSamples.size() - (i + 1);
            int minDivision = (number - countBack) / (countBack + 1);
            int maxDivision = Math.min(number - countBack, minDivision * 2);
            int division = minDivision + random.nextInt(maxDivision - minDivision + 1);
            divisions.add(division);
            number -= division;
        }

        divisions.add(Math.max(1,number));
        Collections.shuffle(divisions, random);
        return divisions;
    }
}
