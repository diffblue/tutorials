package before;

public class Relay {

    static boolean gateOpen;

    public static void open() {
        gateOpen = true;
    }

    public static String broadcast(String s) {
        if(gateOpen)
            return "Text: " + s;
        else
            return null;
    }
}
