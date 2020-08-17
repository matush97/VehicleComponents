package sk.stuba.fei.skuska.ot.components.cannon;

public class SmallCannon extends Cannon {
    private int numberOfRounds; //počet nábojov v zásobníku

    public SmallCannon(int id, String name, int caliber, int cadence, int dispersionAt100M, int numberOfRounds) {
        super(id, name, caliber, cadence, dispersionAt100M);
        setNumberOfRounds(numberOfRounds);
    }

    //Gettre a Settre
    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    @Override
    public String toString() {
        return "SmallCannon{" +
                "numberOfRounds=" + numberOfRounds +
                ", caliber=" + caliber +
                ", cadence=" + cadence +
                ", dispersionAt100M=" + dispersionAt100M +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
