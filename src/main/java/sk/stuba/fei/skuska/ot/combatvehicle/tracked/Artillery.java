package sk.stuba.fei.skuska.ot.combatvehicle.tracked;


import lombok.NoArgsConstructor;
import sk.stuba.fei.skuska.ot.combatvehicle.Nationality;
import sk.stuba.fei.skuska.ot.components.cannon.LargeCannon;
import sk.stuba.fei.skuska.ot.components.chassis.TrackedChassis;


public class Artillery extends CombatVehiclesTracked {
    private LargeCannon largeCannon;


    public Artillery(long id, String name, Nationality nationality, int prize, TrackedChassis trackedChassis, LargeCannon largeCannon) {
        super(id, name, nationality, prize, trackedChassis);
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
        return "Artillery{" +
                "trackedChassis=" + trackedChassis +
                ", largeCannon=" + largeCannon +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", nationality=" + nationality +
                ", prize=" + prize +
                '}';
    }


}
