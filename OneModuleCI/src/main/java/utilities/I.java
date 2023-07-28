package utilities;

import java.util.function.Function;

interface I {
    int MAX_VAL = 2;
    Function<Integer, Integer> getFunction();
    Integer operation(Integer i);

}