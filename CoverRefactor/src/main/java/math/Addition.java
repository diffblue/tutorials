package math;

import java.util.ArrayList;
import java.util.List;

public class Addition {

    private final List<Double> list;

    public Addition(ArrayList<Double> arrayList) {
        this.list = arrayList;
    }

    public double add() {
        double sum = 0d;
        for (double d : list)
            sum += d;
        return sum;
    }
    /** For testing purposes only */
    public List getList() {
        return list;
    }

}
