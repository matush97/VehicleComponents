package sk.stuba.fei.skuska.ot.combatvehicle.tracked;

import sk.stuba.fei.skuska.ot.combatvehicle.CombatVehicles;
import sk.stuba.fei.skuska.ot.combatvehicle.Nationality;
import sk.stuba.fei.skuska.ot.components.chassis.TrackedChassis;

public abstract class CombatVehiclesTracked extends CombatVehicles {
    protected  TrackedChassis trackedChassis;

    public CombatVehiclesTracked(long id, String name, Nationality nationality, int prize, TrackedChassis trackedChassis) {
        super(id, name, nationality, prize);
        setTrackedChassis(trackedChassis);
    }

    public TrackedChassis getTrackedChassis() {
        return trackedChassis;
    }

    public void setTrackedChassis(TrackedChassis trackedChassis) {
        this.trackedChassis = trackedChassis;
    }
}
