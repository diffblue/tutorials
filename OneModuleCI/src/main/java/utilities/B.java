package utilities;

import java.util.function.Function;

class B implements I {
    @Override
    public Function<Integer, Integer> getFunction() {
        return i -> 2*i;
    }

    @Override
    public Integer operation(Integer i) {
        return i+7;
    }
}