package maps;
import java.util.HashMap;
import java.util.Map;

/* the String nameofBird constructor parameter IS listed in the
   DiffblueRules.yml so in the resulting test class CollectionOfBirdsDiffblueTest
   you have control on the values used to initialize Bird objects.
*/

public class CollectionOfBirds {

    private Map<Integer, Bird> birds = new HashMap<>();

    public void addToMap (int id, Bird b) {
        birds.put(id, b);
    }

    public void addToMap (ID id, Bird b) {
        birds.put(id.getId(), b);
    }

    public Bird readFromMap (int id) {
        return birds.get(id);
    }

    public CollectionOfBirds(int id, Bird b) {
        addToMap(id, b);
    }

    public CollectionOfBirds(ID id, Bird b) {
        addToMap(id, b);
    }
}
