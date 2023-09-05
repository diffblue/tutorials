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
}

