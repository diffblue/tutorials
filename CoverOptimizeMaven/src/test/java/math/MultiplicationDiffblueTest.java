package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class MultiplicationDiffblueTest {
  /**
  * Method under test: {@link Multiplication#multiply(ArrayList)}
  */
  @Test
  void testMultiply() {
    // Arrange, Act and Assert
    assertEquals(1, Multiplication.multiply(new ArrayList<>()));
  }

  /**
   * Method under test: {@link Multiplication#multiply(ArrayList)}
   */
  @Test
  void testMultiply2() {
    // Arrange
    ArrayList<Integer> array = new ArrayList<>();
    array.add(1);

    // Act and Assert
    assertEquals(1, Multiplication.multiply(array));
  }

  /**
   * Method under test: {@link Multiplication#multiply(ArrayList)}
   */
  @Test
  void testMultiply3() {
    // Arrange
    ArrayList<Integer> array = new ArrayList<>();
    array.add(1);
    array.add(2);

    // Act and Assert
    assertEquals(2, Multiplication.multiply(array));
  }
}

