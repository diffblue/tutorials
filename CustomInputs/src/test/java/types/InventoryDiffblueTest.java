package types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class InventoryDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Inventory#Inventory(ID, Bird)}
  *   <li>{@link Inventory#getBird()}
  *   <li>{@link Inventory#getId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    ID id = new ID(77L);
    Bird b = new Bird("Eagle");

    // Act
    Inventory actualInventory = new Inventory(id, b);

    // Assert
    assertSame(b, actualInventory.getBird());
    assertSame(id, actualInventory.getId());
  }

  /**
   * Method under test: {@link Inventory#addToMap(ID, Bird)}
   */
  @Test
  void testAddToMap() {
    // Arrange
    ID id = new ID(77L);
    Inventory inventory = new Inventory(id, new Bird("Eagle"));
    ID id2 = new ID(77L);

    // Act
    inventory.addToMap(id2, new Bird("Eagle"));

    // Assert
    assertEquals(1, inventory.getMap().size());
  }
}

