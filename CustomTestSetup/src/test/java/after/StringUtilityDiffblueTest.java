package after;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Disabled;
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
  @Disabled("TODO: Complete this test")
  void testSubbing() {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 2
    //       at java.lang.String.checkBoundsBeginEnd(String.java:4604)
    //       at java.lang.String.substring(String.java:2707)
    //       at java.lang.String.substring(String.java:2680)
    //       at after.StringUtility.subbing(StringUtility.java:17)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    (new StringUtility()).subbing(3);
  }

  /**
   * Method under test: {@link StringUtility#subbing(int)}
   */
  @Test
  void testSubbing2() {
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

