package utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BDiffblueTest {
  /**
  * Method under test: {@link B#getFunction()}
  */
  @Test
  void testGetFunction() {
    // Arrange, Act and Assert
    assertEquals(2, (new B()).getFunction().apply(1).intValue());
  }

  /**
   * Method under test: {@link B#operation(Integer)}
   */
  @Test
  void testOperation() {
    // Arrange, Act and Assert
    assertEquals(3, (new B()).operation(1).intValue());
  }
}

