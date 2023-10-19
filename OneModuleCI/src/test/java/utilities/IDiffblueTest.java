package utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class IDiffblueTest {
  /**
  * Method under test: {@link I#getTemperature(int)}
  */
  @Test
  void testGetTemperature() {
    // Arrange, Act and Assert
    assertEquals(5.0d, (new A()).getTemperature(1));
  }
}

