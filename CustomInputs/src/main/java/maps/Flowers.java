package maps;

import java.util.HashMap;
import java.util.Map;

/* the float weight and String flower method parameters ARE listed in the
   DiffblueRules.yml so in the resulting test class FlowerDiffblueTest
   you have control on the values used.
*/

public class Flowers {

    private Map<Float, String> names = new HashMap<>();


    public void addToMap (float height, String flower) {
        names.put(height, flower);
    }

    public String readFromMap (float height) {
        return names.get(height);
    }
}
