package primitives;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ArrayProcessorDiffblueTest {
  /**
  * Method under test: {@link ArrayProcessor#process(double[])}
  */
  @Test
  void testProcess() {
    // Arrange, Act and Assert
    assertEquals(30.0d, (new ArrayProcessor()).process(new double[]{1.0d, 2.0d, 3.0d, 4.0d, 5.0d}));
    assertEquals(0.0d, (new ArrayProcessor()).process(new double[]{}));
    assertEquals(20.0f, (new ArrayProcessor()).process(new float[]{1.0f, 2.0f}, new float[]{3.0f, 4.0f}));
    assertEquals(10.0f, (new ArrayProcessor()).process(new short[][]{new short[]{1, 2}, new short[]{3, 4}}));
  }
}

