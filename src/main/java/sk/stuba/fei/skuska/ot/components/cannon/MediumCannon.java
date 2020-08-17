package sk.stuba.fei.skuska.ot.components.cannon;

public class MediumCannon  extends  Cannon{
    private int timeForFocus; //cas zameranie

    public MediumCannon(int id, String name, int caliber, int cadence, int dispersionAt100M,int timeForFocus) {
        super(id, name, caliber, cadence, dispersionAt100M);
        setTimeForFocus(timeForFocus);
    }

    public int getTimeForFocus() {
        return timeForFocus;
    }

    public void setTimeForFocus(int timeForFocus) {
        this.timeForFocus = timeForFocus;
    }

    @Override
    public String toString() {
        return "MediumCannon{" +
                "timeForFocus=" + timeForFocus +
                ", caliber=" + caliber +
                ", cadence=" + cadence +
                ", dispersionAt100M=" + dispersionAt100M +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
