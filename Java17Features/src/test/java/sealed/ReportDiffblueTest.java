package sealed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ReportDiffblueTest {
  /**
  * Method under test: {@link Report#date()}
  */
  @Test
  void testDate() {
    // Arrange, Act and Assert
    assertEquals(22, (new Report()).date());
  }
}

