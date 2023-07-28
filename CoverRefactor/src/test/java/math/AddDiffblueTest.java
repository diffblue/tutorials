package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class AddDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Add#Add(List)}
  *   <li>{@link Add#getList()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    ArrayList<Double> list = new ArrayList<>();

    // Act and Assert
    assertSame(list, (new Add(list)).getList());
  }

  /**
   * Method under test: {@link Add#operate()}
   */
  @Test
  void testOperate() {
    // Arrange, Act and Assert
    assertEquals(0.0d, (new Add(new ArrayList<>())).operate());
  }

  /**
   * Method under test: {@link Add#operate()}
   */
  @Test
  void testOperate2() {
    // Arrange
    ArrayList<Double> list = new ArrayList<>();
    list.add(10.0d);

    // Act and Assert
    assertEquals(10.0d, (new Add(list)).operate());
  }
}

