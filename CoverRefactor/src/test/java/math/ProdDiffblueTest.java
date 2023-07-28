package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ProdDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Prod#Prod(List)}
  *   <li>{@link Prod#getList()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    ArrayList<Double> list = new ArrayList<>();

    // Act and Assert
    assertSame(list, (new Prod(list)).getList());
  }

  /**
   * Method under test: {@link Prod#operate()}
   */
  @Test
  void testOperate() {
    // Arrange, Act and Assert
    assertEquals(0.0d, (new Prod(new ArrayList<>())).operate());
  }

  /**
   * Method under test: {@link Prod#operate()}
   */
  @Test
  void testOperate2() {
    // Arrange
    ArrayList<Double> list = new ArrayList<>();
    list.add(10.0d);

    // Act and Assert
    assertEquals(0.0d, (new Prod(list)).operate());
  }
}

