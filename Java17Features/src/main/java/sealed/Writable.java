package sealed;

public non-sealed interface Writable extends Printable {

    static String s1 = "1";
    static String s2 = Printable.N;

    default int print() {
        try {
            return Integer.parseInt(s1) + Integer.parseInt(s2) ;
        } catch (NumberFormatException e) {
            e.getMessage();
            return 0;
        }
    }
}
