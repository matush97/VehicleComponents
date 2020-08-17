package sk.stuba.fei.skuska.ot.components.cannon;

public class LargeCannon  extends Cannon {
    private int explosionRadius;

    public LargeCannon(int id, String name, int caliber, int cadence, int dispersionAt100M, int explosionRadius) {
        super(id, name, caliber, cadence, dispersionAt100M);
        setExplosionRadius(explosionRadius);
    }

    //Gettre a Settre
    public int getExplosionRadius() {
        return explosionRadius;
    }

    public void setExplosionRadius(int explosionRadius) {
        this.explosionRadius = explosionRadius;
    }

    @Override
    public String toString() {
        return "LargeCannon{" +
                "explosionRadius=" + explosionRadius +
                ", caliber=" + caliber +
                ", cadence=" + cadence +
                ", dispersionAt100M=" + dispersionAt100M +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
