package conditions;

public class NumberProcessor {
    public static int processNumber(String str1 /* Context #5 */) {
        try {
            return Integer.parseInt(str1);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + str1);
        }
    }
}
