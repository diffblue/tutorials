package org.utils;

public interface I {

    double level = 5.10, bar = 4.67;

    // implemented by org.utils.A and org.action.B
    double function(double input);

    // overridden by org.action.B
    default double getTemperature(int i) {
        return i * level;
    }

    static double getHeight(double x) {
        return x * bar;
    }
}