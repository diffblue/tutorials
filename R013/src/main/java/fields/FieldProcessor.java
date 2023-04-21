package fields;

public class FieldProcessor {

    private String name;

    public boolean isABC() {
        return name.equals("ABC");
    }

    public void setName(String name) {
        this.name = name;
    }

}