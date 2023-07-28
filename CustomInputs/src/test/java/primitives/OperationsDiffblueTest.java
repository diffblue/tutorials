package primitives;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OperationsDiffblueTest {
  /**
  * Method under test: {@link Operations#add(int, byte, char)}
  */
  @Test
  void testAdd() {
    // Arrange, Act and Assert
    assertEquals(185, (new Operations()).add(55, (byte) 'A', 'A'));
  }

  /**
   * Method under test: {@link Operations#sum(int, short)}
   */
  @Test
  void testSum() {
    // Arrange, Act and Assert
    assertEquals(56, (new Operations()).sum(55, (short) 1));
    assertEquals(4, (new Operations()).sum(3, (short) 1));
    assertEquals(2, (new Operations()).sum(1, (short) 1));
    assertEquals(1, (new Operations()).sum(0, (short) 1));
  }
}

