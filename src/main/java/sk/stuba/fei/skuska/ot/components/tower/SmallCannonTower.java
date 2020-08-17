package sk.stuba.fei.skuska.ot.components.tower;


import sk.stuba.fei.skuska.ot.components.cannon.SmallCannon;

public class SmallCannonTower extends Tower {
    private SmallCannon smallCannon;

    public SmallCannonTower(int id, String name, int rotationSpeed, int oversight, SmallCannon smallCannon) {
        super(id, name, rotationSpeed, oversight);
        setSmallCannon(smallCannon);
    }

    //Gettre a Settre
    public SmallCannon getSmallCannon() {
        return smallCannon;
    }

    public void setSmallCannon(SmallCannon smallCannon) {
        this.smallCannon = smallCannon;
    }

    @Override
    public String toString() {

        return "SmallCannonTower{" +
                "smallCannon=" + smallCannon +
                ", rotationSpeed=" + rotationSpeed +
                ", oversight=" + oversight +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
