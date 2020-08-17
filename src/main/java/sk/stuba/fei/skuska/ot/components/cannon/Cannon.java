package sk.stuba.fei.skuska.ot.components.cannon;


import sk.stuba.fei.skuska.ot.components.Component;

public abstract class Cannon extends Component {
    protected int caliber; //kaliber
    protected int cadence; //kadencia
    protected int dispersionAt100M;  //rozptyl na 100m

    public Cannon(int id, String name, int caliber, int cadence, int dispersionAt100M) {
        super(id, name);
        setCaliber(caliber);
        setCadence(cadence);
        setDispersionAt100M(dispersionAt100M);
    }

    //Gettre a Settre
    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getDispersionAt100M() {
        return dispersionAt100M;
    }

    public void setDispersionAt100M(int dispersionAt100M) {
        this.dispersionAt100M = dispersionAt100M;
    }


}
