package org.features;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class OperationDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link Operation}
  *   <li>{@link Operation#toString()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("Operation[]", (new Operation()).toString());
  }

  /**
   * Method under test: {@link Operation#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new Operation(), null);
    assertNotEquals(new Operation(), "Different type to Operation");
    assertNotEquals(new Operation(), 4);
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
    Operation operation = new Operation();

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
    Operation operation = new Operation();
    Operation operation2 = new Operation();

    // Act and Assert
    assertEquals(operation, operation2);
    int expectedHashCodeResult = operation.hashCode();
    assertEquals(expectedHashCodeResult, operation2.hashCode());
  }
}

