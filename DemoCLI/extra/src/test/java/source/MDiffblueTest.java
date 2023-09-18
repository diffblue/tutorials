package source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link M}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(2, (new M()).m);
  }
}

