package classes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CounterDiffblueTest {
  /**
   * Method under test: {@link Counter#flip()}
   */
  @Test
  void testFlip() {
    // Arrange
    Counter counter = new Counter();

    // Act
    counter.flip();

    // Assert
    assertTrue(counter.getFlag());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link Counter}
  *   <li>{@link Counter#getFlag()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertFalse((new Counter()).getFlag());
  }
}

