package after;

public class StringUtility {
    static public String cache;

    public String combination(String extra) {
        if (cache == null) {
            cache = "C ";
        }
        return cache + extra;
    }

    public String subbing(int len) {
        if (cache == null) {
            cache = "S ";
        }
        return cache.substring(len);
    }
}