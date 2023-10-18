package utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ADiffblueTest {
  /**
  * Method under test: {@link A#doubleIt(Integer)}
  */
  @Test
  void testDoubleIt() {
    // Arrange, Act and Assert
    assertEquals(3, (new A()).doubleIt(1).intValue());
  }
}

