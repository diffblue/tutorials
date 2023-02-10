package math;

import java.util.List;

public class Operations {
   static int elements;

   static {
      // results in R006: Static initializer failed
      // due to NumberFormatException
      //elements = Integer.parseInt("x");
      elements = Integer.parseInt("3");
   }


   public static double add(List<Double> list) {
      double sum = 0;
      for (double d : list)
         sum += d;
      return sum;
   }
}
