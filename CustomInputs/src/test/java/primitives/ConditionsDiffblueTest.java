package primitives;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ConditionsDiffblueTest {
  /**
  * Method under test: {@link Conditions#testMe(int)}
  */
  @Test
  void testTestMe() {
    // Arrange, Act and Assert
    assertEquals(1, Conditions.testMe(-1));
    assertEquals(2, Conditions.testMe(2));
  }
}

