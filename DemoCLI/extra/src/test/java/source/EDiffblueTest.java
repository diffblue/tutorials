package source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EDiffblueTest {
  /**
   * Method under test: {@link E#method(double)}
   */
  @Test
  void testMethod() {
    // Arrange, Act and Assert
    assertEquals(7680, (new E()).method(2.0d));
  }

  /**
  * Method under test: default or parameterless constructor of {@link E}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    E actualE = new E();

    // Assert
    assertEquals(2, A.a);
    assertEquals(10, actualE.e);
    assertEquals(8, actualE.d);
    assertEquals(6, actualE.c);
    assertEquals(4, actualE.b);
  }
}

