package sk.stuba.fei.skuska.ot.components.tower;

import sk.stuba.fei.skuska.ot.components.cannon.MediumCannon;

public class MediumCannonTower  extends Tower{
    private MediumCannon mediumCannon;


    public MediumCannonTower(int id, String name, int rotationSpeed, int oversight,MediumCannon mediumCannon) {
        super(id, name, rotationSpeed, oversight);
        setMediumCannon(mediumCannon);
    }

    //Gettre a Settre
    public MediumCannon getMediumCannon() {
        return mediumCannon;
    }

    public void setMediumCannon(MediumCannon mediumCannon) {
        this.mediumCannon = mediumCannon;
    }
}
