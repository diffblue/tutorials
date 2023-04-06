package primitives;

import java.util.Arrays;

public class ArrayProcessor {

    double process(double[] array) {
        return Arrays.stream(array).map(i -> 2*i).sum();
    }

    float process(float[] left, float[] right) {
        float result = 0;
        for(float L : left)
            for(float R : right)
                result += L + R;

        return result;
    }

    float process(short[][] array) {
        short result = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                result += array[i][j];

        return result;
    }
}
