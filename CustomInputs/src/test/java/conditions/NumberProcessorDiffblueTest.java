package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class NumberProcessorDiffblueTest {
  /**
  * Method under test: {@link NumberProcessor#processNumber(String)}
  */
  @Test
  void testProcessNumber() {
    // Arrange, Act and Assert
    assertEquals(800, NumberProcessor.processNumber("800"));
    assertThrows(IllegalArgumentException.class, () -> NumberProcessor.processNumber("foo"));
  }
}

