package classes;

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
    ArrayList<Double> list = new ArrayList<>();

    // Act and Assert
    assertSame(list, (new Addition(list)).getList());
  }
}

