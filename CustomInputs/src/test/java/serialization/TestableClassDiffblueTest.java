package serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class TestableClassDiffblueTest {

  @Test
  void testGetName() throws IOException, ClassNotFoundException {
    // Arrange
    TestableClass testableClass = new TestableClass();
    // Act and Assert
    assertEquals("Gouda", testableClass.getName(CheeseFactory.readSerializedCheese()));
  }

  @Test
  void testGetMaturity() throws IOException, ClassNotFoundException {
    // Arrange
    TestableClass testableClass = new TestableClass();
    // Act and Assert
    assertEquals(2, testableClass.getMaturity(CheeseFactory.readSerializedCheese()));
  }

  @Test
  void testGetAvailability() throws IOException, ClassNotFoundException {
    // Arrange
    TestableClass testableClass = new TestableClass();
    // Act and Assert
    assertTrue(testableClass.getAvailability(CheeseFactory.readSerializedCheese()));
  }

}