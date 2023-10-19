package org.action;

import org.utils.I;

class B implements I {
    @Override
    public double function(double val) {
        return 4 * val;
    }

    @Override
    public double getTemperature(int i) {
        return (i-1) * level;
    }

    public int getTruncatedTemperature(int i) {
        double temp = I.super.getTemperature(i);
        return (int)temp;
    }
}