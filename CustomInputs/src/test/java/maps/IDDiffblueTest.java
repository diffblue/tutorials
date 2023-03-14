package maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class IDDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ID#ID(int)}
  *   <li>{@link ID#getId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(1, (new ID(1)).getId());
  }
}

