package sk.stuba.fei.skuska.ot.combatvehicle.tracked;

import sk.stuba.fei.skuska.ot.combatvehicle.Nationality;
import sk.stuba.fei.skuska.ot.components.chassis.TrackedChassis;
import sk.stuba.fei.skuska.ot.components.tower.MediumCannonTower;

public class TankDestroyer  extends CombatVehiclesTracked {
    private MediumCannonTower mediumCannonTower;

    public TankDestroyer(long id, String name, Nationality nationality, int prize, TrackedChassis trackedChassis, MediumCannonTower mediumCannonTower) {
        super(id, name, nationality, prize, trackedChassis);
        setMediumCannonTower(mediumCannonTower);
    }

    //Gettre a Settre
    public MediumCannonTower getMediumCannonTower() {
        return mediumCannonTower;
    }

    public void setMediumCannonTower(MediumCannonTower mediumCannonTower) {
        this.mediumCannonTower = mediumCannonTower;
    }

    @Override
    public String toString() {
        return "TankDestroyer{" +
                "mediumCannonTower=" + mediumCannonTower +
                ", trackedChassis=" + trackedChassis +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", nationality=" + nationality +
                ", prize=" + prize +
                '}';
    }
}
