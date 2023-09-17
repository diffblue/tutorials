package org.action;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BDiffblueTest {
  /**
   * Method under test: {@link B#function(double)}
   */
  @Test
  void testFunction() {
    // Arrange, Act and Assert
    assertEquals(40.0d, (new B()).function(10.0d));
  }

  /**
   * Method under test: {@link B#getTemperature(int)}
   */
  @Test
  void testGetTemperature() {
    // Arrange, Act and Assert
    assertEquals(0.0d, (new B()).getTemperature(1));
  }

  /**
   * Method under test: {@link B#getTruncatedTemperature(int)}
   */
  @Test
  void testGetTruncatedTemperature() {
    // Arrange, Act and Assert
    assertEquals(5, (new B()).getTruncatedTemperature(1));
  }

  /**
  * Method under test: default or parameterless constructor of {@link B}
  */
  @Test
  void testConstructor() {
    // TODO: Complete this test.
    //   Reason: R002 Missing observers.
    //   Diffblue Cover was unable to create an assertion.
    //   There are no fields that could be asserted on.

    // Arrange and Act
    new B();
  }
}

