package org.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ADiffblueTest {
  /**
  * Method under test: {@link A#function(double)}
  */
  @Test
  void testFunction() {
    // Arrange, Act and Assert
    assertEquals(20.0d, (new A()).function(10.0d));
  }
}

