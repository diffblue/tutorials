package properties;

public class Property {
    public int propertyLength() {
        return System.getProperty("prop").length();
    }
}
