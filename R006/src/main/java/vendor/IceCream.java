package vendor;

public enum IceCream {
    CHOCOLATE(2),
    LIME(3),
    VANILLA(1);

    public final int scoops;

    IceCream(int scoops) {
        this.scoops = scoops;
    }
}
