package timing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DurationFactoryDiffblueTest {
  /**
  * Method under test: {@link DurationFactory#load(String, String)}
  */
  @Test
  @Disabled("TODO: Complete this test")
  void testLoad() {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.time.format.DateTimeParseException: Text 'S1' could not be parsed at index 0
    //       at java.time.format.DateTimeFormatter.parseResolved0(DateTimeFormatter.java:2052)
    //       at java.time.format.DateTimeFormatter.parse(DateTimeFormatter.java:1954)
    //       at java.time.Instant.parse(Instant.java:397)
    //       at timing.DurationFactory.load(DurationFactory.java:9)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    DurationFactory.load("S1", "S2");
  }
}

