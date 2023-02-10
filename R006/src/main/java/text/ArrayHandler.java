package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayHandler {

    static List<String> list =
            new ArrayList<>(Arrays.asList("Java", "Rust"));

    // results in R006: Static initializer failed
    // due to ArithmeticException
//    static int val = 3/0;
}






