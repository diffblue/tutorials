package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class StringProcessorDiffblueTest {
  /**
   * Method under test: {@link StringProcessor#parse(String)}
   */
  @Test
  void testParse() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StringProcessor.parse("Text"));
    assertEquals(42, StringProcessor.parse("42"));
  }

  /**
  * Method under test: {@link StringProcessor#concatenateStrings(String, String)}
  */
  @Test
  void testConcatenateStrings() {
    // Arrange, Act and Assert
    assertEquals("Hello World!", StringProcessor.concatenateStrings("Hello ", "World!"));
  }

  /**
   * Method under test: {@link StringProcessor#getStringLength(String)}
   */
  @Test
  void testGetStringLength() {
    // Arrange, Act and Assert
    assertEquals(5, StringProcessor.getStringLength("Hello"));
  }
}

