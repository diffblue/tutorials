package org.source;

public class C extends B{
    int c = 6;
    @Override
    int method(double x) {
        return (int) (a * b * c * x);
    }
}
