package records;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class OperationDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Operation#Operation(ArrayList)}
  *   <li>{@link Operation#toString()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("Operation[list=[]]", (new Operation(new ArrayList<>())).toString());
  }

  /**
   * Method under test: {@link Operation#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new Operation(new ArrayList<>()), null);
    assertNotEquals(new Operation(new ArrayList<>()), "Different type to Operation");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Operation#equals(Object)}
   *   <li>{@link Operation#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    Operation operation = new Operation(new ArrayList<>());

    // Act and Assert
    assertEquals(operation, operation);
    int expectedHashCodeResult = operation.hashCode();
    assertEquals(expectedHashCodeResult, operation.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Operation#equals(Object)}
   *   <li>{@link Operation#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    Operation operation = new Operation(new ArrayList<>());
    Operation operation2 = new Operation(new ArrayList<>());

    // Act and Assert
    assertEquals(operation, operation2);
    int expectedHashCodeResult = operation.hashCode();
    assertEquals(expectedHashCodeResult, operation2.hashCode());
  }

  /**
   * Method under test: {@link Operation#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    ArrayList<Double> list = new ArrayList<>();
    list.add(10.0d);
    Operation operation = new Operation(list);

    // Act and Assert
    assertNotEquals(operation, new Operation(new ArrayList<>()));
  }

  /**
   * Method under test: {@link Operation#list()}
   */
  @Test
  void testList() {
    // Arrange
    ArrayList<Double> list = new ArrayList<>();

    // Act
    ArrayList<Double> actualListResult = (new Operation(list)).list();

    // Assert
    assertSame(list, actualListResult);
    assertTrue(actualListResult.isEmpty());
  }
}

