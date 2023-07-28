package primitives;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ArrayBuilderDiffblueTest {
  /**
  * Method under test: {@link ArrayBuilder#concatenate(String[])}
  */
  @Test
  void testConcatenate() {
    // Arrange, Act and Assert
    assertEquals("CamelLionWolf", ArrayBuilder.concatenate(new String[]{"Camel", "Lion", "Wolf"}));
    assertEquals("", ArrayBuilder.concatenate(new StringBuilder[]{new StringBuilder(1)}));
  }
}

