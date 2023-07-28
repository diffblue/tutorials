package math;

//import java.util.ArrayList;
import java.util.List;

public class Add {

    private final List<Double> list;

    public Add(List<Double> list) {
        this.list = list;
    }

    /** For testing purposes only */
    public List getList() {
        return list;
    }

    public double operate() {
        double sum = 0d;
        for (double d : list)
            sum += d;
        return sum;
    }
}
