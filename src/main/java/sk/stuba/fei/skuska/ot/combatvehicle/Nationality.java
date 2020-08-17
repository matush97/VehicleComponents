package sk.stuba.fei.skuska.ot.combatvehicle;

public enum Nationality {
    USA(1),
    ZSSR(2),
    GERMANY(3),
    GREAT_BRITAIN(4);

    private int value;

    Nationality(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
