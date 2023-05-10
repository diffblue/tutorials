package sealed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StaffDiffblueTest {
  /**
   * Method under test: {@link Staff#operate(int, int)}
   */
  @Test
  void testOperate() {
    // Arrange, Act and Assert
    assertEquals(1, Staff.operate(1, 1));
    assertEquals(3, Staff.operate(3, 1));
    assertEquals(0, Staff.operate(0, 1));
    assertEquals(-1, Staff.operate(-1, 1));
  }

  /**
  * Method under test: {@link Staff#Staff(char, char)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("AA", (new Staff('A', 'A')).getWord());
    assertEquals("\u0000\u0000", (new Staff(1)).getWord());
  }

  /**
   * Method under test: {@link Staff#getWord()}
   */
  @Test
  void testGetWord() {
    // Arrange, Act and Assert
    assertEquals("\u0000\u0000", (new Staff(1)).getWord());
  }
}

