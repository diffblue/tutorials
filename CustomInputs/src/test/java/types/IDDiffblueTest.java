package types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class IDDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ID#ID(long)}
  *   <li>{@link ID#getId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(1L, (new ID(1L)).getId());
  }
}

