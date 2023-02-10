package replay.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class PersonExceptionDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link PersonException}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    PersonException actualPersonException = new PersonException();

    // Assert
    assertNull(actualPersonException.getCause());
    assertEquals(0, actualPersonException.getSuppressed().length);
    assertNull(actualPersonException.getMessage());
    assertNull(actualPersonException.getLocalizedMessage());
  }
}

