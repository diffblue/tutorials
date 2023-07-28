package primitives;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class WrappersDiffblueTest {
  /**
   * Method under test: {@link Wrappers#negate(Boolean)}
   */
  @Test
  void testNegate() {
    // Arrange, Act and Assert
    assertFalse((new Wrappers()).negate((Boolean) true));
    assertTrue((new Wrappers()).negate((Boolean) false));
    assertFalse((new Wrappers()).negate(true));
    assertTrue((new Wrappers()).negate(false));
  }

  /**
  * Method under test: {@link Wrappers#add(Character, char)}
  */
  @Test
  void testAdd() {
    // Arrange, Act and Assert
    assertEquals(153, (new Wrappers()).add('X', 'A'));
  }

  /**
   * Method under test: {@link Wrappers#doubleIt(int)}
   */
  @Test
  void testDoubleIt() {
    // Arrange, Act and Assert
    assertEquals(110, (new Wrappers()).doubleIt(55));
  }
}

