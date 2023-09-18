package source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ADiffblueTest {
  /**
   * Method under test: {@link A#method(double)}
   */
  @Test
  void testMethod() {
    // Arrange, Act and Assert
    assertEquals(4, (new A()).method(2.0d));
  }

  /**
  * Method under test: default or parameterless constructor of {@link A}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(2, (new A()).a);
  }
}

