package utilities;

import java.util.function.Function;

class A implements I {
    @Override
    public Function<Integer, Integer> getFunction() {
        return i -> 5 * i;
    }

    @Override
    public Integer operation(Integer i) {
        return i + 5;
    }
}
