package timing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DateAndTimeDiffblueTest {
  /**
   * Method under test: {@link DateAndTime#zonedDateTime(Clock)}
   */
  @Test
  void testZonedDateTime() {
    // Arrange
    DateAndTime dateAndTime = new DateAndTime();

    // Act
    ZonedDateTime actualZonedDateTimeResult = dateAndTime.zonedDateTime(DateFactory.getSpecificDateForTesting());

    // Assert
    assertEquals("Africa/Johannesburg", actualZonedDateTimeResult.getZone().toString());
    LocalDateTime toLocalDateTimeResult = actualZonedDateTimeResult.toLocalDateTime();
    assertEquals("1969-04-27", toLocalDateTimeResult.toLocalDate().toString());
    assertEquals("01:15:20.000000200", toLocalDateTimeResult.toLocalTime().toString());
  }
}