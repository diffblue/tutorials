package source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GDiffblueTest {
  /**
   * Method under test: {@link G#method(double)}
   */
  @Test
  void testMethod() {
    // Arrange, Act and Assert
    assertEquals(1290240, (new G()).method(2.0d));
  }

  /**
  * Method under test: default or parameterless constructor of {@link G}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    G actualG = new G();

    // Assert
    assertEquals(2, A.a);
    assertEquals(14, actualG.g);
    assertEquals(12, actualG.f);
    assertEquals(10, actualG.e);
    assertEquals(8, actualG.d);
    assertEquals(6, actualG.c);
    assertEquals(4, actualG.b);
  }
}

