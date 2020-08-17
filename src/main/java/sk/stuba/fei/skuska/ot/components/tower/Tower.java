package sk.stuba.fei.skuska.ot.components.tower;


import sk.stuba.fei.skuska.ot.components.Component;

public  abstract  class Tower extends Component {
    protected int rotationSpeed; //rychlost otacania
    protected int oversight; //dohľad

    public Tower(int id, String name, int rotationSpeed, int oversight) {
        super(id, name);
        setRotationSpeed(rotationSpeed);
        setOversight(oversight);
    }

    //Gettre a Settre
    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getOversight() {
        return oversight;
    }

    public void setOversight(int oversight) {
        this.oversight = oversight;
    }
}
