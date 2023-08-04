package utilities;

import java.util.function.Function;

class B implements I {
    @Override
    public Function<Integer, Integer> getFunction() {
        return i -> i * 5;
    }

    @Override
    public Integer operation(Integer i) {
        return i * 10;
    }
}