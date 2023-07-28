package utilities;

import java.util.function.Function;

interface I {
    Function<Integer, Integer> getFunction();
    Integer operation(Integer i);

}