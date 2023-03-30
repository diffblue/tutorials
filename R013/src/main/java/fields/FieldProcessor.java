package fields;

public class FieldProcessor {

    private String name;

    public FieldProcessor(String name) {
        this.name = name;
    }

    public boolean isNameABC() {
        return name.equals("ABC");
    }


}
