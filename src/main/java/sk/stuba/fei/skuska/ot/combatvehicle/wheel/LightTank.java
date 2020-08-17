package sk.stuba.fei.skuska.ot.combatvehicle.wheel;


import sk.stuba.fei.skuska.ot.combatvehicle.CombatVehicles;
import sk.stuba.fei.skuska.ot.combatvehicle.Nationality;
import sk.stuba.fei.skuska.ot.components.cannon.SmallCannon;
import sk.stuba.fei.skuska.ot.components.chassis.WheelChassis;

public class LightTank extends CombatVehicles {
    private WheelChassis wheelChassis;
    private SmallCannon smallCannon;

    public LightTank(long id, String name, Nationality nationality, int i, int prize, WheelChassis wheelChassis, SmallCannon smallCannon) {
        super(id, name, nationality, prize);
        setWheelChassis(wheelChassis);
        setSmallCannon(smallCannon);
    }

    //Gettre a Settre
    public WheelChassis getWheelChassis() {
        return wheelChassis;
    }

    public void setWheelChassis(WheelChassis wheelChassis) {
        this.wheelChassis = wheelChassis;
    }

    public SmallCannon getSmallCannon() {
        return smallCannon;
    }

    public void setSmallCannon(SmallCannon smallCannon) {
        this.smallCannon = smallCannon;
    }

    @Override
    public String toString() {
        return "LightTank{" +
                "wheelChassis=" + wheelChassis +
                ", smallCannon=" + smallCannon +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", nationality=" + nationality +
                ", prize=" + prize +
                '}';
    }
}
