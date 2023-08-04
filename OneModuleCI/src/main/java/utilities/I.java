package utilities;

import java.util.function.Function;

interface I {
    int MAX_VAL = 0;
    Function<Integer, Integer> getFunction();
    Integer operation(Integer i);

}