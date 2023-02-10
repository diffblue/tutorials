package math;
import java.util.ArrayList;
public class Factorial {
    static int doFactorial(int N) {
        if (N == 0)
            return 1;
        else {
            ArrayList<Integer> array = new ArrayList<>(N);
            for (int n = 1; n <= N; n++)
                array.add(n);
            return Multiplication.multiply(array);
        }
    }
}
