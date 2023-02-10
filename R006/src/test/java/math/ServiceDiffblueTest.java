package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ServiceDiffblueTest {
  /**
  * Method under test: {@link Service#getAverage(List)}
  */
  @Test
  void testGetAverage() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Service.getAverage(new ArrayList<>()));
  }

  /**
   * Method under test: {@link Service#getAverage(List)}
   */
  @Test
  void testGetAverage2() {
    // Arrange
    ArrayList<Double> resultDoubleList = new ArrayList<>();
    resultDoubleList.add(10.0d);

    // Act and Assert
    assertEquals(3.3333333333333335d, Service.getAverage(resultDoubleList));
  }
}

