package sk.stuba.fei.skuska.ot.components.chassis;

public class TrackedChassis  extends Chassis {
    //Pásový podvozok
    private int beltWidth;  //šírka pásu

    public TrackedChassis(int id, String name, int deadCapacity, int rotationSpeed, int maxSpeed, int beltWidth) {
        super(id, name, deadCapacity, rotationSpeed, maxSpeed);
        setBeltWidth(beltWidth);
    }

    //Gettre a Settre
    public int getBeltWidth() {
        return beltWidth;
    }

    public void setBeltWidth(int beltWidth) {
        this.beltWidth = beltWidth;
    }

    @Override
    public String toString() {
        return "TrackedChassis{" +
                "beltWidth=" + beltWidth +
                ", deadCapacity=" + deadCapacity +
                ", rotationSpeed=" + rotationSpeed +
                ", maxSpeed=" + maxSpeed +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
