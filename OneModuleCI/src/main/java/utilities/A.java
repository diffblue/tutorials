package utilities;

import java.util.function.Function;

class A implements I {
    @Override
    public Function<Integer, Integer> getFunction() {
        return i -> i + 12;
    }

    @Override
    public Integer operation(Integer i) {
        return i + 2;
    }
}
