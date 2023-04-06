package types;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private ID id;
    private Bird bird;
    private Map<Long, String> map = new HashMap<>();

    public Inventory(ID id, Bird b) {
        this.id = id;
        this.bird = b;
    }

    public void addToMap (ID id, Bird b) {
        map.put(id.getId(), b.getName());
    }

    public ID getId() {
        return id;
    }

    public Bird getBird() {
        return bird;
    }

    public Map<Long, String> getMap() {
        return map;
    }
}