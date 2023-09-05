package after;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class StringUtilityDiffblueTest extends StringUtilityDiffblueBase {
  /**
   * Method under test: {@link StringUtility#combination(String)}
   */
  @Test
  void testCombination() {
    // Arrange, Act and Assert
    assertEquals("C Extra", (new StringUtility()).combination("Extra"));
  }

  /**
   * Method under test: {@link StringUtility#subbing(int)}
   */
  @Test
  void testSubbing() {
    // Arrange, Act and Assert
    assertEquals(" ", (new StringUtility()).subbing(1));
  }

  /**
  * Method under test: default or parameterless constructor of {@link StringUtility}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    new StringUtility();

    // Assert
    assertNull(StringUtility.cache);
  }
}

