package maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MapProcessorDiffblueTest {
  /**
  * Method under test: {@link MapProcessor#setType(int)}
  */
  @Test
  void testSetType() {
    // Arrange, Act and Assert
    assertEquals("A", (new MapProcessor()).setType(11));
  }
}

