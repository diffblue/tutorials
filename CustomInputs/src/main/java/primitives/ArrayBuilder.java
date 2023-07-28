package primitives;

public class ArrayBuilder {

    static String concatenate(String[] array) {
        String result = new String();
        for(String s : array)
            result += s;
        return result;
    }

    static String concatenate(StringBuilder[] array) {
        String result = new String();
        for(StringBuilder s : array)
            result += s.toString();
        return result;
    }
}
