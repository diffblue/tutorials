package after;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StoreDiffblueTest extends StoreDiffblueBase {
  /**
  * Method under test: {@link Store#getCombined(String)}
  */
  @Test
  void testGetCombined() {
    // Arrange, Act and Assert
    assertEquals("abcStr", Store.getCombined("Str"));
  }
}

