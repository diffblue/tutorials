package org.extra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BranchesDiffblueTest {
  /**
   * Method under test: {@link Branches#getItCovered()}
   */
  @Test
  void testGetItCovered() {
    // Arrange, Act and Assert
    assertEquals(1, (new Branches()).getItCovered());
  }

  /**
   * Method under test: {@link Branches#getItCovered()}
   */
  @Test
  void testGetItCovered2() {
    // Arrange
    Branches branches = new Branches();
    branches.setSString("foo");
    branches.setTString(null);

    // Act and Assert
    assertEquals(2, branches.getItCovered());
  }

  /**
   * Method under test: {@link Branches#getItCovered()}
   */
  @Test
  void testGetItCovered3() {
    // Arrange
    Branches branches = new Branches();
    branches.setSString("foo");
    branches.setTString("foo");

    // Act and Assert
    assertEquals(3, branches.getItCovered());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link Branches}
  *   <li>{@link Branches#setSString(String)}
  *   <li>{@link Branches#setTString(String)}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Branches actualBranches = new Branches();
    actualBranches.setSString("Str");
    actualBranches.setTString("Str");

    // Assert
    assertEquals(3, actualBranches.getItCovered());
  }
}

