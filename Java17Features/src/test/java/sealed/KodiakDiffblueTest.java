package sealed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class KodiakDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Kodiak#Kodiak(int)}
  *   <li>{@link Kodiak#getIt()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(1, (new Kodiak(1)).getIt());
  }
}

