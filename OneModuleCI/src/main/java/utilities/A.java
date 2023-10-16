package utilities;

import java.util.function.Function;

class A implements I {

    @Override
    public Integer doubleIt(Integer i) {
        return 2 * i;
    }
}
