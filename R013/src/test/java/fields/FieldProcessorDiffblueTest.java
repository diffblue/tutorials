package fields;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FieldProcessorDiffblueTest {
  /**
   * Method under test: {@link FieldProcessor#isABC()}
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testIsABC() {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
    //       at fields.FieldProcessor.isABC(FieldProcessor.java:8)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    (new FieldProcessor()).isABC();
  }

  /**
   * Method under test: {@link FieldProcessor#isABC()}
   */
  @Test
  void testIsABC2() {
    // Arrange
    FieldProcessor fieldProcessor = new FieldProcessor();
    fieldProcessor.setName("Name");

    // Act and Assert
    assertFalse(fieldProcessor.isABC());
  }

  /**
   * Method under test: {@link FieldProcessor#isABC()}
   */
  @Test
  void testIsABC3() {
    // Arrange
    FieldProcessor fieldProcessor = new FieldProcessor();
    fieldProcessor.setName("ABC");

    // Act and Assert
    assertTrue(fieldProcessor.isABC());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link FieldProcessor}
  *   <li>{@link FieldProcessor#setName(String)}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    FieldProcessor actualFieldProcessor = new FieldProcessor();
    actualFieldProcessor.setName("Name");

    // Assert
    assertFalse(actualFieldProcessor.isABC());
  }
}

