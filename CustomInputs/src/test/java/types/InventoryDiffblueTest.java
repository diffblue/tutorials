package types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class InventoryDiffblueTest {

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

