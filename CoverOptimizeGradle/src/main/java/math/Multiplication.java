package math;
import java.util.ArrayList;

public class Multiplication {

    static int multiply(ArrayList<Integer> array) {
        int prod = 0;
        for(int i : array)
            prod *= i;
        return prod;
    }
}