package other.fieldinputs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OwlDiffblueTest extends OwlDiffblueBase {
  /**
   * Method under test: {@link Owl#isOwl(String)}
   */
  @Test
  void testIsOwl() {
    // Arrange, Act and Assert
    assertEquals(0, (new Owl()).isOwl(OwlDiffblueBase.birdName));
    assertEquals(3, (new Owl()).isOwl("foo"));
    assertEquals(1, (new Owl()).isOwl("ow"));
    assertEquals(1, (new Owl()).isOwl("owwl"));
  }

  /**
  * Method under test: default or parameterless constructor of {@link Owl}
  */
  @Test
  void testConstructor() {
    // TODO: Complete this test.
    //   Reason: R002 Missing observers.
    //   Diffblue Cover was unable to create an assertion.
    //   There are no fields that could be asserted on.

    // Arrange and Act
    new Owl();
  }
}

