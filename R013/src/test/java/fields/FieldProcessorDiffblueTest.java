package fields;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FieldProcessorDiffblueTest {
  /**
  * Method under test: {@link FieldProcessor#FieldProcessor(String)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertFalse((new FieldProcessor("Name")).isNameABC());
  }

  /**
   * Method under test: {@link FieldProcessor#isNameABC()}
   */
  @Test
  void testIsNameABC() {
    // Arrange, Act and Assert
    assertFalse((new FieldProcessor("Name")).isNameABC());
    assertTrue((new FieldProcessor("ABC")).isNameABC());
  }
}

