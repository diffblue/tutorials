package source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link P}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    P actualP = new P();

    // Assert
    assertEquals(6, actualP.p);
    N n = actualP.obj;
    assertEquals(4, n.n);
    assertEquals(2, n.obj.m);
  }
}

