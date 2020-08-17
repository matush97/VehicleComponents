package sk.stuba.fei.skuska.ot.components;


public  class Component {
    protected int id;
    protected String name;

    public Component(int id, String name) {
        setId(id);
        setName(name);
    }

    public Component(){}
    //Gettre a Settre
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
