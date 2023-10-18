package utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BDiffblueTest {
  /**
  * Method under test: {@link B#doubleIt(Integer)}
  */
  @Test
  void testDoubleIt() {
    // Arrange, Act and Assert
    assertEquals(3, (new B()).doubleIt(1).intValue());
  }
}

