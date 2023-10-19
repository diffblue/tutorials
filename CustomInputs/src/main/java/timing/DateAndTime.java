package timing;

import java.time.*;

public class DateAndTime {
    public ZonedDateTime zonedDateTime(Clock clock) {
        LocalDate ld = LocalDate.now(clock);
        LocalTime lt = LocalTime.now(clock);
        ZoneId zone = ZoneId.of("Africa/Johannesburg");
        ZonedDateTime zdt = ZonedDateTime.of(ld, lt, zone);
        zdt = zdt.plusDays(2).plusHours(1).plusMinutes(15).plusSeconds(20).plusNanos(200);
        return zdt;
    }
}