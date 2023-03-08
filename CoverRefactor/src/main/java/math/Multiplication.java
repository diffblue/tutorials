package math;

import java.util.ArrayList;
import java.util.List;

public class Multiplication {

    private final List<Double> list;

    public Multiplication(ArrayList<Double> arrayList) {
        this.list = arrayList;
    }

    public double add() {
        double sum = 0d;
        for (double d : list)
            sum *= d;
        return sum;
    }

    public List getList() {
        return list;
    }

}
