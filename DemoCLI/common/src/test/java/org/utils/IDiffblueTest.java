package org.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class IDiffblueTest {
  /**
  * Method under test: {@link I#getTemperature(int)}
  */
  @Test
  void testGetTemperature() {
    // Arrange, Act and Assert
    assertEquals(I.level, (new A()).getTemperature(1));
  }

  /**
   * Method under test: {@link I#getHeight(double)}
   */
  @Test
  void testGetHeight() {
    // Arrange, Act and Assert
    assertEquals(9.34d, I.getHeight(2.0d));
  }
}

