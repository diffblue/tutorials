package sealed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class KoalaDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Koala#Koala(int)}
  *   <li>{@link Koala#getIt()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(1, (new Koala(1)).getIt());
  }
}

