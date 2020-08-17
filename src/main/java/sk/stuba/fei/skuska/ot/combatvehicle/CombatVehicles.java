package sk.stuba.fei.skuska.ot.combatvehicle;

public   class CombatVehicles {
    protected long id;
    protected String name;
    protected Nationality nationality;
    protected int prize;

    public CombatVehicles() {
    }

    public CombatVehicles(long id, String name, Nationality nationality, int prize) {
        setId(id);
        setName(name);
        setNationality(nationality);
        setPrize(prize);
    }



    //Gettre a Settre
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "CombatVehicles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality=" + nationality +
                ", prize=" + prize +
                '}';
    }
}
