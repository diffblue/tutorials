package replay.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EmailDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Email#Email(String, String)}
  *   <li>{@link Email#setDomain(String)}
  *   <li>{@link Email#setUsername(String)}
  *   <li>{@link Email#toString()}
  *   <li>{@link Email#getDomain()}
  *   <li>{@link Email#getUsername()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Email actualEmail = new Email("janedoe", "Domain");
    actualEmail.setDomain("Domain");
    actualEmail.setUsername("janedoe");
    String actualToStringResult = actualEmail.toString();

    // Assert that nothing has changed
    assertEquals("Domain", actualEmail.getDomain());
    assertEquals("janedoe", actualEmail.getUsername());
    assertEquals("janedoe@Domain", actualToStringResult);
  }
}

