package sk.stuba.fei.skuska.ot.components.chassis;

public class WheelChassis extends Chassis {
    //Kolesový podvozok
    private int numberOfWheels; //pocet kolies

    public WheelChassis(int id, String name, int deadCapacity, int rotationSpeed, int maxSpeed, int numberOfWheels) {
        super(id, name, deadCapacity, rotationSpeed, maxSpeed);
        setNumberOfWheels(numberOfWheels);
    }

    //Gettre a Settre
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "WheelChassis{" +
                "numberOfWheels=" + numberOfWheels +
                ", deadCapacity=" + deadCapacity +
                ", rotationSpeed=" + rotationSpeed +
                ", maxSpeed=" + maxSpeed +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
