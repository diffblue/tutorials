package before;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorDiffblueTest extends CalculatorDiffblueBase {
  /**
  * Method under test: {@link Calculator#sum(int, int)}
  */
  @Test
  void testSum() {
    // Arrange, Act and Assert
    assertEquals(2, Calculator.sum(1, 1));
    assertEquals(4, Calculator.sum(3, 1));
    assertEquals(1, Calculator.sum(0, 1));
    assertEquals(0, Calculator.sum(-1, 1));
  }
}

