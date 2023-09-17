package source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FDiffblueTest {
  /**
   * Method under test: {@link F#method(double)}
   */
  @Test
  void testMethod() {
    // Arrange, Act and Assert
    assertEquals(92160, (new F()).method(2.0d));
  }

  /**
  * Method under test: default or parameterless constructor of {@link F}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    F actualF = new F();

    // Assert
    assertEquals(2, actualF.a);
    assertEquals(12, actualF.f);
    assertEquals(10, actualF.e);
    assertEquals(8, actualF.d);
    assertEquals(6, actualF.c);
    assertEquals(4, actualF.b);
  }
}

