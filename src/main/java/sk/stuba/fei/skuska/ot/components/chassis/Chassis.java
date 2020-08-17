package sk.stuba.fei.skuska.ot.components.chassis;


import sk.stuba.fei.skuska.ot.components.Component;

public abstract class Chassis extends Component {
    protected int deadCapacity; //nosnosť
    protected int rotationSpeed; //rýchlosť otáčania
    protected int maxSpeed; //maximálna rýchlosť

    public Chassis(int id, String name, int deadCapacity, int rotationSpeed, int maxSpeed) {
        super(id, name);
        setDeadCapacity(deadCapacity);
        setRotationSpeed(rotationSpeed);
        setMaxSpeed(maxSpeed);
    }

    //Gettre a Settre
    public int getDeadCapacity() {
        return deadCapacity;
    }

    public void setDeadCapacity(int deadCapacity) {
        this.deadCapacity = deadCapacity;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
