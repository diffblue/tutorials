package maps;

import java.util.HashMap;
import java.util.Map;

/* the int id and String name method parameters ARE NOT listed in the
   DiffblueRules.yml so the resulting test class NamesDiffblueTest
   is what you get by default.
*/

public class Names {

    private Map<Integer, String> names = new HashMap<>(5);


    public void addToMap (int id, String name) {
        names.put(id, name);
    }

    public String readFromMap (int id) {
        return names.get(id);
    }
}
