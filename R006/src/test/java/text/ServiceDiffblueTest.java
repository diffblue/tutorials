package text;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ServiceDiffblueTest {
  /**
  * Method under test: {@link Service#Service(short)}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Service actualService = new Service((short) 1);

    // Assert
    assertEquals("Java", actualService.language);
    assertEquals((short) 1, actualService.version);
  }
}

