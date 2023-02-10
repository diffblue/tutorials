package vendor;

public class Service {

	// results in R006: Static initializer failed
    // due to IllegalArgumentException
    static IceCream ic = IceCream.valueOf("ORANGE");

    public static String getOrder() {
        String order = ic.toString() +
                ": " + ic.scoops + " scoops";
        return order;
    }
}
