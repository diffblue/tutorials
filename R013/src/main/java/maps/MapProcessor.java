package maps;

import java.util.HashMap;

public class MapProcessor {
    enum Type {A, B, C}

    private static final HashMap<Integer, Type>
            TYPE_MAP = new HashMap<>();

    static {
        TYPE_MAP.put(1111, Type.A);
        TYPE_MAP.put(1212, Type.B);
        TYPE_MAP.put(1313, Type.C);
    }

    public String setType(int keyFromMap) {
        Type type = TYPE_MAP.get(keyFromMap-1);
        return type.toString();
    }
}