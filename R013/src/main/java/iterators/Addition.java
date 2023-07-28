package iterators;

import java.util.List;

public class Addition {

    private List<Double> list;

    // R013  java.lang.NullPointerException: Cannot invoke "java.lang.Iterable.iterator()" because "iterable" is null
    // use a constructor to initialize list
    public double add() {
        double sum = 0d;
        for (double d : list)
            sum += d;
        return sum;
    }

}