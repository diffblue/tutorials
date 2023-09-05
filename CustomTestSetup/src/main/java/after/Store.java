package after;

public class Store {

    static String dataStore;

    public static String getCombined(String str) {
        dataStore = "abc";
        return dataStore + str;
    }
}