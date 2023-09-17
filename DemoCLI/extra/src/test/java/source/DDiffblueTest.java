package source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DDiffblueTest {
  /**
   * Method under test: {@link D#method(double)}
   */
  @Test
  void testMethod() {
    // Arrange, Act and Assert
    assertEquals(768, (new D()).method(2.0d));
  }

  /**
  * Method under test: default or parameterless constructor of {@link D}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    D actualD = new D();

    // Assert
    assertEquals(2, actualD.a);
    assertEquals(8, actualD.d);
    assertEquals(6, actualD.c);
    assertEquals(4, actualD.b);
  }
}

