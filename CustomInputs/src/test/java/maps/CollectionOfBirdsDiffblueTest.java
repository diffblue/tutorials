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
    CollectionOfBirds collectionOfBirds = new CollectionOfBirds(1, new Bird("Eagle"));
    Bird bird = new Bird("Eagle");

    // Act
    collectionOfBirds.addToMap(1, bird);

    // Assert
    assertSame(bird, collectionOfBirds.readFromMap(1));
  }

  /**
   * Method under test: {@link CollectionOfBirds#addToMap(ID, Bird)}
   */
  @Test
  void testAddToMap2() {
    // Arrange
    Bird bird = new Bird("Eagle");
    CollectionOfBirds collectionOfBirds = new CollectionOfBirds(1, bird);
    ID id = new ID(77);

    // Act
    collectionOfBirds.addToMap(id, new Bird("Eagle"));

    // Assert
    assertSame(bird, collectionOfBirds.readFromMap(1));
  }

  /**
   * Method under test: {@link CollectionOfBirds#readFromMap(int)}
   */
  @Test
  void testReadFromMap() {
    // Arrange
    Bird bird = new Bird("Eagle");

    // Act and Assert
    assertSame(bird, (new CollectionOfBirds(1, bird)).readFromMap(1));
  }

  /**
  * Method under test: {@link CollectionOfBirds#CollectionOfBirds(int, Bird)}
  */
  @Test
  void testConstructor() {
    // Arrange
    Bird bird = new Bird("Eagle");

    // Act and Assert
    assertSame(bird, (new CollectionOfBirds(1, bird)).readFromMap(1));
  }

  /**
   * Method under test: {@link CollectionOfBirds#CollectionOfBirds(ID, Bird)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    ID id = new ID(77);

    // Act and Assert
    assertNull((new CollectionOfBirds(id, new Bird("Eagle"))).readFromMap(1));
  }
}

