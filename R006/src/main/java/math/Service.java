package math;

import java.util.List;

public class Service {

    public static double getAverage(List<Double> list) {
        double average =
                Operations.add(list) / Operations.elements;
        return average;
    }
}

