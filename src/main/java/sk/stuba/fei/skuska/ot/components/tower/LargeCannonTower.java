package sk.stuba.fei.skuska.ot.components.tower;


import sk.stuba.fei.skuska.ot.components.cannon.LargeCannon;

public class LargeCannonTower extends Tower {
    private LargeCannon largeCannon;

    public LargeCannonTower(int id, String name, int rotationSpeed, int oversight, LargeCannon largeCannon) {
        super(id, name, rotationSpeed, oversight);
        setLargeCannon(largeCannon);
    }

    //Gettre a Settre
    public LargeCannon getLargeCannon() {
        return largeCannon;
    }

    public void setLargeCannon(LargeCannon largeCannon) {
        this.largeCannon = largeCannon;
    }

    @Override
    public String toString() {
        return "LargeCannonTower{" +
                "largeCannon=" + largeCannon +
                ", rotationSpeed=" + rotationSpeed +
                ", oversight=" + oversight +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
