package maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class NamesDiffblueTest {
  /**
   * Method under test: {@link Names#addToMap(int, String)}
   */
  @Test
  void testAddToMap() {
    // Arrange
    Names names = new Names();

    // Act
    names.addToMap(1, "Name");

    // Assert
    assertEquals("Name", names.readFromMap(1));
  }

  /**
   * Method under test: {@link Names#readFromMap(int)}
   */
  @Test
  void testReadFromMap() {
    // Arrange, Act and Assert
    assertNull((new Names()).readFromMap(1));
  }

  /**
  * Method under test: default or parameterless constructor of {@link Names}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new Names()).readFromMap(1));
  }
}

