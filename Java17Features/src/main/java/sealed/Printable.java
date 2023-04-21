package sealed;

public sealed interface Printable permits Letter, Report, Writable {
    String N = "99";

    private String getNumber() {
        return N;
    };

    default int print(int h) {
        String str = time(h).concat(getNumber());
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.getMessage();
            return 0;
        }
    }

    private static String time(int h) {
        StringBuilder sb = new StringBuilder(Integer.toString(h));
        return sb.toString();
    }

    int date();
}
