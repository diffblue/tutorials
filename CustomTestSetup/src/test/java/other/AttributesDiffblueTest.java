package other;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AttributesDiffblueTest extends AttributesDiffblueBase {
  /**
  * Method under test: default or parameterless constructor of {@link Attributes}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(2, (new Attributes()).operate(1, 1));
  }

  /**
   * Method under test: {@link Attributes#operate(int, int)}
   */
  @Test
  void testOperate() {
    // Arrange, Act and Assert
    assertEquals(2, (new Attributes()).operate(1, 1));
    assertEquals(4, (new Attributes()).operate(3, 1));
    assertEquals(1, (new Attributes()).operate(0, 1));
    assertEquals(0, (new Attributes()).operate(-1, 1));
  }
}

