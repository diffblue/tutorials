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
    assertEquals(42.0d, (new ArrayProcessor()).process(new double[]{10.0d, 0.5d, 10.0d, 0.5d}));
    assertEquals(0.0d, (new ArrayProcessor()).process(new double[]{}));
    assertEquals(168.0f,
        (new ArrayProcessor()).process(new float[]{10.0f, 0.5f, 10.0f, 0.5f}, new float[]{10.0f, 0.5f, 10.0f, 0.5f}));

    assertEquals(10.0f, (new ArrayProcessor())
            .process(new short[][]{new short[]{1, 2}, new short[]{3, 4}}));
  }
}

