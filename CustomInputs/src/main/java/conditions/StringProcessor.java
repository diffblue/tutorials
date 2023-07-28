package conditions;

public class StringProcessor {
    public static int parse(String text /* Context #1 */) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + text);
        }
    }
    public static String concatenateStrings(String str1 /* Context #2 */, String str2 /* Context #3 */) {
        return str1 + str2;
    }
    public static int getStringLength(String str1 /* Context #4 */) {
        return str1.length();
    }
}