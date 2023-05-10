package sealed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StudentDiffblueTest {
  /**
  * Method under test: {@link Student#operate(int, int)}
  */
  @Test
  void testOperate() {
    // Arrange, Act and Assert
    assertEquals(2, Student.operate(1, 1));
    assertEquals(4, Student.operate(3, 1));
    assertEquals(1, Student.operate(0, 1));
    assertEquals(0, Student.operate(-1, 1));
  }
}

