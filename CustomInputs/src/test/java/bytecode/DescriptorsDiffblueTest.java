package bytecode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class DescriptorsDiffblueTest {
  /**
  * Method under test: {@link Descriptors#initial()}
  */
  @Test
  void testInitial() {
    // Arrange, Act and Assert
    assertEquals('S', (new Descriptors("Student", 1L)).initial());
  }

  /**
   * Method under test: {@link Descriptors#lastDigits(int)}
   */
  @Test
  void testLastDigits() {
    // Arrange and Act
    ArrayList<Integer> actualLastDigitsResult = (new Descriptors("Student", 1L)).lastDigits(1);

    // Assert
    assertEquals(1, actualLastDigitsResult.size());
    assertEquals(1, actualLastDigitsResult.get(0));
  }

  /**
   * Method under test: {@link Descriptors#lastDigits(int)}
   */
  @Test
  void testLastDigits2() {
    // Arrange and Act
    ArrayList<Integer> actualLastDigitsResult = (new Descriptors("Student", 1L)).lastDigits(2);

    // Assert
    assertEquals(1, actualLastDigitsResult.size());
    assertEquals(0, actualLastDigitsResult.get(0));
  }
}

