package maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BirdDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Bird#Bird(String)}
  *   <li>{@link Bird#getName()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("Magpie", (new Bird("Magpie")).getName());
  }
}

