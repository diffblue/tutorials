package serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class CheeseDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link Cheese}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Cheese actualCheese = new Cheese();

    // Assert
    assertFalse(actualCheese.availability);
    assertNull(actualCheese.name);
    assertEquals(0, actualCheese.maturity);
  }
}

