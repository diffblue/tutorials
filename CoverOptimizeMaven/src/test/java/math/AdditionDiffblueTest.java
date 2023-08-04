package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AdditionDiffblueTest {
  /**
  * Method under test: {@link Addition#add(double, double)}
  */
  @Test
  void testAdd() {
    // Arrange, Act and Assert
    assertEquals(20.0d, Addition.add(10.0d, 10.0d));
    assertEquals(10.5d, Addition.add(0.5d, 10.0d));
    assertEquals(9.5d, Addition.add(-0.5d, 10.0d));
    assertEquals(Double.NaN, Addition.add(Double.NaN, 10.0d));
  }
}

