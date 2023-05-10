package sealed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PrintableDiffblueTest {
  /**
  * Method under test: {@link Printable#print(int)}
  */
  @Test
  void testPrint() {
    // Arrange, Act and Assert
    assertEquals(199, (new Letter()).print(1));
    assertEquals(0, (new Letter()).print(Integer.MIN_VALUE));
  }
}

