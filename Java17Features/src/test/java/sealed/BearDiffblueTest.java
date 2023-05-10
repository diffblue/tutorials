package sealed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BearDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Bear#Bear(int)}
  *   <li>{@link Bear#getIt()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(1, (new Bear(1)).getIt());
  }
}

