package sealed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LetterDiffblueTest {
  /**
  * Method under test: {@link Letter#date()}
  */
  @Test
  void testDate() {
    // Arrange, Act and Assert
    assertEquals(11, (new Letter()).date());
  }
}

