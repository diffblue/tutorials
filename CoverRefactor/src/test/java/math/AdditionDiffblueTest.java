package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AdditionDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Addition#Addition(ArrayList)}
  *   <li>{@link Addition#getList()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    ArrayList<Double> resultDoubleList = new ArrayList<>();

    // Act and Assert
    assertSame(resultDoubleList, (new Addition(resultDoubleList)).getList());
  }

  /**
   * Method under test: {@link Addition#add()}
   */
  @Test
  void testAdd() {
    // Arrange, Act and Assert
    assertEquals(0.0d, (new Addition(new ArrayList<>())).add());
  }

  /**
   * Method under test: {@link Addition#add()}
   */
  @Test
  void testAdd2() {
    // Arrange
    ArrayList<Double> resultDoubleList = new ArrayList<>();
    resultDoubleList.add(10.0d);

    // Act and Assert
    assertEquals(10.0d, (new Addition(resultDoubleList)).add());
  }
}

