package utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ADiffblueTest {
  /**
  * Method under test: {@link A#getFunction()}
  */
  @Test
  void testGetFunction() {
    // Arrange, Act and Assert
    assertEquals(1, (new A()).getFunction().apply(1).intValue());
  }

  /**
   * Method under test: {@link A#operation(Integer)}
   */
  @Test
  void testOperation() {
    // Arrange, Act and Assert
    assertEquals(1, (new A()).operation(1).intValue());
  }
}

