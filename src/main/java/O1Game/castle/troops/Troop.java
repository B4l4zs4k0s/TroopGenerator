package O1Game.castle.troops;

public abstract class  Troop {
    private int troopSize;

    public abstract Troop copy();
    public abstract void battleShout();

    public int getTroopSize() {
        return troopSize;
    }

    public void setTroopSize(int troopSize) {
        this.troopSize = troopSize;
    }
}
