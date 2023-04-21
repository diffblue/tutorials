package maps;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MapProcessorDiffblueTest {
  /**
  * Method under test: {@link MapProcessor#setType(int)}
  */
  @Test
  @Disabled("TODO: Complete this test")
  void testSetType() {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.lang.NullPointerException: Cannot invoke "maps.MapProcessor$Type.toString()" because "type" is null
    //       at maps.MapProcessor.setType(MapProcessor.java:19)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    (new MapProcessor()).setType(1);
  }
}

