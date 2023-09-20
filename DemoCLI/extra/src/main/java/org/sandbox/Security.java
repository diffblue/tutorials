package org.sandbox;

import sun.misc.Unsafe;
import java.lang.reflect.Field;

public class Security {

    public int getPageSize() throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        return unsafe.pageSize();
    }
}
