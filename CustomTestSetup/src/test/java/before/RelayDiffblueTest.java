package before;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RelayDiffblueTest extends RelayDiffblueBase {
  /**
  * Method under test: {@link Relay#broadcast(String)}
  */
  @Test
  void testBroadcast() {
    // Arrange, Act and Assert
    assertEquals("Text: foo", Relay.broadcast("foo"));
  }
}

