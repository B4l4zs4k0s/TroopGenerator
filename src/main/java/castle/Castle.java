package castle;

import castle.troops.Soldier;
import castle.troops.SoldierFactory;

import java.util.ArrayList;
import java.util.List;

public class Castle {
    List<List<Soldier>> troopsOfTheArmy = new ArrayList<>();

    public void createATroop(int size){
        troopsOfTheArmy.add(SoldierFactory.getInstance().getTroopOfRandomSoldiers(size));
    }

    public List<List<Soldier>> returnArmy(){
        return troopsOfTheArmy;
    }
}
