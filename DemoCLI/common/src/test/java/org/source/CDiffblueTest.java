package org.source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CDiffblueTest {
  /**
   * Method under test: {@link C#method(double)}
   */
  @Test
  void testMethod() {
    // Arrange, Act and Assert
    assertEquals(96, (new C()).method(2.0d));
  }

  /**
  * Method under test: default or parameterless constructor of {@link C}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    C actualC = new C();

    // Assert
    assertEquals(2, actualC.a);
    assertEquals(6, actualC.c);
    assertEquals(4, actualC.b);
  }
}

