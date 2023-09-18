package source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link N}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    N actualN = new N();

    // Assert
    assertEquals(4, actualN.n);
    assertEquals(2, actualN.obj.m);
  }
}

