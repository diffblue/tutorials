package math;

//import java.util.ArrayList;
import java.util.List;

public class Prod {

    private final List<Double> list;

    public Prod(List<Double> list) {
        this.list = list;
    }

    public double operate() {
        double sum = 0d;
        for (double d : list)
            sum *= d;
        return sum;
    }

    public List getList() {
        return list;
    }

}
