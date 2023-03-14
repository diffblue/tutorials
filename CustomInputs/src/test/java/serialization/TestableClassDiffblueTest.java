package serialization;

import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class TestableClassDiffblueTest {
  /**
  * Method under test: {@link TestableClass#getCheeseName(Cheese)}
  */
  @Test
  void testGetCheeseName() {
    // Arrange
    TestableClass testableClass = new TestableClass();

    // Act and Assert
    assertNull(testableClass.getCheeseName(new Cheese()));
  }
}

