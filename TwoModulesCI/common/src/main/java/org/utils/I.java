package org.utils;


import java.util.function.Function;

public interface I {
    Function<Integer, Integer> getFunction();
    Integer operation(Integer i);
}