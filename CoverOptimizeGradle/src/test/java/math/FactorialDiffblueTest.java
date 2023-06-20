package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FactorialDiffblueTest {
  /**
  * Method under test: {@link Factorial#doFactorial(int)}
  */
  @Test
  void testDoFactorial() {
    // Arrange, Act and Assert
    assertEquals(1, Factorial.doFactorial(1));
    assertEquals(1, Factorial.doFactorial(0));
  }
}

