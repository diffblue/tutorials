package sealed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SophomoreDiffblueTest {
  /**
  * Method under test: {@link Sophomore#operate(int, int)}
  */
  @Test
  void testOperate() {
    // Arrange, Act and Assert
    assertEquals(0, Sophomore.operate(1, 1));
    assertEquals(2, Sophomore.operate(3, 1));
    assertEquals(-1, Sophomore.operate(0, 1));
    assertEquals(-2, Sophomore.operate(-1, 1));
  }
}

