package timing;

import java.time.temporal.TemporalAmount;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ChannelDiffblueTest {
  /**
   * Method under test: {@link Channel#command(TemporalAmount)}
   */
  @Test
  void testCommand() {
    // TODO: Complete this test.
    //   Diffblue AI was unable to find a test

    // Arrange
    Channel channel = new Channel();

    // Act
    channel.command(DurationFactory.load("2017-10-03T10:15:30.00Z", "2017-10-03T10:16:30.00Z"));
  }

  /**
   * Method under test: {@link Channel#command(TemporalAmount)}
   */
  @Test
  @Disabled("TODO: Complete this test")
  void testCommand2() {
    // TODO: Complete this test.
    //   Reason: R013 No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.lang.NullPointerException: amount
    //       at java.util.Objects.requireNonNull(Objects.java:233)
    //       at java.time.Duration.from(Duration.java:337)
    //       at timing.Channel.command(Channel.java:8)
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    (new Channel()).command(null);
  }

  /**
  * Method under test: default or parameterless constructor of {@link Channel}
  */
  @Test
  void testConstructor() {
    // TODO: Complete this test.
    //   Reason: R002 Missing observers.
    //   Diffblue Cover was unable to create an assertion.
    //   There are no fields that could be asserted on.

    // Arrange and Act
    new Channel();
  }
}

