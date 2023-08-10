package org.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ADiffblueTest {
  /**
   * Method under test: {@link A#getFunction()}
   */
  @Test
  void testGetFunction() {
    // Arrange, Act and Assert
    assertEquals(52, (new A()).getFunction().apply(1).intValue());
  }

  /**
   * Method under test: {@link A#operation(Integer)}
   */
  @Test
  void testOperation() {
    // Arrange, Act and Assert
    assertEquals(53, (new A()).operation(1).intValue());
  }

  /**
  * Method under test: default or parameterless constructor of {@link A}
  */
  @Test
  void testConstructor() {
    // TODO: Complete this test.
    //   Reason: R002 Missing observers.
    //   Diffblue Cover was unable to create an assertion.
    //   There are no fields that could be asserted on.

    // Arrange and Act
    new A();
  }
}

