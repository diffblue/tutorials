package maps;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class CollectionOfBirdsDiffblueTest {
  /**
  * Method under test: {@link CollectionOfBirds#addToMap(int, Bird)}
  */
  @Test
  void testAddToMap() {
    // Arrange
    CollectionOfBirds collectionOfBirds = new CollectionOfBirds();
    Bird bird = new Bird("Magpie");

    // Act
    collectionOfBirds.addToMap(1, bird);

    // Assert
    assertSame(bird, collectionOfBirds.readFromMap(1));
  }

  /**
   * Method under test: {@link CollectionOfBirds#readFromMap(int)}
   */
  @Test
  void testReadFromMap() {
    // Arrange, Act and Assert
    assertNull((new CollectionOfBirds()).readFromMap(1));
  }
}

