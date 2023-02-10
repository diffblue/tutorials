package maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class FlowersDiffblueTest {
  /**
  * Method under test: {@link Flowers#addToMap(float, String)}
  */
  @Test
  void testAddToMap() {
    // Arrange
    Flowers flowers = new Flowers();

    // Act
    flowers.addToMap(4.0f, "tulip");

    // Assert
    assertEquals("tulip", flowers.readFromMap(4.0f));
  }

  /**
   * Method under test: {@link Flowers#readFromMap(float)}
   */
  @Test
  void testReadFromMap() {
    // Arrange, Act and Assert
    assertNull((new Flowers()).readFromMap(4.0f));
  }
}

