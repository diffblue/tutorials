package org.action;

import org.utils.I;

import java.util.function.Function;

public class B implements I {
        @Override
        public Function<Integer, Integer> getFunction() {
            return i -> 12 * i;
        }

        @Override
        public Integer operation(Integer i) {
            return i + 12;
        }
    }
