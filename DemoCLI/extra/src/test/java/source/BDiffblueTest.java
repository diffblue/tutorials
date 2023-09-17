package source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BDiffblueTest {
  /**
   * Method under test: {@link B#method(double)}
   */
  @Test
  void testMethod() {
    // Arrange, Act and Assert
    assertEquals(Short.SIZE, (new B()).method(2.0d));
  }

  /**
  * Method under test: default or parameterless constructor of {@link B}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(2, A.a);
    assertEquals(4, (new B()).b);
  }
}

